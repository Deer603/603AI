package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class SerializersKt {
    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> r2) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(module, r2);
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> r2, KSerializer<?>[] r3) {
        return SerializersKt__SerializersKt.moduleThenPolymorphic(module, r2, r3);
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        return SerializersKt__SerializersKt.noCompiledSerializer(forClass);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> r2) {
        return SerializersKt__SerializersKt.noCompiledSerializer(module, r2);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> r2, KSerializer<?>[] r3) {
        return SerializersKt__SerializersKt.noCompiledSerializer(module, r2, r3);
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> r1, List<? extends KSerializer<Object>> r2, Function0<? extends KClassifier> r3) {
        return SerializersKt__SerializersKt.parametrizedSerializerOrNull(r1, r2, r3);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        return (KSerializer<T>) serializer(null);
    }

    public static final KSerializer<Object> serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> r1) {
        return SerializersKt__SerializersKt.serializer(r1);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> r1, List<? extends KSerializer<?>> r2, boolean isNullable) {
        return SerializersKt__SerializersKt.serializer(r1, r2, isNullable);
    }

    public static final KSerializer<Object> serializer(KType type) {
        return SerializersKt__SerializersKt.serializer(type);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule r2) {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (KSerializer<T>) serializer(r2, null);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, Type type) {
        return SerializersKt__SerializersJvmKt.serializer($this$serializer, type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KClass<?> r2, List<? extends KSerializer<?>> r3, boolean isNullable) {
        return SerializersKt__SerializersKt.serializer($this$serializer, r2, r3, isNullable);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KType type) {
        return SerializersKt__SerializersKt.serializer($this$serializer, type);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(type);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> r1) {
        return SerializersKt__SerializersKt.serializerOrNull(r1);
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        return SerializersKt__SerializersKt.serializerOrNull(type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull($this$serializerOrNull, type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, KType type) {
        return SerializersKt__SerializersKt.serializerOrNull($this$serializerOrNull, type);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule $this$serializersForParameters, List<? extends KType> r2, boolean failOnMissingTypeArgSerializer) {
        return SerializersKt__SerializersKt.serializersForParameters($this$serializersForParameters, r2, failOnMissingTypeArgSerializer);
    }
}
