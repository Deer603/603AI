package kotlinx.coroutines.internal;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", HintConstants.AUTOFILL_HINT_NAME, "loader", "Ljava/lang/ClassLoader;", NotificationCompat.CATEGORY_SERVICE, "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = null;
    private static final String PREFIX = "META-INF/services/";

    static {
        INSTANCE = new FastServiceLoader();
    }

    private FastServiceLoader() {
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        if (FastServiceLoaderKt.getANDROID_DETECTED() == false) goto L5;
        ArrayList result = new ArrayList(2);     // Catch: Throwable -> L28
        MainDispatcherFactory $this$loadMainDispatcherFactory_u24lambda_u241 = null;
        MainDispatcherFactory $this$loadMainDispatcherFactory_u24lambda_u240 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));     // Catch: ClassNotFoundException -> L11 Throwable -> L28
    L14:
        if ($this$loadMainDispatcherFactory_u24lambda_u240 == null) goto L31;
        result.add($this$loadMainDispatcherFactory_u24lambda_u240);     // Catch: Throwable -> L28
    L31:
        $this$loadMainDispatcherFactory_u24lambda_u241 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));     // Catch: ClassNotFoundException -> L21 Throwable -> L28
    L23:
        if ($this$loadMainDispatcherFactory_u24lambda_u241 != null) goto L25;
    L26:
        return result;
    L25:
        result.add($this$loadMainDispatcherFactory_u24lambda_u241);     // Catch: Throwable -> L28
    L12:
        $this$loadMainDispatcherFactory_u24lambda_u240 = null;
    L30:
        return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
    L5:
        return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> r5, String serviceClass) {
        return r5.cast(Class.forName(serviceClass, true, r5.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    L6:
        return null;
    }

    private final <S> List<S> load(Class<S> r3, ClassLoader loader) {
        return loadProviders$kotlinx_coroutines_core(r3, loader);
    L6:
        return CollectionsKt.toList(ServiceLoader.load(r3, loader));
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> r14, ClassLoader loader) {
        String fullServiceName = PREFIX + r14.getName();
        Iterable r2 = Collections.list(loader.getResources(fullServiceName));
        Intrinsics.checkNotNullExpressionValue(r2, "list(...)");
        Iterable $this$flatMap$iv = (List) r2;
        Collection destination$iv$iv = new ArrayList();
        Iterator r7 = $this$flatMap$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        Object element$iv$iv = r7.next();
        URL it = (URL) element$iv$iv;
        Iterable list$iv$iv = INSTANCE.parse(it);
        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        goto L4
    L6:
        Iterable providers = CollectionsKt.toSet((List) destination$iv$iv);
        if (((Collection) providers).isEmpty() == true) goto L15;
        Iterable $this$map$iv = providers;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r8 = $this$map$iv.iterator();
    L10:
        if (r8.hasNext() == false) goto L13;
        Object item$iv$iv = r8.next();
        String it2 = (String) item$iv$iv;
        destination$iv$iv2.add(INSTANCE.getProviderInstance(it2, loader, r14));
        goto L10
    L13:
        return (List) destination$iv$iv2;
    L15:
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    private final <S> S getProviderInstance(String name, ClassLoader loader, Class<S> r7) {
        Class<?> r1 = Class.forName(name, false, loader);
        if (r7.isAssignableFrom(r1) == false) goto L7;
        return r7.cast(r1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    L7:
        throw new IllegalArgumentException(("Expected service of class " + r7 + ", but found " + r1).toString());
    }

    private final List<String> parse(URL url) {
        String path = url.toString();
        if (StringsKt.startsWith$default(path, "jar", false, 2, null) == false) goto L26;
        String pathToJar = StringsKt.substringBefore$default(StringsKt.substringAfter$default(path, "jar:file:", null, 2, null), '!', null, 2, null);
        String entry = StringsKt.substringAfter$default(path, "!/", null, 2, null);
        JarFile $this$use$iv = new JarFile(pathToJar, false);
        BufferedReader r10 = new BufferedReader(new InputStreamReader($this$use$iv.getInputStream(new ZipEntry(entry)), "UTF-8"));     // Catch: Throwable -> L17
        BufferedReader r = r10;     // Catch: Throwable -> L12
        List<String> r13 = INSTANCE.parseFile(r);     // Catch: Throwable -> L12
        CloseableKt.closeFinally(r10, null);     // Catch: Throwable -> L17
        $this$use$iv.close();     // Catch: Throwable -> L10
        return r13;
    L10:
        th = move-exception;
        throw th;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        CloseableKt.closeFinally(r10, th);     // Catch: Throwable -> L17
        throw th;     // Catch: Throwable -> L17
    L17:
        e$iv = move-exception;
        throw e$iv;     // Catch: Throwable -> L20
    L20:
        e$iv = move-exception;
        $this$use$iv.close();     // Catch: Throwable -> L23
        throw e$iv;
    L23:
        closeException$iv = move-exception;
        ExceptionsKt.addSuppressed(e$iv, closeException$iv);
        throw e$iv;
    L26:
        BufferedReader r1 = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedReader reader = r1;     // Catch: Throwable -> L30
        List<String> r5 = INSTANCE.parseFile(reader);     // Catch: Throwable -> L30
        CloseableKt.closeFinally(r1, null);
        return r5;
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        CloseableKt.closeFinally(r1, th);
        throw th;
    }

    private final <R> R use(JarFile $this$use, Function1<? super JarFile, ? extends R> r5) {
        R r2 = r5.invoke($this$use);     // Catch: Throwable -> L8
        $this$use.close();     // Catch: Throwable -> L6
        return r2;
    L6:
        closeException = move-exception;
        throw closeException;
    L8:
        e = move-exception;
        throw e;     // Catch: Throwable -> L11
    L11:
        e = move-exception;
        $this$use.close();     // Catch: Throwable -> L14
        throw e;
    L14:
        closeException = move-exception;
        ExceptionsKt.addSuppressed(e, closeException);
        throw e;
    }

    private final List<String> parseFile(BufferedReader r) {
        Set names = new LinkedHashSet();
    L3:
        String line = r.readLine();
        if (line == null) goto L6;
        String serviceName = StringsKt.trim(StringsKt.substringBefore$default(line, "#", null, 2, null)).toString();
        String $this$all$iv = serviceName;
        boolean r5 = false;
        int r6 = 0;
    L9:
        if (r6 >= $this$all$iv.length()) goto L20;
        char element$iv = $this$all$iv.charAt(r6);
        if (element$iv != '.') goto L13;
    L16:
        char it = 1;
    L17:
        if (it == 0) goto L18;
        r6 = r6 + 1;
        goto L9
    L18:
        boolean r3 = false;
    L21:
        if (r3 == false) goto L28;
        if (serviceName.length() <= 0) goto L25;
        r5 = true;
    L25:
        if (r5 == false) goto L3;
        names.add(serviceName);
        goto L3
    L28:
        throw new IllegalArgumentException(("Illegal service provider class name: " + serviceName).toString());
    L13:
        if (Character.isJavaIdentifierPart(element$iv) == true) goto L16;
        it = 0;
        goto L17
    L20:
        r3 = true;
        goto L21
    L6:
        return CollectionsKt.toList(names);
    }
}
