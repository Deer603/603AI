package kotlin.coroutines.jvm.internal;

import androidx.autofill.HintConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "<init>", "()V", "notOnJava9", "Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "cache", "getModuleName", "", "continuation", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "buildCache", "Cache", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class ModuleNameRetriever {
    public static final ModuleNameRetriever INSTANCE = null;
    private static Cache cache;
    private static final Cache notOnJava9 = null;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "getModuleMethod", "Ljava/lang/reflect/Method;", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class Cache {
        public final Method getDescriptorMethod;
        public final Method getModuleMethod;
        public final Method nameMethod;

        public Cache(Method getModuleMethod, Method getDescriptorMethod, Method nameMethod) {
            this.getModuleMethod = getModuleMethod;
            this.getDescriptorMethod = getDescriptorMethod;
            this.nameMethod = nameMethod;
        }
    }

    private ModuleNameRetriever() {
    }

    static {
        INSTANCE = new ModuleNameRetriever();
        notOnJava9 = new Cache(null, null, null);
    }

    public final String getModuleName(BaseContinuationImpl continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Cache cache2 = cache;
        if (cache2 != null) goto L6;
        cache2 = buildCache(continuation);
    L6:
        if (cache2 != notOnJava9) goto L8;
        return null;
    L8:
        Method r1 = cache2.getModuleMethod;
        if (r1 == null) goto L27;
        Object module = r1.invoke(continuation.getClass(), new Object[0]);
        if (module == null) goto L27;
        Method r3 = cache2.getDescriptorMethod;
        if (r3 == null) goto L26;
        Object descriptor = r3.invoke(module, new Object[0]);
        if (descriptor == null) goto L26;
        Method r5 = cache2.nameMethod;
        if (r5 == null) goto L21;
        Object r4 = r5.invoke(descriptor, new Object[0]);
    L23:
        if ((r4 instanceof String) == true) goto L25;
        return null;
    L25:
        return (String) r4;
    L21:
        r4 = null;
    L26:
        return null;
    L27:
        return null;
    }

    private final Cache buildCache(BaseContinuationImpl continuation) {
        Method getModuleMethod = Class.class.getDeclaredMethod("getModule", new Class[0]);     // Catch: Exception -> L4
        Method getDescriptorMethod = continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);     // Catch: Exception -> L4
        Method nameMethod = continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, new Class[0]);     // Catch: Exception -> L4
        Cache it = new Cache(getModuleMethod, getDescriptorMethod, nameMethod);     // Catch: Exception -> L4
        cache = it;     // Catch: Exception -> L4
        return it;
    L5:
        Cache it2 = notOnJava9;
        cache = it2;
        return it2;
    }
}
