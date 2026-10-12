package androidx.lifecycle;

import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 <2\u00020\u0001:\u0002;<B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000bH\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bH\u0017J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000bH\u0017J\u0010\u00105\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020:H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0016j\b\u0012\u0004\u0012\u00020\u000e`\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010*\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00102\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006="}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "provider", "Landroidx/lifecycle/LifecycleOwner;", "enforceMainThread", "", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "(Landroidx/lifecycle/LifecycleOwner;)V", "observerMap", "Landroidx/arch/core/internal/FastSafeIterableMap;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "state", "Landroidx/lifecycle/Lifecycle$State;", "lifecycleOwner", "Ljava/lang/ref/WeakReference;", "addingObserverCounter", "", "handlingEvent", "newEventOccurred", "parentStates", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "markState", "", "currentState", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "_currentStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "handleLifecycleEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "moveToState", "next", "isSynced", "()Z", "calculateTargetState", "observer", "addObserver", "popParentState", "pushParentState", "removeObserver", "observerCount", "getObserverCount", "()I", "forwardPass", "backwardPass", "sync", "enforceMainThreadIfNeeded", "methodName", "", "ObserverWithState", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = null;
    private final MutableStateFlow<Lifecycle.State> _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;
    private ArrayList<Lifecycle.State> parentStates;
    private Lifecycle.State state;

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "<init>", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LifecycleRegistry createUnsafe(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        @JvmStatic
        public final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state1, Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            if (state2 == null) goto L8;
            if (state2.compareTo(state1) >= 0) goto L8;
            return state2;
        L8:
            return state1;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "initialState", "Landroidx/lifecycle/Lifecycle$State;", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "state", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "dispatchEvent", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ObserverWithState {
        private LifecycleEventObserver lifecycleObserver;
        private Lifecycle.State state;

        public ObserverWithState(LifecycleObserver observer, Lifecycle.State initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(observer);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(observer);
            this.state = initialState;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setState(Lifecycle.State r2) {
            Intrinsics.checkNotNullParameter(r2, "<set-?>");
            this.state = r2;
        }

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final void setLifecycleObserver(LifecycleEventObserver r2) {
            Intrinsics.checkNotNullParameter(r2, "<set-?>");
            this.lifecycleObserver = r2;
        }

        public final void dispatchEvent(LifecycleOwner owner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
            Lifecycle.State newState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, newState);
            LifecycleEventObserver r1 = this.lifecycleObserver;
            Intrinsics.checkNotNull(owner);
            r1.onStateChanged(owner, event);
            this.state = newState;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner r1, boolean r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    private LifecycleRegistry(LifecycleOwner provider, boolean enforceMainThread) {
        this.enforceMainThread = enforceMainThread;
        this.observerMap = new FastSafeIterableMap();
        this.state = Lifecycle.State.INITIALIZED;
        this.parentStates = new ArrayList();
        this.lifecycleOwner = new WeakReference(provider);
        this._currentStateFlow = StateFlowKt.MutableStateFlow(Lifecycle.State.INITIALIZED);
    }

    public LifecycleRegistry(LifecycleOwner provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this(provider, true);
    }

    @Deprecated(message = "Override [currentState].")
    public void markState(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    public void setCurrentState(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public StateFlow<Lifecycle.State> getCurrentStateFlow() {
        return FlowKt.asStateFlow(this._currentStateFlow);
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    private final void moveToState(Lifecycle.State next) {
        if (this.state != next) goto L5;
        return;
    L5:
        LifecycleRegistryKt.checkLifecycleStateTransition(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent == false) goto L8;
    L14:
        this.newEventOccurred = true;
        return;
    L8:
        if (this.addingObserverCounter != 0) goto L14;
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state != Lifecycle.State.DESTROYED) goto L16;
        this.observerMap = new FastSafeIterableMap();
        return;
    }

    private final boolean isSynced() {
        if (this.observerMap.size() != 0) goto L5;
        return true;
    L5:
        Map.Entry<LifecycleObserver, ObserverWithState> r0 = this.observerMap.eldest();
        Intrinsics.checkNotNull(r0);
        Lifecycle.State eldestObserverState = r0.getValue().getState();
        Map.Entry<LifecycleObserver, ObserverWithState> r2 = this.observerMap.newest();
        Intrinsics.checkNotNull(r2);
        Lifecycle.State newestObserverState = r2.getValue().getState();
        if (eldestObserverState == newestObserverState) goto L8;
    L10:
        return false;
    L8:
        if (this.state != newestObserverState) goto L10;
        return true;
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver observer) {
        Map.Entry<LifecycleObserver, ObserverWithState> r0 = this.observerMap.ceil(observer);
        Lifecycle.State parentState = null;
        if (r0 == null) goto L7;
        ObserverWithState r2 = r0.getValue();
        if (r2 == null) goto L7;
        Lifecycle.State siblingState = r2.getState();
    L9:
        if (this.parentStates.isEmpty() == true) goto L12;
        parentState = this.parentStates.get(this.parentStates.size() - 1);
    L12:
        return Companion.min$lifecycle_runtime_release(Companion.min$lifecycle_runtime_release(this.state, siblingState), parentState);
    L7:
        siblingState = null;
        goto L9
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        if (this.state != Lifecycle.State.DESTROYED) goto L5;
        Lifecycle.State initialState = Lifecycle.State.DESTROYED;
    L6:
        ObserverWithState statefulObserver = new ObserverWithState(observer, initialState);
        ObserverWithState previous = this.observerMap.putIfAbsent(observer, statefulObserver);
        if (previous == null) goto L9;
        return;
    L9:
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner != null) goto L13;
        return;
    L13:
        if (this.addingObserverCounter == 0) goto L15;
    L18:
        boolean isReentrance = true;
    L19:
        Lifecycle.State targetState = calculateTargetState(observer);
        this.addingObserverCounter++;
    L21:
        if (statefulObserver.getState().compareTo(targetState) >= 0) goto L29;
        if (this.observerMap.contains(observer) == false) goto L29;
        pushParentState(statefulObserver.getState());
        Lifecycle.Event event = Lifecycle.Event.Companion.upFrom(statefulObserver.getState());
        if (event == null) goto L28;
        statefulObserver.dispatchEvent(lifecycleOwner, event);
        popParentState();
        targetState = calculateTargetState(observer);
        goto L21
    L28:
        throw new IllegalStateException("no event up from " + statefulObserver.getState());
    L29:
        if (isReentrance == true) goto L31;
        sync();
    L31:
        this.addingObserverCounter--;
        return;
    L15:
        if (this.handlingEvent == true) goto L18;
        isReentrance = false;
        goto L19
    L5:
        initialState = Lifecycle.State.INITIALIZED;
        goto L6
    }

    private final void popParentState() {
        this.parentStates.remove(this.parentStates.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(observer);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        Iterator r0 = this.observerMap.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(r0, "iteratorWithAdditions(...)");
        Iterator ascendingIterator = r0;
    L4:
        if (ascendingIterator.hasNext() == false) goto L19;
        if (this.newEventOccurred == true) goto L27;
        Map.Entry r1 = ascendingIterator.next();
        LifecycleObserver key = (LifecycleObserver) r1.getKey();
        ObserverWithState observer = (ObserverWithState) r1.getValue();
    L9:
        if (observer.getState().compareTo(this.state) >= 0) goto L4;
        if (this.newEventOccurred == true) goto L4;
        if (this.observerMap.contains(key) == false) goto L4;
        pushParentState(observer.getState());
        Lifecycle.Event event = Lifecycle.Event.Companion.upFrom(observer.getState());
        if (event == null) goto L18;
        observer.dispatchEvent(lifecycleOwner, event);
        popParentState();
        goto L9
    L18:
        throw new IllegalStateException("no event up from " + observer.getState());
    L27:
        return;
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> r0 = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(r0, "descendingIterator(...)");
    L4:
        if (r0.hasNext() == false) goto L19;
        if (this.newEventOccurred == true) goto L27;
        Map.Entry<LifecycleObserver, ObserverWithState> r1 = r0.next();
        Intrinsics.checkNotNull(r1);
        LifecycleObserver key = r1.getKey();
        ObserverWithState observer = r1.getValue();
    L9:
        if (observer.getState().compareTo(this.state) <= 0) goto L4;
        if (this.newEventOccurred == true) goto L4;
        if (this.observerMap.contains(key) == false) goto L4;
        Lifecycle.Event event = Lifecycle.Event.Companion.downFrom(observer.getState());
        if (event == null) goto L18;
        pushParentState(event.getTargetState());
        observer.dispatchEvent(lifecycleOwner, event);
        popParentState();
        goto L9
    L18:
        throw new IllegalStateException("no event down from " + observer.getState());
    L27:
        return;
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) goto L18;
    L5:
        if (isSynced() == true) goto L15;
        this.newEventOccurred = false;
        Lifecycle.State r1 = this.state;
        Map.Entry<LifecycleObserver, ObserverWithState> r2 = this.observerMap.eldest();
        Intrinsics.checkNotNull(r2);
        if (r1.compareTo(r2.getValue().getState()) >= 0) goto L9;
        backwardPass(lifecycleOwner);
    L9:
        Map.Entry<LifecycleObserver, ObserverWithState> r3 = this.observerMap.newest();
        if (this.newEventOccurred == true) goto L5;
        if (r3 == null) goto L5;
        if (this.state.compareTo(r3.getValue().getState()) <= 0) goto L5;
        forwardPass(lifecycleOwner);
        goto L5
    L15:
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getCurrentState());
        return;
    L18:
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    private final void enforceMainThreadIfNeeded(String methodName) {
        if (this.enforceMainThread == true) goto L5;
        return;
    L5:
        if (LifecycleRegistry_androidKt.isMainThread() == false) goto L8;
        return;
    L8:
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    @JvmStatic
    public static final LifecycleRegistry createUnsafe(LifecycleOwner owner) {
        return Companion.createUnsafe(owner);
    }

    @JvmStatic
    public static final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state1, Lifecycle.State state2) {
        return Companion.min$lifecycle_runtime_release(state1, state2);
    }
}
