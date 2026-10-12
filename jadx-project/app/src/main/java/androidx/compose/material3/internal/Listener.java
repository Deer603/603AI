package androidx.compose.material3.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0002\u0010\u0013\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\"B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0019J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0019R+\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u0003*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Landroidx/compose/material3/internal/Listener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroidx/compose/runtime/State;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "(ZZ)V", "<set-?>", "accessibilityEnabled", "getAccessibilityEnabled", "()Z", "setAccessibilityEnabled", "(Z)V", "accessibilityEnabled$delegate", "Landroidx/compose/runtime/MutableState;", "switchAccessListener", "androidx/compose/material3/internal/Listener$switchAccessListener$1", "Landroidx/compose/material3/internal/Listener$switchAccessListener$1;", "touchExplorationListener", "androidx/compose/material3/internal/Listener$touchExplorationListener$1", "Landroidx/compose/material3/internal/Listener$touchExplorationListener$1;", "value", "getValue", "()Ljava/lang/Boolean;", "switchAccessEnabled", "Landroid/view/accessibility/AccessibilityManager;", "getSwitchAccessEnabled", "(Landroid/view/accessibility/AccessibilityManager;)Z", "onAccessibilityStateChanged", "", "enabled", "register", "am", "unregister", "Api33Impl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Listener implements AccessibilityManager.AccessibilityStateChangeListener, State<Boolean> {
    private final MutableState accessibilityEnabled$delegate;
    private final Listener$switchAccessListener$1 switchAccessListener;
    private final Listener$touchExplorationListener$1 touchExplorationListener;

    /* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/material3/internal/Listener$Api33Impl;", "", "()V", "addAccessibilityServicesStateChangeListener", "", "am", "Landroid/view/accessibility/AccessibilityManager;", "listener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "removeAccessibilityServicesStateChangeListener", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api33Impl {
        public static final Api33Impl INSTANCE = null;

        static {
            INSTANCE = new Api33Impl();
        }

        private Api33Impl() {
        }

        @JvmStatic
        public static final void addAccessibilityServicesStateChangeListener(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.addAccessibilityServicesStateChangeListener(listener);
        }

        @JvmStatic
        public static final void removeAccessibilityServicesStateChangeListener(AccessibilityManager am, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    public Listener(boolean listenToTouchExplorationState, boolean listenToSwitchAccessState) {
        Listener$switchAccessListener$1 r2 = null;
        this.accessibilityEnabled$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        if (listenToTouchExplorationState == false) goto L5;
        Listener$touchExplorationListener$1 r0 = new Listener$touchExplorationListener$1();
    L6:
        this.touchExplorationListener = r0;
        if (listenToSwitchAccessState == true) goto L9;
    L12:
        this.switchAccessListener = r2;
        return;
    L9:
        if (Build.VERSION.SDK_INT < 33) goto L12;
        r2 = new Listener$switchAccessListener$1(this);
        goto L12
    L5:
        r0 = null;
        goto L6
    }

    public static final /* synthetic */ boolean access$getSwitchAccessEnabled(Listener $this, AccessibilityManager $receiver) {
        return $this.getSwitchAccessEnabled($receiver);
    }

    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Boolean getValue() {
        return getValue();
    }

    private final boolean getAccessibilityEnabled() {
        State $this$getValue$iv = this.accessibilityEnabled$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    private final void setAccessibilityEnabled(boolean r5) {
        MutableState $this$setValue$iv = this.accessibilityEnabled$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    private final boolean getSwitchAccessEnabled(AccessibilityManager $this$switchAccessEnabled) {
        List<AccessibilityServiceInfo> r0 = $this$switchAccessEnabled.getEnabledAccessibilityServiceList(16);
        int index$iv$iv = 0;
        int r6 = r0.size();
    L3:
        boolean r7 = false;
        if (index$iv$iv >= r6) goto L15;
        Object item$iv$iv = r0.get(index$iv$iv);
        AccessibilityServiceInfo it = (AccessibilityServiceInfo) item$iv$iv;
        String r13 = it.getSettingsActivityName();
        if (r13 == null) goto L10;
        List<AccessibilityServiceInfo> r16 = r0;
        boolean r1 = StringsKt.contains$default(r13, "SwitchAccess", false, 2, null);
        boolean r14 = true;
        if (r1 != true) goto L11;
        r7 = true;
    L11:
        if (r7 == true) goto L18;
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        goto L3
    L18:
        return r14;
    L10:
        r16 = r0;
        r14 = true;
        goto L11
    L15:
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public Boolean getValue() {
        boolean r1 = false;
        if (getAccessibilityEnabled() == false) goto L17;
        Listener$touchExplorationListener$1 r0 = this.touchExplorationListener;
        if (r0 == null) goto L7;
        boolean r2 = r0.getEnabled();
    L8:
        if (r2 == true) goto L14;
        Listener$switchAccessListener$1 r3 = this.switchAccessListener;
        if (r3 == null) goto L12;
        boolean r4 = r3.getEnabled();
    L13:
        if (r4 == false) goto L17;
    L12:
        r4 = false;
    L14:
        r1 = true;
        goto L17
    L7:
        r2 = false;
    L17:
        return Boolean.valueOf(r1);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        setAccessibilityEnabled(enabled);
    }

    public final void register(AccessibilityManager am) {
        setAccessibilityEnabled(am.isEnabled());
        am.addAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 it = this.touchExplorationListener;
        if (it == null) goto L6;
        it.setEnabled(am.isTouchExplorationEnabled());
        am.addTouchExplorationStateChangeListener(it);
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L11;
        Listener$switchAccessListener$1 it2 = this.switchAccessListener;
        if (it2 == null) goto L12;
        it2.setEnabled(getSwitchAccessEnabled(am));
        Api33Impl.addAccessibilityServicesStateChangeListener(am, it2);
        return;
    L12:
        return;
    }

    public final void unregister(AccessibilityManager am) {
        am.removeAccessibilityStateChangeListener(this);
        Listener$touchExplorationListener$1 it = this.touchExplorationListener;
        if (it == null) goto L6;
        am.removeTouchExplorationStateChangeListener(it);
    L6:
        if (Build.VERSION.SDK_INT < 33) goto L11;
        Listener$switchAccessListener$1 it2 = this.switchAccessListener;
        if (it2 == null) goto L12;
        Api33Impl.removeAccessibilityServicesStateChangeListener(am, it2);
        return;
    L12:
        return;
    }
}
