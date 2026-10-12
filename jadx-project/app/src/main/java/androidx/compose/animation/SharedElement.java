package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SharedElement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020#J\b\u0010/\u001a\u00020\u0013H\u0002J\u0006\u00100\u001a\u00020\u0013J(\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0006\u00109\u001a\u00020\u001eJ\u000e\u0010:\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020#J\u0006\u0010+\u001a\u00020\u001eJ\u0006\u0010;\u001a\u00020\u001eR/\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR/\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b'\u0010\nR\"\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u0006\u001a\u0004\u0018\u00010#@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001e0,X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "key", "scope", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "<set-?>", "Landroidx/compose/ui/geometry/Rect;", "_targetBounds", "get_targetBounds", "()Landroidx/compose/ui/geometry/Rect;", "set_targetBounds", "(Landroidx/compose/ui/geometry/Rect;)V", "_targetBounds$delegate", "Landroidx/compose/runtime/MutableState;", "currentBounds", "getCurrentBounds", "setCurrentBounds", "currentBounds$delegate", "", "foundMatch", "getFoundMatch", "()Z", "setFoundMatch", "(Z)V", "foundMatch$delegate", "getKey", "()Ljava/lang/Object;", "observingVisibilityChange", "Lkotlin/Function0;", "", "getScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "states", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/SharedElementInternalState;", "getStates", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "targetBounds", "getTargetBounds", "targetBoundsProvider", "getTargetBoundsProvider$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "updateMatch", "Lkotlin/Function1;", "addState", "sharedElementState", "hasVisibleContent", "isAnimating", "onLookaheadResult", "state", "lookaheadSize", "Landroidx/compose/ui/geometry/Size;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "onLookaheadResult-v_w8tDc", "(Landroidx/compose/animation/SharedElementInternalState;JJ)V", "onSharedTransitionFinished", "removeState", "updateTargetBoundsProvider", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharedElement {
    public static final int $stable = 0;
    private final MutableState _targetBounds$delegate;
    private final MutableState currentBounds$delegate;
    private final MutableState foundMatch$delegate;
    private final Object key;
    private final Function0<Unit> observingVisibilityChange;
    private final SharedTransitionScopeImpl scope;
    private final SnapshotStateList<SharedElementInternalState> states;
    private SharedElementInternalState targetBoundsProvider;
    private final Function1<SharedElement, Unit> updateMatch;

    static {
        $stable = 8;
    }

    public SharedElement(Object key, SharedTransitionScopeImpl scope) {
        this.key = key;
        this.scope = scope;
        this._targetBounds$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.foundMatch$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.currentBounds$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.states = SnapshotStateKt.mutableStateListOf();
        this.updateMatch = new AnonymousClass1(this);
        this.observingVisibilityChange = new SharedElement$observingVisibilityChange$1(this);
    }

    public static final /* synthetic */ boolean access$hasVisibleContent(SharedElement $this) {
        return $this.hasVisibleContent();
    }

    public final Object getKey() {
        return this.key;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isAnimating() {
        List $this$fastAny$iv = this.states;
        int index$iv$iv = 0;
        int r5 = $this$fastAny$iv.size();
    L4:
        if (index$iv$iv >= r5) goto L9;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        SharedElementInternalState it = (SharedElementInternalState) item$iv$iv;
        if (it.getBoundsAnimation().isRunning() == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L7:
        boolean r0 = true;
    L10:
        if (r0 == true) goto L12;
        return false;
    L12:
        if (getFoundMatch() == true) goto L14;
        return false;
    L14:
        return true;
    L9:
        r0 = false;
        goto L10
    }

    private final Rect get_targetBounds() {
        State $this$getValue$iv = this._targetBounds$delegate;
        return (Rect) $this$getValue$iv.getValue();
    }

    private final void set_targetBounds(Rect r4) {
        MutableState $this$setValue$iv = this._targetBounds$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final Rect getTargetBounds() {
        SharedElementInternalState $this$_get_targetBounds__u24lambda_u241 = this.targetBoundsProvider;
        if ($this$_get_targetBounds__u24lambda_u241 == null) goto L5;
        Rect r0 = RectKt.m4165Recttz77jQw($this$_get_targetBounds__u24lambda_u241.m105calculateLookaheadOffsetF1C5BW0(), $this$_get_targetBounds__u24lambda_u241.m106getNonNullLookaheadSizeNHjbRc());
    L6:
        set_targetBounds(r0);
        return get_targetBounds();
    L5:
        r0 = null;
        goto L6
    }

    public final void updateMatch() {
        boolean hasVisibleContent = hasVisibleContent();
        if (this.states.size() <= 1) goto L7;
        if (hasVisibleContent == false) goto L7;
        setFoundMatch(true);
    L12:
        if (this.states.isEmpty() == true) goto L15;
        this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
        return;
    L15:
        return;
    L7:
        if (this.scope.isTransitionActive() == false) goto L10;
        if (hasVisibleContent == true) goto L12;
        setFoundMatch(false);
        goto L12
    L10:
        setFoundMatch(false);
        goto L12
    }

    private final void setFoundMatch(boolean r5) {
        MutableState $this$setValue$iv = this.foundMatch$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final boolean getFoundMatch() {
        State $this$getValue$iv = this.foundMatch$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final Rect getCurrentBounds() {
        State $this$getValue$iv = this.currentBounds$delegate;
        return (Rect) $this$getValue$iv.getValue();
    }

    public final void setCurrentBounds(Rect r4) {
        MutableState $this$setValue$iv = this.currentBounds$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final SharedElementInternalState getTargetBoundsProvider$animation_release() {
        return this.targetBoundsProvider;
    }

    /* JADX INFO: renamed from: onLookaheadResult-v_w8tDc, reason: not valid java name */
    public final void m104onLookaheadResultv_w8tDc(SharedElementInternalState state, long lookaheadSize, long topLeft) {
        if (state.getBoundsAnimation().getTarget() == false) goto L24;
        this.targetBoundsProvider = state;
        Rect r0 = get_targetBounds();
        Size r1 = null;
        if (r0 == null) goto L7;
        Offset r2 = Offset.m4114boximpl(r0.m4160getTopLeftF1C5BW0());
    L8:
        boolean r3 = false;
        if (r2 != null) goto L11;
        boolean r4 = false;
    L12:
        if (r4 == false) goto L20;
        Rect r5 = get_targetBounds();
        if (r5 == null) goto L16;
        r1 = Size.m4182boximpl(r5.m4158getSizeNHjbRc());
    L16:
        if (r1 == null) goto L19;
        r3 = Size.m4190equalsimpl0(r1.m4199unboximpl(), lookaheadSize);
    L19:
        if (r3 == false) goto L20;
        return;
    L20:
        Rect target = RectKt.m4165Recttz77jQw(topLeft, lookaheadSize);
        set_targetBounds(target);
        List $this$fastForEach$iv = this.states;
        int index$iv = 0;
        int r6 = $this$fastForEach$iv.size();
    L21:
        if (index$iv >= r6) goto L27;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        SharedElementInternalState it = (SharedElementInternalState) item$iv;
        BoundsAnimation r8 = it.getBoundsAnimation();
        Rect r9 = getCurrentBounds();
        Intrinsics.checkNotNull(r9);
        r8.animate(r9, target);
        index$iv = index$iv + 1;
        goto L21
    L27:
        return;
    L11:
        r4 = Offset.m4122equalsimpl0(r2.m4135unboximpl(), topLeft);
        goto L12
    L7:
        r2 = null;
        goto L8
    }

    public final SnapshotStateList<SharedElementInternalState> getStates() {
        return this.states;
    }

    private final boolean hasVisibleContent() {
        List $this$fastAny$iv = this.states;
        int index$iv$iv = 0;
        int r5 = $this$fastAny$iv.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = $this$fastAny$iv.get(index$iv$iv);
        SharedElementInternalState it = (SharedElementInternalState) item$iv$iv;
        if (it.getBoundsAnimation().getTarget() == true) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        return true;
    L8:
        return false;
    }

    public final void updateTargetBoundsProvider() {
        SharedElementInternalState r0 = null;
        List $this$fastForEachReversed$iv = this.states;
        int r3 = $this$fastForEachReversed$iv.size() - 1;
        if (r3 < 0) goto L12;
    L4:
        int index$iv = r3;
        r3 = r3 - 1;
        Object item$iv = $this$fastForEachReversed$iv.get(index$iv);
        SharedElementInternalState it = (SharedElementInternalState) item$iv;
        if (it.getBoundsAnimation().getTarget() == false) goto L9;
        r0 = it;
    L9:
        if (r3 >= 0) goto L4;
    L12:
        if (Intrinsics.areEqual(r0, this.targetBoundsProvider) == false) goto L14;
        return;
    L14:
        this.targetBoundsProvider = r0;
        set_targetBounds(null);
    }

    public final void onSharedTransitionFinished() {
        boolean r1 = true;
        if (this.states.size() > 1) goto L5;
    L7:
        r1 = false;
    L8:
        setFoundMatch(r1);
        set_targetBounds(null);
        return;
    L5:
        if (hasVisibleContent() == false) goto L7;
        goto L7
    }

    public final void addState(SharedElementInternalState sharedElementState) {
        this.states.add(sharedElementState);
        this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final void removeState(SharedElementInternalState sharedElementState) {
        this.states.remove(sharedElementState);
        if (this.states.isEmpty() == false) goto L5;
        updateMatch();
        this.scope.clearObservation$animation_release(this);
        return;
    L5:
        this.scope.observeReads$animation_release(this, this.updateMatch, this.observingVisibilityChange);
    }
}
