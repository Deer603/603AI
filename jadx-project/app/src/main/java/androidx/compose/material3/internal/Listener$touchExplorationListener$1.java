package androidx.compose.material3.internal;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R+\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"androidx/compose/material3/internal/Listener$touchExplorationListener$1", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "<set-?>", "", "enabled", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled$delegate", "Landroidx/compose/runtime/MutableState;", "onTouchExplorationStateChanged", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Listener$touchExplorationListener$1 implements AccessibilityManager.TouchExplorationStateChangeListener {
    private final MutableState enabled$delegate;

    Listener$touchExplorationListener$1() {
        this.enabled$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public final boolean getEnabled() {
        State $this$getValue$iv = this.enabled$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setEnabled(boolean r5) {
        MutableState $this$setValue$iv = this.enabled$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean enabled) {
        setEnabled(enabled);
    }
}
