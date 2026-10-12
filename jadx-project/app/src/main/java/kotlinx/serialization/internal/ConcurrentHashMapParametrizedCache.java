package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012,\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R4\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "compute", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "get", "Lkotlin/Result;", "key", "types", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapParametrizedCache(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> r2) {
        Intrinsics.checkNotNullParameter(r2, "compute");
        this.compute = r2;
        this.cache = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* JADX INFO: renamed from: get-gIAlu-s */
    public Object mo8983getgIAlus(KClass<Object> r13, List<? extends KType> r14) {
        Intrinsics.checkNotNullParameter(r13, "key");
        Intrinsics.checkNotNullParameter(r14, "types");
        ConcurrentMap $this$getOrPut$iv = this.cache;
        Class<?> r1 = JvmClassMappingKt.getJavaClass(r13);
        ParametrizedCacheEntry<T> r3 = $this$getOrPut$iv.get(r1);
        if (r3 != null) goto L8;
        ParametrizedCacheEntry<T> r4 = new ParametrizedCacheEntry();
        ParametrizedCacheEntry<T> r5 = $this$getOrPut$iv.putIfAbsent(r1, r4);
        if (r5 != null) goto L7;
        r3 = r4;
        goto L8
    L7:
        r3 = r5;
    L8:
        ParametrizedCacheEntry<T> r6 = r3;
        List<? extends KType> $this$map$iv$iv = r14;
        Collection destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10));
        Iterator<T> r7 = $this$map$iv$iv.iterator();
    L10:
        if (r7.hasNext() == false) goto L12;
        Object item$iv$iv$iv = r7.next();
        KType it$iv = (KType) item$iv$iv$iv;
        destination$iv$iv$iv.add(new KTypeWrapper(it$iv));
        goto L10
    L12:
        ArrayList r8 = (List) destination$iv$iv$iv;
        ConcurrentMap $this$getOrPut$iv$iv = ParametrizedCacheEntry.access$getSerializers$p(r6);
        Object r9 = $this$getOrPut$iv$iv.get(r8);
        if (r9 == null) goto L25;
    L23:
        Intrinsics.checkNotNullExpressionValue(r9, "getOrPut(...)");
        return ((Result) r9).m7434unboximpl();
    L25:
        Result.Companion r10 = Result.Companion;     // Catch: Throwable -> L17
        Object r11 = Result.m7425constructorimpl(this.compute.invoke(r13, r14));     // Catch: Throwable -> L17
    L19:
        Result r12 = Result.m7424boximpl(r11);
        Object r15 = $this$getOrPut$iv$iv.putIfAbsent(r8, r12);
        if (r15 != null) goto L22;
        r9 = r12;
        goto L23
    L22:
        r9 = r15;
    L17:
        th = move-exception;
        Result.Companion r16 = Result.Companion;
        r11 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L19
    }
}
