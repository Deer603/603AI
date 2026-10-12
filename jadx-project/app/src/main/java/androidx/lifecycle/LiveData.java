package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = null;
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap<Observer<? super T>, LiveData<T>.ObserverWrapper> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    private class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        final /* synthetic */ LiveData this$0;

        AlwaysActiveObserver(LiveData r1, Observer<? super T> observer) {
            this.this$0 = r1;
            super(r1, observer);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
            return true;
        }
    }

    class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        final LifecycleOwner mOwner;
        final /* synthetic */ LiveData this$0;

        LifecycleBoundObserver(LiveData this$0, LifecycleOwner owner, Observer<? super T> observer) {
            this.this$0 = this$0;
            super(this$0, observer);
            this.mOwner = owner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState != Lifecycle.State.DESTROYED) goto L6;
            this.this$0.removeObserver(this.mObserver);
            return;
        L6:
            Lifecycle.State prevState = null;
        L7:
            if (prevState == currentState) goto L9;
            prevState = currentState;
            activeStateChanged(shouldBeActive());
            currentState = this.mOwner.getLifecycle().getCurrentState();
            goto L7
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        boolean isAttachedTo(LifecycleOwner owner) {
            if (this.mOwner != owner) goto L5;
            return true;
        L5:
            return false;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }
    }

    private abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion;
        final Observer<? super T> mObserver;
        final /* synthetic */ LiveData this$0;

        abstract boolean shouldBeActive();

        ObserverWrapper(LiveData r1, Observer<? super T> observer) {
            this.this$0 = r1;
            this.mLastVersion = -1;
            this.mObserver = observer;
        }

        boolean isAttachedTo(LifecycleOwner owner) {
            return false;
        }

        void detachObserver() {
        }

        void activeStateChanged(boolean newActive) {
            if (newActive != this.mActive) goto L5;
            return;
        L5:
            this.mActive = newActive;
            LiveData r0 = this.this$0;
            if (this.mActive == false) goto L8;
            int r1 = 1;
        L9:
            r0.changeActiveCounter(r1);
            if (this.mActive == false) goto L13;
            this.this$0.dispatchingValue(this);
            return;
        L13:
            return;
        L8:
            r1 = -1;
            goto L9
        }
    }

    static {
        NOT_SET = new Object();
    }

    public LiveData(T value) {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new AnonymousClass1(this);
        this.mData = value;
        this.mVersion = 0;
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new AnonymousClass1(this);
        this.mData = NOT_SET;
        this.mVersion = -1;
    }

    private void considerNotify(LiveData<T>.ObserverWrapper r3) {
        if (r3.mActive == true) goto L6;
        return;
    L6:
        if (r3.shouldBeActive() == true) goto L10;
        r3.activeStateChanged(false);
        return;
    L10:
        if (r3.mLastVersion < this.mVersion) goto L12;
        return;
    L12:
        r3.mLastVersion = this.mVersion;
        r3.mObserver.onChanged((Object) this.mData);
    }

    void dispatchingValue(LiveData<T>.ObserverWrapper initiator) {
        if (this.mDispatchingValue == false) goto L6;
        this.mDispatchInvalidated = true;
        return;
    L6:
        this.mDispatchingValue = true;
    L7:
        this.mDispatchInvalidated = false;
        if (initiator == null) goto L10;
        considerNotify(initiator);
        initiator = null;
    L16:
        if (this.mDispatchInvalidated == true) goto L7;
        this.mDispatchingValue = false;
        return;
    L10:
        Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> iterator = this.mObservers.iteratorWithAdditions();
    L12:
        if (iterator.hasNext() == false) goto L16;
        considerNotify(iterator.next().getValue());
        if (this.mDispatchInvalidated == false) goto L12;
        goto L16
    }

    public void observe(LifecycleOwner owner, Observer<? super T> observer) {
        assertMainThread("observe");
        if (owner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) goto L5;
        return;
    L5:
        LiveData<T>.LifecycleBoundObserver wrapper = new LifecycleBoundObserver(this, owner, observer);
        LiveData<T>.ObserverWrapper existing = this.mObservers.putIfAbsent(observer, wrapper);
        if (existing != null) goto L8;
    L12:
        if (existing == null) goto L14;
        return;
    L14:
        owner.getLifecycle().addObserver(wrapper);
        return;
    L8:
        if (existing.isAttachedTo(owner) == true) goto L12;
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void observeForever(Observer<? super T> observer) {
        assertMainThread("observeForever");
        LiveData<T>.AlwaysActiveObserver wrapper = new AlwaysActiveObserver(this, observer);
        LiveData<T>.ObserverWrapper existing = this.mObservers.putIfAbsent(observer, wrapper);
        if ((existing instanceof LifecycleBoundObserver) == true) goto L9;
        if (existing == null) goto L6;
        return;
    L6:
        wrapper.activeStateChanged(true);
        return;
    L9:
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void removeObserver(Observer<? super T> observer) {
        assertMainThread("removeObserver");
        LiveData<T>.ObserverWrapper removed = this.mObservers.remove(observer);
        if (removed != null) goto L5;
        return;
    L5:
        removed.detachObserver();
        removed.activeStateChanged(false);
    }

    public void removeObservers(LifecycleOwner owner) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> r0 = this.mObservers.iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper> entry = r0.next();
        if (entry.getValue().isAttachedTo(owner) == false) goto L4;
        removeObserver(entry.getKey());
        goto L4
    }

    protected void postValue(T value) {
        Object r0 = this.mDataLock;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.mPendingData != NOT_SET) goto L7;
        boolean postTask = true;
    L8:
        this.mPendingData = value;     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        if (postTask == true) goto L12;
        return;
    L12:
        ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
        return;
    L7:
        postTask = false;
        goto L8
    }

    protected void setValue(T value) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = value;
        dispatchingValue(null);
    }

    public T getValue() {
        T r0 = (T) this.mData;
        if (r0 == NOT_SET) goto L5;
        return r0;
    L5:
        return null;
    }

    public boolean isInitialized() {
        if (this.mData == NOT_SET) goto L5;
        return true;
    L5:
        return false;
    }

    int getVersion() {
        return this.mVersion;
    }

    protected void onActive() {
    }

    protected void onInactive() {
    }

    public boolean hasObservers() {
        if (this.mObservers.size() <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    void changeActiveCounter(int change) {
        int previousActiveCount = this.mActiveCount;
        this.mActiveCount += change;
        if (this.mChangingActiveState == false) goto L5;
        return;
    L5:
        this.mChangingActiveState = true;
    L30:
        if (previousActiveCount == this.mActiveCount) goto L25;
        if (previousActiveCount == 0) goto L11;
    L13:
        boolean needToCallActive = false;
    L14:
        if (previousActiveCount > 0) goto L16;
    L18:
        boolean needToCallInactive = false;
    L19:
        previousActiveCount = this.mActiveCount;     // Catch: Throwable -> L27
        if (needToCallActive == true) goto L21;
        if (needToCallInactive == false) goto L30;
        onInactive();     // Catch: Throwable -> L27
        goto L30
    L21:
        onActive();     // Catch: Throwable -> L27
        goto L30
    L16:
        if (this.mActiveCount != 0) goto L18;
        needToCallInactive = true;
        goto L19
    L11:
        if (this.mActiveCount <= 0) goto L13;
        needToCallActive = true;
        goto L14
    L25:
        this.mChangingActiveState = false;
        return;
    L27:
        th = move-exception;
        this.mChangingActiveState = false;
        throw th;
    }

    static void assertMainThread(String methodName) {
        if (ArchTaskExecutor.getInstance().isMainThread() == false) goto L6;
        return;
    L6:
        throw new IllegalStateException("Cannot invoke " + methodName + " on a background thread");
    }
}
