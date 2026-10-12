package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewGlueCommunicator {
    private static final String GLUE_FACTORY_PROVIDER_FETCHER_CLASS = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    private static final String GLUE_FACTORY_PROVIDER_FETCHER_METHOD = "createWebViewProviderFactory";

    private static class LAZY_COMPAT_CONVERTER_HOLDER {
        static final WebkitToCompatConverter INSTANCE = null;

        private LAZY_COMPAT_CONVERTER_HOLDER() {
        }

        static {
            INSTANCE = new WebkitToCompatConverter(WebViewGlueCommunicator.getFactory().getWebkitToCompatConverter());
        }
    }

    private static class LAZY_FACTORY_HOLDER {
        static final WebViewProviderFactory INSTANCE = null;

        private LAZY_FACTORY_HOLDER() {
        }

        static {
            INSTANCE = WebViewGlueCommunicator.createGlueProviderFactory();
        }
    }

    public static WebViewProviderFactory getFactory() {
        return LAZY_FACTORY_HOLDER.INSTANCE;
    }

    public static WebkitToCompatConverter getCompatConverter() {
        return LAZY_COMPAT_CONVERTER_HOLDER.INSTANCE;
    }

    private static InvocationHandler fetchGlueProviderFactoryImpl() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        Class<?> glueFactoryProviderFetcherClass = Class.forName(GLUE_FACTORY_PROVIDER_FETCHER_CLASS, false, getWebViewClassLoader());
        Method createProviderFactoryMethod = glueFactoryProviderFetcherClass.getDeclaredMethod(GLUE_FACTORY_PROVIDER_FETCHER_METHOD, new Class[0]);
        return (InvocationHandler) createProviderFactoryMethod.invoke(null, new Object[0]);
    }

    static WebViewProviderFactory createGlueProviderFactory() {
        InvocationHandler invocationHandler = fetchGlueProviderFactoryImpl();     // Catch: ClassNotFoundException -> L5 Throwable -> L8
        goto L7
    L4:
        return new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, invocationHandler));
    L8:
        e = move-exception;
        throw new RuntimeException(e);
    L7:
        return new IncompatibleApkWebViewProviderFactory();
    }

    public static ClassLoader getWebViewClassLoader() {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return ApiHelperForP.getWebViewClassLoader();
    L7:
        return getWebViewProviderFactory().getClass().getClassLoader();
    }

    private static Object getWebViewProviderFactory() {
        Method getFactoryMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);     // Catch: Throwable -> L4
        getFactoryMethod.setAccessible(true);     // Catch: Throwable -> L4
        return getFactoryMethod.invoke(null, new Object[0]);
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    private WebViewGlueCommunicator() {
    }
}
