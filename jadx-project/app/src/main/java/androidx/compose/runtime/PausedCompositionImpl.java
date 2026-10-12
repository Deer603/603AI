package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PausableComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B^\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015¢\u0006\u0002\u0010\u0016J\b\u00104\u001a\u00020\rH\u0016J\b\u00105\u001a\u00020\rH\u0002J\b\u00106\u001a\u00020\rH\u0016J\b\u00107\u001a\u00020\rH\u0002J\u0010\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020:H\u0016R\u0015\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0015\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "composition", "Landroidx/compose/runtime/CompositionImpl;", "context", "Landroidx/compose/runtime/CompositionContext;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "reusable", "", "applier", "Landroidx/compose/runtime/Applier;", "lock", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "getComposer", "()Landroidx/compose/runtime/ComposerImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getContext", "()Landroidx/compose/runtime/CompositionContext;", "invalidScopes", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "isComplete", "()Z", "getLock", "()Ljava/lang/Object;", "pausableApplier", "Landroidx/compose/runtime/RecordingApplier;", "getPausableApplier$runtime_release", "()Landroidx/compose/runtime/RecordingApplier;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getRememberManager$runtime_release", "()Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getReusable", "state", "Landroidx/compose/runtime/PausedCompositionState;", "apply", "applyChanges", "cancel", "markComplete", "resume", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 0;
    private final Applier<?> applier;
    private final ComposerImpl composer;
    private final CompositionImpl composition;
    private final Function2<Composer, Integer, Unit> content;
    private final CompositionContext context;
    private ScatterSet<RecomposeScopeImpl> invalidScopes;
    private final Object lock;
    private final RecordingApplier<Object> pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;
    private PausedCompositionState state;

    /* JADX INFO: compiled from: PausableComposition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PausedCompositionState.values().length];
            r0[PausedCompositionState.InitialPending.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L23:
            r0[PausedCompositionState.RecomposePending.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L29:
            r0[PausedCompositionState.ApplyPending.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L33:
            r0[PausedCompositionState.Applied.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L25:
            r0[PausedCompositionState.Cancelled.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L27:
            r0[PausedCompositionState.Invalid.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L21:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(CompositionImpl composition, CompositionContext context, ComposerImpl composer, Set<RememberObserver> r6, Function2<? super Composer, ? super Integer, Unit> r7, boolean reusable, Applier<?> r9, Object lock) {
        this.composition = composition;
        this.context = context;
        this.composer = composer;
        this.content = r7;
        this.reusable = reusable;
        this.applier = r9;
        this.lock = lock;
        this.state = PausedCompositionState.InitialPending;
        this.invalidScopes = ScatterSetKt.emptyScatterSet();
        this.rememberManager = new RememberEventDispatcher(r6);
        this.pausableApplier = new RecordingApplier(this.applier.getCurrent());
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final CompositionContext getContext() {
        return this.context;
    }

    public final ComposerImpl getComposer() {
        return this.composer;
    }

    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    public final Applier<?> getApplier() {
        return this.applier;
    }

    public final Object getLock() {
        return this.lock;
    }

    public final RememberEventDispatcher getRememberManager$runtime_release() {
        return this.rememberManager;
    }

    public final RecordingApplier<Object> getPausableApplier$runtime_release() {
        return this.pausableApplier;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isComplete() {
        if (this.state.compareTo(PausedCompositionState.ApplyPending) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean resume(ShouldPauseCallback shouldPause) {
        PausedCompositionState r0 = this.state;     // Catch: Exception -> L34
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L17;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L33;
        };     // Catch: Exception -> L34
    L13:
        this.invalidScopes = this.context.recomposePaused$runtime_release(this.composition, shouldPause, this.invalidScopes);     // Catch: Exception -> L34
        if (this.invalidScopes.isEmpty() == false) goto L33;
        markComplete();     // Catch: Exception -> L34
    L33:
        return isComplete();
    L6:
        throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());     // Catch: Exception -> L34
    L8:
        throw new IllegalStateException("The paused composition has been cancelled".toString());     // Catch: Exception -> L34
    L10:
        throw new IllegalStateException("The paused composition has been applied".toString());     // Catch: Exception -> L34
    L12:
        throw new IllegalStateException("Pausable composition is complete and apply() should be applied".toString());     // Catch: Exception -> L34
    L17:
        if (this.reusable == false) goto L37;
        this.composer.startReuseFromRoot();     // Catch: Exception -> L34
    L37:
        this.invalidScopes = this.context.composeInitialPaused$runtime_release(this.composition, shouldPause, this.content);     // Catch: Throwable -> L27
    L22:
        if (this.reusable == false) goto L24;
        this.composer.endReuseFromRoot();     // Catch: Exception -> L34
    L24:
        this.state = PausedCompositionState.RecomposePending;     // Catch: Exception -> L34
        if (this.invalidScopes.isEmpty() == false) goto L33;
        markComplete();     // Catch: Exception -> L34
    L27:
        th = move-exception;
        if (this.reusable == false) goto L31;
        this.composer.endReuseFromRoot();     // Catch: Exception -> L34
    L31:
        throw th;     // Catch: Exception -> L34
    L34:
        e = move-exception;
        this.state = PausedCompositionState.Invalid;
        throw e;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void apply() {
        PausedCompositionState r0 = this.state;     // Catch: Exception -> L15
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L13;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L14;
        };     // Catch: Exception -> L15
    L11:
        applyChanges();     // Catch: Exception -> L15
        this.state = PausedCompositionState.Applied;     // Catch: Exception -> L15
        return;
    L14:
        return;
    L6:
        throw new IllegalStateException("The paused composition is invalid because of a previous exception".toString());     // Catch: Exception -> L15
    L8:
        throw new IllegalStateException("The paused composition has been cancelled".toString());     // Catch: Exception -> L15
    L10:
        throw new IllegalStateException("The paused composition has already been applied".toString());     // Catch: Exception -> L15
    L13:
        throw new IllegalStateException("The paused composition has not completed yet".toString());     // Catch: Exception -> L15
    L15:
        e = move-exception;
        this.state = PausedCompositionState.Invalid;
        throw e;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state = PausedCompositionState.Cancelled;
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime_release();
    }

    private final void markComplete() {
        this.state = PausedCompositionState.ApplyPending;
    }

    private final void applyChanges() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        RecordingApplier<Object> r3 = this.pausableApplier;     // Catch: Throwable -> L9
        Applier<?> r4 = this.applier;     // Catch: Throwable -> L9
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");     // Catch: Throwable -> L9
        r3.playTo(r4);     // Catch: Throwable -> L9
        this.rememberManager.dispatchRememberObservers();     // Catch: Throwable -> L9
        this.rememberManager.dispatchSideEffects();     // Catch: Throwable -> L9
        this.rememberManager.dispatchAbandons();     // Catch: Throwable -> L12
        this.composition.pausedCompositionFinished$runtime_release();     // Catch: Throwable -> L12
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        return;
    L12:
        th = move-exception;
        throw th;
    L9:
        th = move-exception;
        this.rememberManager.dispatchAbandons();     // Catch: Throwable -> L12
        this.composition.pausedCompositionFinished$runtime_release();     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    }
}
