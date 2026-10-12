package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateRegistryImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u001e\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0006\u0010\u001f\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0010H\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u000fH\u0007J\b\u0010%\u001a\u00020\u0006H\u0007J\u001f\u0010&\u001a\u00020\u00062\u000e\u0010'\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0001¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u00062\n\u0010+\u001a\u00060\u0014j\u0002`\u0015H\u0001¢\u0006\u0004\b,\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R \u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00128G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl;", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "onAttach", "Lkotlin/Function0;", "", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Lkotlin/jvm/functions/Function0;)V", "getOnAttach$savedstate_release", "()Lkotlin/jvm/functions/Function0;", "lock", "Landroidx/savedstate/internal/SynchronizedObject;", "keyToProviders", "", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "attached", "", "restoredState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "Landroid/os/Bundle;", "value", "isRestored", "()Z", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "consumeRestoredStateForKey", "key", "(Ljava/lang/String;)Landroid/os/Bundle;", "registerSavedStateProvider", "provider", "getSavedStateProvider", "unregisterSavedStateProvider", "performAttach", "performRestore", "savedState", "performRestore$savedstate_release", "(Landroid/os/Bundle;)V", "performSave", "outBundle", "performSave$savedstate_release", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateRegistryImpl {
    private static final Companion Companion = null;
    private static final String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private final Map<String, SavedStateRegistry.SavedStateProvider> keyToProviders;
    private final SynchronizedObject lock;
    private final Function0<Unit> onAttach;
    private final SavedStateRegistryOwner owner;
    private Bundle restoredState;

    /* JADX INFO: compiled from: SavedStateRegistryImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl$Companion;", "", "<init>", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public SavedStateRegistryImpl(SavedStateRegistryOwner owner, Function0<Unit> r3) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(r3, "onAttach");
        this.owner = owner;
        this.onAttach = r3;
        this.lock = new SynchronizedObject();
        this.keyToProviders = new LinkedHashMap();
        this.isAllowingSavingState = true;
    }

    public /* synthetic */ SavedStateRegistryImpl(SavedStateRegistryOwner r1, Function0 r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = new SavedStateRegistryImpl$$ExternalSyntheticLambda1();
    L5:
        this(r1, r2);
    }

    public static final /* synthetic */ Map access$getKeyToProviders$p(SavedStateRegistryImpl $this) {
        return $this.keyToProviders;
    }

    static final Unit _init_$lambda$0() {
        return Unit.INSTANCE;
    }

    public final Function0<Unit> getOnAttach$savedstate_release() {
        return this.onAttach;
    }

    public final boolean isRestored() {
        return this.isRestored;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.isAllowingSavingState;
    }

    public final void setAllowingSavingState$savedstate_release(boolean r1) {
        this.isAllowingSavingState = r1;
    }

    public final Bundle consumeRestoredStateForKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.isRestored == false) goto L16;
        Bundle state = this.restoredState;
        if (state != null) goto L7;
        return null;
    L7:
        Bundle $this$consumeRestoredStateForKey_u24lambda_u242 = SavedStateReader.m7271constructorimpl(state);
        if (SavedStateReader.m7272containsimpl($this$consumeRestoredStateForKey_u24lambda_u242, key) == false) goto L10;
        Bundle consumed = SavedStateReader.m7328getSavedStateimpl($this$consumeRestoredStateForKey_u24lambda_u242, key);
    L11:
        Bundle $this$consumeRestoredStateForKey_u24lambda_u243 = SavedStateWriter.m7357constructorimpl(state);
        SavedStateWriter.m7393removeimpl($this$consumeRestoredStateForKey_u24lambda_u243, key);
        Bundle $this$consumeRestoredStateForKey_u24lambda_u244 = SavedStateReader.m7271constructorimpl(state);
        if (SavedStateReader.m7349isEmptyimpl($this$consumeRestoredStateForKey_u24lambda_u244) == false) goto L14;
        this.restoredState = null;
    L14:
        return consumed;
    L10:
        consumed = null;
        goto L11
    L16:
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state".toString());
    }

    public final void registerSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
    L13:
        th = move-exception;
        throw th;
    L6:
        if (access$getKeyToProviders$p(this).containsKey(key) == true) goto L12;
        access$getKeyToProviders$p(this).put(key, provider);     // Catch: Throwable -> L13
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L13
        monitor-exit(lock$iv);
        return;
    L12:
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());     // Catch: Throwable -> L13
    }

    public final SavedStateRegistry.SavedStateProvider getSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        Iterator r4 = access$getKeyToProviders$p(this).entrySet().iterator();     // Catch: Throwable -> L15
    L6:
        SavedStateRegistry.SavedStateProvider r6 = null;
        if (r4.hasNext() == false) goto L13;
        Map.Entry r5 = (Map.Entry) r4.next();     // Catch: Throwable -> L15
        String k = (String) r5.getKey();     // Catch: Throwable -> L15
        SavedStateRegistry.SavedStateProvider provider = (SavedStateRegistry.SavedStateProvider) r5.getValue();     // Catch: Throwable -> L15
        if (Intrinsics.areEqual(k, key) == false) goto L11;
        r6 = provider;
    L11:
        if (r6 == null) goto L6;
    L13:
        monitor-exit(lock$iv);
        return r6;
    L15:
        th = move-exception;
        throw th;
    }

    public final void unregisterSavedStateProvider(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        SavedStateRegistry.SavedStateProvider r4 = (SavedStateRegistry.SavedStateProvider) access$getKeyToProviders$p(this).remove(key);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void performAttach() {
        if (this.owner.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L14;
        if (this.attached == true) goto L12;
        this.onAttach.invoke();
        this.owner.getLifecycle().addObserver(new SavedStateRegistryImpl$$ExternalSyntheticLambda0(this));
        this.attached = true;
        return;
    L12:
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    L14:
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    L5:
        r0 = false;
        goto L6
    }

    static final void performAttach$lambda$12(SavedStateRegistryImpl this$0, LifecycleOwner r2, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(r2, "<unused var>");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        if (event != Lifecycle.Event.ON_START) goto L6;
        this$0.isAllowingSavingState = true;
        return;
    L6:
        if (event != Lifecycle.Event.ON_STOP) goto L10;
        this$0.isAllowingSavingState = false;
        return;
    }

    public final void performRestore$savedstate_release(Bundle savedState) {
        if (this.attached == true) goto L6;
        performAttach();
    L6:
        if (this.owner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) == true) goto L20;
        if (this.isRestored == true) goto L18;
        Bundle r0 = null;
        if (savedState == null) goto L15;
        Bundle $this$performRestore_u24lambda_u2415 = SavedStateReader.m7271constructorimpl(savedState);
        if (SavedStateReader.m7272containsimpl($this$performRestore_u24lambda_u2415, SAVED_COMPONENTS_KEY) == false) goto L15;
        r0 = SavedStateReader.m7328getSavedStateimpl($this$performRestore_u24lambda_u2415, SAVED_COMPONENTS_KEY);
    L15:
        this.restoredState = r0;
        this.isRestored = true;
        return;
    L18:
        throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
    L20:
        throw new IllegalStateException(("performRestore cannot be called when owner is " + this.owner.getLifecycle().getCurrentState()).toString());
    }

    public final void performSave$savedstate_release(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Map initialState$iv = MapsKt.emptyMap();
        if (initialState$iv.isEmpty() == false) goto L5;
        Pair[] r0 = new Pair[0];
    L10:
        Pair[] pairs$iv = r0;
        Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        Bundle $this$performSave_u24lambda_u2418 = SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
        Bundle it = this.restoredState;
        if (it == null) goto L13;
        SavedStateWriter.m7361putAllimpl($this$performSave_u24lambda_u2418, it);
    L13:
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        Iterator r16 = access$getKeyToProviders$p(this).entrySet().iterator();     // Catch: Throwable -> L26
    L18:
        if (r16.hasNext() == false) goto L20;
        Map.Entry r17 = (Map.Entry) r16.next();     // Catch: Throwable -> L26
        String key = (String) r17.getKey();     // Catch: Throwable -> L26
        SavedStateRegistry.SavedStateProvider provider = (SavedStateRegistry.SavedStateProvider) r17.getValue();     // Catch: Throwable -> L26
        Bundle r18 = $this$savedState_u24lambda_u241$iv;
        SavedStateWriter.m7384putSavedStateimpl($this$performSave_u24lambda_u2418, key, provider.saveState());     // Catch: Throwable -> L26
        $this$savedState_u24lambda_u241$iv = r18;
        goto L18
    L20:
        Bundle inState = $this$savedState_u24lambda_u241$iv;
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L26
        monitor-exit(lock$iv);
        Bundle $this$performSave_u24lambda_u2419 = SavedStateReader.m7271constructorimpl(inState);
        if (SavedStateReader.m7349isEmptyimpl($this$performSave_u24lambda_u2419) == true) goto L33;
        Bundle $this$performSave_u24lambda_u2420 = SavedStateWriter.m7357constructorimpl(outBundle);
        SavedStateWriter.m7384putSavedStateimpl($this$performSave_u24lambda_u2420, SAVED_COMPONENTS_KEY, inState);
        return;
    L33:
        return;
    L26:
        th = move-exception;
        throw th;
    L5:
        Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
        Iterator r10 = initialState$iv.entrySet().iterator();
    L7:
        if (r10.hasNext() == false) goto L9;
        Map.Entry item$iv$iv$iv = (Map.Entry) r10.next();
        String key$iv = (String) item$iv$iv$iv.getKey();
        Object value$iv = item$iv$iv$iv.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L7
    L9:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        r0 = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
        goto L10
    }
}
