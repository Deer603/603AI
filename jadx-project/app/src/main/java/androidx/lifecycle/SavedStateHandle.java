package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.lifecycle.internal.SavedStateHandleImpl_androidKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: SavedStateHandle.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0002,-B\u001f\b\u0016\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0087\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u0002H\u0014H\u0007¢\u0006\u0002\u0010\u0016J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002H\u0014H\u0002¢\u0006\u0002\u0010\u0019J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001b\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u0002H\u0014H\u0007¢\u0006\u0002\u0010\u001cJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00140\u001e\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u0002H\u0014H\u0007¢\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0007J\u001e\u0010\"\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020%\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u0001H\u0014H\u0087\u0002¢\u0006\u0002\u0010'J\u001d\u0010(\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010#J\u0018\u0010)\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u000eH\u0007J\u0010\u0010+\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "<init>", "(Ljava/util/Map;)V", "()V", "liveDatas", "", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "impl", "Landroidx/lifecycle/internal/SavedStateHandleImpl;", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "contains", "", "key", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "T", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "getMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "keys", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "setSavedStateProvider", "provider", "clearSavedStateProvider", "SavingStateLiveData", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandle {
    public static final Companion Companion = null;
    private SavedStateHandleImpl impl;
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    /* JADX INFO: compiled from: SavedStateHandle.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "<init>", "()V", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SavedStateHandle createHandle(Bundle restoredState, Bundle defaultState) {
            if (restoredState != null) goto L4;
            Bundle initialState = defaultState;
        L5:
            if (initialState == null) goto L7;
            ClassLoader r1 = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(r1);
            initialState.setClassLoader(r1);
            Bundle $this$read$iv = initialState;
            Bundle $this$createHandle_u24lambda_u240 = SavedStateReader.m7271constructorimpl($this$read$iv);
            return new SavedStateHandle(SavedStateReader.m7352toMapimpl($this$createHandle_u24lambda_u240));
        L7:
            return new SavedStateHandle();
        L4:
            initialState = restoredState;
            goto L5
        }

        public final boolean validateValue(Object value) {
            return SavedStateHandleImpl_androidKt.isAcceptableType(value);
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.android.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "setValue", "", "(Ljava/lang/Object;)V", "detach", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        public SavingStateLiveData(SavedStateHandle handle, String key, T r4) {
            Intrinsics.checkNotNullParameter(key, "key");
            super(r4);
            this.key = key;
            this.handle = handle;
        }

        public SavingStateLiveData(SavedStateHandle handle, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
            this.handle = handle;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T r3) {
            SavedStateHandle r0 = this.handle;
            if (r0 == null) goto L7;
            SavedStateHandleImpl r1 = SavedStateHandle.access$getImpl$p(r0);
            if (r1 == null) goto L7;
            r1.set(this.key, r3);
        L7:
            super.setValue(r3);
        }

        public final void detach() {
            this.handle = null;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public static final /* synthetic */ SavedStateHandleImpl access$getImpl$p(SavedStateHandle $this) {
        return $this.impl;
    }

    public SavedStateHandle(Map<String, ? extends Object> r2) {
        Intrinsics.checkNotNullParameter(r2, "initialState");
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandle() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new SavedStateHandleImpl(null, 1, 0 == true ? 1 : 0);
    }

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.impl.getSavedStateProvider();
    }

    public final boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.impl.contains(key);
    }

    public final <T> MutableLiveData<T> getLiveData(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MutableLiveData<T> r0 = getLiveDataInternal(key, false, null);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return r0;
    }

    public final <T> MutableLiveData<T> getLiveData(String key, T r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getLiveDataInternal(key, true, r3);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String key, boolean hasInitialValue, T r9) {
        if (this.impl.getMutableFlows().containsKey(key) == true) goto L17;
        Map<String, SavingStateLiveData<?>> r0 = this.liveDatas;
        SavingStateLiveData<?> r2 = r0.get(key);
        if (r2 == null) goto L7;
        SavingStateLiveData<?> r4 = r2;
    L15:
        return r4;
    L7:
        if (this.impl.getRegular().containsKey(key) == false) goto L9;
        r4 = new SavingStateLiveData(this, key, this.impl.getRegular().get(key));
    L12:
        r0.put(key, r4);
        goto L15
    L9:
        if (hasInitialValue == false) goto L11;
        this.impl.getRegular().put(key, r9);
        r4 = new SavingStateLiveData(this, key, r9);
        goto L12
    L11:
        r4 = new SavingStateLiveData(this, key);
        goto L12
    L17:
        throw new IllegalArgumentException(SavedStateHandle_androidKt.access$createMutuallyExclusiveErrorMessage(key).toString());
    }

    public final <T> StateFlow<T> getStateFlow(String key, T r4) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean r0 = this.impl.getMutableFlows().containsKey(key);
        SavedStateHandleImpl r1 = this.impl;
        if (r0 == false) goto L6;
        return FlowKt.asStateFlow(r1.getMutableStateFlow(key, r4));
    L6:
        return r1.getStateFlow(key, r4);
    }

    public final <T> MutableStateFlow<T> getMutableStateFlow(String key, T r4) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.liveDatas.containsKey(key) == true) goto L7;
        return this.impl.getMutableStateFlow(key, r4);
    L7:
        throw new IllegalArgumentException(SavedStateHandle_androidKt.access$createMutuallyExclusiveErrorMessage(key).toString());
    }

    public final Set<String> keys() {
        return SetsKt.plus(this.impl.keys(), this.liveDatas.keySet());
    }

    public final <T> T get(String r2) {
        Intrinsics.checkNotNullParameter(r2, "key");
        return (T) this.impl.get(r2);
    }

    public final <T> void set(String key, T r5) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Companion.validateValue(r5) == false) goto L12;
        MutableLiveData r0 = this.liveDatas.get(key);
        if ((r0 instanceof MutableLiveData) == false) goto L7;
        MutableLiveData mutableLiveData = r0;
    L8:
        if (mutableLiveData == null) goto L10;
        mutableLiveData.setValue(r5);
    L10:
        this.impl.set(key, r5);
        return;
    L7:
        mutableLiveData = null;
        goto L8
    L12:
        StringBuilder r1 = new StringBuilder().append("Can't put value with type ");
        Intrinsics.checkNotNull(r5);
        throw new IllegalArgumentException(r1.append(r5.getClass()).append(" into saved state").toString().toString());
    }

    public final <T> T remove(String r5) {
        Intrinsics.checkNotNullParameter(r5, "key");
        T r0 = (T) this.impl.remove(r5);
        SavingStateLiveData<?> r3 = this.liveDatas.remove(r5);
        if (r3 == null) goto L5;
        r3.detach();
    L5:
        return r0;
    }

    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.impl.setSavedStateProvider(key, provider);
    }

    public final void clearSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.impl.clearSavedStateProvider(key);
    }

    @JvmStatic
    public static final SavedStateHandle createHandle(Bundle restoredState, Bundle defaultState) {
        return Companion.createHandle(restoredState, defaultState);
    }
}
