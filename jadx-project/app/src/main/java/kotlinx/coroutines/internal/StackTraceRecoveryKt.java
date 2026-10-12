package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import _COROUTINE.CoroutineDebuggingKt;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a9\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\u0006\u0010\f\u001a\u0002H\t2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000e2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002\u001a1\u0010\u0015\u001a\u00020\u00162\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0010\u0010\f\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0080H¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0000¢\u0006\u0002\u0010!\u001a,\u0010 \u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\"H\u0080\b¢\u0006\u0002\u0010#\u001a \u0010$\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0081\b¢\u0006\u0002\u0010!\u001a\u001f\u0010%\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010!\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\t\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00180'\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020**\u00060\u0001j\u0002`\u000f2\n\u0010+\u001a\u00060\u0001j\u0002`\u000fH\u0002\u001a#\u0010,\u001a\u00020-*\f\u0012\b\u0012\u00060\u0001j\u0002`\u000f0\u00182\u0006\u0010.\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\u00020\u0016*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\u0010\u00101\u001a\u00020**\u00060\u0001j\u0002`\u000fH\u0000\u001a\u001b\u00102\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n*\u0002H\tH\u0002¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00103\"\u00020\u00132\u00020\u0013*\f\b\u0000\u00104\"\u00020\u00012\u00020\u0001¨\u00065"}, d2 = {"ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "firstFrameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = null;
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName = null;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName = null;

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    public static final /* synthetic */ Throwable access$recoverFromStackFrame(Throwable exception, CoroutineStackFrame continuation) {
        return recoverFromStackFrame(exception, continuation);
    }

    static {
        Object r0 = stackTraceRecoveryClass;
        Object r1 = baseContinuationImplClass;
        ARTIFICIAL_FRAME = new ArtificialStackFrames().coroutineBoundary();
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L5
        Object r3 = Result.m7425constructorimpl(Class.forName(baseContinuationImplClass).getCanonicalName());     // Catch: Throwable -> L5
    L8:
        if (Result.m7428exceptionOrNullimpl(r3) != null) goto L11;
        r1 = r3;
    L11:
        baseContinuationImplClassName = (String) r1;
        Result.Companion r4 = Result.Companion;     // Catch: Throwable -> L14
        Object r5 = Result.m7425constructorimpl(Class.forName(stackTraceRecoveryClass).getCanonicalName());     // Catch: Throwable -> L14
    L17:
        if (Result.m7428exceptionOrNullimpl(r5) != null) goto L20;
        r0 = r5;
    L20:
        stackTraceRecoveryClassName = (String) r0;
        return;
    L14:
        th = move-exception;
        Result.Companion r6 = Result.Companion;
        r5 = Result.m7425constructorimpl(ResultKt.createFailure(th));
    L5:
        th = move-exception;
        Result.Companion r7 = Result.Companion;
        r3 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L8
    }

    public static final <E extends Throwable> E recoverStackTrace(E r2) {
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L5;
        return r2;
    L5:
        Throwable r0 = ExceptionsConstructorKt.tryCopyException(r2);
        if (r0 != null) goto L9;
        return r2;
    L9:
        return (E) sanitizeStackTrace(r0);
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E r11) {
        StackTraceElement[] stackTrace = r11.getStackTrace();
        int size = stackTrace.length;
        int r4 = stackTrace.length - 1;
        if (r4 < 0) goto L8;
    L4:
        int index$iv = r4;
        r4 = r4 - 1;
        StackTraceElement it = stackTrace[index$iv];
        if (Intrinsics.areEqual(stackTraceRecoveryClassName, it.getClassName()) == true) goto L9;
        if (r4 >= 0) goto L4;
    L9:
        int startIndex = index$iv + 1;
        int endIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int r5 = 0;
        if (endIndex != (-1)) goto L12;
        int adjustment = 0;
    L13:
        int r7 = (size - index$iv) - adjustment;
        StackTraceElement[] trace = new StackTraceElement[r7];
    L14:
        if (r5 >= r7) goto L19;
        if (r5 != 0) goto L17;
        StackTraceElement r9 = ARTIFICIAL_FRAME;
    L18:
        trace[r5] = r9;
        r5 = r5 + 1;
        goto L14
    L17:
        r9 = stackTrace[(startIndex + r5) - 1];
        goto L18
    L19:
        r11.setStackTrace(trace);
        return r11;
    L12:
        adjustment = size - endIndex;
    L8:
        index$iv = -1;
        goto L9
    }

    public static final <E extends Throwable> E recoverStackTrace(E r2, Continuation<?> r3) {
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L5;
    L9:
        return r2;
    L5:
        if ((r3 instanceof CoroutineStackFrame) == false) goto L9;
        return (E) access$recoverFromStackFrame(r2, (CoroutineStackFrame) r3);
    }

    private static final <E extends Throwable> E recoverFromStackFrame(E r5, CoroutineStackFrame r6) {
        Pair r0 = causeAndStacktrace(r5);
        Throwable r1 = (Throwable) r0.component1();
        StackTraceElement[] r2 = (StackTraceElement[]) r0.component2();
        Throwable r3 = ExceptionsConstructorKt.tryCopyException(r1);
        if (r3 != null) goto L5;
        return r5;
    L5:
        ArrayDeque<StackTraceElement> r4 = createStackTrace(r6);
        if (r4.isEmpty() == false) goto L8;
        return r5;
    L8:
        if (r1 == r5) goto L11;
        mergeRecoveredTraces(r2, r4);
    L11:
        return (E) createFinalException(r1, r3, r4);
    }

    private static final <E extends Throwable> E createFinalException(E r8, E r9, ArrayDeque<StackTraceElement> r10) {
        r10.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] causeTrace = r8.getStackTrace();
        int size = firstFrameIndex(causeTrace, baseContinuationImplClassName);
        int r3 = 0;
        if (size != (-1)) goto L6;
        ArrayDeque<StackTraceElement> $this$toTypedArray$iv = r10;
        r9.setStackTrace((StackTraceElement[]) $this$toTypedArray$iv.toArray(new StackTraceElement[0]));
        return r9;
    L6:
        StackTraceElement[] mergedStackTrace = new StackTraceElement[r10.size() + size];
        int i = 0;
    L7:
        if (i >= size) goto L9;
        mergedStackTrace[i] = causeTrace[i];
        i = i + 1;
        goto L7
    L9:
        Iterator<StackTraceElement> r4 = r10.iterator();
    L11:
        if (r4.hasNext() == false) goto L13;
        int index = r3;
        r3 = r3 + 1;
        StackTraceElement element = r4.next();
        mergedStackTrace[size + index] = element;
        goto L11
    L13:
        r9.setStackTrace(mergedStackTrace);
        return r9;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E r10) {
        Throwable cause = r10.getCause();
        if (cause == null) goto L17;
        if (Intrinsics.areEqual(cause.getClass(), r10.getClass()) == false) goto L17;
        StackTraceElement[] currentTrace = r10.getStackTrace();
        int r5 = currentTrace.length;
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L12;
        if (isArtificial(currentTrace[r6]) == true) goto L10;
        r6 = r6 + 1;
        goto L7
    L10:
        boolean r7 = true;
    L13:
        if (r7 == false) goto L21;
        return TuplesKt.to(cause, currentTrace);
    L21:
        return TuplesKt.to(r10, new StackTraceElement[0]);
    L12:
        r7 = false;
    L17:
        return TuplesKt.to(r10, new StackTraceElement[0]);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] recoveredStacktrace, ArrayDeque<StackTraceElement> r7) {
        int index$iv = 0;
        int r3 = recoveredStacktrace.length;
    L3:
        if (index$iv >= r3) goto L8;
        StackTraceElement it = recoveredStacktrace[index$iv];
        if (isArtificial(it) == true) goto L9;
        index$iv = index$iv + 1;
    L9:
        int startIndex = index$iv + 1;
        int lastFrameIndex = recoveredStacktrace.length - 1;
        int i = lastFrameIndex;
        if (startIndex > i) goto L17;
    L11:
        StackTraceElement element = recoveredStacktrace[i];
        if (elementWiseEquals(element, r7.getLast()) == false) goto L14;
        r7.removeLast();
    L14:
        r7.addFirst(recoveredStacktrace[i]);
        if (i == startIndex) goto L21;
        i = i - 1;
        goto L11
    L21:
        return;
    L17:
        return;
    L8:
        index$iv = -1;
        goto L9
    }

    public static final Object recoverAndThrow(Throwable exception, Continuation<?> r5) {
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L5;
        throw exception;
    L5:
        if ((r5 instanceof CoroutineStackFrame) == true) goto L8;
        throw exception;
    L8:
        throw access$recoverFromStackFrame(exception, (CoroutineStackFrame) r5);
    }

    private static final Object recoverAndThrow$$forInline(Throwable exception, Continuation<?> r5) {
        if (DebugKt.getRECOVER_STACK_TRACES() == false) goto L9;
        Continuation<?> r1 = r5;
        if ((r1 instanceof CoroutineStackFrame) == true) goto L8;
        throw exception;
    L8:
        throw access$recoverFromStackFrame(exception, (CoroutineStackFrame) r1);
    L9:
        throw exception;
    }

    public static final <E extends Throwable> E unwrap(E r2) {
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L6;
        return r2;
    L6:
        return (E) unwrapImpl(r2);
    }

    public static final <E extends Throwable> E unwrapImpl(E r9) {
        E r0 = (E) r9.getCause();
        if (r0 != null) goto L5;
    L17:
        return r9;
    L5:
        if (Intrinsics.areEqual(r0.getClass(), r9.getClass()) == false) goto L17;
        StackTraceElement[] r1 = r9.getStackTrace();
        int r3 = r1.length;
        boolean r4 = false;
        int r5 = 0;
    L8:
        if (r5 >= r3) goto L14;
        if (isArtificial(r1[r5]) == true) goto L11;
        r5 = r5 + 1;
        goto L8
    L11:
        r4 = true;
    L14:
        if (r4 == false) goto L16;
        return r0;
    L16:
        return r9;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame continuation) {
        ArrayDeque<StackTraceElement> r0 = new ArrayDeque();
        StackTraceElement it = continuation.getStackTraceElement();
        if (it == null) goto L5;
        r0.add(it);
    L5:
        CoroutineStackFrame last = continuation;
    L7:
        if ((last instanceof CoroutineStackFrame) == false) goto L9;
        CoroutineStackFrame r2 = last;
    L10:
        if (r2 == null) goto L17;
        CoroutineStackFrame r3 = r2.getCallerFrame();
        if (r3 == null) goto L17;
        last = r3;
        StackTraceElement it2 = last.getStackTraceElement();
        if (it2 == null) goto L7;
        r0.add(it2);
    L17:
        return r0;
    L9:
        r2 = null;
        goto L10
    }

    public static final boolean isArtificial(StackTraceElement $this$isArtificial) {
        return StringsKt.startsWith$default($this$isArtificial.getClassName(), CoroutineDebuggingKt.getARTIFICIAL_FRAME_PACKAGE_NAME(), false, 2, null);
    }

    private static final int firstFrameIndex(StackTraceElement[] $this$firstFrameIndex, String methodName) {
        int index$iv = 0;
        int r3 = $this$firstFrameIndex.length;
    L3:
        if (index$iv >= r3) goto L8;
        StackTraceElement it = $this$firstFrameIndex[index$iv];
        if (Intrinsics.areEqual(methodName, it.getClassName()) == true) goto L12;
        index$iv = index$iv + 1;
        goto L3
    L12:
        return index$iv;
    L8:
        return -1;
    }

    private static final boolean elementWiseEquals(StackTraceElement $this$elementWiseEquals, StackTraceElement e) {
        if ($this$elementWiseEquals.getLineNumber() == e.getLineNumber()) goto L5;
    L11:
        return false;
    L5:
        if (Intrinsics.areEqual($this$elementWiseEquals.getMethodName(), e.getMethodName()) == false) goto L11;
        if (Intrinsics.areEqual($this$elementWiseEquals.getFileName(), e.getFileName()) == false) goto L11;
        if (Intrinsics.areEqual($this$elementWiseEquals.getClassName(), e.getClassName()) == false) goto L11;
        return true;
    }

    public static final void initCause(Throwable $this$initCause, Throwable cause) {
        $this$initCause.initCause(cause);
    }
}
