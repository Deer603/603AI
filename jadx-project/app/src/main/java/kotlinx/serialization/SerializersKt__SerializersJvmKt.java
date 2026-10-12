package kotlinx.serialization;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: SerializersJvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a+\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\n\u001a-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\r\u001aG\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u0001\"\b\b\u0000\u0010\u000f*\u00020\u0002*\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0012H\u0002¢\u0006\u0002\b\u0013\u001a)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\b\u0016\u001a\u0015\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\f*\u00020\u0004H\u0002¢\u0006\u0002\b\u0018¨\u0006\u0019"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ljava/lang/reflect/Type;", "serializerOrNull", "Lkotlinx/serialization/modules/SerializersModule;", "serializerByJavaTypeImpl", "failOnMissingTypeArgSerializer", "", "serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt", "typeSerializer", "Ljava/lang/Class;", "typeSerializer$SerializersKt__SerializersJvmKt", "reflectiveOrContextual", "T", "jClass", "typeArgumentsSerializers", "", "reflectiveOrContextual$SerializersKt__SerializersJvmKt", "genericArraySerializer", "Ljava/lang/reflect/GenericArrayType;", "genericArraySerializer$SerializersKt__SerializersJvmKt", "prettyClass", "prettyClass$SerializersKt__SerializersJvmKt", "kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final KSerializer<Object> serializer(Type type) {
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, Type type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        KSerializer<Object> r0 = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializer, type, true);
        if (r0 == null) goto L5;
        return r0;
    L5:
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, Type type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializerOrNull, type, false);
    }

    static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule r0, Type r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(r0, r1, r2);
    }

    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule $this$serializerByJavaTypeImpl, Type type, boolean failOnMissingTypeArgSerializer) {
        if ((type instanceof GenericArrayType) == false) goto L6;
        return genericArraySerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (GenericArrayType) type, failOnMissingTypeArgSerializer);
    L6:
        if ((type instanceof Class) == false) goto L9;
        return typeSerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (Class) type, failOnMissingTypeArgSerializer);
    L9:
        if ((type instanceof ParameterizedType) == false) goto L50;
        Type r3 = ((ParameterizedType) type).getRawType();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type java.lang.Class<*>");
        Class rootClass = (Class) r3;
        Type[] args = ((ParameterizedType) type).getActualTypeArguments();
        Intrinsics.checkNotNull(args);
        if (failOnMissingTypeArgSerializer == false) goto L16;
        Collection destination$iv$iv = new ArrayList(args.length);
        int r12 = args.length;
        int r13 = 0;
    L13:
        if (r13 >= r12) goto L15;
        Type r14 = args[r13];
        Intrinsics.checkNotNull(r14);
        destination$iv$iv.add(SerializersKt.serializer($this$serializerByJavaTypeImpl, r14));
        r13 = r13 + 1;
        goto L13
    L15:
        List argsSerializers = (List) destination$iv$iv;
    L24:
        if (Set.class.isAssignableFrom(rootClass) == false) goto L27;
        KSerializer<Object> r4 = BuiltinSerializersKt.SetSerializer((KSerializer) argsSerializers.get(0));
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r4;
    L27:
        if (List.class.isAssignableFrom(rootClass) == false) goto L29;
    L48:
        KSerializer<Object> r5 = BuiltinSerializersKt.ListSerializer((KSerializer) argsSerializers.get(0));
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r5;
    L29:
        if (Collection.class.isAssignableFrom(rootClass) == true) goto L48;
        if (Map.class.isAssignableFrom(rootClass) == false) goto L35;
        KSerializer<Object> r6 = BuiltinSerializersKt.MapSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r6;
    L35:
        if (Map.Entry.class.isAssignableFrom(rootClass) == false) goto L38;
        KSerializer<Object> r7 = BuiltinSerializersKt.MapEntrySerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
        Intrinsics.checkNotNull(r7, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r7;
    L38:
        if (Pair.class.isAssignableFrom(rootClass) == false) goto L41;
        KSerializer<Object> r8 = BuiltinSerializersKt.PairSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r8;
    L41:
        if (Triple.class.isAssignableFrom(rootClass) == false) goto L43;
        KSerializer<Object> r9 = BuiltinSerializersKt.TripleSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1), (KSerializer) argsSerializers.get(2));
        Intrinsics.checkNotNull(r9, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r9;
    L43:
        Iterable $this$map$iv = argsSerializers;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r11 = $this$map$iv.iterator();
    L45:
        if (r11.hasNext() == false) goto L47;
        Object item$iv$iv = r11.next();
        KSerializer it = (KSerializer) item$iv$iv;
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
        destination$iv$iv2.add(it);
        goto L45
    L47:
        List varargs = (List) destination$iv$iv2;
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, rootClass, varargs);
    L16:
        Collection destination$iv$iv3 = new ArrayList(args.length);
        int r15 = args.length;
        int r16 = 0;
    L17:
        if (r16 >= r15) goto L22;
        Type r17 = args[r16];
        Intrinsics.checkNotNull(r17);
        KSerializer<Object> r10 = SerializersKt.serializerOrNull($this$serializerByJavaTypeImpl, r17);
        if (r10 == null) goto L20;
        destination$iv$iv3.add(r10);
        r16 = r16 + 1;
        goto L17
    L20:
        return null;
    L22:
        argsSerializers = (List) destination$iv$iv3;
        goto L24
    L50:
        if ((type instanceof WildcardType) == false) goto L54;
        Type[] r18 = ((WildcardType) type).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(r18, "getUpperBounds(...)");
        Object r19 = ArraysKt.first(r18);
        Intrinsics.checkNotNullExpressionValue(r19, "first(...)");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default($this$serializerByJavaTypeImpl, (Type) r19, false, 2, null);
    L54:
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$typeSerializer, Class<?> r5, boolean failOnMissingTypeArgSerializer) {
        if (r5.isArray() == true) goto L5;
    L14:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$typeSerializer, r5, CollectionsKt.emptyList());
    L5:
        if (r5.getComponentType().isPrimitive() == true) goto L14;
        Class<?> r0 = r5.getComponentType();
        Intrinsics.checkNotNullExpressionValue(r0, "getComponentType(...)");
        Class<?> r1 = r0;
        if (failOnMissingTypeArgSerializer == false) goto L9;
        KSerializer<Object> r2 = SerializersKt.serializer($this$typeSerializer, r1);
    L13:
        KClass r3 = JvmClassMappingKt.getKotlinClass(r0);
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> r4 = BuiltinSerializersKt.ArraySerializer(r3, r2);
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r4;
    L9:
        r2 = SerializersKt.serializerOrNull($this$typeSerializer, r1);
        if (r2 != null) goto L13;
        return null;
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule $this$reflectiveOrContextual, Class<T> r5, List<? extends KSerializer<Object>> r6) {
        List<? extends KSerializer<Object>> $this$toTypedArray$iv = r6;
        KSerializer[] r0 = (KSerializer[]) $this$toTypedArray$iv.toArray(new KSerializer[0]);
        KSerializer<T> r1 = PlatformKt.constructSerializerForGivenTypeArgs(r5, (KSerializer[]) Arrays.copyOf(r0, r0.length));
        if (r1 != null) goto L5;
        KClass<T> r2 = JvmClassMappingKt.getKotlinClass(r5);
        KSerializer<T> r3 = PrimitivesKt.builtinSerializerOrNull(r2);
        if (r3 != null) goto L15;
        KSerializer<T> r4 = $this$reflectiveOrContextual.getContextual(r2, r6);
        if (r4 == null) goto L11;
        return r4;
    L11:
        if (r5.isInterface() == true) goto L17;
        return null;
    L17:
        return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(r5));
    L15:
        return r3;
    L5:
        return r1;
    }

    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$genericArraySerializer, GenericArrayType type, boolean failOnMissingTypeArgSerializer) {
        Type it = type.getGenericComponentType();
        if ((it instanceof WildcardType) == false) goto L5;
        Type[] r2 = ((WildcardType) it).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(r2, "getUpperBounds(...)");
        Type eType = (Type) ArraysKt.first(r2);
    L6:
        Intrinsics.checkNotNull(eType);
        if (failOnMissingTypeArgSerializer == false) goto L9;
        KSerializer<Object> r0 = SerializersKt.serializer($this$genericArraySerializer, eType);
    L14:
        if ((eType instanceof ParameterizedType) == false) goto L17;
        Type r1 = ((ParameterizedType) eType).getRawType();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type java.lang.Class<*>");
        KClass kclass = JvmClassMappingKt.getKotlinClass((Class) r1);
    L19:
        Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> r3 = BuiltinSerializersKt.ArraySerializer(kclass, r0);
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return r3;
    L17:
        if ((eType instanceof KClass) == false) goto L22;
        kclass = (KClass) eType;
        goto L19
    L22:
        throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
    L9:
        r0 = SerializersKt.serializerOrNull($this$genericArraySerializer, eType);
        if (r0 != null) goto L14;
        return null;
    L5:
        eType = it;
        goto L6
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type $this$prettyClass) {
        if (($this$prettyClass instanceof Class) == false) goto L6;
        return (Class) $this$prettyClass;
    L6:
        if (($this$prettyClass instanceof ParameterizedType) == false) goto L9;
        Type r1 = ((ParameterizedType) $this$prettyClass).getRawType();
        Intrinsics.checkNotNullExpressionValue(r1, "getRawType(...)");
        return prettyClass$SerializersKt__SerializersJvmKt(r1);
    L9:
        if (($this$prettyClass instanceof WildcardType) == false) goto L12;
        Type[] r2 = ((WildcardType) $this$prettyClass).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(r2, "getUpperBounds(...)");
        Object r3 = ArraysKt.first(r2);
        Intrinsics.checkNotNullExpressionValue(r3, "first(...)");
        return prettyClass$SerializersKt__SerializersJvmKt((Type) r3);
    L12:
        if (($this$prettyClass instanceof GenericArrayType) == false) goto L16;
        Type r4 = ((GenericArrayType) $this$prettyClass).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(r4, "getGenericComponentType(...)");
        return prettyClass$SerializersKt__SerializersJvmKt(r4);
    L16:
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + $this$prettyClass + " has type " + Reflection.getOrCreateKotlinClass($this$prettyClass.getClass()));
    }
}
