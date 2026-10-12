package androidx.compose.ui.tooling.animation.states;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TargetState.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "initial", "target", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitial", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTarget", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TargetState<T> implements ComposeAnimationState {
    public static final int $stable = 0;
    private final T initial;
    private final T target;

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetState copy$default(TargetState r0, Object r1, Object r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.initial;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.target;
    L9:
        return r0.copy(r1, r2);
    }

    public final T component1() {
        return this.initial;
    }

    public final T component2() {
        return this.target;
    }

    public final TargetState<T> copy(T r2, T r3) {
        return new TargetState(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof TargetState) == true) goto L8;
        return false;
    L8:
        TargetState r1 = (TargetState) r6;
        if (Intrinsics.areEqual(this.initial, r1.initial) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.target, r1.target) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.initial != null) goto L5;
        int r0 = 0;
    L6:
        int r2 = r0 * 31;
        if (this.target == null) goto L11;
        r1 = this.target.hashCode();
    L11:
        return r2 + r1;
    L5:
        r0 = this.initial.hashCode();
        goto L6
    }

    public String toString() {
        return "TargetState(initial=" + this.initial + ", target=" + this.target + ')';
    }

    public TargetState(T r1, T r2) {
        this.initial = r1;
        this.target = r2;
    }

    public final T getInitial() {
        return this.initial;
    }

    public final T getTarget() {
        return this.target;
    }
}
