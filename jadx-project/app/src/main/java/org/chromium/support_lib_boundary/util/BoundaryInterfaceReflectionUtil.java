package org.chromium.support_lib_boundary.util;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes4.dex */
@NullMarked
public class BoundaryInterfaceReflectionUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static class InvocationHandlerWithDelegateGetter implements InvocationHandler {
        private final Object mDelegate;

        public InvocationHandlerWithDelegateGetter(Object delegate) {
            this.mDelegate = delegate;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            ClassLoader delegateLoader = this.mDelegate.getClass().getClassLoader();
            return BoundaryInterfaceReflectionUtil.dupeMethod(method, delegateLoader).invoke(this.mDelegate, objects);
        L8:
            e = move-exception;
            throw e.getTargetException();
        L5:
            e = move-exception;
            throw new RuntimeException("Reflection failed for method " + method, e);
        }

        public Object getDelegate() {
            return this.mDelegate;
        }
    }

    static {
    }

    public BoundaryInterfaceReflectionUtil() {
    }

    public static boolean instanceOfInOwnClassLoader(Object obj, String className) {
        ClassLoader loader = obj.getClass().getClassLoader();     // Catch: ClassNotFoundException -> L5
        Class<?> clazz = Class.forName(className, false, loader);     // Catch: ClassNotFoundException -> L5
        return clazz.isInstance(obj);
    L6:
        return false;
    }

    public static Method dupeMethod(Method method, ClassLoader delegateLoader) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> declaringClass = Class.forName(method.getDeclaringClass().getName(), true, delegateLoader);
        Class<?>[] r1 = method.getParameterTypes();
        return declaringClass.getDeclaredMethod(method.getName(), r1);
    }

    public static <T> T castToSuppLibClass(Class<T> clazz, InvocationHandler invocationHandler) {
        if (invocationHandler != null) goto L6;
        return null;
    L6:
        return clazz.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{clazz}, invocationHandler));
    }

    public static InvocationHandler createInvocationHandlerFor(Object delegate) {
        if (delegate != null) goto L6;
        return null;
    L6:
        return new InvocationHandlerWithDelegateGetter(delegate);
    }

    public static InvocationHandler[] createInvocationHandlersForArray(Object[] delegates) {
        if (delegates != null) goto L5;
        return null;
    L5:
        InvocationHandler[] handlers = new InvocationHandler[delegates.length];
        int i = 0;
    L7:
        if (i >= handlers.length) goto L9;
        handlers[i] = createInvocationHandlerFor(delegates[i]);
        i = i + 1;
        goto L7
    L9:
        return handlers;
    }

    public static Object getDelegateFromInvocationHandler(InvocationHandler invocationHandler) {
        if (invocationHandler != null) goto L5;
        return null;
    L5:
        InvocationHandlerWithDelegateGetter objectHolder = (InvocationHandlerWithDelegateGetter) invocationHandler;
        return objectHolder.getDelegate();
    }

    private static boolean isDebuggable() {
        if ("eng".equals(Build.TYPE) == false) goto L5;
    L8:
        return true;
    L5:
        if ("userdebug".equals(Build.TYPE) == true) goto L8;
        return false;
    }

    public static boolean containsFeature(Collection<String> features, String soughtFeature) {
        if (soughtFeature.endsWith(Features.DEV_SUFFIX) == true) goto L15;
        if (features.contains(soughtFeature) == false) goto L7;
    L12:
        return true;
    L7:
        if (isDebuggable() == true) goto L9;
    L11:
        return false;
    L9:
        if (features.contains(soughtFeature + Features.DEV_SUFFIX) == false) goto L11;
    L15:
        throw new AssertionError();
    }

    public static boolean containsFeature(String[] features, String soughtFeature) {
        return containsFeature(Arrays.asList(features), soughtFeature);
    }
}
