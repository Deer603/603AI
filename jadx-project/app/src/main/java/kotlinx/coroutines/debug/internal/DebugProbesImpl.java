package kotlinx.coroutines.debug.internal;

import _COROUTINE.ArtificialStackFrames;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001}B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u00101\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H3022\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0001J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0011\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\u0010?J9\u0010@\u001a\b\u0012\u0004\u0012\u0002HA0;\"\b\b\u0000\u0010A*\u00020\u00012\u001e\b\u0004\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u0002HA0CH\u0082\bJ\u0010\u0010E\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0002J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0;J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010I\u001a\u00020<2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;J\u000e\u0010K\u001a\u00020)2\u0006\u0010I\u001a\u00020<J.\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010M\u001a\u00020)2\b\u0010N\u001a\u0004\u0018\u00010'2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J=\u0010O\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010TJ1\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0015\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020*H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u00020\u0014H\u0000¢\u0006\u0002\b]J\u001e\u0010^\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\u0014\u0010`\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J'\u0010b\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H302H\u0000¢\u0006\u0002\bcJ\u0019\u0010d\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\beJ\u0019\u0010f\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\bgJ%\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040;\"\b\b\u0000\u00103*\u00020i2\u0006\u0010j\u001a\u0002H3H\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\u0014H\u0002J\b\u0010m\u001a\u00020\u0014H\u0002J\r\u0010n\u001a\u00020\u0014H\u0000¢\u0006\u0002\boJ\u0018\u0010p\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u0010M\u001a\u00020)H\u0002J\u001c\u0010q\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J(\u0010q\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J4\u0010r\u001a\u00020\u0014*\u00020*2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0t2\n\u0010u\u001a\u00060vj\u0002`w2\u0006\u0010x\u001a\u00020)H\u0002J\u0010\u0010y\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0016\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u0006\u0012\u0002\b\u000302H\u0002J\u0013\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u0007H\u0082\u0010J\u000f\u0010z\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0082\u0010J\u0012\u0010{\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\f\u0010|\u001a\u00020)*\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\t\u0010\u001d\u001a\u00020\u001eX\u0082\u0004R\u0011\u0010\u001f\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\t\u0010$\u001a\u00020%X\u0082\u0004R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)*\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u00020\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006~"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "()V", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "capturedCoroutines", "", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutinesMap", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/Function1;", "", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "()Z", "setEnableCreationStackTraces$kotlinx_coroutines_core", "(Z)V", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "installations", "Lkotlinx/atomicfu/AtomicInt;", "isInstalled", "isInstalled$kotlinx_coroutines_debug", "sanitizeStackTraces", "getSanitizeStackTraces$kotlinx_coroutines_core", "setSanitizeStackTraces$kotlinx_coroutines_core", "sequenceNumber", "Lkotlinx/atomicfu/AtomicLong;", "weakRefCleanerThread", "Ljava/lang/Thread;", "debugString", "", "Lkotlinx/coroutines/Job;", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "getDebugString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "createOwner", "Lkotlin/coroutines/Continuation;", "T", "completion", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "dumpCoroutines", "out", "Ljava/io/PrintStream;", "dumpCoroutinesInfo", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfoAsJsonAndReferences", "", "()[Ljava/lang/Object;", "dumpCoroutinesInfoImpl", "R", "create", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "dumpCoroutinesSynchronized", "dumpDebuggerInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "enhanceStackTraceWithThreadDump", "info", "coroutineTrace", "enhanceStackTraceWithThreadDumpAsJson", "enhanceStackTraceWithThreadDumpImpl", "state", "thread", "findContinuationStartIndex", "Lkotlin/Pair;", "", "indexOfResumeWith", "actualTrace", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "findIndexOfFrame", "frameIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "getDynamicAttach", "hierarchyToString", "job", "hierarchyToString$kotlinx_coroutines_core", "install", "install$kotlinx_coroutines_core", "printStackTrace", "frames", "probeCoroutineCompleted", "owner", "probeCoroutineCreated", "probeCoroutineCreated$kotlinx_coroutines_core", "probeCoroutineResumed", "probeCoroutineResumed$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineSuspended$kotlinx_coroutines_core", "sanitizeStackTrace", "", "throwable", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "uninstall$kotlinx_coroutines_core", "updateRunningState", "updateState", "build", "map", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "indent", "isFinished", "realCaller", "toStackTraceFrame", "toStringRepr", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME = null;
    public static final DebugProbesImpl INSTANCE = null;
    private static final ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> callerInfoCache = null;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap = null;
    private static final SimpleDateFormat dateFormat = null;
    private static final /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private debugProbesImpl$VolatileWrapper$atomicfu$private = null;
    private static final Function1<Boolean, Unit> dynamicAttach = null;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static boolean sanitizeStackTraces;
    private static Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001b\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements Continuation<T>, CoroutineStackFrame {
        public final Continuation<T> delegate;
        public final DebugCoroutineInfoImpl info;

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.delegate.getContext();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(Continuation<? super T> r1, DebugCoroutineInfoImpl info) {
            this.delegate = r1;
            this.info = info;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public CoroutineStackFrame getCallerFrame() {
            StackTraceFrame r0 = getFrame();
            if (r0 != null) goto L7;
            return null;
        L7:
            return r0.getCallerFrame();
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame r0 = getFrame();
            if (r0 != null) goto L7;
            return null;
        L7:
            return r0.getStackTraceElement();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            DebugProbesImpl.access$probeCoroutineCompleted(DebugProbesImpl.INSTANCE, this);
            this.delegate.resumeWith(result);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    private static final /* synthetic */ DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private getDebugProbesImpl$VolatileWrapper$atomicfu$private() {
        return debugProbesImpl$VolatileWrapper$atomicfu$private;
    }

    private static /* synthetic */ void getDebugString$annotations(Job r0) {
    }

    private DebugProbesImpl() {
    }

    public static final /* synthetic */ ConcurrentWeakMap access$getCallerInfoCache$p() {
        return callerInfoCache;
    }

    public static final /* synthetic */ boolean access$isFinished(DebugProbesImpl $this, CoroutineOwner $receiver) {
        return $this.isFinished($receiver);
    }

    public static final /* synthetic */ void access$probeCoroutineCompleted(DebugProbesImpl $this, CoroutineOwner owner) {
        $this.probeCoroutineCompleted(owner);
    }

    static {
        INSTANCE = new DebugProbesImpl();
        ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineCreation();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap(false, 1, null);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = INSTANCE.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap(true);
        debugProbesImpl$VolatileWrapper$atomicfu$private = new DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private(null);
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        if (DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU().get(getDebugProbesImpl$VolatileWrapper$atomicfu$private()) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean r1) {
        sanitizeStackTraces = r1;
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean r1) {
        enableCreationStackTraces = r1;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean r1) {
        ignoreCoroutinesWithEmptyContext = r1;
    }

    private final Function1<Boolean, Unit> getDynamicAttach() {
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L4
        DebugProbesImpl r1 = this;     // Catch: Throwable -> L4
        Object r4 = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);     // Catch: Throwable -> L4
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");     // Catch: Throwable -> L4
        Object r2 = Result.m7425constructorimpl((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, 1));     // Catch: Throwable -> L4
    L7:
        if (Result.m7431isFailureimpl(r2) == false) goto L10;
        r2 = null;
    L10:
        return (Function1) r2;
    L4:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r2 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L7
    }

    public final void install$kotlinx_coroutines_core() {
        if (DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU().incrementAndGet(getDebugProbesImpl$VolatileWrapper$atomicfu$private()) <= 1) goto L5;
        return;
    L5:
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() == false) goto L8;
        return;
    L8:
        Function1<Boolean, Unit> r0 = dynamicAttach;
        if (r0 == null) goto L12;
        r0.invoke(true);
        return;
    }

    public final void uninstall$kotlinx_coroutines_core() {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L15;
        if (DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU().decrementAndGet(getDebugProbesImpl$VolatileWrapper$atomicfu$private()) == 0) goto L7;
        return;
    L7:
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() == false) goto L10;
        return;
    L10:
        Function1<Boolean, Unit> r0 = dynamicAttach;
        if (r0 == null) goto L16;
        r0.invoke(false);
        return;
    L16:
        return;
    L15:
        throw new IllegalStateException("Agent was not installed".toString());
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = ThreadsKt.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, AnonymousClass1.INSTANCE, 21, null);
    }

    private final void stopWeakRefCleanerThread() {
        Thread thread = weakRefCleanerThread;
        if (thread != null) goto L5;
        return;
    L5:
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L20;
        Iterable $this$filter$iv = getCapturedCoroutines();
        Collection destination$iv$iv = new ArrayList();
        Iterator r5 = $this$filter$iv.iterator();
    L6:
        if (r5.hasNext() == false) goto L13;
        Object element$iv$iv = r5.next();
        CoroutineOwner it = (CoroutineOwner) element$iv$iv;
        if (it.delegate.getContext().get(Job.Key) == null) goto L10;
        boolean r9 = true;
    L11:
        if (r9 == false) goto L6;
        destination$iv$iv.add(element$iv$iv);
        goto L6
    L10:
        r9 = false;
        goto L11
    L13:
        Iterable $this$associateBy$iv = (List) destination$iv$iv;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map jobToStack = new LinkedHashMap(capacity$iv);
        Iterator r6 = $this$associateBy$iv.iterator();
    L15:
        if (r6.hasNext() == false) goto L17;
        Object element$iv$iv2 = r6.next();
        CoroutineOwner it2 = (CoroutineOwner) element$iv$iv2;
        CoroutineOwner it3 = (CoroutineOwner) element$iv$iv2;
        jobToStack.put(JobKt.getJob(it2.delegate.getContext()), it3.info);
        goto L15
    L17:
        StringBuilder $this$hierarchyToString_u24lambda_u246 = new StringBuilder();
        INSTANCE.build(job, jobToStack, $this$hierarchyToString_u24lambda_u246, "");
        String r0 = $this$hierarchyToString_u24lambda_u246.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    L20:
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final void build(Job $this$build, Map<Job, DebugCoroutineInfoImpl> r10, StringBuilder builder, String indent) {
        DebugCoroutineInfoImpl info = r10.get($this$build);
        if (info == null) goto L5;
        StackTraceElement element = (StackTraceElement) CollectionsKt.firstOrNull(info.lastObservedStackTrace$kotlinx_coroutines_core());
        String state = info.getState$kotlinx_coroutines_core();
        builder.append(indent + getDebugString($this$build) + ", continuation is " + state + " at line " + element + '\n');
        String newIndent = indent + '\t';
    L9:
        Iterator<Job> r2 = $this$build.getChildren().iterator();
    L11:
        if (r2.hasNext() == false) goto L13;
        Job child = r2.next();
        build(child, r10, builder, newIndent);
        goto L11
    L13:
        return;
    L5:
        if (($this$build instanceof ScopeCoroutine) == true) goto L7;
        builder.append(indent + getDebugString($this$build) + '\n');
        newIndent = indent + '\t';
        goto L9
    L7:
        newIndent = indent;
        goto L9
    }

    private final String getDebugString(Job $this$debugString) {
        if (($this$debugString instanceof JobSupport) == false) goto L6;
        return ((JobSupport) $this$debugString).toDebugString();
    L6:
        return $this$debugString.toString();
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final Function2<? super CoroutineOwner<?>, ? super CoroutineContext, ? extends R> r5) {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L7;
        Sequence $this$sortedBy$iv = CollectionsKt.asSequence(getCapturedCoroutines());
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith($this$sortedBy$iv, new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new AnonymousClass3(r5)));
    L7:
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        List<DebugCoroutineInfo> r0 = dumpCoroutinesInfo();
        int size = r0.size();
        ArrayList lastObservedThreads = new ArrayList(size);
        ArrayList lastObservedFrames = new ArrayList(size);
        ArrayList coroutinesInfoAsJson = new ArrayList(size);
        Iterator<DebugCoroutineInfo> r5 = r0.iterator();
    L4:
        if (r5.hasNext() == false) goto L19;
        DebugCoroutineInfo info = r5.next();
        CoroutineContext context = info.getContext();
        CoroutineName r8 = (CoroutineName) context.get(CoroutineName.Key);
        Long r9 = null;
        if (r8 == null) goto L10;
        String r10 = r8.getName();
        if (r10 == null) goto L10;
        String name = toStringRepr(r10);
    L11:
        CoroutineDispatcher r11 = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
        if (r11 == null) goto L14;
        String dispatcher = toStringRepr(r11);
    L15:
        StringBuilder r12 = new StringBuilder().append("\n                {\n                    \"name\": ").append(name).append(",\n                    \"id\": ");
        CoroutineId r13 = (CoroutineId) context.get(CoroutineId.Key);
        if (r13 == null) goto L18;
        r9 = Long.valueOf(r13.getId());
    L18:
        coroutinesInfoAsJson.add(StringsKt.trimIndent(r12.append(r9).append(",\n                    \"dispatcher\": ").append(dispatcher).append(",\n                    \"sequenceNumber\": ").append(info.getSequenceNumber()).append(",\n                    \"state\": \"").append(info.getState()).append("\"\n                } \n                ").toString()));
        lastObservedFrames.add(info.getLastObservedFrame());
        lastObservedThreads.add(info.getLastObservedThread());
        goto L4
    L14:
        dispatcher = null;
    L10:
        name = null;
        goto L11
    L19:
        ArrayList $this$toTypedArray$iv = lastObservedThreads;
        ArrayList $this$toTypedArray$iv2 = lastObservedFrames;
        List<DebugCoroutineInfo> $this$toTypedArray$iv3 = r0;
        return new Object[]{'[' + CollectionsKt.joinToString$default(coroutinesInfoAsJson, null, null, null, 0, null, null, 63, null) + ']', $this$toTypedArray$iv.toArray(new Thread[0]), $this$toTypedArray$iv2.toArray(new CoroutineStackFrame[0]), $this$toTypedArray$iv3.toArray(new DebugCoroutineInfo[0])};
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo info) {
        List<StackTraceElement> r0 = enhanceStackTraceWithThreadDump(info, info.lastObservedStackTrace());
        List stackTraceElementsInfoAsJson = new ArrayList();
        Iterator<StackTraceElement> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L11;
        StackTraceElement element = r2.next();
        StringBuilder r4 = new StringBuilder().append("\n                {\n                    \"declaringClass\": \"").append(element.getClassName()).append("\",\n                    \"methodName\": \"").append(element.getMethodName()).append("\",\n                    \"fileName\": ");
        String r5 = element.getFileName();
        if (r5 == null) goto L8;
        String r6 = toStringRepr(r5);
    L9:
        stackTraceElementsInfoAsJson.add(StringsKt.trimIndent(r4.append(r6).append(",\n                    \"lineNumber\": ").append(element.getLineNumber()).append("\n                }\n                ").toString()));
        goto L4
    L8:
        r6 = null;
        goto L9
    L11:
        return '[' + CollectionsKt.joinToString$default(stackTraceElementsInfoAsJson, null, null, null, 0, null, null, 63, null) + ']';
    }

    private final String toStringRepr(Object $this$toStringRepr) {
        return DebugProbesImplKt.access$repr($this$toStringRepr.toString());
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L7;
        Sequence $this$sortedBy$iv$iv = CollectionsKt.asSequence(getCapturedCoroutines());
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith($this$sortedBy$iv$iv, new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1()));
    L7:
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L7;
        Sequence $this$sortedBy$iv$iv = CollectionsKt.asSequence(getCapturedCoroutines());
        return SequencesKt.toList(SequencesKt.mapNotNull(SequencesKt.sortedWith($this$sortedBy$iv$iv, new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1()));
    L7:
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    public final void dumpCoroutines(PrintStream out) {
        monitor-enter(out);
        INSTANCE.dumpCoroutinesSynchronized(out);     // Catch: Throwable -> L7
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L7
        monitor-exit(out);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private final boolean isFinished(CoroutineOwner<?> r4) {
        CoroutineContext r0 = r4.info.getContext();
        if (r0 == null) goto L12;
        Job job = (Job) r0.get(Job.Key);
        if (job == null) goto L12;
        if (job.isCompleted() == true) goto L10;
        return false;
    L10:
        capturedCoroutinesMap.remove(r4);
        return true;
    L12:
        return false;
    }

    private final void dumpCoroutinesSynchronized(PrintStream out) {
        if (isInstalled$kotlinx_coroutines_debug() == false) goto L20;
        out.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        Sequence $this$sortedBy$iv = SequencesKt.filter(CollectionsKt.asSequence(getCapturedCoroutines()), AnonymousClass2.INSTANCE);
        Iterator r2 = SequencesKt.sortedWith($this$sortedBy$iv, new DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1()).iterator();
    L6:
        if (r2.hasNext() == false) goto L18;
        Object element$iv = r2.next();
        CoroutineOwner owner = (CoroutineOwner) element$iv;
        DebugCoroutineInfoImpl info = owner.info;
        List<StackTraceElement> r7 = info.lastObservedStackTrace$kotlinx_coroutines_core();
        List<StackTraceElement> r8 = INSTANCE.enhanceStackTraceWithThreadDumpImpl(info.getState$kotlinx_coroutines_core(), info.lastObservedThread, r7);
        if (Intrinsics.areEqual(info.getState$kotlinx_coroutines_core(), DebugCoroutineInfoImplKt.RUNNING) == false) goto L11;
        if (r8 != r7) goto L11;
        String state = info.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)";
    L12:
        out.print("\n\nCoroutine " + owner.delegate + ", state: " + state);
        if (r7.isEmpty() == true) goto L14;
        INSTANCE.printStackTrace(out, r8);
        goto L6
    L14:
        out.print("\n\tat " + ARTIFICIAL_FRAME);
        INSTANCE.printStackTrace(out, info.getCreationStackTrace());
    L11:
        state = info.getState$kotlinx_coroutines_core();
        goto L12
    L18:
        return;
    L20:
        throw new IllegalStateException("Debug probes are not installed".toString());
    }

    private final void printStackTrace(PrintStream out, List<StackTraceElement> r10) {
        List<StackTraceElement> $this$forEach$iv = r10;
        Iterator r2 = $this$forEach$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Object element$iv = r2.next();
        StackTraceElement frame = (StackTraceElement) element$iv;
        out.print("\n\tat " + frame);
        goto L4
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo info, List<StackTraceElement> r4) {
        return enhanceStackTraceWithThreadDumpImpl(info.getState(), info.getLastObservedThread(), r4);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String state, Thread thread, List<StackTraceElement> r14) {
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) == false) goto L43;
        if (thread == null) goto L43;
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L8
        DebugProbesImpl r1 = this;     // Catch: Throwable -> L8
        Object r2 = Result.m7425constructorimpl(thread.getStackTrace());     // Catch: Throwable -> L8
    L11:
        if (Result.m7431isFailureimpl(r2) == false) goto L13;
        r2 = null;
    L13:
        StackTraceElement[] actualTrace = (StackTraceElement[]) r2;
        if (actualTrace != null) goto L16;
        return r14;
    L16:
        int index$iv = 0;
        int r4 = actualTrace.length;
    L18:
        if (index$iv >= r4) goto L31;
        StackTraceElement it = actualTrace[index$iv];
        if (Intrinsics.areEqual(it.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") == true) goto L22;
    L26:
        boolean r9 = false;
    L28:
        if (r9 == true) goto L32;
        index$iv = index$iv + 1;
    L32:
        Pair<Integer, Integer> r3 = findContinuationStartIndex(index$iv, actualTrace, r14);
        int continuationStartFrame = r3.component1().intValue();
        int delta = r3.component2().intValue();
        if (continuationStartFrame != (-1)) goto L35;
        return r14;
    L35:
        int expectedSize = (((r14.size() + index$iv) - continuationStartFrame) - 1) - delta;
        ArrayList result = new ArrayList(expectedSize);
        int index = 0;
        int r7 = index$iv - delta;
    L36:
        if (index >= r7) goto L38;
        result.add(actualTrace[index]);
        index = index + 1;
        goto L36
    L38:
        int index2 = continuationStartFrame + 1;
        int r8 = r14.size();
    L39:
        if (index2 >= r8) goto L42;
        result.add(r14.get(index2));
        index2 = index2 + 1;
        goto L39
    L42:
        return result;
    L22:
        if (Intrinsics.areEqual(it.getMethodName(), "resumeWith") == false) goto L26;
        if (Intrinsics.areEqual(it.getFileName(), "ContinuationImpl.kt") == false) goto L26;
        r9 = true;
        goto L28
    L31:
        index$iv = -1;
    L8:
        th = move-exception;
        Result.Companion r5 = Result.Companion;
        r2 = Result.m7425constructorimpl(ResultKt.createFailure(th));
    L43:
        return r14;
    }

    private final Pair<Integer, Integer> findContinuationStartIndex(int indexOfResumeWith, StackTraceElement[] actualTrace, List<StackTraceElement> r10) {
        int r1 = 0;
    L4:
        if (r1 >= 3) goto L11;
        int it = r1;
        int result = INSTANCE.findIndexOfFrame((indexOfResumeWith - 1) - it, actualTrace, r10);
        if (result != (-1)) goto L8;
        r1 = r1 + 1;
        goto L4
    L8:
        return TuplesKt.to(Integer.valueOf(result), Integer.valueOf(it));
    L11:
        return TuplesKt.to(-1, 0);
    }

    private final int findIndexOfFrame(int frameIndex, StackTraceElement[] actualTrace, List<StackTraceElement> r14) {
        StackTraceElement continuationFrame = (StackTraceElement) ArraysKt.getOrNull(actualTrace, frameIndex);
        if (continuationFrame != null) goto L5;
        return -1;
    L5:
        int index$iv = 0;
        Iterator<StackTraceElement> r5 = r14.iterator();
    L7:
        if (r5.hasNext() == false) goto L24;
        Object item$iv = r5.next();
        StackTraceElement it = (StackTraceElement) item$iv;
        if (Intrinsics.areEqual(it.getFileName(), continuationFrame.getFileName()) == true) goto L11;
    L15:
        boolean r9 = false;
    L17:
        if (r9 == true) goto L21;
        index$iv = index$iv + 1;
        goto L7
    L21:
        return index$iv;
    L11:
        if (Intrinsics.areEqual(it.getClassName(), continuationFrame.getClassName()) == false) goto L15;
        if (Intrinsics.areEqual(it.getMethodName(), continuationFrame.getMethodName()) == false) goto L15;
        r9 = true;
        goto L17
    L24:
        return -1;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(Continuation<?> r2) {
        updateState(r2, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(Continuation<?> r2) {
        updateState(r2, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    private final void updateState(Continuation<?> r3, String state) {
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L6;
        return;
    L6:
        if (ignoreCoroutinesWithEmptyContext == false) goto L11;
        if (r3.getContext() != EmptyCoroutineContext.INSTANCE) goto L11;
        return;
    L11:
        if (Intrinsics.areEqual(state, DebugCoroutineInfoImplKt.RUNNING) == true) goto L13;
        CoroutineOwner<?> r0 = owner(r3);
        if (r0 != null) goto L23;
        return;
    L23:
        updateState(r0, r3, state);
        return;
    L13:
        if ((r3 instanceof CoroutineStackFrame) == false) goto L15;
        CoroutineStackFrame stackFrame = (CoroutineStackFrame) r3;
    L16:
        if (stackFrame != null) goto L18;
        return;
    L18:
        updateRunningState(stackFrame, state);
        return;
    L15:
        stackFrame = null;
        goto L16
    }

    private final void updateRunningState(CoroutineStackFrame frame, String state) {
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L5;
        return;
    L5:
        DebugCoroutineInfoImpl cached = callerInfoCache.remove(frame);
        if (cached == null) goto L8;
        DebugCoroutineInfoImpl info = cached;
        boolean shouldBeMatchedWithProbeSuspended = false;
    L19:
        Intrinsics.checkNotNull(frame, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
        info.updateState$kotlinx_coroutines_core(state, (Continuation) frame, shouldBeMatchedWithProbeSuspended);
        CoroutineStackFrame caller = realCaller(frame);
        if (caller != null) goto L22;
        return;
    L22:
        callerInfoCache.put(caller, info);
        return;
    L8:
        CoroutineOwner<?> r3 = owner(frame);
        if (r3 == null) goto L24;
        DebugCoroutineInfoImpl r4 = r3.info;
        if (r4 == null) goto L25;
        info = r4;
        shouldBeMatchedWithProbeSuspended = true;
        CoroutineStackFrame r5 = info.getLastObservedFrame$kotlinx_coroutines_core();
        if (r5 == null) goto L16;
        CoroutineStackFrame realCaller = realCaller(r5);
    L17:
        if (realCaller == null) goto L19;
        callerInfoCache.remove(realCaller);
        goto L19
    L16:
        realCaller = null;
        goto L17
    L25:
        return;
    }

    private final CoroutineStackFrame realCaller(CoroutineStackFrame $this$realCaller) {
    L2:
        CoroutineStackFrame caller = $this$realCaller.getCallerFrame();
        if (caller == null) goto L4;
        if (caller.getStackTraceElement() != null) goto L8;
        $this$realCaller = caller;
        goto L2
    L8:
        return caller;
    L4:
        return null;
    }

    private final void updateState(CoroutineOwner<?> r3, Continuation<?> r4, String state) {
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L5;
        return;
    L5:
        r3.info.updateState$kotlinx_coroutines_core(state, r4, true);
    }

    private final CoroutineOwner<?> owner(Continuation<?> r3) {
        if ((r3 instanceof CoroutineStackFrame) == false) goto L5;
        CoroutineStackFrame r0 = (CoroutineStackFrame) r3;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return owner(r0);
    L5:
        r0 = null;
        goto L6
    }

    private final CoroutineOwner<?> owner(CoroutineStackFrame $this$owner) {
    L3:
        if (($this$owner instanceof CoroutineOwner) == true) goto L12;
        CoroutineStackFrame r0 = $this$owner.getCallerFrame();
        if (r0 == null) goto L8;
        $this$owner = r0;
        goto L3
    L8:
        return null;
    L12:
        return (CoroutineOwner) $this$owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(Continuation<? super T> r4) {
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L6;
        return r4;
    L6:
        if (ignoreCoroutinesWithEmptyContext == false) goto L11;
        if (r4.getContext() != EmptyCoroutineContext.INSTANCE) goto L11;
        return r4;
    L11:
        if (owner(r4) == null) goto L14;
        return r4;
    L14:
        if (enableCreationStackTraces == false) goto L16;
        StackTraceFrame frame = toStackTraceFrame(sanitizeStackTrace(new Exception()));
    L18:
        return createOwner(r4, frame);
    L16:
        frame = null;
        goto L18
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> r11) {
        Object accumulator$iv = null;
        if (r11.isEmpty() == true) goto L8;
        ListIterator<StackTraceElement> r4 = r11.listIterator(r11.size());
    L6:
        if (r4.hasPrevious() == false) goto L8;
        StackTraceElement frame = r4.previous();
        Object acc = accumulator$iv;
        accumulator$iv = new StackTraceFrame((CoroutineStackFrame) acc, frame);
    L8:
        Object initial$iv = accumulator$iv;
        return new StackTraceFrame((CoroutineStackFrame) initial$iv, ARTIFICIAL_FRAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> Continuation<T> createOwner(Continuation<? super T> r5, StackTraceFrame frame) {
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L5;
        return r5;
    L5:
        DebugCoroutineInfoImpl info = new DebugCoroutineInfoImpl(r5.getContext(), frame, DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getSequenceNumber$volatile$FU().incrementAndGet(getDebugProbesImpl$VolatileWrapper$atomicfu$private()));
        CoroutineOwner<?> r1 = new CoroutineOwner(r5, info);
        capturedCoroutinesMap.put(r1, true);
        if (isInstalled$kotlinx_coroutines_debug() == true) goto L9;
        capturedCoroutinesMap.clear();
    L9:
        return r1;
    }

    private final void probeCoroutineCompleted(CoroutineOwner<?> r3) {
        capturedCoroutinesMap.remove(r3);
        CoroutineStackFrame r0 = r3.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (r0 == null) goto L9;
        CoroutineStackFrame caller = realCaller(r0);
        if (caller == null) goto L10;
        callerInfoCache.remove(caller);
        return;
    L10:
        return;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T r12) {
        StackTraceElement[] stackTrace = r12.getStackTrace();
        int size = stackTrace.length;
        int r5 = -1;
        int r4 = stackTrace.length - 1;
        if (r4 < 0) goto L9;
    L4:
        int index$iv = r4;
        r4 = r4 - 1;
        StackTraceElement it = stackTrace[index$iv];
        if (Intrinsics.areEqual(it.getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt") == true) goto L6;
        if (r4 >= 0) goto L4;
    L6:
        r5 = index$iv;
    L9:
        int traceStart = r5 + 1;
        if (sanitizeStackTraces == true) goto L16;
        int r2 = size - traceStart;
        ArrayList r3 = new ArrayList(r2);
        int r6 = 0;
    L12:
        if (r6 >= r2) goto L15;
        int it2 = r6;
        r3.add(stackTrace[it2 + traceStart]);
        r6 = r6 + 1;
        goto L12
    L15:
        return r3;
    L16:
        ArrayList result = new ArrayList((size - traceStart) + 1);
        int i = traceStart;
    L17:
        if (i >= size) goto L37;
        if (isInternalMethod(stackTrace[i]) == true) goto L20;
        result.add(stackTrace[i]);
        i = i + 1;
        goto L17
    L20:
        result.add(stackTrace[i]);
        int j = i + 1;
    L21:
        if (j >= size) goto L25;
        if (isInternalMethod(stackTrace[j]) == false) goto L25;
        j = j + 1;
    L25:
        int k = j - 1;
    L26:
        if (k <= i) goto L30;
        if (stackTrace[k].getFileName() != null) goto L30;
        k = k - 1;
    L30:
        if (k > i) goto L32;
    L34:
        result.add(stackTrace[j - 1]);
        i = j;
        goto L17
    L32:
        if (k >= (j - 1)) goto L34;
        result.add(stackTrace[k]);
        goto L34
    L37:
        return result;
    }

    private final boolean isInternalMethod(StackTraceElement $this$isInternalMethod) {
        return StringsKt.startsWith$default($this$isInternalMethod.getClassName(), "kotlinx.coroutines", false, 2, null);
    }
}
