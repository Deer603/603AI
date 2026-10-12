package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* JADX INFO: compiled from: SnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "", "onApplied", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "changed", "", "onCreated", "parent", "observers", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "onCreating", "readonly", "", "onDisposing", "onPreCreate", "onPreDispose", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SnapshotObserver {
    @Deprecated(message = "Deprecated and renamed to onPreCreate. This method will be removed before 1.8.0 stable", replaceWith = @ReplaceWith(expression = "onPreCreate", imports = {}))
    default SnapshotInstanceObservers onCreating(Snapshot parent, boolean readonly) {
        return null;
    }

    default SnapshotInstanceObservers onPreCreate(Snapshot parent, boolean readonly) {
        return onCreating(parent, readonly);
    }

    default void onCreated(Snapshot snapshot, Snapshot parent, SnapshotInstanceObservers observers) {
    }

    @Deprecated(message = "Deprecated and renamed to onPreDispose. This method will be removed before 1.8.0 stable", replaceWith = @ReplaceWith(expression = "onPreDispose", imports = {}))
    default void onDisposing(Snapshot snapshot) {
    }

    default void onPreDispose(Snapshot snapshot) {
        onDisposing(snapshot);
    }

    default void onApplied(Snapshot snapshot, Set<? extends Object> r2) {
    }
}
