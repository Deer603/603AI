package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a$\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a$\u0010\u0014\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001a\u0010\u0015\u001a\u00020\u00162\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a'\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0000\u0010\u0018*\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0001H\u0000¢\u0006\u0002\u0010\u001a\u001a.\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001c0 H\u0080\b¢\u0006\u0002\u0010!\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0007\u001a\u00020\b*\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\""}, d2 = {"CompositionImplServiceKey", "Landroidx/compose/runtime/CompositionServiceKey;", "Landroidx/compose/runtime/CompositionImpl;", "getCompositionImplServiceKey", "()Landroidx/compose/runtime/CompositionServiceKey;", "PendingApplyNoModifications", "", "recomposeCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/ControlledComposition;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/coroutines/CoroutineContext;", "Composition", "Landroidx/compose/runtime/Composition;", "applier", "Landroidx/compose/runtime/Applier;", "parent", "Landroidx/compose/runtime/CompositionContext;", "ControlledComposition", "ReusableComposition", "Landroidx/compose/runtime/ReusableComposition;", "getCompositionService", "T", "key", "(Landroidx/compose/runtime/Composition;Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "pausable", "R", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "block", "Lkotlin/Function0;", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionKt {
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = null;
    private static final Object PendingApplyNoModifications = null;

    public static final /* synthetic */ Object access$getPendingApplyNoModifications$p() {
        return PendingApplyNoModifications;
    }

    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition r0) {
    }

    public static final <T> T getCompositionService(Composition r2, CompositionServiceKey<T> r3) {
        if ((r2 instanceof CompositionServices) == false) goto L5;
        CompositionServices r0 = (CompositionServices) r2;
    L6:
        if (r0 != null) goto L8;
        return null;
    L8:
        return (T) r0.getCompositionService(r3);
    L5:
        r0 = null;
        goto L6
    }

    public static final <R> R pausable(ControlledComposition $this$pausable, ShouldPauseCallback shouldPause, Function0<? extends R> r5) {
        ShouldPauseCallback previous = $this$pausable.getAndSetShouldPauseCallback(shouldPause);
        R r2 = r5.invoke();     // Catch: Throwable -> L6
        $this$pausable.getAndSetShouldPauseCallback(previous);
        return r2;
    L6:
        th = move-exception;
        $this$pausable.getAndSetShouldPauseCallback(previous);
        throw th;
    }

    public static final CoroutineContext getRecomposeCoroutineContext(ControlledComposition $this$recomposeCoroutineContext) {
        if (($this$recomposeCoroutineContext instanceof CompositionImpl) == false) goto L5;
        CompositionImpl r0 = (CompositionImpl) $this$recomposeCoroutineContext;
    L6:
        if (r0 == null) goto L10;
        CoroutineContext r1 = r0.getRecomposeContext();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return EmptyCoroutineContext.INSTANCE;
    L5:
        r0 = null;
        goto L6
    }

    public static final Composition Composition(Applier<?> r6, CompositionContext parent) {
        CoroutineContext r3 = null;
        return new CompositionImpl(parent, r6, r3, 4, null);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> r6, CompositionContext parent) {
        CoroutineContext r3 = null;
        return new CompositionImpl(parent, r6, r3, 4, null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> r6, CompositionContext parent) {
        CoroutineContext r3 = null;
        return new CompositionImpl(parent, r6, r3, 4, null);
    }

    public static final Composition Composition(Applier<?> r1, CompositionContext parent, CoroutineContext recomposeCoroutineContext) {
        return new CompositionImpl(parent, r1, recomposeCoroutineContext);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> r1, CompositionContext parent, CoroutineContext recomposeCoroutineContext) {
        return new CompositionImpl(parent, r1, recomposeCoroutineContext);
    }

    static {
        PendingApplyNoModifications = new Object();
        CompositionImplServiceKey = new CompositionKt$CompositionImplServiceKey$1();
    }

    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }
}
