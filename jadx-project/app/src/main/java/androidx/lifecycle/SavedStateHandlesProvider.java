package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0013\u001a\u00060\u000bj\u0002`\fH\u0016J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "saveState", "performRestore", "", "consumeRestoredStateForKey", "key", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final Lazy viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = LazyKt.lazy(new SavedStateHandlesProvider$$ExternalSyntheticLambda0(viewModelStoreOwner));
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    static final SavedStateHandlesVM viewModel_delegate$lambda$0(ViewModelStoreOwner $viewModelStoreOwner) {
        return SavedStateHandleSupport.getSavedStateHandlesVM($viewModelStoreOwner);
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        Map initialState$iv = MapsKt.emptyMap();
        if (initialState$iv.isEmpty() == false) goto L5;
        Pair[] pairs$iv = new Pair[0];
    L10:
        Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        Bundle $this$saveState_u24lambda_u244 = SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
        Bundle it = this.restoredState;
        if (it == null) goto L13;
        SavedStateWriter.m7361putAllimpl($this$saveState_u24lambda_u244, it);
    L13:
        Iterator<Map.Entry<String, SavedStateHandle>> r14 = getViewModel().getHandles().entrySet().iterator();
    L15:
        if (r14.hasNext() == false) goto L20;
        Map.Entry<String, SavedStateHandle> r15 = r14.next();
        String key = r15.getKey();
        SavedStateHandle handle = r15.getValue();
        Map initialState$iv2 = initialState$iv;
        Bundle savedState = handle.savedStateProvider().saveState();
        Bundle $this$saveState_u24lambda_u244_u24lambda_u243_u24lambda_u242 = SavedStateReader.m7271constructorimpl(savedState);
        if (SavedStateReader.m7349isEmptyimpl($this$saveState_u24lambda_u244_u24lambda_u243_u24lambda_u242) == true) goto L19;
        SavedStateWriter.m7384putSavedStateimpl($this$saveState_u24lambda_u244, key, savedState);
    L19:
        initialState$iv = initialState$iv2;
        goto L15
    L20:
        this.restored = false;
        return $this$savedState_u24lambda_u241$iv;
    L5:
        Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
        Iterator r9 = initialState$iv.entrySet().iterator();
    L7:
        if (r9.hasNext() == false) goto L9;
        Map.Entry item$iv$iv$iv = (Map.Entry) r9.next();
        String key$iv = (String) item$iv$iv$iv.getKey();
        Object value$iv = item$iv$iv$iv.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L7
    L9:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
        goto L10
    }

    public final void performRestore() {
        if (this.restored == true) goto L20;
        Bundle newState = this.savedStateRegistry.consumeRestoredStateForKey(SavedStateHandleSupport.SAVED_STATE_KEY);
        Map initialState$iv = MapsKt.emptyMap();
        if (initialState$iv.isEmpty() == false) goto L7;
        Pair[] pairs$iv = new Pair[0];
    L12:
        Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        Bundle $this$performRestore_u24lambda_u247 = SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
        Bundle it = this.restoredState;
        if (it == null) goto L15;
        SavedStateWriter.m7361putAllimpl($this$performRestore_u24lambda_u247, it);
    L15:
        if (newState == null) goto L17;
        SavedStateWriter.m7361putAllimpl($this$performRestore_u24lambda_u247, newState);
    L17:
        this.restoredState = $this$savedState_u24lambda_u241$iv;
        this.restored = true;
        getViewModel();
        return;
    L7:
        Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
        Iterator r9 = initialState$iv.entrySet().iterator();
    L9:
        if (r9.hasNext() == false) goto L11;
        Map.Entry item$iv$iv$iv = (Map.Entry) r9.next();
        String key$iv = (String) item$iv$iv$iv.getKey();
        Object value$iv = item$iv$iv$iv.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L9
    L11:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
        goto L12
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        performRestore();
        Bundle state = this.restoredState;
        if (state != null) goto L5;
        return null;
    L5:
        Bundle $this$consumeRestoredStateForKey_u24lambda_u248 = SavedStateReader.m7271constructorimpl(state);
        if (SavedStateReader.m7272containsimpl($this$consumeRestoredStateForKey_u24lambda_u248, key) == true) goto L8;
        return null;
    L8:
        Bundle $this$consumeRestoredStateForKey_u24lambda_u249 = SavedStateReader.m7271constructorimpl(state);
        Bundle result = SavedStateReader.m7333getSavedStateOrNullimpl($this$consumeRestoredStateForKey_u24lambda_u249, key);
        if (result != null) goto L19;
        Map initialState$iv = MapsKt.emptyMap();
        if (initialState$iv.isEmpty() == false) goto L13;
        Pair[] pairs$iv = new Pair[0];
    L18:
        Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
        result = $this$savedState_u24lambda_u241$iv;
        goto L19
    L13:
        Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
        Iterator r16 = initialState$iv.entrySet().iterator();
    L15:
        if (r16.hasNext() == false) goto L17;
        Map.Entry item$iv$iv$iv = (Map.Entry) r16.next();
        String key$iv = (String) item$iv$iv$iv.getKey();
        Object value$iv = item$iv$iv$iv.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L15
    L17:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
    L19:
        Bundle $this$consumeRestoredStateForKey_u24lambda_u2410 = SavedStateWriter.m7357constructorimpl(state);
        SavedStateWriter.m7393removeimpl($this$consumeRestoredStateForKey_u24lambda_u2410, key);
        Bundle $this$consumeRestoredStateForKey_u24lambda_u2411 = SavedStateReader.m7271constructorimpl(state);
        if (SavedStateReader.m7349isEmptyimpl($this$consumeRestoredStateForKey_u24lambda_u2411) == false) goto L22;
        this.restoredState = null;
    L22:
        return result;
    }
}
