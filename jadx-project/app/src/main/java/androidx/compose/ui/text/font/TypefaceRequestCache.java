package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0011J(\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0017J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u0010\u001a\u00020\t2\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0017\u0012\u0004\u0012\u00020\n0\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "()V", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock$ui_text_release", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "resultCache", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "Landroidx/compose/ui/text/font/TypefaceResult;", "size", "", "getSize$ui_text_release", "()I", "get", "typefaceRequest", "get$ui_text_release", "preWarmCache", "", "typefaceRequests", "", "resolveTypeface", "Lkotlin/Function1;", "runCached", "Landroidx/compose/runtime/State;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TypefaceRequestCache {
    public static final int $stable = 0;
    private final SynchronizedObject lock;
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache;

    static {
        $stable = 8;
    }

    public TypefaceRequestCache() {
        this.lock = new SynchronizedObject();
        this.resultCache = new LruCache(16);
    }

    public static final /* synthetic */ LruCache access$getResultCache$p(TypefaceRequestCache $this) {
        return $this.resultCache;
    }

    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final State<Object> runCached(final TypefaceRequest typefaceRequest, Function1<? super Function1<? super TypefaceResult, Unit>, ? extends TypefaceResult> r8) {
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        TypefaceResult it = this.resultCache.get(typefaceRequest);     // Catch: Throwable -> L34
        if (it != null) goto L8;
    L14:
        monitor-exit(lock$iv);
        TypefaceResult currentTypefaceResult = r8.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(this, typefaceRequest));     // Catch: Exception -> L31
        SynchronizedObject lock$iv2 = this.lock;
        monitor-enter(lock$iv2);
    L28:
        th = move-exception;
        throw th;
    L20:
        if (this.resultCache.get(typefaceRequest) == null) goto L22;
    L24:
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L28
        monitor-exit(lock$iv2);
        return currentTypefaceResult;
    L22:
        if (currentTypefaceResult.getCacheable() == false) goto L24;
        this.resultCache.put(typefaceRequest, currentTypefaceResult);     // Catch: Throwable -> L28
    L31:
        cause = move-exception;
        throw new IllegalStateException("Could not load font", cause);
    L8:
        if (it.getCacheable() == false) goto L12;
        TypefaceResult r5 = it;     // Catch: Throwable -> L34
        monitor-exit(lock$iv);
        return r5;
    L12:
        TypefaceResult r6 = this.resultCache.remove(typefaceRequest);     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;
    }

    public final void preWarmCache(List<TypefaceRequest> r10, Function1<? super TypefaceRequest, ? extends TypefaceResult> r11) {
        int i = 0;
        int r1 = r10.size();
    L3:
        if (i >= r1) goto L29;
        TypefaceRequest typeRequest = r10.get(i);
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        TypefaceResult prior = this.resultCache.get(typeRequest);     // Catch: Throwable -> L26
        monitor-exit(lock$iv);
        if (prior != null) goto L25;
        TypefaceResult next = r11.invoke(typeRequest);     // Catch: Exception -> L22
        if ((next instanceof TypefaceResult.Async) == true) goto L25;
        SynchronizedObject lock$iv2 = this.lock;
        monitor-enter(lock$iv2);
        TypefaceResult r8 = this.resultCache.put(typeRequest, next);     // Catch: Throwable -> L19
        monitor-exit(lock$iv2);
    L19:
        th = move-exception;
        throw th;
    L22:
        cause = move-exception;
        throw new IllegalStateException("Could not load font", cause);
    L25:
        i = i + 1;
    L26:
        th = move-exception;
        throw th;
    }

    public final TypefaceResult get$ui_text_release(TypefaceRequest typefaceRequest) {
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        TypefaceResult r3 = this.resultCache.get(typefaceRequest);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    public final int getSize$ui_text_release() {
        SynchronizedObject lock$iv = this.lock;
        monitor-enter(lock$iv);
        int r3 = this.resultCache.size();     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }
}
