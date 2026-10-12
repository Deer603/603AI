package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class CallbackToFutureAdapter {

    public static final class Completer<T> {
        private boolean attemptedSetting;
        private ResolvableFuture<Void> cancellationFuture;
        SafeFuture<T> future;
        Object tag;

        Completer() {
            this.cancellationFuture = ResolvableFuture.create();
        }

        public boolean set(T value) {
            boolean wasSet = true;
            this.attemptedSetting = true;
            SafeFuture<T> localFuture = this.future;
            if (localFuture != null) goto L5;
        L7:
            wasSet = false;
        L8:
            if (wasSet == false) goto L10;
            setCompletedNormally();
        L10:
            return wasSet;
        L5:
            if (localFuture.set(value) == false) goto L7;
            goto L7
        }

        public boolean setException(Throwable t) {
            boolean wasSet = true;
            this.attemptedSetting = true;
            SafeFuture<T> localFuture = this.future;
            if (localFuture != null) goto L5;
        L7:
            wasSet = false;
        L8:
            if (wasSet == false) goto L10;
            setCompletedNormally();
        L10:
            return wasSet;
        L5:
            if (localFuture.setException(t) == false) goto L7;
            goto L7
        }

        public boolean setCancelled() {
            boolean wasSet = true;
            this.attemptedSetting = true;
            SafeFuture<T> localFuture = this.future;
            if (localFuture != null) goto L5;
        L7:
            wasSet = false;
        L8:
            if (wasSet == false) goto L10;
            setCompletedNormally();
        L10:
            return wasSet;
        L5:
            if (localFuture.cancelWithoutNotifyingCompleter(true) == false) goto L7;
            goto L7
        }

        public void addCancellationListener(Runnable runnable, Executor executor) {
            ListenableFuture<?> localCancellationFuture = this.cancellationFuture;
            if (localCancellationFuture == null) goto L6;
            localCancellationFuture.addListener(runnable, executor);
            return;
        }

        void fireCancellationListeners() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture.set(null);
        }

        private void setCompletedNormally() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }

        protected void finalize() {
            SafeFuture<T> localFuture = this.future;
            if (localFuture == null) goto L8;
            if (localFuture.isDone() == true) goto L8;
            localFuture.setException(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.tag));
        L8:
            if (this.attemptedSetting == true) goto L13;
            ResolvableFuture<Void> localCancellationFuture = this.cancellationFuture;
            if (localCancellationFuture == null) goto L14;
            localCancellationFuture.set(null);
            return;
        L14:
            return;
        }
    }

    static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String message) {
            super(message);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            monitor-enter(this);
            monitor-exit(this);
            return this;
        }
    }

    public interface Resolver<T> {
        Object attachCompleter(Completer<T> r1) throws Exception;
    }

    private static final class SafeFuture<T> implements ListenableFuture<T> {
        final WeakReference<Completer<T>> completerWeakReference;
        private final AbstractResolvableFuture<T> delegate;

        SafeFuture(Completer<T> completer) {
            this.delegate = new AnonymousClass1(this);
            this.completerWeakReference = new WeakReference(completer);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            Completer<T> completer = this.completerWeakReference.get();
            boolean cancelled = this.delegate.cancel(mayInterruptIfRunning);
            if (cancelled == false) goto L6;
            if (completer == null) goto L6;
            completer.fireCancellationListeners();
        L6:
            return cancelled;
        }

        boolean cancelWithoutNotifyingCompleter(boolean shouldInterrupt) {
            return this.delegate.cancel(shouldInterrupt);
        }

        boolean set(T value) {
            return this.delegate.set(value);
        }

        boolean setException(Throwable t) {
            return this.delegate.setException(t);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.delegate.get(timeout, unit);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable listener, Executor executor) {
            this.delegate.addListener(listener, executor);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    private CallbackToFutureAdapter() {
    }

    public static <T> ListenableFuture<T> getFuture(Resolver<T> callback) {
        Completer<T> completer = new Completer();
        SafeFuture<T> safeFuture = new SafeFuture(completer);
        completer.future = safeFuture;
        completer.tag = callback.getClass();
        Object tag = callback.attachCompleter(completer);     // Catch: Exception -> L7
        if (tag == null) goto L9;
        completer.tag = tag;     // Catch: Exception -> L7
    L9:
        return safeFuture;
    L7:
        e = move-exception;
        safeFuture.setException(e);
        goto L9
    }
}
