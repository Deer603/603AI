package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LifecycleRegistry.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"checkLifecycleStateTransition", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "current", "Landroidx/lifecycle/Lifecycle$State;", "next", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(LifecycleOwner owner, Lifecycle.State current, Lifecycle.State next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current != Lifecycle.State.INITIALIZED) goto L10;
        if (next != Lifecycle.State.DESTROYED) goto L10;
        throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + next + "' in component " + owner).toString());
    L10:
        if (current != Lifecycle.State.DESTROYED) goto L15;
        if (current != next) goto L14;
        return;
    L14:
        throw new IllegalStateException(("State is '" + Lifecycle.State.DESTROYED + "' and cannot be moved to `" + next + "` in component " + owner).toString());
    }
}
