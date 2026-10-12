package androidx.savedstate;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Recreator.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "SavedStateProvider", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recreator implements LifecycleEventObserver {
    public static final String CLASSES_KEY = "classes_to_restore";
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    public static final Companion Companion = null;
    private final SavedStateRegistryOwner owner;

    /* JADX INFO: compiled from: Recreator.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "<init>", "()V", "CLASSES_KEY", "", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Recreator.android.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0016J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "<init>", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "saveState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "add", "", "className", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        private final Set<String> classes;

        public SavedStateProvider(SavedStateRegistry registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public Bundle saveState() {
            Map initialState$iv = MapsKt.emptyMap();
            if (initialState$iv.isEmpty() == false) goto L5;
            Pair[] pairs$iv = new Pair[0];
        L10:
            Bundle $this$savedState_u24lambda_u241$iv = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
            Bundle $this$saveState_u24lambda_u240 = SavedStateWriter.m7357constructorimpl($this$savedState_u24lambda_u241$iv);
            SavedStateWriter.m7392putStringListimpl($this$saveState_u24lambda_u240, Recreator.CLASSES_KEY, CollectionsKt.toList(this.classes));
            return $this$savedState_u24lambda_u241$iv;
        L5:
            Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
            Iterator r8 = initialState$iv.entrySet().iterator();
        L7:
            if (r8.hasNext() == false) goto L9;
            Map.Entry item$iv$iv$iv = (Map.Entry) r8.next();
            String key$iv = (String) item$iv$iv$iv.getKey();
            Object value$iv = item$iv$iv$iv.getValue();
            destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
            goto L7
        L9:
            Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
            pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
            goto L10
        }

        public final void add(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Recreator(SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        if (event != Lifecycle.Event.ON_CREATE) goto L17;
        source.getLifecycle().removeObserver(this);
        SavedStateRegistry registry = this.owner.getSavedStateRegistry();
        Bundle savedState = registry.consumeRestoredStateForKey(COMPONENT_KEY);
        if (savedState != null) goto L7;
        return;
    L7:
        Bundle $this$onStateChanged_u24lambda_u240 = SavedStateReader.m7271constructorimpl(savedState);
        List<String> r6 = SavedStateReader.m7346getStringListOrNullimpl($this$onStateChanged_u24lambda_u240, CLASSES_KEY);
        if (r6 == null) goto L15;
        Iterator<String> r2 = r6.iterator();
    L11:
        if (r2.hasNext() == false) goto L13;
        String className = r2.next();
        reflectiveNew(className);
        goto L11
    L13:
        return;
    L15:
        throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"".toString());
    L17:
        throw new AssertionError("Next event must be ON_CREATE");
    }

    private final void reflectiveNew(String className) {
        Class clazz = Class.forName(className, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);     // Catch: ClassNotFoundException -> L15
        Intrinsics.checkNotNull(clazz);     // Catch: ClassNotFoundException -> L15
        Constructor constructor = clazz.getDeclaredConstructor(new Class[0]);     // Catch: NoSuchMethodException -> L12
        constructor.setAccessible(true);
        Object r2 = constructor.newInstance(new Object[0]);     // Catch: Exception -> L9
        Intrinsics.checkNotNull(r2);     // Catch: Exception -> L9
        SavedStateRegistry.AutoRecreated newInstance = (SavedStateRegistry.AutoRecreated) r2;     // Catch: Exception -> L9
        newInstance.onRecreated(this.owner);
        return;
    L9:
        e = move-exception;
        throw new RuntimeException("Failed to instantiate " + className, e);
    L12:
        e = move-exception;
        throw new IllegalStateException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
    L15:
        e = move-exception;
        throw new RuntimeException("Class " + className + " wasn't found", e);
    }
}
