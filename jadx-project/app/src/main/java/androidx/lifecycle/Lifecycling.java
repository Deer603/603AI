package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Lifecycling.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0007J \u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002J\u001e\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\u0015\u001a\u00020\u00052\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\u0016\u001a\u00020\u00052\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "<init>", "()V", "REFLECTIVE_CALLBACK", "", "GENERATED_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "object", "createGeneratedAdapter", "constructor", "generatedConstructor", "klass", "getObserverConstructorType", "resolveObserverCallbackType", "isLifecycleParent", "", "getAdapterName", "", "className", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    public static final Lifecycling INSTANCE = null;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static final Map<Class<?>, Integer> callbackCache = null;
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = null;

    private Lifecycling() {
    }

    static {
        INSTANCE = new Lifecycling();
        callbackCache = new HashMap();
        classToAdapters = new HashMap();
    }

    @JvmStatic
    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean isLifecycleEventObserver = object instanceof LifecycleEventObserver;
        boolean isDefaultLifecycleObserver = object instanceof DefaultLifecycleObserver;
        if (isLifecycleEventObserver == false) goto L7;
        if (isDefaultLifecycleObserver == false) goto L7;
        return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
    L7:
        if (isDefaultLifecycleObserver == true) goto L9;
        if (isLifecycleEventObserver == true) goto L12;
        Class<?> r2 = object.getClass();
        int type = INSTANCE.getObserverConstructorType(r2);
        if (type != 2) goto L25;
        List<Constructor<? extends GeneratedAdapter>> r4 = classToAdapters.get(r2);
        Intrinsics.checkNotNull(r4);
        List<Constructor<? extends GeneratedAdapter>> r5 = r4;
        int r6 = 0;
        if (r5.size() != 1) goto L19;
        GeneratedAdapter generatedAdapter = INSTANCE.createGeneratedAdapter(r5.get(0), object);
        return new SingleGeneratedAdapterObserver(generatedAdapter);
    L19:
        int r7 = r5.size();
        GeneratedAdapter[] adapters = new GeneratedAdapter[r7];
    L20:
        if (r6 >= r7) goto L23;
        adapters[r6] = INSTANCE.createGeneratedAdapter(r5.get(r6), object);
        r6 = r6 + 1;
        goto L20
    L23:
        return new CompositeGeneratedAdaptersObserver(adapters);
    L25:
        return new ReflectiveGenericLifecycleObserver(object);
    L12:
        return (LifecycleEventObserver) object;
    L9:
        return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> r4, Object object) {
        GeneratedAdapter r0 = r4.newInstance(new Object[]{object});     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
        Intrinsics.checkNotNull(r0);     // Catch: InvocationTargetException -> L4 InstantiationException -> L7 IllegalAccessException -> L10
        return r0;
    L10:
        e = move-exception;
        throw new RuntimeException(e);
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> r9) {
        Package aPackage = r9.getPackage();     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        String name = r9.getCanonicalName();     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        if (aPackage == null) goto L5;
        String fullPackage = aPackage.getName();     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
    L6:
        Intrinsics.checkNotNull(fullPackage);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        if (fullPackage.length() != 0) goto L9;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L12;
        String r4 = name;
    L13:
        Intrinsics.checkNotNull(r4);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        String adapterName = getAdapterName(r4);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        if (fullPackage.length() != 0) goto L16;
        boolean r6 = true;
    L17:
        if (r6 == false) goto L19;
        String r7 = adapterName;
    L20:
        Class<?> r8 = Class.forName(r7);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        Constructor constructor = r8.getDeclaredConstructor(new Class[]{r9});     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        if (constructor.isAccessible() == true) goto L33;
        constructor.setAccessible(true);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        goto L28
    L32:
        return constructor;
    L33:
        return constructor;
    L19:
        r7 = fullPackage + '.' + adapterName;     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        goto L20
    L16:
        r6 = false;
        goto L17
    L12:
        Intrinsics.checkNotNull(name);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        r4 = name.substring(fullPackage.length() + 1);     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        Intrinsics.checkNotNullExpressionValue(r4, "substring(...)");     // Catch: NoSuchMethodException -> L24 ClassNotFoundException -> L27
        goto L13
    L9:
        r3 = false;
        goto L10
    L5:
        fullPackage = "";
    L24:
        e = move-exception;
        throw new RuntimeException(e);
    L28:
        return null;
    }

    private final int getObserverConstructorType(Class<?> r5) {
        Integer callbackCache2 = callbackCache.get(r5);
        if (callbackCache2 != null) goto L5;
        int type = resolveObserverCallbackType(r5);
        Integer r2 = Integer.valueOf(type);
        callbackCache.put(r5, r2);
        return type;
    L5:
        return callbackCache2.intValue();
    }

    private final int resolveObserverCallbackType(Class<?> r10) {
        if (r10.getCanonicalName() != null) goto L5;
        return 1;
    L5:
        Constructor<? extends GeneratedAdapter> r0 = generatedConstructor(r10);
        if (r0 == null) goto L9;
        classToAdapters.put(r10, CollectionsKt.listOf(r0));
        return 2;
    L9:
        boolean hasLifecycleMethods = ClassesInfoCache.sInstance.hasLifecycleMethods(r10);
        if (hasLifecycleMethods == false) goto L12;
        return 1;
    L12:
        Class<? super Object> r4 = r10.getSuperclass();
        List adapterConstructors = null;
        if (isLifecycleParent(r4) == false) goto L18;
        Intrinsics.checkNotNull(r4);
        if (getObserverConstructorType(r4) != 1) goto L17;
        return 1;
    L17:
        List<Constructor<? extends GeneratedAdapter>> r7 = classToAdapters.get(r4);
        Intrinsics.checkNotNull(r7);
        List adapterConstructors2 = new ArrayList(r7);
        adapterConstructors = adapterConstructors2;
    L18:
        Iterator r6 = ArrayIteratorKt.iterator(r10.getInterfaces());
    L20:
        if (r6.hasNext() == false) goto L30;
        Class<?> r8 = (Class) r6.next();
        if (isLifecycleParent(r8) == false) goto L20;
        Intrinsics.checkNotNull(r8);
        if (getObserverConstructorType(r8) == 1) goto L26;
        if (adapterConstructors != null) goto L29;
        List adapterConstructors3 = new ArrayList();
        adapterConstructors = adapterConstructors3;
    L29:
        List<Constructor<? extends GeneratedAdapter>> r9 = classToAdapters.get(r8);
        Intrinsics.checkNotNull(r9);
        adapterConstructors.addAll(r9);
        goto L20
    L26:
        return 1;
    L30:
        if (adapterConstructors == null) goto L33;
        classToAdapters.put(r10, adapterConstructors);
        return 2;
    L33:
        return 1;
    }

    private final boolean isLifecycleParent(Class<?> r2) {
        if (r2 != null) goto L4;
    L6:
        return false;
    L4:
        if (LifecycleObserver.class.isAssignableFrom(r2) == false) goto L6;
        return true;
    }

    @JvmStatic
    public static final String getAdapterName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }
}
