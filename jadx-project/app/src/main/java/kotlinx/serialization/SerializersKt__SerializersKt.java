package kotlinx.serialization;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a6\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a:\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u001c\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a+\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0010\u001aG\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a2\u0010\u0014\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001\u0018\u00010\n*\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000f\u001a\u00020\fH\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001aB\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0000\u001a7\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\nH\u0002¢\u0006\u0002\b\u001c\u001aG\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002¢\u0006\u0002\b\u001e\u001a1\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0002\b!\u001a\u0014\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010#\u001a\u00020$H\u0001\u001a \u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(\u001a \u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "T", "Lkotlinx/serialization/modules/SerializersModule;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lkotlin/reflect/KType;", "kClass", "Lkotlin/reflect/KClass;", "typeArgumentsSerializers", "", "isNullable", "", "serializerOrNull", "serializerByKTypeImpl", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "serializerByKClassImpl", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializersForParameters", "typeArguments", "parametrizedSerializerOrNull", "serializers", "elementClassifierIfArray", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "compiledParametrizedSerializer", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "builtinParametrizedSerializer", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "nullable", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "noCompiledSerializer", "forClass", "", "module", "argSerializers", "", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "moduleThenPolymorphic", "kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class SerializersKt__SerializersKt {
    public static /* synthetic */ KClassifier $r8$lambda$kySqFMIAiKMq9XadqaNh2wiOkNo() {
        return serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt();
    }

    public static /* synthetic */ KClassifier $r8$lambda$u_x7BEkvLYF9XQ9RRlbMZi_QcQ0(List r0) {
        return serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(r0);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer(null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer($this$serializer, null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    public static final KSerializer<Object> serializer(KType type) {
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> r1, List<? extends KSerializer<?>> r2, boolean isNullable) {
        Intrinsics.checkNotNullParameter(r1, "kClass");
        Intrinsics.checkNotNullParameter(r2, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), r1, r2, isNullable);
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KType type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        KSerializer<Object> r0 = serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializer, type, true);
        if (r0 == null) goto L5;
        return r0;
    L5:
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KClass<?> r2, List<? extends KSerializer<?>> r3, boolean isNullable) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(r2, "kClass");
        Intrinsics.checkNotNullParameter(r3, "typeArgumentsSerializers");
        KSerializer<Object> r0 = serializerByKClassImpl$SerializersKt__SerializersKt($this$serializer, r2, r3, isNullable);
        if (r0 == null) goto L5;
        return r0;
    L5:
        PlatformKt.platformSpecificSerializerNotRegistered(r2);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, KType type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializerOrNull, type, false);
    }

    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKTypeImpl, KType type, boolean failOnMissingTypeArgSerializer) {
        KClass<Object> r0 = Platform_commonKt.kclass(type);
        boolean isNullable = type.isMarkedNullable();
        Iterable $this$map$iv = type.getArguments();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r7 = $this$map$iv.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        Object item$iv$iv = r7.next();
        KTypeProjection p0 = (KTypeProjection) item$iv$iv;
        destination$iv$iv.add(Platform_commonKt.typeOrThrow(p0));
        goto L4
    L6:
        final List typeArguments = (List) destination$iv$iv;
        if (typeArguments.isEmpty() == false) goto L15;
        if (PlatformKt.isInterface(r0) == true) goto L11;
    L13:
        KSerializer<Object> r2 = SerializersCacheKt.findCachedSerializer(r0, isNullable);
    L22:
        if (r2 == null) goto L25;
        return r2;
    L25:
        if (typeArguments.isEmpty() == false) goto L35;
        PolymorphicSerializer r6 = SerializersKt.serializerOrNull(r0);
        if (r6 != null) goto L48;
        r6 = SerializersModule.getContextual$default($this$serializerByKTypeImpl, r0, null, 2, null);
        if (r6 != null) goto L48;
        if (PlatformKt.isInterface(r0) == false) goto L33;
        PolymorphicSerializer r8 = new PolymorphicSerializer(r0);
    L34:
        r6 = r8;
        goto L48
    L33:
        r8 = null;
    L48:
        if (r6 != null) goto L50;
        return null;
    L50:
        return nullable$SerializersKt__SerializersKt(r6, isNullable);
    L35:
        List<KSerializer<Object>> r3 = SerializersKt.serializersForParameters($this$serializerByKTypeImpl, typeArguments, failOnMissingTypeArgSerializer);
        if (r3 != null) goto L38;
        return null;
    L38:
        r6 = SerializersKt.parametrizedSerializerOrNull(r0, r3, new SerializersKt__SerializersKt$$ExternalSyntheticLambda1(typeArguments));
        if (r6 != null) goto L48;
        r6 = $this$serializerByKTypeImpl.getContextual(r0, r3);
        if (r6 != null) goto L48;
        if (PlatformKt.isInterface(r0) == false) goto L45;
        PolymorphicSerializer r9 = new PolymorphicSerializer(r0);
    L46:
        r6 = r9;
        goto L48
    L45:
        r9 = null;
        goto L46
    L11:
        if (SerializersModule.getContextual$default($this$serializerByKTypeImpl, r0, null, 2, null) == null) goto L13;
        r2 = null;
        goto L22
    L15:
        if ($this$serializerByKTypeImpl.getHasInterfaceContextualSerializers$kotlinx_serialization_core() == false) goto L17;
        r2 = null;
        goto L22
    L17:
        Object r4 = SerializersCacheKt.findParametrizedCachedSerializer(r0, typeArguments, isNullable);
        if (Result.m7431isFailureimpl(r4) == false) goto L20;
        r4 = null;
    L20:
        r2 = (KSerializer) r4;
        goto L22
    }

    private static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List $typeArguments) {
        return ((KType) $typeArguments.get(0)).getClassifier();
    }

    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKClassImpl, KClass<Object> r5, List<? extends KSerializer<Object>> r6, boolean isNullable) {
        if (r6.isEmpty() == false) goto L19;
        KSerializer<? extends Object> r0 = SerializersKt.serializerOrNull(r5);
        if (r0 != null) goto L13;
        r0 = SerializersModule.getContextual$default($this$serializerByKClassImpl, r5, null, 2, null);
    L13:
        if (r0 != null) goto L15;
        return null;
    L15:
        return nullable$SerializersKt__SerializersKt(r0, isNullable);
    L19:
        r0 = SerializersKt.parametrizedSerializerOrNull(r5, r6, new SerializersKt__SerializersKt$$ExternalSyntheticLambda0());     // Catch: IndexOutOfBoundsException -> L16
        if (r0 != null) goto L13;
        r0 = $this$serializerByKClassImpl.getContextual(r5, r6);     // Catch: IndexOutOfBoundsException -> L16
    L16:
        e = move-exception;
        throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
    }

    private static final KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule $this$serializersForParameters, List<? extends KType> r11, boolean failOnMissingTypeArgSerializer) {
        Intrinsics.checkNotNullParameter($this$serializersForParameters, "<this>");
        Intrinsics.checkNotNullParameter(r11, "typeArguments");
        if (failOnMissingTypeArgSerializer == false) goto L9;
        List<? extends KType> $this$map$iv = r11;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r5 = $this$map$iv.iterator();
    L6:
        if (r5.hasNext() == false) goto L8;
        Object item$iv$iv = r5.next();
        KType it = (KType) item$iv$iv;
        destination$iv$iv.add(SerializersKt.serializer($this$serializersForParameters, it));
        goto L6
    L8:
        List serializers = (List) destination$iv$iv;
        return serializers;
    L9:
        List<? extends KType> $this$map$iv2 = r11;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        Iterator r6 = $this$map$iv2.iterator();
    L11:
        if (r6.hasNext() == false) goto L17;
        Object item$iv$iv2 = r6.next();
        KType it2 = (KType) item$iv$iv2;
        KSerializer<Object> r9 = SerializersKt.serializerOrNull($this$serializersForParameters, it2);
        if (r9 == null) goto L14;
        destination$iv$iv2.add(r9);
        goto L11
    L14:
        return null;
    L17:
        List serializers2 = (List) destination$iv$iv2;
        return serializers2;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        KSerializer<T> r0 = SerializersKt.serializerOrNull(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        Platform_commonKt.serializerNotRegistered(r1);
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        KSerializer<T> r0 = PlatformKt.compiledSerializerImpl(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return PrimitivesKt.builtinSerializerOrNull(r1);
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> r1, List<? extends KSerializer<Object>> r2, Function0<? extends KClassifier> r3) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "serializers");
        Intrinsics.checkNotNullParameter(r3, "elementClassifierIfArray");
        KSerializer<? extends Object> r0 = builtinParametrizedSerializer$SerializersKt__SerializersKt(r1, r2, r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return compiledParametrizedSerializer$SerializersKt__SerializersKt(r1, r2);
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> r4, List<? extends KSerializer<Object>> r5) {
        List<? extends KSerializer<Object>> $this$toTypedArray$iv = r5;
        KSerializer[] r0 = (KSerializer[]) $this$toTypedArray$iv.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(r4, (KSerializer[]) Arrays.copyOf(r0, r0.length));
    }

    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> r3, List<? extends KSerializer<Object>> r4, Function0<? extends KClassifier> r5) {
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Collection.class)) == true) goto L47;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(List.class)) == true) goto L47;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(List.class)) == true) goto L47;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(ArrayList.class)) == true) goto L47;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(HashSet.class)) == false) goto L15;
        return new HashSetSerializer(r4.get(0));
    L15:
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Set.class)) == true) goto L56;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Set.class)) == true) goto L56;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(LinkedHashSet.class)) == true) goto L56;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(HashMap.class)) == false) goto L25;
        return new HashMapSerializer(r4.get(0), r4.get(1));
    L25:
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Map.class)) == true) goto L55;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Map.class)) == true) goto L55;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(LinkedHashMap.class)) == true) goto L55;
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Map.Entry.class)) == false) goto L35;
        return BuiltinSerializersKt.MapEntrySerializer(r4.get(0), r4.get(1));
    L35:
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Pair.class)) == false) goto L38;
        return BuiltinSerializersKt.PairSerializer(r4.get(0), r4.get(1));
    L38:
        if (Intrinsics.areEqual(r3, Reflection.getOrCreateKotlinClass(Triple.class)) == false) goto L41;
        return BuiltinSerializersKt.TripleSerializer(r4.get(0), r4.get(1), r4.get(2));
    L41:
        if (PlatformKt.isReferenceArray(r3) == false) goto L43;
        KClassifier r0 = r5.invoke();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) r0, r4.get(0));
    L43:
        return null;
    L55:
        return new LinkedHashMapSerializer(r4.get(0), r4.get(1));
    L56:
        return new LinkedHashSetSerializer(r4.get(0));
    L47:
        return new ArrayListSerializer(r4.get(0));
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> r1, boolean shouldBeNullable) {
        if (shouldBeNullable == true) goto L4;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return r1;
    L4:
        return BuiltinSerializersKt.getNullable(r1);
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> r3) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(r3, "kClass");
        KSerializer<?> r0 = SerializersModule.getContextual$default(module, r3, null, 2, null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        Platform_commonKt.serializerNotRegistered(r3);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> r2, KSerializer<?>[] r3) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(r2, "kClass");
        Intrinsics.checkNotNullParameter(r3, "argSerializers");
        KSerializer<?> r0 = module.getContextual(r2, ArraysKt.asList(r3));
        if (r0 == null) goto L5;
        return r0;
    L5:
        Platform_commonKt.serializerNotRegistered(r2);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> r3) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(r3, "kClass");
        KSerializer<?> r0 = SerializersModule.getContextual$default(module, r3, null, 2, null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new PolymorphicSerializer(r3);
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> r2, KSerializer<?>[] r3) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(r2, "kClass");
        Intrinsics.checkNotNullParameter(r3, "argSerializers");
        KSerializer<?> r0 = module.getContextual(r2, ArraysKt.asList(r3));
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new PolymorphicSerializer(r2);
    }
}
