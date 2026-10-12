package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u001a\u0019\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\b\b\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u001e\u0010\f\u001a\u00020\r*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0012\u0010\u0014\u001a\u00020\r*\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0002H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\f\u0010\u0016\u001a\u00020\r*\u00020\u0005H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\r*\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u001a\u0014\u0010\u0017\u001a\u00020\u0018*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\r*\u00020\u0005\u001a(\u0010\u001b\u001a\u00020\u0018*\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\u001a\u001b\u0010 \u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\b!\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "job", "Lkotlinx/coroutines/Job;", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "Job", "Lkotlinx/coroutines/CompletableJob;", "parent", "Job0", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handle", "ensureActive", "invokeOnCompletion", "onCancelling", "invokeImmediately", "handler", "Lkotlinx/coroutines/InternalCompletionHandler;", "orCancellation", "orCancellation$JobKt__JobKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__JobKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1, reason: invalid class name */
    /* JADX INFO: compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        AnonymousClass1(Object r8) {
            super(1, r8, InternalCompletionHandler.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable r2) {
            invoke2(r2);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            ((InternalCompletionHandler) this.receiver).invoke(p0);
        }
    }

    public static /* synthetic */ DisposableHandle invokeOnCompletion$default(Job r0, boolean r1, boolean r2, InternalCompletionHandler r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = true;
    L9:
        return JobKt.invokeOnCompletion(r0, r1, r2, r3);
    }

    public static final DisposableHandle invokeOnCompletion(Job $this$invokeOnCompletion, boolean onCancelling, boolean invokeImmediately, InternalCompletionHandler handler) {
        if (($this$invokeOnCompletion instanceof JobSupport) == false) goto L6;
        return ((JobSupport) $this$invokeOnCompletion).invokeOnCompletionInternal$kotlinx_coroutines_core(onCancelling, invokeImmediately, handler);
    L6:
        return $this$invokeOnCompletion.invokeOnCompletion(onCancelling, invokeImmediately, new AnonymousClass1(handler));
    }

    public static final CompletableJob Job(Job parent) {
        return new JobImpl(parent);
    }

    public static /* synthetic */ CompletableJob Job$default(Job r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = null;
    L6:
        return JobKt.Job(r0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ Job m8909Job(Job parent) {
        return JobKt.Job(parent);
    }

    /* JADX INFO: renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ Job m8910Job$default(Job r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = null;
    L6:
        return JobKt.m8907Job(r0);
    }

    public static final DisposableHandle disposeOnCompletion(Job $this$disposeOnCompletion, DisposableHandle handle) {
        return JobKt.invokeOnCompletion$default($this$disposeOnCompletion, false, false, new DisposeOnCompletion(handle), 3, null);
    }

    public static final Object cancelAndJoin(Job $this$cancelAndJoin, Continuation<? super Unit> r3) {
        Job.DefaultImpls.cancel$default($this$cancelAndJoin, null, 1, null);
        Object r0 = $this$cancelAndJoin.join(r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void cancelChildren$default(Job r0, CancellationException r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        JobKt.cancelChildren(r0, r1);
    }

    public static final void cancelChildren(Job $this$cancelChildren, CancellationException cause) {
        Iterator<Job> r2 = $this$cancelChildren.getChildren().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Object element$iv = r2.next();
        Job it = (Job) element$iv;
        it.cancel(cause);
        goto L4
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(Job $this$cancelChildren) {
        JobKt.cancelChildren($this$cancelChildren, null);
    }

    public static /* synthetic */ void cancelChildren$default(Job r0, Throwable r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        JobKt.cancelChildren(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(Job $this$cancelChildren, Throwable cause) {
        Iterator<Job> r2 = $this$cancelChildren.getChildren().iterator();
    L4:
        if (r2.hasNext() == false) goto L13;
        Object element$iv = r2.next();
        Job it = (Job) element$iv;
        if ((it instanceof JobSupport) == false) goto L8;
        JobSupport r6 = (JobSupport) it;
    L9:
        if (r6 == null) goto L4;
        r6.cancelInternal(orCancellation$JobKt__JobKt(cause, $this$cancelChildren));
        goto L4
    L8:
        r6 = null;
        goto L9
    }

    public static final boolean isActive(CoroutineContext $this$isActive) {
        Job r0 = (Job) $this$isActive.get(Job.Key);
        if (r0 != null) goto L7;
        return true;
    L7:
        return r0.isActive();
    }

    public static /* synthetic */ void cancel$default(CoroutineContext r0, CancellationException r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        JobKt.cancel(r0, r1);
    }

    public static final void cancel(CoroutineContext $this$cancel, CancellationException cause) {
        Job r0 = (Job) $this$cancel.get(Job.Key);
        if (r0 == null) goto L6;
        r0.cancel(cause);
        return;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancel(CoroutineContext $this$cancel) {
        JobKt.cancel($this$cancel, null);
    }

    public static final void ensureActive(Job $this$ensureActive) {
        if ($this$ensureActive.isActive() == false) goto L6;
        return;
    L6:
        throw $this$ensureActive.getCancellationException();
    }

    public static final void ensureActive(CoroutineContext $this$ensureActive) {
        Job r0 = (Job) $this$ensureActive.get(Job.Key);
        if (r0 == null) goto L6;
        JobKt.ensureActive(r0);
        return;
    }

    public static final void cancel(Job $this$cancel, String message, Throwable cause) {
        $this$cancel.cancel(ExceptionsKt.CancellationException(message, cause));
    }

    public static /* synthetic */ void cancel$default(Job r0, String r1, Throwable r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        JobKt.cancel(r0, r1, r2);
    }

    public static /* synthetic */ boolean cancel$default(CoroutineContext r0, Throwable r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return JobKt.cancel(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(CoroutineContext $this$cancel, Throwable cause) {
        CoroutineContext.Element r0 = $this$cancel.get(Job.Key);
        if ((r0 instanceof JobSupport) == false) goto L5;
        JobSupport job = (JobSupport) r0;
    L6:
        if (job != null) goto L9;
        return false;
    L9:
        job.cancelInternal(orCancellation$JobKt__JobKt(cause, job));
        return true;
    L5:
        job = null;
        goto L6
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext r0, CancellationException r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        JobKt.cancelChildren(r0, r1);
    }

    public static final void cancelChildren(CoroutineContext $this$cancelChildren, CancellationException cause) {
        Job r0 = (Job) $this$cancelChildren.get(Job.Key);
        if (r0 == null) goto L11;
        Sequence<Job> r1 = r0.getChildren();
        if (r1 == null) goto L13;
        Iterator<Job> r2 = r1.iterator();
    L8:
        if (r2.hasNext() == false) goto L14;
        Object element$iv = r2.next();
        Job it = (Job) element$iv;
        it.cancel(cause);
        goto L8
    L14:
        return;
    L13:
        return;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(CoroutineContext $this$cancelChildren) {
        JobKt.cancelChildren($this$cancelChildren, null);
    }

    public static final Job getJob(CoroutineContext $this$job) {
        Job r0 = (Job) $this$job.get(Job.Key);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + $this$job).toString());
    }

    public static /* synthetic */ void cancelChildren$default(CoroutineContext r0, Throwable r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        JobKt.cancelChildren(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(CoroutineContext $this$cancelChildren, Throwable cause) {
        Job job = (Job) $this$cancelChildren.get(Job.Key);
        if (job != null) goto L5;
        return;
    L5:
        Iterator<Job> r3 = job.getChildren().iterator();
    L7:
        if (r3.hasNext() == false) goto L16;
        Object element$iv = r3.next();
        Job it = (Job) element$iv;
        if ((it instanceof JobSupport) == false) goto L11;
        JobSupport r7 = (JobSupport) it;
    L12:
        if (r7 == null) goto L7;
        r7.cancelInternal(orCancellation$JobKt__JobKt(cause, job));
        goto L7
    L11:
        r7 = null;
        goto L12
    }

    private static final Throwable orCancellation$JobKt__JobKt(Throwable $this$orCancellation, Job job) {
        if ($this$orCancellation != null) goto L5;
        return new JobCancellationException("Job was cancelled", null, job);
    L5:
        return $this$orCancellation;
    }
}
