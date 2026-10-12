package androidx.compose.runtime.internal;

import androidx.collection.IntList;
import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0006\u0010$\u001a\u00020\u001dJ\u0016\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020\u001dJ\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016J(\u0010+\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J(\u0010-\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002J(\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0016\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "afters", "Landroidx/collection/MutableIntList;", "currentRememberingList", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "leaving", "", "nestedRemembersLists", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pending", "", "priorities", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", "instance", "endRelativeOrder", "", "priority", "endRelativeAfter", "dispatchAbandons", "dispatchRememberList", "list", "dispatchRememberObservers", "dispatchSideEffects", "endResumingScope", "scope", "forgetting", "processPendingLeaving", "recordLeaving", "rememberPausingScope", "sideEffect", "effect", "startResumingScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 0;
    private final Set<RememberObserver> abandoning;
    private final MutableIntList afters;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private final MutableVector<Object> leaving;
    private ArrayList<T> nestedRemembersLists;
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;
    private final List<Object> pending;
    private final MutableIntList priorities;
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<Function0<Unit>> sideEffects;

    static {
        $stable = 8;
    }

    public RememberEventDispatcher(Set<RememberObserver> r7) {
        this.abandoning = r7;
        this.remembering = new MutableVector(new RememberObserverHolder[16], 0);
        this.currentRememberingList = this.remembering;
        this.leaving = new MutableVector(new Object[16], 0);
        this.sideEffects = new MutableVector(new Function0[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(RememberObserverHolder instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(Function0<Unit> r3) {
        this.sideEffects.add(r3);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        MutableScatterSet<ComposeNodeLifecycleCallback> r0 = this.releasing;
        if (r0 != null) goto L5;
        r0 = ScatterSetKt.mutableScatterSetOf();
        this.releasing = r0;
    L5:
        r0.plusAssign(instance);
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl scope) {
        PausedCompositionRemembers pausedPlaceholder = new PausedCompositionRemembers(this.abandoning);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> r1 = this.pausedPlaceholders;
        if (r1 != null) goto L5;
        r1 = ScatterMapKt.mutableScatterMapOf();
        this.pausedPlaceholders = r1;
    L5:
        r1.set(scope, pausedPlaceholder);
        this.currentRememberingList.add(new RememberObserverHolder(pausedPlaceholder, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(RecomposeScopeImpl scope) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> r0 = this.pausedPlaceholders;
        if (r0 == null) goto L5;
        PausedCompositionRemembers placeholder = r0.get(scope);
    L6:
        if (placeholder == null) goto L12;
        ArrayList it = this.nestedRemembersLists;
        if (it != null) goto L10;
        it = Stack.m3793constructorimpl$default(null, 1, null);
        this.nestedRemembersLists = it;
    L10:
        Stack.m3803pushimpl(it, this.currentRememberingList);
        this.currentRememberingList = placeholder.getPausedRemembers();
        return;
    L12:
        return;
    L5:
        placeholder = null;
        goto L6
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(RecomposeScopeImpl scope) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> r0 = this.pausedPlaceholders;
        if (r0 == null) goto L13;
        PausedCompositionRemembers placeholder = r0.get(scope);
        if (placeholder == null) goto L14;
        ArrayList<T> r2 = this.nestedRemembersLists;
        if (r2 == 0) goto L11;
        MutableVector<RememberObserverHolder> r3 = (MutableVector) Stack.m3802popimpl(r2);
        if (r3 == null) goto L11;
        this.currentRememberingList = r3;
    L11:
        r0.remove(scope);
        return;
    L14:
        return;
    }

    public final void dispatchRememberObservers() {
        processPendingLeaving(Integer.MIN_VALUE);
        boolean r3 = false;
        if (this.leaving.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L28;
        Object token$iv = Trace.INSTANCE.beginSection("Compose:onForgotten");
        MutableScatterSet releasing = this.releasing;     // Catch: Throwable -> L24
        int i = this.leaving.getSize() - 1;     // Catch: Throwable -> L24
    L10:
        if ((-1) >= i) goto L22;
        Object instance = this.leaving.content[i];     // Catch: Throwable -> L24
        if ((instance instanceof RememberObserverHolder) == false) goto L15;
        RememberObserver wrapped = ((RememberObserverHolder) instance).getWrapped();     // Catch: Throwable -> L24
        this.abandoning.remove(wrapped);     // Catch: Throwable -> L24
        wrapped.onForgotten();     // Catch: Throwable -> L24
    L15:
        if ((instance instanceof ComposeNodeLifecycleCallback) == false) goto L21;
        if (releasing != null) goto L18;
    L20:
        ((ComposeNodeLifecycleCallback) instance).onDeactivate();     // Catch: Throwable -> L24
        goto L21
    L18:
        if (releasing.contains(instance) == false) goto L20;
        ((ComposeNodeLifecycleCallback) instance).onRelease();     // Catch: Throwable -> L24
    L21:
        i = i - 1;     // Catch: Throwable -> L24
        goto L10
    L22:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L24
        Trace.INSTANCE.endSection(token$iv);
    L24:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv);
        throw th;
    L28:
        if (this.remembering.getSize() == 0) goto L30;
        r3 = true;
    L30:
        if (r3 == false) goto L37;
        Object token$iv2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
        dispatchRememberList(this.remembering);     // Catch: Throwable -> L34
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L34
        Trace.INSTANCE.endSection(token$iv2);
        return;
    L34:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv2);
        throw th;
    L37:
        return;
    L5:
        r0 = false;
        goto L6
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> r10) {
        int i$iv = 0;
        Object[] content$iv = r10.content;
        int size$iv = r10.getSize();
    L3:
        if (i$iv >= size$iv) goto L6;
        RememberObserverHolder instance = (RememberObserverHolder) content$iv[i$iv];
        RememberObserver wrapped = instance.getWrapped();
        this.abandoning.remove(wrapped);
        wrapped.onRemembered();
        i$iv = i$iv + 1;
        goto L3
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() == 0) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L16;
        Object token$iv = Trace.INSTANCE.beginSection("Compose:sideeffects");
        MutableVector<Function0<Unit>> r4 = this.sideEffects;     // Catch: Throwable -> L13
        int i$iv = 0;
        Object[] content$iv = r4.content;     // Catch: Throwable -> L13
        int size$iv = r4.getSize();     // Catch: Throwable -> L13
    L9:
        if (i$iv >= size$iv) goto L11;
        ((Function0) content$iv[i$iv]).invoke();     // Catch: Throwable -> L13
        i$iv = i$iv + 1;     // Catch: Throwable -> L13
        goto L9
    L11:
        this.sideEffects.clear();     // Catch: Throwable -> L13
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L13
        Trace.INSTANCE.endSection(token$iv);
        return;
    L13:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv);
        throw th;
    L16:
        return;
    L5:
        r2 = false;
        goto L6
    }

    public final void dispatchAbandons() {
        if (this.abandoning.isEmpty() == true) goto L14;
        Object token$iv = Trace.INSTANCE.beginSection("Compose:abandons");
        Iterator<RememberObserver> r4 = this.abandoning.iterator();     // Catch: Throwable -> L11
    L7:
        if (r4.hasNext() == false) goto L9;
        RememberObserver instance = r4.next();     // Catch: Throwable -> L11
        r4.remove();     // Catch: Throwable -> L11
        instance.onAbandoned();     // Catch: Throwable -> L11
        goto L7
    L9:
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L11
        Trace.INSTANCE.endSection(token$iv);
        return;
    L11:
        th = move-exception;
        Trace.INSTANCE.endSection(token$iv);
        throw th;
    }

    private final void recordLeaving(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        processPendingLeaving(endRelativeOrder);
        boolean r0 = false;
        if (endRelativeAfter < 0) goto L6;
        if (endRelativeAfter >= endRelativeOrder) goto L6;
        r0 = true;
    L6:
        if (r0 == false) goto L8;
        this.pending.add(instance);
        this.priorities.add(priority);
        this.afters.add(endRelativeAfter);
        return;
    L8:
        this.leaving.add(instance);
    }

    private final void processPendingLeaving(int endRelativeOrder) {
        if (this.pending.isEmpty() == true) goto L43;
        int index = 0;
        List<? extends Object> r1 = null;
        MutableIntList toAddAfter = null;
        MutableIntList toAddPriority = null;
    L5:
        IntList this_$iv = this.afters;
        if (index >= this_$iv._size) goto L14;
        if (endRelativeOrder <= this.afters.get(index)) goto L9;
        index = index + 1;
        goto L5
    L9:
        Object instance = this.pending.remove(index);
        int endRelativeAfter = this.afters.removeAt(index);
        int priority = this.priorities.removeAt(index);
        if (r1 == null) goto L11;
        Intrinsics.checkNotNull(toAddPriority, "null cannot be cast to non-null type androidx.collection.MutableIntList");
        Intrinsics.checkNotNull(toAddAfter, "null cannot be cast to non-null type androidx.collection.MutableIntList");
        r1.add(instance);
        toAddAfter.add(endRelativeAfter);
        toAddPriority.add(priority);
        goto L5
    L11:
        r1 = CollectionsKt.mutableListOf(new Object[]{instance});
        MutableIntList it = new MutableIntList(0, 1, null);
        it.add(endRelativeAfter);
        toAddAfter = it;
        MutableIntList it2 = new MutableIntList(0, 1, null);
        it2.add(priority);
        toAddPriority = it2;
        goto L5
    L14:
        if (r1 == null) goto L44;
        Intrinsics.checkNotNull(toAddPriority, "null cannot be cast to non-null type androidx.collection.MutableIntList");
        Intrinsics.checkNotNull(toAddAfter, "null cannot be cast to non-null type androidx.collection.MutableIntList");
        int i = 0;
        int r5 = r1.size() - 1;
    L16:
        if (i >= r5) goto L27;
        int j = i + 1;
        int r7 = r1.size();
    L18:
        if (j >= r7) goto L26;
        int iAfter = toAddAfter.get(i);
        int jAfter = toAddAfter.get(j);
        if (iAfter < jAfter) goto L24;
        if (jAfter != iAfter) goto L25;
        if (toAddPriority.get(i) < toAddPriority.get(j)) goto L24;
    L25:
        j = j + 1;
    L24:
        RememberEventDispatcherKt.access$swap(r1, i, j);
        RememberEventDispatcherKt.access$swap(toAddPriority, i, j);
        RememberEventDispatcherKt.access$swap(toAddAfter, i, j);
        goto L25
    L26:
        i = i + 1;
        goto L16
    L27:
        MutableVector<Object> r4 = this.leaving;
        r4.addAll(r4.getSize(), r1);
        return;
    L44:
        return;
    }
}
