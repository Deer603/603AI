package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 72\u00020\u0001:\u0003678B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J#\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u0002H\u0017H\u0007¢\u0006\u0002\u0010\u001aJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J8\u0010\u001e\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0017\u0018\u00010\u0006H\u0002J\b\u0010 \u001a\u00020\nH\u0002JG\u0010!\u001a\u00020\u0012\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H\u00170$2\u0006\u0010%\u001a\u0002H\"2\b\u0010&\u001a\u0004\u0018\u00010'H'¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u000fJB\u0010-\u001a\b\u0012\u0004\u0012\u0002H\"0.\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u00172\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H\u00170$2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u001700JJ\u0010-\u001a\b\u0012\u0004\u0012\u0002H\"0.\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u00172\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H\u00170$2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u001700J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0015\u00104\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0001¢\u0006\u0002\b5R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "()V", "keyToCallback", "", "", "Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "keyToLifecycleContainers", "Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "keyToRc", "", "launchedKeys", "", "parsedPendingResults", "pendingResults", "Landroid/os/Bundle;", "rcToKey", "bindRcKey", "", "rc", "key", "dispatchResult", "", "O", "requestCode", "result", "(ILjava/lang/Object;)Z", "resultCode", "data", "Landroid/content/Intent;", "doDispatch", "callbackAndContract", "generateRandomNumber", "onLaunch", "I", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "onRestoreInstanceState", "savedInstanceState", "onSaveInstanceState", "outState", "register", "Landroidx/activity/result/ActivityResultLauncher;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "registerKey", "unregister", "unregister$activity_release", "CallbackAndContract", "Companion", "LifecycleContainer", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultRegistry {
    private static final Companion Companion = null;
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final transient Map<String, CallbackAndContract<?>> keyToCallback;
    private final Map<String, LifecycleContainer> keyToLifecycleContainers;
    private final Map<String, Integer> keyToRc;
    private final List<String> launchedKeys;
    private final Map<String, Object> parsedPendingResults;
    private final Bundle pendingResults;
    private final Map<Integer, String> rcToKey;

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$CallbackAndContract;", "O", "", "callback", "Landroidx/activity/result/ActivityResultCallback;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "getCallback", "()Landroidx/activity/result/ActivityResultCallback;", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CallbackAndContract<O> {
        private final ActivityResultCallback<O> callback;
        private final ActivityResultContract<?, O> contract;

        public CallbackAndContract(ActivityResultCallback<O> r2, ActivityResultContract<?, O> r3) {
            Intrinsics.checkNotNullParameter(r2, "callback");
            Intrinsics.checkNotNullParameter(r3, "contract");
            this.callback = r2;
            this.contract = r3;
        }

        public final ActivityResultCallback<O> getCallback() {
            return this.callback;
        }

        public final ActivityResultContract<?, O> getContract() {
            return this.contract;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$Companion;", "", "()V", "INITIAL_REQUEST_CODE_VALUE", "", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, "", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, ActivityResultRegistry.KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$LifecycleContainer;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;)V", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "observers", "", "Landroidx/lifecycle/LifecycleEventObserver;", "addObserver", "", "observer", "clearObservers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LifecycleContainer {
        private final Lifecycle lifecycle;
        private final List<LifecycleEventObserver> observers;

        public LifecycleContainer(Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final Lifecycle getLifecycle() {
            return this.lifecycle;
        }

        public final void addObserver(LifecycleEventObserver observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.lifecycle.addObserver(observer);
            this.observers.add(observer);
        }

        public final void clearObservers() {
            Iterable $this$forEach$iv = this.observers;
            Iterator r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L6;
            Object element$iv = r2.next();
            LifecycleEventObserver observer = (LifecycleEventObserver) element$iv;
            this.lifecycle.removeObserver(observer);
            goto L4
        L6:
            this.observers.clear();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public abstract <I, O> void onLaunch(int r1, ActivityResultContract<I, O> r2, I r3, ActivityOptionsCompat r4);

    public ActivityResultRegistry() {
        this.rcToKey = new LinkedHashMap();
        this.keyToRc = new LinkedHashMap();
        this.keyToLifecycleContainers = new LinkedHashMap();
        this.launchedKeys = new ArrayList();
        this.keyToCallback = new LinkedHashMap();
        this.parsedPendingResults = new LinkedHashMap();
        this.pendingResults = new Bundle();
    }

    public static final /* synthetic */ Map access$getKeyToRc$p(ActivityResultRegistry $this) {
        return $this.keyToRc;
    }

    public static final /* synthetic */ List access$getLaunchedKeys$p(ActivityResultRegistry $this) {
        return $this.launchedKeys;
    }

    public final <I, O> ActivityResultLauncher<I> register(final String key, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> r7, final ActivityResultCallback<O> r8) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(r7, "contract");
        Intrinsics.checkNotNullParameter(r8, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED) == true) goto L10;
        registerKey(key);
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer != null) goto L7;
        lifecycleContainer = new LifecycleContainer(lifecycle);
    L7:
        LifecycleEventObserver observer = new ActivityResultRegistry$$ExternalSyntheticLambda0(this, key, r8, r7);
        lifecycleContainer.addObserver(observer);
        this.keyToLifecycleContainers.put(key, lifecycleContainer);
        return new AnonymousClass2(this, key, r7);
    L10:
        throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    static final void register$lambda$1(ActivityResultRegistry this$0, String $key, ActivityResultCallback $callback, ActivityResultContract $contract, LifecycleOwner r6, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(r6, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        if (Lifecycle.Event.ON_START != event) goto L11;
        this$0.keyToCallback.put($key, new CallbackAndContract($callback, $contract));
        if (this$0.parsedPendingResults.containsKey($key) == false) goto L7;
        Object parsedPendingResult = this$0.parsedPendingResults.get($key);
        this$0.parsedPendingResults.remove($key);
        $callback.onActivityResult(parsedPendingResult);
    L7:
        ActivityResult pendingResult = (ActivityResult) BundleCompat.getParcelable(this$0.pendingResults, $key, ActivityResult.class);
        if (pendingResult == null) goto L17;
        this$0.pendingResults.remove($key);
        $callback.onActivityResult($contract.parseResult(pendingResult.getResultCode(), pendingResult.getData()));
        return;
    L17:
        return;
    L11:
        if (Lifecycle.Event.ON_STOP != event) goto L14;
        this$0.keyToCallback.remove($key);
        return;
    L14:
        if (Lifecycle.Event.ON_DESTROY != event) goto L20;
        this$0.unregister$activity_release($key);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> register(final String key, final ActivityResultContract<I, O> r5, ActivityResultCallback<O> r6) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r5, "contract");
        Intrinsics.checkNotNullParameter(r6, "callback");
        registerKey(key);
        this.keyToCallback.put(key, new CallbackAndContract(r6, r5));
        if (this.parsedPendingResults.containsKey(key) == false) goto L5;
        Object parsedPendingResult = this.parsedPendingResults.get(key);
        this.parsedPendingResults.remove(key);
        r6.onActivityResult(parsedPendingResult);
    L5:
        ActivityResult pendingResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class);
        if (pendingResult == null) goto L9;
        this.pendingResults.remove(key);
        r6.onActivityResult(r5.parseResult(pendingResult.getResultCode(), pendingResult.getData()));
    L9:
        return new AnonymousClass3(this, key, r5);
    }

    public final void unregister$activity_release(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.launchedKeys.contains(key) == true) goto L7;
        Integer rc = this.keyToRc.remove(key);
        if (rc == null) goto L7;
        this.rcToKey.remove(rc);
    L7:
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key) == false) goto L11;
        Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
        this.parsedPendingResults.remove(key);
    L11:
        if (this.pendingResults.containsKey(key) == false) goto L13;
        ActivityResult pendingResult = (ActivityResult) BundleCompat.getParcelable(this.pendingResults, key, ActivityResult.class);
        Log.w(LOG_TAG, "Dropping pending result for request " + key + ": " + pendingResult);
        this.pendingResults.remove(key);
    L13:
        LifecycleContainer lifecycleContainer = this.keyToLifecycleContainers.get(key);
        if (lifecycleContainer == null) goto L17;
        lifecycleContainer.clearObservers();
        this.keyToLifecycleContainers.remove(key);
        return;
    }

    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList(this.keyToRc.values()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList(this.keyToRc.keySet()));
        outState.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList(this.launchedKeys));
        outState.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, new Bundle(this.pendingResults));
    }

    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        if (savedInstanceState != null) goto L4;
        return;
    L4:
        ArrayList<Integer> r0 = savedInstanceState.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> r1 = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (r1 == null) goto L23;
        if (r0 == null) goto L28;
        ArrayList<String> r2 = savedInstanceState.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
        if (r2 == null) goto L11;
        this.launchedKeys.addAll(r2);
    L11:
        Bundle restoredPendingResults = savedInstanceState.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS);
        if (restoredPendingResults == null) goto L14;
        this.pendingResults.putAll(restoredPendingResults);
    L14:
        int i = 0;
        int r5 = r1.size();
    L15:
        if (i >= r5) goto L22;
        String key = r1.get(i);
        if (this.keyToRc.containsKey(key) == false) goto L21;
        Integer newRequestCode = this.keyToRc.remove(key);
        if (this.pendingResults.containsKey(key) == true) goto L21;
        TypeIntrinsics.asMutableMap(this.rcToKey).remove(newRequestCode);
    L21:
        Integer newRequestCode2 = r0.get(i);
        Intrinsics.checkNotNullExpressionValue(newRequestCode2, "rcs[i]");
        int r7 = newRequestCode2.intValue();
        String r8 = r1.get(i);
        Intrinsics.checkNotNullExpressionValue(r8, "keys[i]");
        bindRcKey(r7, r8);
        i = i + 1;
        goto L15
    L22:
        return;
    L28:
        return;
    }

    public final boolean dispatchResult(int requestCode, int resultCode, Intent data) {
        String key = this.rcToKey.get(Integer.valueOf(requestCode));
        if (key != null) goto L6;
        return false;
    L6:
        doDispatch(key, resultCode, data, this.keyToCallback.get(key));
        return true;
    }

    public final <O> boolean dispatchResult(int requestCode, O r6) {
        String key = this.rcToKey.get(Integer.valueOf(requestCode));
        if (key != null) goto L6;
        return false;
    L6:
        CallbackAndContract<?> r1 = this.keyToCallback.get(key);
        if (r1 == null) goto L9;
        ActivityResultCallback<?> r2 = r1.getCallback();
    L10:
        if (r2 != null) goto L12;
        this.pendingResults.remove(key);
        this.parsedPendingResults.put(key, r6);
        return true;
    L12:
        ActivityResultCallback<?> r3 = r1.getCallback();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (this.launchedKeys.remove(key) == false) goto L18;
        r3.onActivityResult(r6);
        return true;
    L18:
        return true;
    L9:
        r2 = null;
        goto L10
    }

    private final <O> void doDispatch(String key, int resultCode, Intent data, CallbackAndContract<O> r7) {
        if (r7 == null) goto L4;
        ActivityResultCallback<O> r0 = r7.getCallback();
    L5:
        if (r0 != null) goto L7;
    L9:
        this.parsedPendingResults.remove(key);
        this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        return;
    L7:
        if (this.launchedKeys.contains(key) == false) goto L9;
        r7.getCallback().onActivityResult(r7.getContract().parseResult(resultCode, data));
        this.launchedKeys.remove(key);
        return;
    L4:
        r0 = null;
        goto L5
    }

    private final void registerKey(String key) {
        Integer existing = this.keyToRc.get(key);
        if (existing == null) goto L5;
        return;
    L5:
        int rc = generateRandomNumber();
        bindRcKey(rc, key);
    }

    private final int generateRandomNumber() {
        Sequence $this$first$iv = SequencesKt.generateSequence(AnonymousClass1.INSTANCE);
        Iterator r2 = $this$first$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Object element$iv = r2.next();
        int number = ((Number) element$iv).intValue();
        if (this.rcToKey.containsKey(Integer.valueOf(number)) == true) goto L4;
        return ((Number) element$iv).intValue();
    L10:
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final void bindRcKey(int rc, String key) {
        Integer r0 = Integer.valueOf(rc);
        this.rcToKey.put(r0, key);
        Integer r1 = Integer.valueOf(rc);
        this.keyToRc.put(key, r1);
    }
}
