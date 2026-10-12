package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0017JH\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u001e\u0010\u0019\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eH\u0086\bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "()V", "PermanentFailure", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "Ljava/lang/Object;", "cacheLock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "permanentCache", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "resultCache", "Landroidx/collection/LruCache;", "get", "font", "Landroidx/compose/ui/text/font/Font;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "get-1ASDuI8", "put", "", "result", "forever", "", "runCached", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCachedBlocking", "Lkotlin/Function0;", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AsyncTypefaceCache {
    public static final int $stable = 0;
    private final Object PermanentFailure;
    private final SynchronizedObject cacheLock;
    private final MutableScatterMap<Key, AsyncTypefaceResult> permanentCache;
    private final LruCache<Key, AsyncTypefaceResult> resultCache;

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0088\u0001\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isPermanentFailure", "", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "getResult", "()Ljava/lang/Object;", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class AsyncTypefaceResult {
        private final Object result;

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m6483boximpl(Object r1) {
            return new AsyncTypefaceResult(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Object m6484constructorimpl(Object r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m6485equalsimpl(Object r2, Object r3) {
            if ((r3 instanceof AsyncTypefaceResult) == true) goto L6;
            return false;
        L6:
            if (Intrinsics.areEqual(r2, ((AsyncTypefaceResult) r3).m6490unboximpl()) == true) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m6486equalsimpl0(Object r1, Object r2) {
            return Intrinsics.areEqual(r1, r2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m6487hashCodeimpl(Object r1) {
            if (r1 != null) goto L5;
            return 0;
        L5:
            return r1.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m6489toStringimpl(Object r2) {
            return "AsyncTypefaceResult(result=" + r2 + ')';
        }

        public boolean equals(Object r2) {
            return m6485equalsimpl(this.result, r2);
        }

        public int hashCode() {
            return m6487hashCodeimpl(this.result);
        }

        public String toString() {
            return m6489toStringimpl(this.result);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m6490unboximpl() {
            return this.result;
        }

        private /* synthetic */ AsyncTypefaceResult(Object result) {
            this.result = result;
        }

        public final Object getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m6488isPermanentFailureimpl(Object arg0) {
            if (arg0 != null) goto L4;
            return true;
        L4:
            return false;
        }
    }

    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "font", "Landroidx/compose/ui/text/font/Font;", "loaderKey", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "getFont", "()Landroidx/compose/ui/text/font/Font;", "getLoaderKey", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key {
        public static final int $stable = 0;
        private final Font font;
        private final Object loaderKey;

        static {
            $stable = 8;
        }

        public static /* synthetic */ Key copy$default(Key r0, Font r1, Object r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.font;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.loaderKey;
        L9:
            return r0.copy(r1, r2);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font r2, Object r3) {
            return new Key(r2, r3);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof Key) == true) goto L8;
            return false;
        L8:
            Key r1 = (Key) r6;
            if (Intrinsics.areEqual(this.font, r1.font) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.loaderKey, r1.loaderKey) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            int r1 = this.font.hashCode() * 31;
            if (this.loaderKey != null) goto L5;
            int r2 = 0;
        L7:
            return r1 + r2;
        L5:
            r2 = this.loaderKey.hashCode();
            goto L7
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }

        public Key(Font font, Object loaderKey) {
            this.font = font;
            this.loaderKey = loaderKey;
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1, reason: invalid class name */
    /* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {412}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AsyncTypefaceCache this$0;

        AnonymousClass1(AsyncTypefaceCache r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runCached(null, null, false, null, this);
        }
    }

    static {
        $stable = 8;
    }

    public AsyncTypefaceCache() {
        this.PermanentFailure = AsyncTypefaceResult.m6484constructorimpl(null);
        this.resultCache = new LruCache(16);
        this.permanentCache = ScatterMapKt.mutableScatterMapOf();
        this.cacheLock = new SynchronizedObject();
    }

    public static final /* synthetic */ SynchronizedObject access$getCacheLock$p(AsyncTypefaceCache $this) {
        return $this.cacheLock;
    }

    public static final /* synthetic */ MutableScatterMap access$getPermanentCache$p(AsyncTypefaceCache $this) {
        return $this.permanentCache;
    }

    public static final /* synthetic */ LruCache access$getResultCache$p(AsyncTypefaceCache $this) {
        return $this.resultCache;
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache r0, Font r1, PlatformFontLoader r2, Object r3, boolean r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = false;
    L5:
        r0.put(r1, r2, r3, r4);
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        SynchronizedObject lock$iv = this.cacheLock;
        monitor-enter(lock$iv);
        if (result != null) goto L9;
        this.permanentCache.set(key, AsyncTypefaceResult.m6483boximpl(this.PermanentFailure));     // Catch: Throwable -> L7
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L7
    L13:
        monitor-exit(lock$iv);
        return;
    L9:
        if (forever == false) goto L11;
        this.permanentCache.set(key, AsyncTypefaceResult.m6483boximpl(AsyncTypefaceResult.m6484constructorimpl(result)));     // Catch: Throwable -> L7
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L7
        goto L13
    L11:
        this.resultCache.put(key, AsyncTypefaceResult.m6483boximpl(AsyncTypefaceResult.m6484constructorimpl(result)));     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m6482get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        SynchronizedObject lock$iv = this.cacheLock;
        monitor-enter(lock$iv);
        AsyncTypefaceResult r4 = this.resultCache.get(key);     // Catch: Throwable -> L10
        if (r4 != null) goto L8;
        r4 = this.permanentCache.get(key);     // Catch: Throwable -> L10
    L8:
        monitor-exit(lock$iv);
        return r4;
    L10:
        th = move-exception;
        throw th;
    }

    public final Object runCached(Font font, PlatformFontLoader platformFontLoader, boolean forever, Function1<? super Continuation<Object>, ? extends Object> r12, Continuation<Object> r13) {
        if ((r13 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        boolean forever2 = r0.Z$0;
        Key key = (Key) r0.L$1;
        AsyncTypefaceCache r11 = (AsyncTypefaceCache) r0.L$0;
        ResultKt.throwOnFailure($result);
        AsyncTypefaceCache r3 = r11;
        forever = forever2;
        Object r9 = $result;
    L29:
        Object it = r9;
        SynchronizedObject lock$iv = r3.cacheLock;
        monitor-enter(lock$iv);
        if (it != null) goto L37;
        r3.permanentCache.set(key, AsyncTypefaceResult.m6483boximpl(r3.PermanentFailure));     // Catch: Throwable -> L34
    L40:
        Unit r10 = Unit.INSTANCE;     // Catch: Throwable -> L34
        monitor-exit(lock$iv);
        return r9;
    L37:
        if (forever == false) goto L39;
        r3.permanentCache.set(key, AsyncTypefaceResult.m6483boximpl(AsyncTypefaceResult.m6484constructorimpl(it)));     // Catch: Throwable -> L34
        goto L40
    L39:
        r3.resultCache.put(key, AsyncTypefaceResult.m6483boximpl(AsyncTypefaceResult.m6484constructorimpl(it)));     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;
    L13:
        ResultKt.throwOnFailure($result);
        r3 = this;
        key = new Key(font, platformFontLoader.getCacheKey());
        SynchronizedObject lock$iv2 = r3.cacheLock;
        monitor-enter(lock$iv2);
        AsyncTypefaceResult priorResult = r3.resultCache.get(key);     // Catch: Throwable -> L45
        if (priorResult != null) goto L19;
        priorResult = r3.permanentCache.get(key);     // Catch: Throwable -> L45
    L19:
        if (priorResult == null) goto L24;
        Object r14 = priorResult.m6490unboximpl();     // Catch: Throwable -> L45
        monitor-exit(lock$iv2);
        return r14;
    L24:
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L45
        monitor-exit(lock$iv2);
        r0.L$0 = r3;
        r0.L$1 = key;
        r0.Z$0 = forever;
        r0.label = 1;
        r9 = r12.invoke(r0);
        if (r9 != r2) goto L29;
        return r2;
    L45:
        th = move-exception;
        throw th;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r13);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, Function0<? extends Object> r13) {
        SynchronizedObject lock$iv = access$getCacheLock$p(this);
        monitor-enter(lock$iv);
        Key key = new Key(font, platformFontLoader.getCacheKey());     // Catch: Throwable -> L19
        AsyncTypefaceResult priorResult = (AsyncTypefaceResult) access$getResultCache$p(this).get(key);     // Catch: Throwable -> L19
        if (priorResult == null) goto L23;
    L10:
        if (priorResult == null) goto L15;
        Object r6 = priorResult.m6490unboximpl();     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r6;
    L8:
        th = th;
    L21:
        monitor-exit(lock$iv);
        throw th;
    L15:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L19
        monitor-exit(lock$iv);
        Object it = r13.invoke();
        put$default(this, font, platformFontLoader, it, false, 8, null);
        return it;
    L23:
        priorResult = (AsyncTypefaceResult) access$getPermanentCache$p(this).get(key);     // Catch: Throwable -> L8
    L19:
        th = th;
        goto L21
    }
}
