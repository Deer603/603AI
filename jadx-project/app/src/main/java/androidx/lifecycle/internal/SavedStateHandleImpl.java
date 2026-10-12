package androidx.lifecycle.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: SavedStateHandleImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\u0002J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0018\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0019H\u0007¢\u0006\u0002\u0010\u001bJ)\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00190\u000e\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0019H\u0007¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001fH\u0007J\u001e\u0010 \u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010!J&\u0010\"\u001a\u00020#\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u0001H\u0019H\u0087\u0002¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010!J\u0018\u0010'\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fH\u0007J\u0010\u0010)\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "initialState", "", "", "<init>", "(Ljava/util/Map;)V", "regular", "", "getRegular", "()Ljava/util/Map;", "providers", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "flows", "Lkotlinx/coroutines/flow/MutableStateFlow;", "mutableFlows", "getMutableFlows", "savedStateProvider", "getSavedStateProvider", "()Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "contains", "", "key", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "T", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "getMutableStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "keys", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "setSavedStateProvider", "provider", "clearSavedStateProvider", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandleImpl {
    private final Map<String, MutableStateFlow<Object>> flows;
    private final Map<String, MutableStateFlow<Object>> mutableFlows;
    private final Map<String, SavedStateRegistry.SavedStateProvider> providers;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SavedStateHandleImpl(Map<String, ? extends Object> r2) {
        Intrinsics.checkNotNullParameter(r2, "initialState");
        this.regular = MapsKt.toMutableMap(r2);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateHandleImpl$$ExternalSyntheticLambda0(this);
    }

    public /* synthetic */ SavedStateHandleImpl(Map r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = MapsKt.emptyMap();
    L5:
        this(r1);
    }

    public final Map<String, Object> getRegular() {
        return this.regular;
    }

    public final Map<String, MutableStateFlow<Object>> getMutableFlows() {
        return this.mutableFlows;
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider() {
        return this.savedStateProvider;
    }

    static final Bundle savedStateProvider$lambda$0(SavedStateHandleImpl this$0) {
        Iterator r0 = MapsKt.toMap(this$0.mutableFlows).entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r0.next();
        String key = (String) r1.getKey();
        MutableStateFlow mutableFlow = (MutableStateFlow) r1.getValue();
        this$0.set(key, mutableFlow.getValue());
        goto L4
    L6:
        Iterator r2 = MapsKt.toMap(this$0.providers).entrySet().iterator();
    L8:
        if (r2.hasNext() == false) goto L10;
        Map.Entry r3 = (Map.Entry) r2.next();
        String key2 = (String) r3.getKey();
        SavedStateRegistry.SavedStateProvider provider = (SavedStateRegistry.SavedStateProvider) r3.getValue();
        this$0.set(key2, provider.saveState());
        goto L8
    L10:
        Map<String, Object> r4 = this$0.regular;
        if (r4.isEmpty() == false) goto L13;
        Pair[] pairs$iv = new Pair[0];
    L18:
        Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
        return $this$savedState_u24lambda_u241$iv;
    L13:
        Collection destination$iv$iv$iv = new ArrayList(r4.size());
        Iterator<Map.Entry<String, Object>> r8 = r4.entrySet().iterator();
    L15:
        if (r8.hasNext() == false) goto L17;
        Map.Entry<String, Object> r9 = r8.next();
        String key$iv = r9.getKey();
        Object value$iv = r9.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L15
    L17:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
        goto L18
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.regular.containsKey(key);
    }

    public final <T> StateFlow<T> getStateFlow(String key, T r7) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, MutableStateFlow<Object>> r0 = this.flows;
        MutableStateFlow<Object> r2 = r0.get(key);
        if (r2 == null) goto L5;
        MutableStateFlow<Object> r3 = r2;
    L9:
        StateFlow<T> r1 = FlowKt.asStateFlow(r3);
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getStateFlow>");
        return r1;
    L5:
        if (this.regular.containsKey(key) == true) goto L7;
        this.regular.put(key, r7);
    L7:
        r3 = StateFlowKt.MutableStateFlow(this.regular.get(key));
        r0.put(key, r3);
        goto L9
    }

    public final <T> MutableStateFlow<T> getMutableStateFlow(String key, T r7) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map $this$getOrPut$iv = this.mutableFlows;
        Object value$iv = $this$getOrPut$iv.get(key);
        if (value$iv == null) goto L5;
        Object answer$iv = value$iv;
    L9:
        MutableStateFlow<T> r3 = (MutableStateFlow) answer$iv;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<T of androidx.lifecycle.internal.SavedStateHandleImpl.getMutableStateFlow>");
        return r3;
    L5:
        if (this.regular.containsKey(key) == true) goto L7;
        this.regular.put(key, r7);
    L7:
        answer$iv = StateFlowKt.MutableStateFlow(this.regular.get(key));
        $this$getOrPut$iv.put(key, answer$iv);
        goto L9
    }

    public final Set<String> keys() {
        return SetsKt.plus(this.regular.keySet(), this.providers.keySet());
    }

    public final <T> T get(String r3) {
        Intrinsics.checkNotNullParameter(r3, "key");
        MutableStateFlow<Object> r0 = this.mutableFlows.get(r3);     // Catch: ClassCastException -> L9
        if (r0 == null) goto L7;
        T r1 = (T) r0.getValue();
        if (r1 == null) goto L7;
        return r1;
    L7:
        return (T) this.regular.get(r3);
    L10:
        remove(r3);
        return null;
    }

    public final <T> void set(String key, T r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.regular.put(key, r3);
        MutableStateFlow<Object> r0 = this.flows.get(key);
        if (r0 == null) goto L5;
        r0.setValue(r3);
    L5:
        MutableStateFlow<Object> r1 = this.mutableFlows.get(key);
        if (r1 == null) goto L9;
        r1.setValue(r3);
        return;
    }

    public final <T> T remove(String r3) {
        Intrinsics.checkNotNullParameter(r3, "key");
        T r0 = (T) this.regular.remove(r3);
        this.flows.remove(r3);
        this.mutableFlows.remove(r3);
        return r0;
    }

    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.providers.put(key, provider);
    }

    public final void clearSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.providers.remove(key);
    }
}
