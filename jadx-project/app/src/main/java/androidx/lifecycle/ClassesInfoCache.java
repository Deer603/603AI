package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class ClassesInfoCache {
    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    static ClassesInfoCache sInstance;
    private final Map<Class<?>, CallbackInfo> mCallbackMap;
    private final Map<Class<?>, Boolean> mHasLifecycleMethods;

    @Deprecated
    static class CallbackInfo {
        final Map<Lifecycle.Event, List<MethodReference>> mEventToHandlers;
        final Map<MethodReference, Lifecycle.Event> mHandlerToEvent;

        CallbackInfo(Map<MethodReference, Lifecycle.Event> handlerToEvent) {
            this.mHandlerToEvent = handlerToEvent;
            this.mEventToHandlers = new HashMap();
            Iterator<Map.Entry<MethodReference, Lifecycle.Event>> r0 = handlerToEvent.entrySet().iterator();
        L4:
            if (r0.hasNext() == false) goto L9;
            Map.Entry<MethodReference, Lifecycle.Event> entry = r0.next();
            Lifecycle.Event event = entry.getValue();
            List<MethodReference> methodReferences = this.mEventToHandlers.get(event);
            if (methodReferences != null) goto L8;
            methodReferences = new ArrayList();
            this.mEventToHandlers.put(event, methodReferences);
        L8:
            methodReferences.add(entry.getKey());
            goto L4
        }

        void invokeCallbacks(LifecycleOwner source, Lifecycle.Event event, Object target) {
            invokeMethodsForEvent(this.mEventToHandlers.get(event), source, event, target);
            invokeMethodsForEvent(this.mEventToHandlers.get(Lifecycle.Event.ON_ANY), source, event, target);
        }

        private static void invokeMethodsForEvent(List<MethodReference> handlers, LifecycleOwner source, Lifecycle.Event event, Object mWrapped) {
            if (handlers == null) goto L6;
            int i = handlers.size() - 1;
        L4:
            if (i < 0) goto L8;
            handlers.get(i).invokeCallback(source, event, mWrapped);
            i = i - 1;
            goto L4
        L8:
            return;
        }
    }

    @Deprecated
    static final class MethodReference {
        final int mCallType;
        final Method mMethod;

        MethodReference(int callType, Method method) {
            this.mCallType = callType;
            this.mMethod = method;
            this.mMethod.setAccessible(true);
        }

        void invokeCallback(LifecycleOwner source, Lifecycle.Event event, Object target) {
        L10:
            e = move-exception;
            throw new RuntimeException(e);
        L13:
            e = move-exception;
            throw new RuntimeException("Failed to call observer method", e.getCause());
        L3:
            switch(this.mCallType) {
                case 0: goto L7;
                case 1: goto L6;
                case 2: goto L5;
                default: goto L17;
            };     // Catch: IllegalAccessException -> L10 InvocationTargetException -> L13
        L5:
            this.mMethod.invoke(target, new Object[]{source, event});     // Catch: IllegalAccessException -> L10 InvocationTargetException -> L13
            return;
        L6:
            this.mMethod.invoke(target, new Object[]{source});     // Catch: IllegalAccessException -> L10 InvocationTargetException -> L13
            return;
        L7:
            this.mMethod.invoke(target, new Object[0]);     // Catch: IllegalAccessException -> L10 InvocationTargetException -> L13
            return;
        }

        public boolean equals(Object o) {
            if (this != o) goto L6;
            return true;
        L6:
            if ((o instanceof MethodReference) == true) goto L8;
            return false;
        L8:
            MethodReference that = (MethodReference) o;
            if (this.mCallType != that.mCallType) goto L14;
            if (this.mMethod.getName().equals(that.mMethod.getName()) == false) goto L14;
            return true;
        L14:
            return false;
        }

        public int hashCode() {
            return (this.mCallType * 31) + this.mMethod.getName().hashCode();
        }
    }

    ClassesInfoCache() {
        this.mCallbackMap = new HashMap();
        this.mHasLifecycleMethods = new HashMap();
    }

    static {
        sInstance = new ClassesInfoCache();
    }

    boolean hasLifecycleMethods(Class<?> klass) {
        Boolean hasLifecycleMethods = this.mHasLifecycleMethods.get(klass);
        if (hasLifecycleMethods != null) goto L5;
        Method[] methods = getDeclaredMethods(klass);
        int r2 = methods.length;
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L13;
        Method method = methods[r4];
        OnLifecycleEvent annotation = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
        if (annotation != null) goto L10;
        r4 = r4 + 1;
        goto L7
    L10:
        createInfo(klass, methods);
        return true;
    L13:
        this.mHasLifecycleMethods.put(klass, false);
        return false;
    L5:
        return hasLifecycleMethods.booleanValue();
    }

    private Method[] getDeclaredMethods(Class<?> klass) {
        return klass.getDeclaredMethods();
    L4:
        e = move-exception;
        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
    }

    CallbackInfo getInfo(Class<?> klass) {
        CallbackInfo existing = this.mCallbackMap.get(klass);
        if (existing == null) goto L6;
        return existing;
    L6:
        return createInfo(klass, null);
    }

    private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> handlers, MethodReference newHandler, Lifecycle.Event newEvent, Class<?> klass) {
        Lifecycle.Event event = handlers.get(newHandler);
        if (event == null) goto L8;
        if (newEvent == event) goto L8;
        Method method = newHandler.mMethod;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + klass.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event + ", new value " + newEvent);
    L8:
        if (event != null) goto L11;
        handlers.put(newHandler, newEvent);
        return;
    }

    private CallbackInfo createInfo(Class<?> klass, Method[] declaredMethods) {
        Class<?> superclass = klass.getSuperclass();
        Map<MethodReference, Lifecycle.Event> handlerToEvent = new HashMap();
        if (superclass == null) goto L7;
        CallbackInfo superInfo = getInfo(superclass);
        if (superInfo == null) goto L7;
        handlerToEvent.putAll(superInfo.mHandlerToEvent);
    L7:
        Class<?>[] interfaces = klass.getInterfaces();
        int r5 = interfaces.length;
        char r6 = 0;
        int r7 = 0;
    L8:
        if (r7 >= r5) goto L14;
        Class<?> intrfc = interfaces[r7];
        Iterator<Map.Entry<MethodReference, Lifecycle.Event>> r9 = getInfo(intrfc).mHandlerToEvent.entrySet().iterator();
    L11:
        if (r9.hasNext() == false) goto L13;
        Map.Entry<MethodReference, Lifecycle.Event> entry = r9.next();
        verifyAndPutHandler(handlerToEvent, entry.getKey(), entry.getValue(), klass);
        goto L11
    L13:
        r7 = r7 + 1;
        goto L8
    L14:
        if (declaredMethods == null) goto L16;
        Method[] methods = declaredMethods;
    L17:
        boolean hasLifecycleMethods = false;
        int r8 = methods.length;
        int r10 = 0;
    L18:
        if (r10 >= r8) goto L46;
        Method method = methods[r10];
        OnLifecycleEvent annotation = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
        if (annotation == null) goto L43;
        hasLifecycleMethods = true;
        Class<?>[] params = method.getParameterTypes();
        int callType = 0;
        if (params.length <= 0) goto L29;
        callType = 1;
        if (LifecycleOwner.class.isAssignableFrom(params[r6]) == true) goto L29;
        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
    L29:
        Lifecycle.Event event = annotation.value();
        if (params.length <= 1) goto L41;
        callType = 2;
        if (Lifecycle.Event.class.isAssignableFrom(params[1]) == false) goto L39;
        if (event == Lifecycle.Event.ON_ANY) goto L41;
        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
    L39:
        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
    L41:
        if (params.length > 2) goto L45;
        MethodReference methodReference = new MethodReference(callType, method);
        verifyAndPutHandler(handlerToEvent, methodReference, event, klass);
        goto L43
    L45:
        throw new IllegalArgumentException("cannot have more than 2 params");
    L43:
        r10 = r10 + 1;
        r6 = 0;
        goto L18
    L46:
        CallbackInfo info = new CallbackInfo(handlerToEvent);
        this.mCallbackMap.put(klass, info);
        this.mHasLifecycleMethods.put(klass, Boolean.valueOf(hasLifecycleMethods));
        return info;
    L16:
        methods = getDeclaredMethods(klass);
        goto L17
    }
}
