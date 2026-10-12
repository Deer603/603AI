package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    static final AtomicHelper ATOMIC_HELPER = null;
    static final boolean GENERATE_CANCELLATION_CAUSES = false;
    private static final Object NULL = null;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    private static final Logger log = null;
    volatile Listener listeners;
    volatile Object value;
    volatile Waiter waiters;

    /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AtomicHelper {
        abstract boolean casListeners(AbstractResolvableFuture<?> r1, Listener r2, Listener r3);

        abstract boolean casValue(AbstractResolvableFuture<?> r1, Object r2, Object r3);

        abstract boolean casWaiters(AbstractResolvableFuture<?> r1, Waiter r2, Waiter r3);

        abstract void putNext(Waiter r1, Waiter r2);

        abstract void putThread(Waiter r1, Thread r2);

        private AtomicHelper() {
        }

        /* synthetic */ AtomicHelper(AnonymousClass1 x0) {
            this();
        }
    }

    private static final class Cancellation {
        static final Cancellation CAUSELESS_CANCELLED = null;
        static final Cancellation CAUSELESS_INTERRUPTED = null;
        final Throwable cause;
        final boolean wasInterrupted;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES == false) goto L5;
            CAUSELESS_CANCELLED = null;
            CAUSELESS_INTERRUPTED = null;
            return;
        L5:
            CAUSELESS_CANCELLED = new Cancellation(false, null);
            CAUSELESS_INTERRUPTED = new Cancellation(true, null);
        }

        Cancellation(boolean wasInterrupted, Throwable cause) {
            this.wasInterrupted = wasInterrupted;
            this.cause = cause;
        }
    }

    private static final class Failure {
        static final Failure FALLBACK_INSTANCE = null;
        final Throwable exception;

        static {
            final String r2 = "Failure occurred while trying to finish a future.";
            FALLBACK_INSTANCE = new Failure(new AnonymousClass1(r2));
        }

        Failure(Throwable exception) {
            this.exception = (Throwable) AbstractResolvableFuture.checkNotNull(exception);
        }
    }

    private static final class Listener {
        static final Listener TOMBSTONE = null;
        final Executor executor;
        Listener next;
        final Runnable task;

        static {
            TOMBSTONE = new Listener(null, null);
        }

        Listener(Runnable task, Executor executor) {
            this.task = task;
            this.executor = executor;
        }
    }

    private static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> listenersUpdater;
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> waitersUpdater;

        SafeAtomicHelper(AtomicReferenceFieldUpdater<Waiter, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<Waiter, Waiter> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Waiter> waitersUpdater, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Listener> listenersUpdater, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> valueUpdater) {
            super(null);
            this.waiterThreadUpdater = waiterThreadUpdater;
            this.waiterNextUpdater = waiterNextUpdater;
            this.waitersUpdater = waitersUpdater;
            this.listenersUpdater = listenersUpdater;
            this.valueUpdater = valueUpdater;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(Waiter waiter, Thread newValue) {
            this.waiterThreadUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter newValue) {
            this.waiterNextUpdater.lazySet(waiter, newValue);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(AbstractResolvableFuture<?> future, Waiter expect, Waiter update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.waitersUpdater, future, expect, update);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(AbstractResolvableFuture<?> future, Listener expect, Listener update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.listenersUpdater, future, expect, update);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(AbstractResolvableFuture<?> future, Object expect, Object update) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.valueUpdater, future, expect, update);
        }
    }

    private static final class SetFuture<V> implements Runnable {
        final ListenableFuture<? extends V> future;
        final AbstractResolvableFuture<V> owner;

        SetFuture(AbstractResolvableFuture<V> owner, ListenableFuture<? extends V> future) {
            this.owner = owner;
            this.future = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.owner.value == this) goto L5;
            return;
        L5:
            Object valueToSet = AbstractResolvableFuture.getFutureValue(this.future);
            if (AbstractResolvableFuture.ATOMIC_HELPER.casValue(this.owner, this, valueToSet) == false) goto L9;
            AbstractResolvableFuture.complete(this.owner);
            return;
        }
    }

    private static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super(null);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putThread(Waiter waiter, Thread newValue) {
            waiter.thread = newValue;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        void putNext(Waiter waiter, Waiter newValue) {
            waiter.next = newValue;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casWaiters(AbstractResolvableFuture<?> future, Waiter expect, Waiter update) {
            monitor-enter(future);
        L12:
            th = move-exception;
            throw th;
        L4:
            if (future.waiters != expect) goto L9;
            future.waiters = update;     // Catch: Throwable -> L12
            monitor-exit(future);     // Catch: Throwable -> L12
            return true;
        L9:
            monitor-exit(future);     // Catch: Throwable -> L12
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casListeners(AbstractResolvableFuture<?> future, Listener expect, Listener update) {
            monitor-enter(future);
        L12:
            th = move-exception;
            throw th;
        L4:
            if (future.listeners != expect) goto L9;
            future.listeners = update;     // Catch: Throwable -> L12
            monitor-exit(future);     // Catch: Throwable -> L12
            return true;
        L9:
            monitor-exit(future);     // Catch: Throwable -> L12
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        boolean casValue(AbstractResolvableFuture<?> future, Object expect, Object update) {
            monitor-enter(future);
        L12:
            th = move-exception;
            throw th;
        L4:
            if (future.value != expect) goto L9;
            future.value = update;     // Catch: Throwable -> L12
            monitor-exit(future);     // Catch: Throwable -> L12
            return true;
        L9:
            monitor-exit(future);     // Catch: Throwable -> L12
            return false;
        }
    }

    private static final class Waiter {
        static final Waiter TOMBSTONE = null;
        volatile Waiter next;
        volatile Thread thread;

        static {
            TOMBSTONE = new Waiter(false);
        }

        Waiter(boolean unused) {
        }

        Waiter() {
            AbstractResolvableFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        void setNext(Waiter next) {
            AbstractResolvableFuture.ATOMIC_HELPER.putNext(this, next);
        }

        void unpark() {
            Thread w = this.thread;
            if (w == null) goto L6;
            this.thread = null;
            LockSupport.unpark(w);
            return;
        }
    }

    static {
        GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        log = Logger.getLogger(AbstractResolvableFuture.class.getName());
        Throwable thrownAtomicReferenceFieldUpdaterFailure = null;
        AtomicHelper helper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "value"));     // Catch: Throwable -> L5
    L7:
        ATOMIC_HELPER = helper;
        if (thrownAtomicReferenceFieldUpdaterFailure == null) goto L10;
        log.log(Level.SEVERE, "SafeAtomicHelper is broken!", thrownAtomicReferenceFieldUpdaterFailure);
    L10:
        NULL = new Object();
        return;
    L5:
        atomicReferenceFieldUpdaterFailure = move-exception;
        thrownAtomicReferenceFieldUpdaterFailure = atomicReferenceFieldUpdaterFailure;
        helper = new SynchronizedHelper();
        goto L7
    }

    private void removeWaiter(Waiter node) {
        node.thread = null;
    L3:
        Waiter pred = null;
        Waiter curr = this.waiters;
        if (curr == Waiter.TOMBSTONE) goto L5;
    L6:
        if (curr == null) goto L18;
        Waiter succ = curr.next;
        if (curr.thread == null) goto L10;
        pred = curr;
    L17:
        curr = succ;
        goto L6
    L10:
        if (pred == null) goto L15;
        pred.next = succ;
        if (pred.thread != null) goto L17;
    L15:
        if (ATOMIC_HELPER.casWaiters(this, curr, succ) == true) goto L17;
    L18:
        return;
    }

    protected AbstractResolvableFuture() {
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws InterruptedException, TimeoutException, ExecutionException {
        long timeoutNanos = unit.toNanos(timeout);
        long remainingNanos = timeoutNanos;
        if (Thread.interrupted() == true) goto L87;
        Object localValue = this.value;
        if (localValue == null) goto L7;
        boolean r11 = true;
    L9:
        if ((r11 & (!(localValue instanceof SetFuture))) == true) goto L11;
        long r12 = 0;
        if (remainingNanos <= 0) goto L15;
        long endNanos = System.nanoTime() + remainingNanos;
    L17:
        if (remainingNanos < 1000) goto L44;
        Waiter oldHead = this.waiters;
        boolean r18 = true;
        if (oldHead == Waiter.TOMBSTONE) goto L43;
        Waiter node = new Waiter();
    L21:
        node.setNext(oldHead);
        long r19 = r12;
        if (ATOMIC_HELPER.casWaiters(this, oldHead, node) == true) goto L23;
        oldHead = this.waiters;
        if (oldHead == Waiter.TOMBSTONE) goto L43;
        r12 = r19;
    L23:
        LockSupport.parkNanos(this, remainingNanos);
        if (Thread.interrupted() == true) goto L36;
        Object localValue2 = this.value;
        if (localValue2 == null) goto L28;
        boolean r13 = true;
    L30:
        if ((r13 & (!(localValue2 instanceof SetFuture))) == true) goto L32;
        remainingNanos = endNanos - System.nanoTime();
        if (remainingNanos >= 1000) goto L23;
        removeWaiter(node);
    L46:
        if (remainingNanos <= r19) goto L60;
        Object localValue3 = this.value;
        if (localValue3 == null) goto L50;
        boolean r9 = r18;
    L52:
        if ((r9 & (!(localValue3 instanceof SetFuture))) == true) goto L54;
        if (Thread.interrupted() == true) goto L59;
        remainingNanos = endNanos - System.nanoTime();
        goto L46
    L59:
        throw new InterruptedException();
    L54:
        return getDoneValue(localValue3);
    L50:
        r9 = false;
        goto L52
    L60:
        String futureToString = toString();
        String unitString = unit.toString().toLowerCase(Locale.ROOT);
        String message = "Waited " + timeout + " " + unit.toString().toLowerCase(Locale.ROOT);
        if ((remainingNanos + 1000) >= r19) goto L81;
        String message2 = message + " (plus ";
        long overWaitNanos = -remainingNanos;
        long overWaitUnits = unit.convert(overWaitNanos, TimeUnit.NANOSECONDS);
        long overWaitNanos2 = overWaitNanos - unit.toNanos(overWaitUnits);
        if (overWaitUnits != r19) goto L65;
    L68:
        boolean shouldShowExtraNanos = r18;
    L70:
        if (overWaitUnits <= r19) goto L76;
        String message3 = message2 + overWaitUnits + " " + unitString;
        if (shouldShowExtraNanos == false) goto L75;
        message3 = message3 + ",";
    L75:
        message2 = message3 + " ";
    L76:
        if (shouldShowExtraNanos == false) goto L78;
        message2 = message2 + overWaitNanos2 + " nanoseconds ";
    L78:
        message = message2 + "delay)";
        goto L81
    L65:
        if (overWaitNanos2 > 1000) goto L68;
        shouldShowExtraNanos = false;
    L81:
        if (isDone() == false) goto L85;
        throw new TimeoutException(message + " but future completed as timeout expired");
    L85:
        throw new TimeoutException(message + " for " + futureToString);
    L32:
        return getDoneValue(localValue2);
    L28:
        r13 = false;
        goto L30
    L36:
        removeWaiter(node);
        throw new InterruptedException();
    L43:
        return getDoneValue(this.value);
    L44:
        r18 = true;
        r19 = 0;
        goto L46
    L15:
        endNanos = 0;
        goto L17
    L11:
        return getDoneValue(localValue);
    L7:
        r11 = false;
        goto L9
    L87:
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted() == true) goto L34;
        Object localValue = this.value;
        if (localValue == null) goto L7;
        boolean r3 = true;
    L9:
        if ((r3 & (!(localValue instanceof SetFuture))) == true) goto L11;
        Waiter oldHead = this.waiters;
        if (oldHead == Waiter.TOMBSTONE) goto L32;
        Waiter node = new Waiter();
    L15:
        node.setNext(oldHead);
        if (ATOMIC_HELPER.casWaiters(this, oldHead, node) == true) goto L17;
        oldHead = this.waiters;
        if (oldHead != Waiter.TOMBSTONE) goto L15;
    L17:
        LockSupport.park(this);
        if (Thread.interrupted() == true) goto L27;
        Object localValue2 = this.value;
        if (localValue2 == null) goto L22;
        boolean r5 = true;
    L24:
        if ((r5 & (!(localValue2 instanceof SetFuture))) == false) goto L17;
        return getDoneValue(localValue2);
    L22:
        r5 = false;
        goto L24
    L27:
        removeWaiter(node);
        throw new InterruptedException();
    L32:
        return getDoneValue(this.value);
    L11:
        return getDoneValue(localValue);
    L7:
        r3 = false;
        goto L9
    L34:
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object r3) throws ExecutionException {
        if ((r3 instanceof Cancellation) == true) goto L15;
        if ((r3 instanceof Failure) == true) goto L13;
        if (r3 != NULL) goto L11;
        return null;
    L11:
        return r3;
    L13:
        throw new ExecutionException(((Failure) r3).exception);
    L15:
        throw cancellationExceptionWithCause("Task was cancelled.", ((Cancellation) r3).cause);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object localValue = this.value;
        if (localValue == null) goto L5;
        boolean r2 = true;
    L7:
        return (true ^ (localValue instanceof SetFuture)) & r2;
    L5:
        r2 = false;
        goto L7
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object localValue = this.value;
        return localValue instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        Object localValue = this.value;
        boolean rValue = false;
        if (localValue != null) goto L5;
        boolean r4 = true;
    L7:
        if ((r4 | (localValue instanceof SetFuture)) == true) goto L9;
    L36:
        return rValue;
    L9:
        if (GENERATE_CANCELLATION_CAUSES == false) goto L11;
        Object valueToSet = new Cancellation(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
    L14:
        AbstractResolvableFuture<V> r5 = this;
    L16:
        if (ATOMIC_HELPER.casValue(r5, localValue, valueToSet) == true) goto L17;
        localValue = r5.value;
        if ((localValue instanceof SetFuture) == true) goto L16;
    L17:
        rValue = true;
        if (mayInterruptIfRunning == false) goto L20;
        r5.interruptTask();
    L20:
        complete(r5);
        if ((localValue instanceof SetFuture) == false) goto L36;
        ListenableFuture<?> futureToPropagateTo = ((SetFuture) localValue).future;
        if ((futureToPropagateTo instanceof AbstractResolvableFuture) == false) goto L32;
        AbstractResolvableFuture<V> r7 = (AbstractResolvableFuture) futureToPropagateTo;
        localValue = r7.value;
        if (localValue != null) goto L27;
        boolean r8 = true;
    L29:
        if ((r8 | (localValue instanceof SetFuture)) == false) goto L36;
        r5 = r7;
        goto L16
    L27:
        r8 = false;
        goto L29
    L32:
        futureToPropagateTo.cancel(mayInterruptIfRunning);
        goto L36
    L11:
        if (mayInterruptIfRunning == false) goto L13;
        valueToSet = Cancellation.CAUSELESS_INTERRUPTED;
        goto L14
    L13:
        valueToSet = Cancellation.CAUSELESS_CANCELLED;
        goto L14
    L5:
        r4 = false;
        goto L7
    }

    protected void interruptTask() {
    }

    protected final boolean wasInterrupted() {
        Object localValue = this.value;
        if ((localValue instanceof Cancellation) == true) goto L5;
    L7:
        return false;
    L5:
        if (((Cancellation) localValue).wasInterrupted == false) goto L7;
        return true;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        checkNotNull(listener);
        checkNotNull(executor);
        Listener oldHead = this.listeners;
        if (oldHead == Listener.TOMBSTONE) goto L10;
        Listener newNode = new Listener(listener, executor);
    L5:
        newNode.next = oldHead;
        if (ATOMIC_HELPER.casListeners(this, oldHead, newNode) == true) goto L7;
        oldHead = this.listeners;
        if (oldHead != Listener.TOMBSTONE) goto L5;
    L7:
        return;
    L10:
        executeListener(listener, executor);
    }

    protected boolean set(V value) {
        if (value != null) goto L4;
        Object valueToSet = NULL;
    L6:
        if (ATOMIC_HELPER.casValue(this, null, valueToSet) == false) goto L9;
        complete(this);
        return true;
    L9:
        return false;
    L4:
        valueToSet = value;
        goto L6
    }

    protected boolean setException(Throwable throwable) {
        Object valueToSet = new Failure((Throwable) checkNotNull(throwable));
        if (ATOMIC_HELPER.casValue(this, null, valueToSet) == false) goto L6;
        complete(this);
        return true;
    L6:
        return false;
    }

    protected boolean setFuture(ListenableFuture<? extends V> future) {
        checkNotNull(future);
        Object localValue = this.value;
        if (localValue != null) goto L24;
        if (future.isDone() == false) goto L11;
        Object value = getFutureValue(future);
        if (ATOMIC_HELPER.casValue(this, null, value) == false) goto L10;
        complete(this);
        return true;
    L10:
        return false;
    L11:
        SetFuture valueToSet = new SetFuture(this, future);
        if (ATOMIC_HELPER.casValue(this, null, valueToSet) == true) goto L27;
        localValue = this.value;
        goto L24
    L27:
        future.addListener(valueToSet, DirectExecutor.INSTANCE);     // Catch: Throwable -> L15
    L21:
        return true;
    L15:
        t = move-exception;
        Failure failure = new Failure(t);     // Catch: Throwable -> L18
    L20:
        ATOMIC_HELPER.casValue(this, valueToSet, failure);
    L19:
        failure = Failure.FALLBACK_INSTANCE;
    L24:
        if ((localValue instanceof Cancellation) == false) goto L26;
        future.cancel(((Cancellation) localValue).wasInterrupted);
    L26:
        return false;
    }

    static Object getFutureValue(ListenableFuture<?> future) {
        if ((future instanceof AbstractResolvableFuture) == false) goto L14;
        Object v = ((AbstractResolvableFuture) future).value;
        if ((v instanceof Cancellation) == false) goto L38;
        Cancellation c = (Cancellation) v;
        if (c.wasInterrupted == true) goto L9;
        return v;
    L9:
        if (c.cause == null) goto L11;
        Object v2 = new Cancellation(false, c.cause);
    L13:
        return v2;
    L11:
        v2 = Cancellation.CAUSELESS_CANCELLED;
        goto L13
    L38:
        return v;
    L14:
        boolean wasCancelled = future.isCancelled();
        if (((!GENERATE_CANCELLATION_CAUSES) & wasCancelled) == true) goto L17;
        Object v3 = getUninterruptibly(future);     // Catch: Throwable -> L24 CancellationException -> L27 ExecutionException -> L33
        if (v3 != null) goto L23;
    L40:
        return NULL;
    L23:
        return v3;
    L27:
        cancellation = move-exception;
        if (wasCancelled == true) goto L32;
        return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, cancellation));
    L32:
        return new Cancellation(false, cancellation);
    L33:
        exception = move-exception;
        return new Failure(exception.getCause());
    L24:
        t = move-exception;
        return new Failure(t);
    L17:
        return Cancellation.CAUSELESS_CANCELLED;
    }

    static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        boolean interrupted = false;
    L13:
        V r1 = future.get();     // Catch: Throwable -> L7 InterruptedException -> L11
        goto L12
    L4:
        if (interrupted == false) goto L6;
        Thread.currentThread().interrupt();
    L6:
        return r1;
    L7:
        th = move-exception;
        if (interrupted == false) goto L10;
        Thread.currentThread().interrupt();
    L10:
        throw th;
    L12:
        interrupted = true;
        goto L13
    }

    static void complete(AbstractResolvableFuture<?> future) {
        Listener next = null;
    L3:
        future.releaseWaiters();
        future.afterDone();
        next = future.clearListeners(next);
    L4:
        if (next == null) goto L15;
        Listener curr = next;
        next = next.next;
        Runnable task = curr.task;
        if ((task instanceof SetFuture) == true) goto L7;
        executeListener(task, curr.executor);
        goto L4
    L7:
        SetFuture<?> setFuture = (SetFuture) task;
        future = setFuture.owner;
        if (future.value != setFuture) goto L4;
        Object valueToSet = getFutureValue(setFuture.future);
        if (ATOMIC_HELPER.casValue(future, setFuture, valueToSet) == false) goto L4;
    }

    protected void afterDone() {
    }

    final void maybePropagateCancellationTo(Future<?> related) {
        if (related == null) goto L4;
        boolean r0 = true;
    L6:
        if ((r0 & isCancelled()) == false) goto L9;
        related.cancel(wasInterrupted());
        return;
    L9:
        return;
    L4:
        r0 = false;
        goto L6
    }

    private void releaseWaiters() {
    L2:
        Waiter head = this.waiters;
        if (ATOMIC_HELPER.casWaiters(this, head, Waiter.TOMBSTONE) == false) goto L2;
        Waiter currentWaiter = head;
    L5:
        if (currentWaiter == null) goto L7;
        currentWaiter.unpark();
        currentWaiter = currentWaiter.next;
        goto L5
    }

    private Listener clearListeners(Listener onto) {
    L2:
        Listener head = this.listeners;
        if (ATOMIC_HELPER.casListeners(this, head, Listener.TOMBSTONE) == false) goto L2;
        Listener reversedList = onto;
    L5:
        if (head == null) goto L7;
        Listener tmp = head;
        head = head.next;
        tmp.next = reversedList;
        reversedList = tmp;
        goto L5
    L7:
        return reversedList;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled() == false) goto L6;
        builder.append("CANCELLED");
    L21:
        return builder.append("]").toString();
    L6:
        if (isDone() == false) goto L22;
        addDoneString(builder);
        goto L21
    L22:
        String pendingDescription = pendingToString();     // Catch: RuntimeException -> L10
    L12:
        if (pendingDescription == null) goto L17;
        if (pendingDescription.isEmpty() == true) goto L17;
        builder.append("PENDING, info=[").append(pendingDescription).append("]");
    L17:
        if (isDone() == false) goto L19;
        addDoneString(builder);
        goto L21
    L19:
        builder.append("PENDING");
    L10:
        e = move-exception;
        pendingDescription = "Exception thrown from implementation: " + e.getClass();
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String pendingToString() {
        Object localValue = this.value;
        if ((localValue instanceof SetFuture) == false) goto L7;
        return "setFuture=[" + userObjectToString(((SetFuture) localValue).future) + "]";
    L7:
        if ((this instanceof ScheduledFuture) == true) goto L9;
        return null;
    L9:
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private void addDoneString(StringBuilder builder) {
        Object r1 = getUninterruptibly(this);     // Catch: RuntimeException -> L5 CancellationException -> L7 ExecutionException -> L9
        builder.append("SUCCESS, result=[").append(userObjectToString(r1)).append("]");     // Catch: RuntimeException -> L5 CancellationException -> L7 ExecutionException -> L9
        goto L8
    L15:
        return;
    L5:
        e = move-exception;
        builder.append("UNKNOWN, cause=[").append(e.getClass()).append(" thrown from get()]");
        return;
    L9:
        e = move-exception;
        builder.append("FAILURE, cause=[").append(e.getCause()).append("]");
        return;
    L8:
        builder.append("CANCELLED");
    }

    private String userObjectToString(Object o) {
        if (o != this) goto L6;
        return "this future";
    L6:
        return String.valueOf(o);
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        executor.execute(runnable);     // Catch: RuntimeException -> L4
        return;
    L4:
        e = move-exception;
        log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
    }

    private static CancellationException cancellationExceptionWithCause(String message, Throwable cause) {
        CancellationException exception = new CancellationException(message);
        exception.initCause(cause);
        return exception;
    }

    static <T> T checkNotNull(T reference) {
        if (reference == null) goto L5;
        return reference;
    L5:
        throw new NullPointerException();
    }
}
