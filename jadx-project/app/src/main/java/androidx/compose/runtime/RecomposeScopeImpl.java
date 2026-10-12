package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010D\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u000eJ\u001c\u0010G\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u0010\u0018\u00010H2\u0006\u0010J\u001a\u00020\u000fJ\b\u0010K\u001a\u00020\u0010H\u0016J\u0010\u0010L\u001a\u00020M2\b\u0010\u0016\u001a\u0004\u0018\u00010<J\u0010\u0010N\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010<J\u0015\u0010P\u001a\u00020Q2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\bRJ\u001c\u0010S\u001a\u00020\u00102\n\u0010T\u001a\u0006\u0012\u0002\b\u00030;2\b\u0010\u0016\u001a\u0004\u0018\u00010<J\u000e\u0010U\u001a\u00020\u00122\u0006\u0010T\u001a\u00020<J\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020\u0010J\u0006\u0010X\u001a\u00020\u0010J\u000e\u0010Y\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u000fJ\"\u0010Z\u001a\u00020\u00102\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH\u0016J*\u0010[\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030;2\u0018\u0010\\\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030;\u0012\u0006\u0012\u0004\u0018\u00010<0:H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001aR\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u001aR\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u001a\u0010#\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b%\u0010&R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010'\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u001aR$\u0010*\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u001aR$\u0010-\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u001aR$\u00100\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u001aR$\u00103\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u001aR$\u00106\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128@@BX\u0080\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u001aR\"\u00109\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030;\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010?\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010\u001aR\u0011\u0010B\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bC\u0010\u0014¨\u0006^"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "owner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "anchor", "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "", "canRecompose", "", "getCanRecompose", "()Z", "currentToken", "value", "defaultsInScope", "getDefaultsInScope", "setDefaultsInScope", "(Z)V", "defaultsInvalid", "getDefaultsInvalid", "setDefaultsInvalid", "flags", "forcedRecompose", "getForcedRecompose", "setForcedRecompose", "isConditional", "observer", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "getObserver$annotations", "()V", "paused", "getPaused", "setPaused", "requiresRecompose", "getRequiresRecompose", "setRequiresRecompose", "rereading", "getRereading", "setRereading", "resuming", "getResuming", "setResuming", "reusing", "getReusing", "setReusing", "skipped", "getSkipped$runtime_release", "setSkipped", "trackedDependencies", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/DerivedState;", "", "trackedInstances", "Landroidx/collection/MutableObjectIntMap;", "used", "getUsed", "setUsed", "valid", "getValid", "adoptedBy", "compose", "composer", "end", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "token", "invalidate", "invalidateForResult", "Landroidx/compose/runtime/InvalidationResult;", "isInvalidFor", "instances", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "recordDerivedStateValue", "instance", "recordRead", "release", "rereadTrackedInstances", "scopeSkipped", "start", "updateScope", "checkDerivedStateChanged", "dependencies", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private Anchor anchor;
    private Function2<? super Composer, ? super Integer, Unit> block;
    private int currentToken;
    private int flags;
    private RecomposeScopeObserver observer;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;

    /* JADX INFO: compiled from: RecomposeScopeImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "()V", "adoptAnchoredScopes", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "anchors", "", "Landroidx/compose/runtime/Anchor;", "newOwner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "adoptAnchoredScopes$runtime_release", "hasAnchoredRecomposeScopes", "", "Landroidx/compose/runtime/SlotTable;", "hasAnchoredRecomposeScopes$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime_release(SlotWriter slots, List<Anchor> r11, RecomposeScopeOwner newOwner) {
            if (r11.isEmpty() == true) goto L14;
            int index$iv = 0;
            int r3 = r11.size();
        L5:
            if (index$iv >= r3) goto L18;
            Object item$iv = r11.get(index$iv);
            Anchor anchor = (Anchor) item$iv;
            Object r7 = slots.slot(anchor, 0);
            if ((r7 instanceof RecomposeScopeImpl) == false) goto L9;
            RecomposeScopeImpl recomposeScope = (RecomposeScopeImpl) r7;
        L10:
            if (recomposeScope == null) goto L12;
            recomposeScope.adoptedBy(newOwner);
        L12:
            index$iv = index$iv + 1;
            goto L5
        L9:
            recomposeScope = null;
            goto L10
        L18:
            return;
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(SlotTable slots, List<Anchor> r17) {
            if (r17.isEmpty() == true) goto L23;
            int index$iv$iv = 0;
            int r7 = r17.size();
        L6:
            if (index$iv$iv >= r7) goto L16;
            Object item$iv$iv = r17.get(index$iv$iv);
            Anchor it = (Anchor) item$iv$iv;
            if (slots.ownsAnchor(it) == true) goto L10;
        L12:
            boolean r12 = false;
        L13:
            if (r12 == true) goto L14;
            index$iv$iv = index$iv$iv + 1;
            goto L6
        L14:
            boolean r1 = true;
        L17:
            if (r1 == true) goto L20;
            return false;
        L20:
            return true;
        L10:
            if ((slots.slot$runtime_release(slots.anchorIndex(it), 0) instanceof RecomposeScopeImpl) == false) goto L12;
            r12 = true;
            goto L13
        L16:
            r1 = false;
            goto L17
        L23:
            return false;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    private static /* synthetic */ void getObserver$annotations() {
    }

    public RecomposeScopeImpl(RecomposeScopeOwner owner) {
        this.owner = owner;
    }

    public static final /* synthetic */ int access$getCurrentToken$p(RecomposeScopeImpl $this) {
        return $this.currentToken;
    }

    public static final /* synthetic */ RecomposeScopeObserver access$getObserver$p(RecomposeScopeImpl $this) {
        return $this.observer;
    }

    public static final /* synthetic */ MutableScatterMap access$getTrackedDependencies$p(RecomposeScopeImpl $this) {
        return $this.trackedDependencies;
    }

    public static final /* synthetic */ MutableObjectIntMap access$getTrackedInstances$p(RecomposeScopeImpl $this) {
        return $this.trackedInstances;
    }

    public static final /* synthetic */ void access$setObserver$p(RecomposeScopeImpl $this, RecomposeScopeObserver r1) {
        $this.observer = r1;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final void setAnchor(Anchor r1) {
        this.anchor = r1;
    }

    public final boolean getValid() {
        if (this.owner == null) goto L11;
        Anchor r0 = this.anchor;
        if (r0 == null) goto L7;
        boolean r1 = r0.getValid();
    L8:
        if (r1 == false) goto L12;
        return true;
    L12:
        return false;
    L7:
        r1 = false;
        goto L8
    L11:
        return false;
    }

    public final boolean getCanRecompose() {
        if (this.block == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean getUsed() {
        if ((this.flags & 1) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public final void setUsed(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        int r1 = r0 | 1;
    L6:
        this.flags = r1;
        return;
    L5:
        r1 = r0 & (-2);
        goto L6
    }

    public final boolean getReusing() {
        if ((this.flags & 128) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setReusing(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        int r1 = r0 | 128;
    L6:
        this.flags = r1;
        return;
    L5:
        r1 = r0 & (-129);
        goto L6
    }

    public final boolean getPaused() {
        if ((this.flags & 256) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setPaused(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        int r1 = r0 | 256;
    L6:
        this.flags = r1;
        return;
    L5:
        r1 = r0 & (-257);
        goto L6
    }

    public final boolean getResuming() {
        if ((this.flags & 512) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setResuming(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        int r1 = r0 | 512;
    L6:
        this.flags = r1;
        return;
    L5:
        r1 = r0 & (-513);
        goto L6
    }

    public final boolean getDefaultsInScope() {
        if ((this.flags & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setDefaultsInScope(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 2;
        return;
    L5:
        this.flags = r0 & (-3);
    }

    public final boolean getDefaultsInvalid() {
        if ((this.flags & 4) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setDefaultsInvalid(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 4;
        return;
    L5:
        this.flags = r0 & (-5);
    }

    public final boolean getRequiresRecompose() {
        if ((this.flags & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setRequiresRecompose(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 8;
        return;
    L5:
        this.flags = r0 & (-9);
    }

    public final void compose(Composer composer) {
        Function2<? super Composer, ? super Integer, Unit> r0 = this.block;
        RecomposeScopeObserver observer = this.observer;
        if (observer == null) goto L12;
        if (r0 == null) goto L12;
        observer.onBeginScopeComposition(this);
        r0.invoke(composer, 1);     // Catch: Throwable -> L9
        observer.onEndScopeComposition(this);
        return;
    L9:
        th = move-exception;
        observer.onEndScopeComposition(this);
        throw th;
    L12:
        if (r0 == null) goto L14;
        r0.invoke(composer, 1);
        Unit r2 = Unit.INSTANCE;
    L15:
        if (r2 == null) goto L18;
        return;
    L18:
        throw new IllegalStateException("Invalid restart scope".toString());
    L14:
        r2 = null;
        goto L15
    }

    public final CompositionObserverHandle observe$runtime_release(final RecomposeScopeObserver observer) {
        Object lock$iv = RecomposeScopeImplKt.access$getCallbackLock$p();
        monitor-enter(lock$iv);
        this.observer = observer;     // Catch: Throwable -> L9
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L9
        monitor-exit(lock$iv);
        return new RecomposeScopeImpl$observe$2(this, observer);
    L9:
        th = move-exception;
        throw th;
    }

    public final InvalidationResult invalidateForResult(Object value) {
        RecomposeScopeOwner r0 = this.owner;
        if (r0 == null) goto L7;
        InvalidationResult r1 = r0.invalidate(this, value);
        if (r1 == null) goto L7;
        return r1;
    L7:
        return InvalidationResult.IGNORED;
    }

    public final void release() {
        RecomposeScopeOwner r0 = this.owner;
        if (r0 == null) goto L5;
        r0.recomposeScopeReleased(this);
    L5:
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver r1 = this.observer;
        if (r1 == null) goto L9;
        r1.onScopeDisposed(this);
        return;
    }

    public final void adoptedBy(RecomposeScopeOwner owner) {
        this.owner = owner;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner r0 = this.owner;
        if (r0 == null) goto L6;
        r0.invalidate(this, null);
        return;
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(Function2<? super Composer, ? super Integer, Unit> r1) {
        this.block = r1;
    }

    private final boolean getRereading() {
        if ((this.flags & 32) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private final void setRereading(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 32;
        return;
    L5:
        this.flags = r0 & (-33);
    }

    public final boolean getForcedRecompose() {
        if ((this.flags & 64) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final void setForcedRecompose(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 64;
        return;
    L5:
        this.flags = r0 & (-65);
    }

    public final boolean getSkipped$runtime_release() {
        if ((this.flags & 16) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private final void setSkipped(boolean value) {
        int r0 = this.flags;
        if (value == false) goto L5;
        this.flags = r0 | 16;
        return;
    L5:
        this.flags = r0 & (-17);
    }

    public final void start(int token) {
        this.currentToken = token;
        setSkipped(false);
    }

    public final void scopeSkipped() {
        if (getReusing() == true) goto L6;
        setSkipped(true);
        return;
    }

    public final boolean recordRead(Object instance) {
        int r1 = 0;
        if (getRereading() == false) goto L5;
        return false;
    L5:
        MutableObjectIntMap<Object> r0 = this.trackedInstances;
        int r2 = 1;
        if (r0 != null) goto L8;
        r0 = new MutableObjectIntMap(r1, r2, null);
        this.trackedInstances = r0;
    L8:
        int token = r0.put(instance, this.currentToken, -1);
        if (token != this.currentToken) goto L11;
        return true;
    L11:
        return false;
    }

    public final void recordDerivedStateValue(DerivedState<?> r5, Object value) {
        MutableScatterMap<DerivedState<?>, Object> r0 = this.trackedDependencies;
        if (r0 != null) goto L5;
        int r3 = 0;
        r0 = new MutableScatterMap(r3, 1, null);
        this.trackedDependencies = r0;
    L5:
        r0.set(r5, value);
    }

    public final boolean isConditional() {
        if (this.trackedDependencies == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean isInvalidFor(Object instances) {
        if (instances != null) goto L5;
        return true;
    L5:
        MutableScatterMap<DerivedState<?>, Object> r3 = this.trackedDependencies;
        if (r3 != null) goto L9;
        return true;
    L9:
        if ((instances instanceof DerivedState) == false) goto L12;
        return checkDerivedStateChanged((DerivedState) instances, r3);
    L12:
        if ((instances instanceof ScatterSet) == true) goto L14;
        return true;
    L14:
        if (((ScatterSet) instances).isNotEmpty() == false) goto L50;
        ScatterSet this_$iv = (ScatterSet) instances;
        int $i$f$any = 0;
        Object[] elements$iv$iv = this_$iv.elements;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L47;
    L17:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int $i$f$any2 = $i$f$any;
        MutableScatterMap<DerivedState<?>, Object> r17 = r3;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L42;
        int r4 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L20:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L39;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L24;
        int $i$f$isFull = 1;
    L25:
        if ($i$f$isFull == 0) goto L37;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object element$iv = elements$iv$iv[index$iv$iv$iv];
        if ((element$iv instanceof DerivedState) == false) goto L32;
        MutableScatterMap<DerivedState<?>, Object> r5 = r17;
        if (checkDerivedStateChanged((DerivedState) element$iv, r5) == true) goto L33;
        boolean r1 = false;
    L34:
        if (r1 == false) goto L38;
        boolean r2 = true;
    L48:
        if (r2 == false) goto L50;
        return true;
    L38:
        slot$iv$iv$iv = slot$iv$iv$iv >> r4;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r17 = r5;
        r4 = r4;
    L33:
        r1 = true;
        goto L34
    L32:
        r5 = r17;
        goto L33
    L37:
        r5 = r17;
        goto L38
    L24:
        $i$f$isFull = 0;
        goto L25
    L39:
        int r26 = r4;
        r3 = r17;
        if (bitCount$iv$iv$iv != r26) goto L47;
    L43:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L47;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $i$f$any = $i$f$any2;
        goto L17
    L42:
        r3 = r17;
    L47:
        r2 = false;
    L50:
        return false;
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> r4, MutableScatterMap<DerivedState<?>, Object> r5) {
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy<?> r0 = r4.getPolicy();
        if (r0 != null) goto L6;
        r0 = SnapshotStateKt.structuralEqualityPolicy();
    L6:
        return !r0.equivalent(r4.getCurrentRecord().getCurrentValue(), r5.get(r4));
    }

    public final void rereadTrackedInstances() {
        RecomposeScopeImpl r1 = this;
        RecomposeScopeOwner owner = r1.owner;
        if (owner == null) goto L36;
        ObjectIntMap r0 = r1.trackedInstances;
        if (r0 == null) goto L46;
        r1.setRereading(true);
        ObjectIntMap this_$iv = r0;     // Catch: Throwable -> L32
        Object[] k$iv = this_$iv.keys;     // Catch: Throwable -> L32
        int[] v$iv = this_$iv.values;     // Catch: Throwable -> L32
        long[] m$iv$iv = this_$iv.metadata;     // Catch: Throwable -> L32
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L31;
    L37:
        long slot$iv$iv = m$iv$iv[i$iv$iv];     // Catch: Throwable -> L27
        ObjectIntMap this_$iv2 = this_$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);     // Catch: Throwable -> L27
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L25;
        int r2 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);     // Catch: Throwable -> L27
        int j$iv$iv = 0;
    L13:
        if (j$iv$iv >= bitCount$iv$iv) goto L24;
        long value$iv$iv$iv = slot$iv$iv & 255;     // Catch: Throwable -> L27
        if (value$iv$iv$iv >= 128) goto L17;
        int $i$f$isFull = 1;
    L18:
        if ($i$f$isFull == 0) goto L22;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;     // Catch: Throwable -> L27
        Object value = k$iv[index$iv$iv];     // Catch: Throwable -> L27
        int r23 = v$iv[index$iv$iv];     // Catch: Throwable -> L27
        owner.recordReadOf(value);     // Catch: Throwable -> L27
    L22:
        slot$iv$iv = slot$iv$iv >> r2;
        j$iv$iv = j$iv$iv + 1;
        r2 = r2;
        goto L13
    L17:
        $i$f$isFull = 0;
        goto L18
    L24:
        if (bitCount$iv$iv != r2) goto L31;
    L25:
        if (i$iv$iv == lastIndex$iv$iv) goto L31;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
    L27:
        th = th;
        r1 = this;
    L33:
        r1.setRereading(false);
        throw th;
    L31:
        setRereading(false);
        return;
    L32:
        th = th;
        goto L33
    L46:
        return;
    }

    public final Function1<Composition, Unit> end(final int token) {
        final MutableObjectIntMap<Object> r2 = this.trackedInstances;
        if (r2 == null) goto L38;
        int r4 = 0;
        if (getSkipped$runtime_release() == true) goto L36;
        MutableObjectIntMap<Object> this_$iv = r2;
        int $i$f$any = 0;
        Object[] k$iv$iv = this_$iv.keys;
        int[] v$iv$iv = this_$iv.values;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        boolean r16 = false;
        if (0 > lastIndex$iv$iv$iv) goto L33;
    L8:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int r22 = r4;
        ObjectIntMap this_$iv2 = this_$iv;
        int $i$f$any2 = $i$f$any;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L28;
        int r5 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L11:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L27;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L15;
        int $i$f$isFull = 1;
    L16:
        if ($i$f$isFull == 0) goto L25;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object r24 = k$iv$iv[index$iv$iv$iv];
        int value$iv = v$iv$iv[index$iv$iv$iv];
        if (value$iv == token) goto L20;
        int instanceToken = 1;
    L21:
        if (instanceToken == 0) goto L25;
        r16 = true;
        goto L33
    L20:
        instanceToken = 0;
    L25:
        slot$iv$iv$iv = slot$iv$iv$iv >> r5;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r5 = r5;
        goto L11
    L15:
        $i$f$isFull = 0;
        goto L16
    L27:
        if (bitCount$iv$iv$iv != r5) goto L33;
    L28:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L33;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$any = $i$f$any2;
        r4 = r22;
    L33:
        if (r16 == false) goto L36;
        return new RecomposeScopeImpl$end$1$2(this, token, r2);
    L36:
        return null;
    L38:
        return null;
    }
}
