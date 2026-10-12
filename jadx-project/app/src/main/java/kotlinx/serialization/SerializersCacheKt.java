package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001aA\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f0\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u001b*\u0006\u0012\u0002\b\u00030\u0011H\u0080\b\"$\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0004\"\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0004\"\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0004¨\u0006\u001c"}, d2 = {"SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "", "getSERIALIZERS_CACHE$annotations", "()V", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE_NULLABLE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "findCachedSerializer", "Lkotlinx/serialization/KSerializer;", "clazz", "Lkotlin/reflect/KClass;", "isNullable", "", "findParametrizedCachedSerializer", "Lkotlin/Result;", "types", "", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "polymorphicIfInterface", "Lkotlinx/serialization/PolymorphicSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SerializersCacheKt {
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE = null;
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = null;
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE = null;
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE = null;

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    static {
        SERIALIZERS_CACHE = CachingKt.createCache(new SerializersCacheKt$$ExternalSyntheticLambda0());
        SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new SerializersCacheKt$$ExternalSyntheticLambda1());
        PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new SerializersCacheKt$$ExternalSyntheticLambda2());
        PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new SerializersCacheKt$$ExternalSyntheticLambda3());
    }

    static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer r0 = SerializersKt.serializerOrNull(it);
        if (r0 == null) goto L5;
        return r0;
    L5:
        if (PlatformKt.isInterface(it) == false) goto L7;
        PolymorphicSerializer r2 = new PolymorphicSerializer(it);
    L9:
        return r2;
    L7:
        r2 = null;
        goto L9
    }

    static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PolymorphicSerializer r0 = SerializersKt.serializerOrNull(it);
        if (r0 == null) goto L5;
    L9:
        if (r0 == null) goto L14;
        KSerializer $this$cast$iv = BuiltinSerializersKt.getNullable(r0);
        if ($this$cast$iv != null) goto L13;
        return null;
    L13:
        return $this$cast$iv;
    L14:
        return null;
    L5:
        if (PlatformKt.isInterface(it) == false) goto L7;
        PolymorphicSerializer r3 = new PolymorphicSerializer(it);
    L8:
        r0 = r3;
        goto L9
    L7:
        r3 = null;
        goto L8
    }

    static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> r0 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(r0);
        return SerializersKt.parametrizedSerializerOrNull(clazz, r0, new SerializersCacheKt$$ExternalSyntheticLambda4(types));
    }

    static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List $types) {
        return ((KType) $types.get(0)).getClassifier();
    }

    static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> r0 = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(r0);
        KSerializer<? extends Object> r1 = SerializersKt.parametrizedSerializerOrNull(clazz, r0, new SerializersCacheKt$$ExternalSyntheticLambda5(types));
        if (r1 == null) goto L7;
        KSerializer r2 = BuiltinSerializersKt.getNullable(r1);
        if (r2 == null) goto L7;
        return r2;
    L7:
        return null;
    }

    static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List $types) {
        return ((KType) $types.get(0)).getClassifier();
    }

    public static final KSerializer<Object> findCachedSerializer(KClass<Object> r2, boolean isNullable) {
        Intrinsics.checkNotNullParameter(r2, "clazz");
        if (isNullable == true) goto L9;
        KSerializer<? extends Object> r0 = SERIALIZERS_CACHE.get(r2);
        if (r0 != null) goto L10;
        return null;
    L10:
        return r0;
    L9:
        return SERIALIZERS_CACHE_NULLABLE.get(r2);
    }

    public static final Object findParametrizedCachedSerializer(KClass<Object> r1, List<? extends KType> r2, boolean isNullable) {
        Intrinsics.checkNotNullParameter(r1, "clazz");
        Intrinsics.checkNotNullParameter(r2, "types");
        if (isNullable == true) goto L6;
        return PARAMETRIZED_SERIALIZERS_CACHE.mo8983getgIAlus(r1, r2);
    L6:
        return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo8983getgIAlus(r1, r2);
    }

    public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(KClass<?> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if (PlatformKt.isInterface(r2) == true) goto L7;
        return null;
    L7:
        return new PolymorphicSerializer(r2);
    }
}
