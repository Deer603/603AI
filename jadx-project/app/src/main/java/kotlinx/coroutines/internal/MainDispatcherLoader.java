package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "()V", "FAST_SERVICE_LOADER_ENABLED", "", "dispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "loadMainDispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainDispatcherLoader {
    private static final boolean FAST_SERVICE_LOADER_ENABLED = false;
    public static final MainDispatcherLoader INSTANCE = null;
    public static final MainCoroutineDispatcher dispatcher = null;

    private MainDispatcherLoader() {
    }

    static {
        INSTANCE = new MainDispatcherLoader();
        FAST_SERVICE_LOADER_ENABLED = SystemPropsKt.systemProp("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = INSTANCE.loadMainDispatcher();
    }

    private final MainCoroutineDispatcher loadMainDispatcher() {
    L25:
        e = move-exception;
        return MainDispatchersKt.createMissingDispatcher$default(e, null, 2, null);
    L4:
        if (FAST_SERVICE_LOADER_ENABLED == false) goto L6;
        List<MainDispatcherFactory> r1 = FastServiceLoader.INSTANCE.loadMainDispatcherFactory$kotlinx_coroutines_core();     // Catch: Throwable -> L25
    L7:
        Iterable $this$maxByOrNull$iv = r1;     // Catch: Throwable -> L25
        Iterator iterator$iv = $this$maxByOrNull$iv.iterator();     // Catch: Throwable -> L25
        if (iterator$iv.hasNext() == true) goto L10;
        Object maxElem$iv = null;
    L19:
        MainDispatcherFactory r5 = (MainDispatcherFactory) maxElem$iv;     // Catch: Throwable -> L25
        if (r5 == null) goto L23;
        MainCoroutineDispatcher r2 = MainDispatchersKt.tryCreateDispatcher(r5, r1);     // Catch: Throwable -> L25
        if (r2 == null) goto L23;
        return r2;
    L23:
        return MainDispatchersKt.createMissingDispatcher$default(null, null, 3, null);
    L10:
        maxElem$iv = iterator$iv.next();     // Catch: Throwable -> L25
        if (iterator$iv.hasNext() == false) goto L19;
        MainDispatcherFactory it = (MainDispatcherFactory) maxElem$iv;     // Catch: Throwable -> L25
        int maxValue$iv = it.getLoadPriority();     // Catch: Throwable -> L25
    L14:
        Object e$iv = iterator$iv.next();     // Catch: Throwable -> L25
        MainDispatcherFactory it2 = (MainDispatcherFactory) e$iv;     // Catch: Throwable -> L25
        int v$iv = it2.getLoadPriority();     // Catch: Throwable -> L25
        if (maxValue$iv >= v$iv) goto L18;
        maxElem$iv = e$iv;
        maxValue$iv = v$iv;
    L18:
        if (iterator$iv.hasNext() == true) goto L14;
    L6:
        r1 = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));     // Catch: Throwable -> L25
        goto L7
    }
}
