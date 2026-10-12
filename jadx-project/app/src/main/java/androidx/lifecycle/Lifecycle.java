package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH'R6\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058G@GX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "value", "Landroidx/lifecycle/AtomicReference;", "internalScopeRef", "getInternalScopeRef", "()Landroidx/lifecycle/AtomicReference;", "setInternalScopeRef", "(Landroidx/lifecycle/AtomicReference;)V", "addObserver", "", "observer", "Landroidx/lifecycle/LifecycleObserver;", "removeObserver", "currentState", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Event", "State", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Lifecycle {
    private AtomicReference<Object> internalScopeRef;

    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "<init>", "(Ljava/lang/String;I)V", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "Companion", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final enum Event extends Enum<Event> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ Event[] $VALUES = null;
        public static final Companion Companion = null;
        public static final Event ON_ANY = null;
        public static final Event ON_CREATE = null;
        public static final Event ON_DESTROY = null;
        public static final Event ON_PAUSE = null;
        public static final Event ON_RESUME = null;
        public static final Event ON_START = null;
        public static final Event ON_STOP = null;

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "<init>", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Lifecycle.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

                static {
                    int[] r0 = new int[State.values().length];
                    r0[State.CREATED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
                L20:
                    r0[State.STARTED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
                L24:
                    r0[State.RESUMED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
                L28:
                    r0[State.DESTROYED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
                L22:
                    r0[State.INITIALIZED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
                L18:
                    $EnumSwitchMapping$0 = r0;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Event downFrom(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case 1: goto L8;
                    case 2: goto L11;
                    case 3: goto L10;
                    default: goto L4;
                };
            L4:
                return null;
            L10:
                return Event.ON_PAUSE;
            L11:
                return Event.ON_STOP;
            L8:
                return Event.ON_DESTROY;
            }

            @JvmStatic
            public final Event downTo(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case 1: goto L8;
                    case 2: goto L11;
                    case 3: goto L4;
                    case 4: goto L10;
                    default: goto L4;
                };
            L4:
                return null;
            L10:
                return Event.ON_DESTROY;
            L11:
                return Event.ON_PAUSE;
            L8:
                return Event.ON_STOP;
            }

            @JvmStatic
            public final Event upFrom(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case 1: goto L8;
                    case 2: goto L11;
                    case 3: goto L4;
                    case 4: goto L4;
                    case 5: goto L10;
                    default: goto L4;
                };
            L4:
                return null;
            L10:
                return Event.ON_CREATE;
            L11:
                return Event.ON_RESUME;
            L8:
                return Event.ON_START;
            }

            @JvmStatic
            public final Event upTo(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                switch(WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case 1: goto L8;
                    case 2: goto L11;
                    case 3: goto L10;
                    default: goto L4;
                };
            L4:
                return null;
            L10:
                return Event.ON_RESUME;
            L11:
                return Event.ON_START;
            L8:
                return Event.ON_CREATE;
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[Event.values().length];
                r0[Event.ON_CREATE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            L26:
                r0[Event.ON_STOP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L32:
                r0[Event.ON_START.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
            L36:
                r0[Event.ON_PAUSE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
            L28:
                r0[Event.ON_RESUME.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
            L30:
                r0[Event.ON_DESTROY.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
            L38:
                r0[Event.ON_ANY.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
            L24:
                $EnumSwitchMapping$0 = r0;
            }
        }

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        private Event(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            ON_CREATE = new Event("ON_CREATE", 0);
            ON_START = new Event("ON_START", 1);
            ON_RESUME = new Event("ON_RESUME", 2);
            ON_PAUSE = new Event("ON_PAUSE", 3);
            ON_STOP = new Event("ON_STOP", 4);
            ON_DESTROY = new Event("ON_DESTROY", 5);
            ON_ANY = new Event("ON_ANY", 6);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
            Companion = new Companion(null);
        }

        public final State getTargetState() {
            switch(WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1: goto L15;
                case 2: goto L15;
                case 3: goto L13;
                case 4: goto L13;
                case 5: goto L11;
                case 6: goto L9;
                case 7: goto L7;
                default: goto L5;
            };
        L5:
            throw new NoWhenBranchMatchedException();
        L7:
            throw new IllegalArgumentException(this + " has no target state");
        L9:
            return State.DESTROYED;
        L11:
            return State.RESUMED;
        L13:
            return State.STARTED;
        L15:
            return State.CREATED;
        }

        @JvmStatic
        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        @JvmStatic
        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        @JvmStatic
        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        @JvmStatic
        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        public static Event valueOf(String value) {
            return (Event) Enum.valueOf(Event.class, value);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "<init>", "(Ljava/lang/String;I)V", "DESTROYED", "INITIALIZED", DebugCoroutineInfoImplKt.CREATED, "STARTED", "RESUMED", "isAtLeast", "", "state", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final enum State extends Enum<State> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State CREATED = null;
        public static final State DESTROYED = null;
        public static final State INITIALIZED = null;
        public static final State RESUMED = null;
        public static final State STARTED = null;

        private static final /* synthetic */ State[] $values() {
            return new State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        private State(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            DESTROYED = new State("DESTROYED", 0);
            INITIALIZED = new State("INITIALIZED", 1);
            CREATED = new State(DebugCoroutineInfoImplKt.CREATED, 2);
            STARTED = new State("STARTED", 3);
            RESUMED = new State("RESUMED", 4);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }

        public final boolean isAtLeast(State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (compareTo(state) < 0) goto L5;
            return true;
        L5:
            return false;
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String value) {
            return (State) Enum.valueOf(State.class, value);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public abstract void addObserver(LifecycleObserver r1);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver r1);

    public Lifecycle() {
        this.internalScopeRef = new AtomicReference(null);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public final void setInternalScopeRef(AtomicReference<Object> r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.internalScopeRef = r2;
    }

    public StateFlow<State> getCurrentStateFlow() {
        final MutableStateFlow mutableStateFlow = StateFlowKt.MutableStateFlow(getCurrentState());
        LifecycleEventObserver it = new Lifecycle$$ExternalSyntheticLambda0(mutableStateFlow);
        addObserver(it);
        return FlowKt.asStateFlow(mutableStateFlow);
    }

    static final void _get_currentStateFlow_$lambda$0(MutableStateFlow $mutableStateFlow, LifecycleOwner r2, Event event) {
        Intrinsics.checkNotNullParameter(r2, "<unused var>");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        $mutableStateFlow.setValue(event.getTargetState());
    }
}
