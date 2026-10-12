package androidx.lifecycle.viewmodel.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ViewModelImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u00060\tj\u0002`\n0\b\"\u00060\tj\u0002`\n¢\u0006\u0004\b\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\tj\u0002`\nJ\u0012\u0010\u0017\u001a\u00020\u00162\n\u0010\u0019\u001a\u00060\tj\u0002`\nJ#\u0010\u001a\u001a\u0004\u0018\u0001H\u001b\"\f\b\u0000\u0010\u001b*\u00060\tj\u0002`\n2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\b\u0012\u00060\tj\u0002`\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "keyToCloseables", "", "", "", "isCleared", "", "clear", "", "addCloseable", "key", "closeable", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "closeWithRuntimeException", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewModelImpl {
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;
    private final Map<String, AutoCloseable> keyToCloseables;
    private final SynchronizedObject lock;

    public static final /* synthetic */ void access$closeWithRuntimeException(ViewModelImpl $this, AutoCloseable closeable) {
        $this.closeWithRuntimeException(closeable);
    }

    public static final /* synthetic */ Set access$getCloseables$p(ViewModelImpl $this) {
        return $this.closeables;
    }

    public static final /* synthetic */ Map access$getKeyToCloseables$p(ViewModelImpl $this) {
        return $this.keyToCloseables;
    }

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    public ViewModelImpl(CoroutineScope viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public ViewModelImpl(AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        CollectionsKt.addAll(this.closeables, closeables);
    }

    public ViewModelImpl(CoroutineScope viewModelScope, AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        CollectionsKt.addAll(this.closeables, closeables);
    }

    public final void clear() {
        if (this.isCleared == false) goto L5;
        return;
    L5:
        this.isCleared = true;
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        Iterator r4 = access$getKeyToCloseables$p(this).values().iterator();     // Catch: Throwable -> L19
    L10:
        if (r4.hasNext() == false) goto L12;
        AutoCloseable closeable = (AutoCloseable) r4.next();     // Catch: Throwable -> L19
        access$closeWithRuntimeException(this, closeable);     // Catch: Throwable -> L19
        goto L10
    L12:
        Iterator r5 = access$getCloseables$p(this).iterator();     // Catch: Throwable -> L19
    L14:
        if (r5.hasNext() == false) goto L16;
        AutoCloseable closeable2 = (AutoCloseable) r5.next();     // Catch: Throwable -> L19
        access$closeWithRuntimeException(this, closeable2);     // Catch: Throwable -> L19
        goto L14
    L16:
        access$getCloseables$p(this).clear();     // Catch: Throwable -> L19
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L19
        monitor-exit(lock$iv);
        return;
    L19:
        th = move-exception;
        throw th;
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared == false) goto L6;
        closeWithRuntimeException(closeable);
        return;
    L6:
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        AutoCloseable oldCloseable = (AutoCloseable) access$getKeyToCloseables$p(this).put(key, closeable);     // Catch: Throwable -> L13
        monitor-exit(lock$iv);
        closeWithRuntimeException(oldCloseable);
        return;
    L13:
        th = move-exception;
        throw th;
    }

    public final void addCloseable(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared == false) goto L6;
        closeWithRuntimeException(closeable);
        return;
    L6:
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        access$getCloseables$p(this).add(closeable);     // Catch: Throwable -> L12
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        T r4 = (T) access$getKeyToCloseables$p(this).get(key);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r4;
    L8:
        th = move-exception;
        throw th;
    }

    private final void closeWithRuntimeException(AutoCloseable closeable) {
        if (closeable != null) goto L9;
        return;
    L9:
        ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(closeable);     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
