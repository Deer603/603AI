package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0004\"\f\b\u0000\u0010\u0005*\u00020\u0006*\u00020\u0007*\u0002H\u0005H\u0007¢\u0006\u0002\u0010\b\u001a0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00012\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0011H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u001b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"VIEWMODEL_KEY", "", "SAVED_STATE_KEY", "enableSavedStateHandles", "", "T", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "createSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateRegistryOwner", "viewModelStoreOwner", "key", "defaultArgs", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesProvider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandleSupport {
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = null;
    public static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = null;
    public static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = null;

    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(T r5) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Lifecycle.State currentState = ((LifecycleOwner) r5).getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED) goto L5;
    L8:
        boolean r1 = true;
    L9:
        if (r1 == false) goto L15;
        if (r5.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) != null) goto L16;
        SavedStateHandlesProvider provider = new SavedStateHandlesProvider(r5.getSavedStateRegistry(), r5);
        r5.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, provider);
        ((LifecycleOwner) r5).getLifecycle().addObserver(new SavedStateHandleAttacher(provider));
        return;
    L16:
        return;
    L15:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        if (currentState == Lifecycle.State.CREATED) goto L8;
        r1 = false;
        goto L9
    }

    private static final SavedStateHandle createSavedStateHandle(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String key, Bundle defaultArgs) {
        SavedStateHandlesProvider provider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM viewModel = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle r2 = viewModel.getHandles().get(key);
        if (r2 != null) goto L6;
        SavedStateHandle it = SavedStateHandle.Companion.createHandle(provider.consumeRestoredStateForKey(key), defaultArgs);
        viewModel.getHandles().put(key, it);
        return it;
    L6:
        return r2;
    }

    public static final SavedStateHandle createSavedStateHandle(CreationExtras $this$createSavedStateHandle) {
        Intrinsics.checkNotNullParameter($this$createSavedStateHandle, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) $this$createSavedStateHandle.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner == null) goto L15;
        ViewModelStoreOwner viewModelStateRegistryOwner = (ViewModelStoreOwner) $this$createSavedStateHandle.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStateRegistryOwner == null) goto L13;
        Bundle defaultArgs = (Bundle) $this$createSavedStateHandle.get(DEFAULT_ARGS_KEY);
        String key = (String) $this$createSavedStateHandle.get(ViewModelProvider.VIEW_MODEL_KEY);
        if (key == null) goto L11;
        return createSavedStateHandle(savedStateRegistryOwner, viewModelStateRegistryOwner, key, defaultArgs);
    L11:
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    L13:
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
    L15:
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner $this$savedStateHandlesVM) {
        Intrinsics.checkNotNullParameter($this$savedStateHandlesVM, "<this>");
        return (SavedStateHandlesVM) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, $this$savedStateHandlesVM, new SavedStateHandleSupport$savedStateHandlesVM$1(), null, 4, null).get(VIEWMODEL_KEY, Reflection.getOrCreateKotlinClass(SavedStateHandlesVM.class));
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(SavedStateRegistryOwner $this$savedStateHandlesProvider) {
        Intrinsics.checkNotNullParameter($this$savedStateHandlesProvider, "<this>");
        SavedStateRegistry.SavedStateProvider r0 = $this$savedStateHandlesProvider.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        if ((r0 instanceof SavedStateHandlesProvider) == false) goto L5;
        SavedStateHandlesProvider r1 = (SavedStateHandlesProvider) r0;
    L6:
        if (r1 == null) goto L9;
        return r1;
    L9:
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    L5:
        r1 = null;
        goto L6
    }

    static {
        CreationExtras.Companion r0 = CreationExtras.Companion;
        SAVED_STATE_REGISTRY_OWNER_KEY = new SavedStateHandleSupport$special$$inlined$Key$1();
        CreationExtras.Companion r1 = CreationExtras.Companion;
        VIEW_MODEL_STORE_OWNER_KEY = new SavedStateHandleSupport$special$$inlined$Key$2();
        CreationExtras.Companion r2 = CreationExtras.Companion;
        DEFAULT_ARGS_KEY = new SavedStateHandleSupport$special$$inlined$Key$3();
    }
}
