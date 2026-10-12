package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CompositionContext.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J*\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u001e0!¢\u0006\u0002\b\"H ¢\u0006\u0004\b#\u0010$J8\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u001e0!¢\u0006\u0002\b\"H ¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H ¢\u0006\u0002\b/J\r\u00100\u001a\u00020\u001eH\u0010¢\u0006\u0002\b1J\r\u00102\u001a\u000203H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H ¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001fH ¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020'H ¢\u0006\u0002\b;J)\u0010<\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010=\u001a\u00020>2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030@H ¢\u0006\u0002\bAJ\u0017\u0010B\u001a\u0004\u0018\u00010>2\u0006\u0010-\u001a\u00020.H\u0010¢\u0006\u0002\bCJ1\u0010D\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u000b\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020'0&H ¢\u0006\u0002\bFJ\u001b\u0010G\u001a\u00020\u001e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IH\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001fH ¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020'H ¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001fH ¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020\u001eH\u0010¢\u0006\u0002\bWJ\u0015\u0010X\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bYJ\u0015\u0010Z\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001fH ¢\u0006\u0002\b[R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX \u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X \u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0014X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016¨\u0006\\"}, d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "()V", "collectingCallByInformation", "", "getCollectingCallByInformation$runtime_release", "()Z", "collectingParameterInformation", "getCollectingParameterInformation$runtime_release", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "composition", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitialPaused", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "applier", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recomposePaused", "invalidScopes", "recomposePaused$runtime_release", "recordInspectionTable", "table", "", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "reportPausedScope", "reportPausedScope$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CompositionContext {
    public static final int $stable = 0;

    static {
    }

    public abstract void composeInitial$runtime_release(ControlledComposition r1, Function2<? super Composer, ? super Integer, Unit> r2);

    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(ControlledComposition r1, ShouldPauseCallback r2, Function2<? super Composer, ? super Integer, Unit> r3);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference r1);

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    public abstract Composition getComposition$runtime_release();

    public abstract int getCompoundHashKey$runtime_release();

    public abstract CoroutineContext getEffectCoroutineContext();

    public abstract CoroutineContext getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference r1);

    public abstract void invalidate$runtime_release(ControlledComposition r1);

    public abstract void invalidateScope$runtime_release(RecomposeScopeImpl r1);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference r1, MovableContentState r2, Applier<?> r3);

    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(ControlledComposition r1, ShouldPauseCallback r2, ScatterSet<RecomposeScopeImpl> r3);

    public abstract void registerComposition$runtime_release(ControlledComposition r1);

    public abstract void reportPausedScope$runtime_release(RecomposeScopeImpl r1);

    public abstract void reportRemovedComposition$runtime_release(ControlledComposition r1);

    public abstract void unregisterComposition$runtime_release(ControlledComposition r1);

    public CompositionContext() {
    }

    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> r1) {
    }

    public void registerComposer$runtime_release(Composer composer) {
    }

    public void unregisterComposer$runtime_release(Composer composer) {
    }

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
    }

    public void startComposing$runtime_release() {
    }

    public void doneComposing$runtime_release() {
    }

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
        return null;
    }
}
