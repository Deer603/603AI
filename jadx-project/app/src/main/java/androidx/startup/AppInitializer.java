package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class AppInitializer {
    private static final String SECTION_NAME = "Startup";
    private static volatile AppInitializer sInstance;
    private static final Object sLock = null;
    final Context mContext;
    final Set<Class<? extends Initializer<?>>> mDiscovered;
    final Map<Class<?>, Object> mInitialized;

    static {
        sLock = new Object();
    }

    AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
        this.mDiscovered = new HashSet();
        this.mInitialized = new HashMap();
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance != null) goto L15;
        Object r0 = sLock;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (sInstance != null) goto L9;
        sInstance = new AppInitializer(context);     // Catch: Throwable -> L11
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
    L15:
        return sInstance;
    }

    static void setDelegate(AppInitializer delegate) {
        Object r0 = sLock;
        monitor-enter(r0);
        sInstance = delegate;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public <T> T initializeComponent(Class<? extends Initializer<T>> r2) {
        return (T) doInitialize(r2);
    }

    public boolean isEagerlyInitialized(Class<? extends Initializer<?>> component) {
        return this.mDiscovered.contains(component);
    }

    <T> T doInitialize(Class<? extends Initializer<?>> r4) {
        Object r0 = sLock;
        monitor-enter(r0);
        T r1 = (T) this.mInitialized.get(r4);
        if (r1 != null) goto L7;
        r1 = (T) doInitialize(r4, new HashSet());
    L7:
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r1;
    L9:
        th = move-exception;
        throw th;
    }

    private <T> T doInitialize(Class<? extends Initializer<?>> r8, Set<Class<?>> r9) {
        if (Trace.isEnabled() == false) goto L6;
        Trace.beginSection(r8.getSimpleName());     // Catch: Throwable -> L31
    L31:
        th = move-exception;
        Trace.endSection();
        throw th;
    L6:
        if (r9.contains(r8) == true) goto L30;
        if (this.mInitialized.containsKey(r8) == true) goto L26;
        r9.add(r8);     // Catch: Throwable -> L31
        Initializer<?> r2 = r8.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);     // Catch: Throwable -> L22
        List<Class<? extends Initializer<?>>> r3 = r2.dependencies();     // Catch: Throwable -> L22
        if (r3.isEmpty() == true) goto L20;
        Iterator<Class<? extends Initializer<?>>> r4 = r3.iterator();     // Catch: Throwable -> L22
    L15:
        if (r4.hasNext() == false) goto L20;
        Class<? extends Initializer<?>> r5 = r4.next();     // Catch: Throwable -> L22
        if (this.mInitialized.containsKey(r5) == true) goto L15;
        doInitialize(r5, r9);     // Catch: Throwable -> L22
    L20:
        T r6 = (T) r2.create(this.mContext);
        r9.remove(r8);     // Catch: Throwable -> L22
        this.mInitialized.put(r8, r6);     // Catch: Throwable -> L22
    L27:
        Trace.endSection();
        return r6;
    L22:
        th = move-exception;
        throw new StartupException(th);     // Catch: Throwable -> L31
    L26:
        r6 = (T) this.mInitialized.get(r8);
        goto L27
    L30:
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{r8.getName()}));     // Catch: Throwable -> L31
    }

    void discoverAndInitialize() {
        Trace.beginSection(SECTION_NAME);     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        ComponentName provider = new ComponentName(this.mContext.getPackageName(), InitializationProvider.class.getName());     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        ProviderInfo providerInfo = this.mContext.getPackageManager().getProviderInfo(provider, 128);     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        Bundle metadata = providerInfo.metaData;     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        discoverAndInitialize(metadata);     // Catch: Throwable -> L5 PackageManager.NameNotFoundException -> L7
        Trace.endSection();
        return;
    L7:
        exception = move-exception;
        throw new StartupException(exception);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    void discoverAndInitialize(Bundle r10) {
        String r0 = this.mContext.getString(R.string.androidx_startup);
        if (r10 != null) goto L23;
        return;
    L23:
        HashSet r1 = new HashSet();     // Catch: ClassNotFoundException -> L18
        Iterator<String> r3 = r10.keySet().iterator();     // Catch: ClassNotFoundException -> L18
    L6:
        if (r3.hasNext() == false) goto L13;
        String r4 = r3.next();     // Catch: ClassNotFoundException -> L18
        if (r0.equals(r10.getString(r4, null)) == false) goto L6;
        Class<?> r6 = Class.forName(r4);     // Catch: ClassNotFoundException -> L18
        if (Initializer.class.isAssignableFrom(r6) == false) goto L6;
        this.mDiscovered.add((Class<? extends Initializer<?>>) r6);     // Catch: ClassNotFoundException -> L18
        goto L6
    L13:
        Iterator<Class<? extends Initializer<?>>> r5 = this.mDiscovered.iterator();     // Catch: ClassNotFoundException -> L18
    L14:
        if (r5.hasNext() == false) goto L30;
        doInitialize(r5.next(), r1);     // Catch: ClassNotFoundException -> L18
        goto L14
    L30:
        return;
    L18:
        e = move-exception;
        throw new StartupException(e);
    }
}
