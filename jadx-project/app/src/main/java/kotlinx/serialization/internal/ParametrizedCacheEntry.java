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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "<init>", "()V", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "computeIfAbsent", "types", "Lkotlin/reflect/KType;", "producer", "Lkotlin/Function0;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ParametrizedCacheEntry<T> {
    private final ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<T>>> serializers;

    public ParametrizedCacheEntry() {
        this.serializers = new ConcurrentHashMap();
    }

    public static final /* synthetic */ ConcurrentHashMap access$getSerializers$p(ParametrizedCacheEntry $this) {
        return $this.serializers;
    }

    /* JADX INFO: renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m8986computeIfAbsentgIAlus(List<? extends KType> r12, Function0<? extends KSerializer<T>> r13) {
        Intrinsics.checkNotNullParameter(r12, "types");
        Intrinsics.checkNotNullParameter(r13, "producer");
        List<? extends KType> $this$map$iv = r12;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<T> r6 = $this$map$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        Object item$iv$iv = r6.next();
        KType it = (KType) item$iv$iv;
        destination$iv$iv.add(new KTypeWrapper(it));
        goto L4
    L6:
        ArrayList r3 = (List) destination$iv$iv;
        ConcurrentMap $this$getOrPut$iv = access$getSerializers$p(this);
        Object r4 = $this$getOrPut$iv.get(r3);
        if (r4 == null) goto L19;
    L17:
        Intrinsics.checkNotNullExpressionValue(r4, "getOrPut(...)");
        return ((Result) r4).m7434unboximpl();
    L19:
        Result.Companion r5 = Result.Companion;     // Catch: Throwable -> L11
        Object r7 = Result.m7425constructorimpl(r13.invoke());     // Catch: Throwable -> L11
    L13:
        Result r8 = Result.m7424boximpl(r7);
        Object r9 = $this$getOrPut$iv.putIfAbsent(r3, r8);
        if (r9 != null) goto L16;
        r4 = r8;
        goto L17
    L16:
        r4 = r9;
    L11:
        th = move-exception;
        Result.Companion r10 = Result.Companion;
        r7 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L13
    }
}
