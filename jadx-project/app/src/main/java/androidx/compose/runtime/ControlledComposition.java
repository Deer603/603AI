package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J \u0010\f\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u000fH&¢\u0006\u0002\u0010\u0010J3\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00120\u000eH&¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH'J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J$\u0010\u001e\u001a\u00020\b2\u001a\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\"0!0 H'J\b\u0010#\u001a\u00020\bH&J\u0016\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H&J\u0016\u0010(\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH&J\b\u0010)\u001a\u00020\u0003H&J\u0016\u0010*\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H&J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020'H&J\u0010\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020'H&J\b\u0010.\u001a\u00020\bH'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005\u0082\u0001\u0001/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "hasPendingChanges", "", "getHasPendingChanges", "()Z", "isComposing", "abandonChanges", "", "applyChanges", "applyLateChanges", "changesApplied", "composeContent", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "delegateInvalidations", "R", "to", "groupIndex", "", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "getAndSetShouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "insertMovableContent", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidateAll", "observesAnyOf", "values", "", "", "prepareCompose", "recompose", "recordModificationsOf", "recordReadOf", "value", "recordWriteOf", "verifyConsistent", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ControlledComposition extends Composition {
    void abandonChanges();

    void applyChanges();

    void applyLateChanges();

    void changesApplied();

    void composeContent(Function2<? super Composer, ? super Integer, Unit> r1);

    <R> R delegateInvalidations(ControlledComposition r1, int r2, Function0<? extends R> r3);

    void disposeUnusedMovableContent(MovableContentState r1);

    ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback r1);

    boolean getHasPendingChanges();

    void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> r1);

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(Set<? extends Object> r1);

    void prepareCompose(Function0<Unit> r1);

    boolean recompose();

    void recordModificationsOf(Set<? extends Object> r1);

    void recordReadOf(Object r1);

    void recordWriteOf(Object r1);

    void verifyConsistent();
}
