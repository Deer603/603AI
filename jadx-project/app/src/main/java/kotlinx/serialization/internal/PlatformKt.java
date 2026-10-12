package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b\u001a\u001c\u0010\b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001a$\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0002\"\b\b\u0000\u0010\u0001*\u00020\t\"\n\b\u0001\u0010\u000e*\u0004\u0018\u0001H\u0001*\u0012\u0012\u0004\u0012\u0002H\u000e0\u000fj\b\u0012\u0004\u0012\u0002H\u000e`\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0000¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\nH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u0014*\u0006\u0012\u0002\b\u00030\u0016H\u0000\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\n2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u0019\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0000¢\u0006\u0002\u0010\u001a\u001aM\u0010\u001b\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001c\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u001c\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001aO\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u00162\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010\u001a\u001aK\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t2\u0006\u0010\"\u001a\u00020\t2\"\u0010\u0018\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f0\u0002\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\fH\u0002¢\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010%\u001a\u00020&H\u0002\u001a\"\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a$\u0010(\u001a\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00010\u0016H\u0002\u001a\u0016\u0010)\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0000\u001a\u001c\u0010+\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0,H\u0000\u001a\u0017\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.00H\u0082\b¨\u00061"}, d2 = {"getChecked", "T", "", "index", "", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "isInterface", "", "Lkotlin/reflect/KClass;", "compiledSerializerImpl", "Lkotlinx/serialization/KSerializer;", "toNativeArrayImpl", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "platformSpecificSerializerNotRegistered", "", "serializerNotRegistered", "Ljava/lang/Class;", "constructSerializerForGivenTypeArgs", "args", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "isNotAnnotated", "isPolymorphicSerializer", "invokeSerializerOnDefaultCompanion", "jClass", "invokeSerializerOnCompanion", "companion", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "companionOrNull", "companionName", "", "createEnumSerializer", "findObjectSerializer", "isReferenceArray", "rootClass", "initBuiltins", "", "loadSafe", "", "block", "Lkotlin/Function0;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlatformKt {
    public static final <T> T getChecked(T[] r2, int index) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return r2[index];
    }

    public static final boolean getChecked(boolean[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        return $this$getChecked[index];
    }

    public static final <T> boolean isInterface(KClass<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return JvmClassMappingKt.getJavaClass(r1).isInterface();
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return constructSerializerForGivenTypeArgs(r1, new KSerializer[0]);
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> r2, KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "eClass");
        Object r0 = Array.newInstance(JvmClassMappingKt.getJavaClass(r3), r2.size());
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] r1 = (E[]) r2.toArray((Object[]) r0);
        Intrinsics.checkNotNullExpressionValue(r1, "toArray(...)");
        return r1;
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Platform_commonKt.serializerNotRegistered(r1);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(JvmClassMappingKt.getKotlinClass(r2)));
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> r2, KSerializer<Object>... r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass(r2), (KSerializer[]) Arrays.copyOf(r3, r3.length));
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> r4, KSerializer<Object>... r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "args");
        if (r4.isEnum() == true) goto L5;
    L8:
        KSerializer<T> r0 = invokeSerializerOnDefaultCompanion(r4, (KSerializer[]) Arrays.copyOf(r5, r5.length));
        if (r0 == null) goto L11;
        return r0;
    L11:
        KSerializer<T> r1 = findObjectSerializer(r4);
        if (r1 != null) goto L14;
        KSerializer<T> r2 = findInNamedCompanion(r4, (KSerializer[]) Arrays.copyOf(r5, r5.length));
        if (r2 == null) goto L19;
        return r2;
    L19:
        if (isPolymorphicSerializer(r4) == true) goto L23;
        return null;
    L23:
        return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(r4));
    L14:
        return r1;
    L5:
        if (isNotAnnotated(r4) == false) goto L8;
        return createEnumSerializer(r4);
    }

    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> r13, KSerializer<Object>... r14) {
        Object namedCompanion = findNamedCompanionByAnnotation(r13);
        if (namedCompanion == null) goto L32;
        KSerializer<T> r1 = invokeSerializerOnCompanion(namedCompanion, (KSerializer[]) Arrays.copyOf(r14, r14.length));
        if (r1 == null) goto L32;
        return r1;
    L32:
        Object[] r2 = r13.getDeclaredClasses();     // Catch: NoSuchFieldException -> L30
        Intrinsics.checkNotNullExpressionValue(r2, "getDeclaredClasses(...)");     // Catch: NoSuchFieldException -> L30
        Object[] $this$singleOrNull$iv = r2;     // Catch: NoSuchFieldException -> L30
        Object single$iv = null;
        boolean found$iv = false;
        int r6 = $this$singleOrNull$iv.length;     // Catch: NoSuchFieldException -> L30
        int r7 = 0;
    L10:
        if (r7 >= r6) goto L17;
        Object element$iv = $this$singleOrNull$iv[r7];     // Catch: NoSuchFieldException -> L30
        if (Intrinsics.areEqual(((Class) element$iv).getSimpleName(), "$serializer") == false) goto L16;
        if (found$iv == true) goto L14;
        single$iv = element$iv;
        found$iv = true;
        goto L16
    L14:
        single$iv = null;
    L20:
        Class<?> r4 = (Class) single$iv;     // Catch: NoSuchFieldException -> L30
        if (r4 == null) goto L25;
        Field r3 = r4.getField("INSTANCE");     // Catch: NoSuchFieldException -> L30
        if (r3 == null) goto L25;
        Object r5 = r3.get(null);     // Catch: NoSuchFieldException -> L30
    L27:
        if ((r5 instanceof KSerializer) == false) goto L38;
        return (KSerializer) r5;
    L38:
        return null;
    L25:
        r5 = null;
    L16:
        r7 = r7 + 1;     // Catch: NoSuchFieldException -> L30
        goto L10
    L17:
        if (found$iv == true) goto L20;
        single$iv = null;
    L31:
        return null;
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> r10) {
        Object[] r0 = r10.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(r0, "getDeclaredClasses(...)");
        Object[] $this$firstOrNull$iv = r0;
        int r2 = $this$firstOrNull$iv.length;
        int r4 = 0;
    L4:
        if (r4 >= r2) goto L12;
        Object element$iv = $this$firstOrNull$iv[r4];
        if (((Class) element$iv).getAnnotation(NamedCompanion.class) == null) goto L8;
        boolean r9 = true;
    L9:
        if (r9 == true) goto L13;
        r4 = r4 + 1;
    L13:
        Class<?> r6 = (Class) element$iv;
        if (r6 != null) goto L16;
        return null;
    L16:
        String r1 = r6.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(r1, "getSimpleName(...)");
        return companionOrNull(r10, r1);
    L8:
        r9 = false;
        goto L9
    L12:
        element$iv = null;
        goto L13
    }

    private static final <T> boolean isNotAnnotated(Class<T> r1) {
        if (r1.getAnnotation(Serializable.class) == null) goto L5;
    L7:
        return false;
    L5:
        if (r1.getAnnotation(Polymorphic.class) != null) goto L7;
        return true;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> r4) {
        if (r4.getAnnotation(Polymorphic.class) == null) goto L5;
        return true;
    L5:
        Serializable serializable = (Serializable) r4.getAnnotation(Serializable.class);
        if (serializable != null) goto L8;
        return false;
    L8:
        if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class)) == false) goto L12;
        return true;
    L12:
        return false;
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> r2, KSerializer<Object>... r3) {
        Object companion = companionOrNull(r2, "Companion");
        if (companion != null) goto L7;
        return null;
    L7:
        return invokeSerializerOnCompanion(companion, (KSerializer[]) Arrays.copyOf(r3, r3.length));
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object companion, KSerializer<Object>... r6) {
        int r2 = 0;
        if (r6.length != 0) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L9;
        Class[] types = new Class[0];     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
    L13:
        Object r3 = companion.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(types, types.length)).invoke(companion, Arrays.copyOf(r6, r6.length));     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
        if ((r3 instanceof KSerializer) == false) goto L31;
        goto L27
    L32:
        return (KSerializer) r3;
    L31:
        return null;
    L9:
        int r4 = r6.length;     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
        Class[] r5 = new Class[r4];     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
    L10:
        if (r2 >= r4) goto L12;
        r5[r2] = KSerializer.class;     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
        r2 = r2 + 1;     // Catch: InvocationTargetException -> L17 NoSuchMethodException -> L26
        goto L10
    L12:
        types = r5;
        goto L13
    L6:
        r1 = false;
    L17:
        e = move-exception;
        Throwable cause = e.getCause();
        if (cause == null) goto L25;
        String r7 = cause.getMessage();
        if (r7 != null) goto L24;
        r7 = e.getMessage();
    L24:
        throw new InvocationTargetException(cause, r7);
    L25:
        throw e;
    L27:
        return null;
    }

    private static final Object companionOrNull(Class<?> r3, String companionName) {
        Field companion = r3.getDeclaredField(companionName);     // Catch: Throwable -> L5
        companion.setAccessible(true);     // Catch: Throwable -> L5
        return companion.get(null);
    L6:
        return null;
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> r4) {
        Object[] constants = r4.getEnumConstants();
        String r2 = r4.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(r2, "getCanonicalName(...)");
        Intrinsics.checkNotNull(constants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(r2, (Enum[]) constants);
    }

    private static final <T> KSerializer<T> findObjectSerializer(Class<T> r16) {
        String it = r16.getCanonicalName();
        if (it != null) goto L5;
    L13:
        boolean r0 = false;
    L14:
        if (r0 == true) goto L16;
        return null;
    L16:
        Object[] r1 = r16.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(r1, "getDeclaredFields(...)");
        Object[] $this$singleOrNull$iv = r1;
        Object single$iv = null;
        boolean found$iv = false;
        int r7 = $this$singleOrNull$iv.length;
        int r8 = 0;
    L17:
        if (r8 >= r7) goto L32;
        Object element$iv = $this$singleOrNull$iv[r8];
        Field it2 = (Field) element$iv;
        if (Intrinsics.areEqual(it2.getName(), "INSTANCE") == false) goto L25;
        Class<T> r13 = r16;
        if (Intrinsics.areEqual(it2.getType(), r13) == true) goto L23;
    L26:
        boolean r10 = false;
    L27:
        if (r10 == false) goto L31;
        if (found$iv == true) goto L29;
        single$iv = element$iv;
        found$iv = true;
        goto L31
    L29:
        single$iv = null;
    L36:
        Field field = (Field) single$iv;
        if (field != null) goto L39;
        return null;
    L39:
        Object instance = field.get(null);
        Object[] r4 = r13.getMethods();
        Intrinsics.checkNotNullExpressionValue(r4, "getMethods(...)");
        Object[] $this$singleOrNull$iv2 = r4;
        Object single$iv2 = null;
        boolean found$iv2 = false;
        int r9 = $this$singleOrNull$iv2.length;
        int r11 = 0;
    L40:
        if (r11 >= r9) goto L57;
        Object element$iv2 = $this$singleOrNull$iv2[r11];
        Method it3 = (Method) element$iv2;
        if (Intrinsics.areEqual(it3.getName(), "serializer") == false) goto L51;
        Class<?>[] r2 = it3.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(r2, "getParameterTypes(...)");
        if (r2.length != 0) goto L46;
        boolean r3 = true;
    L47:
        if (r3 == false) goto L51;
        if (Intrinsics.areEqual(it3.getReturnType(), KSerializer.class) == false) goto L51;
        boolean r5 = true;
    L52:
        if (r5 == false) goto L56;
        if (found$iv2 == true) goto L54;
        found$iv2 = true;
        single$iv2 = element$iv2;
        goto L56
    L54:
        single$iv2 = null;
    L60:
        Method method = (Method) single$iv2;
        if (method != null) goto L63;
        return null;
    L63:
        Object result = method.invoke(instance, new Object[0]);
        if ((result instanceof KSerializer) == true) goto L66;
        return null;
    L66:
        return (KSerializer) result;
    L56:
        r11 = r11 + 1;
        goto L40
    L46:
        r3 = false;
    L51:
        r5 = false;
        goto L52
    L57:
        if (found$iv2 == true) goto L60;
        single$iv2 = null;
    L31:
        r8 = r8 + 1;
        goto L17
    L23:
        if (Modifier.isStatic(it2.getModifiers()) == false) goto L26;
        r10 = true;
        goto L27
    L25:
        r13 = r16;
        goto L26
    L32:
        r13 = r16;
        if (found$iv == true) goto L36;
        single$iv = null;
        goto L36
    L5:
        if (StringsKt.startsWith$default(it, "java.", false, 2, null) == false) goto L7;
    L10:
        boolean r6 = true;
    L11:
        if (r6 == true) goto L13;
        r0 = true;
        goto L14
    L7:
        if (StringsKt.startsWith$default(it, "kotlin.", false, 2, null) == true) goto L10;
        r6 = false;
        goto L11
    }

    public static final boolean isReferenceArray(KClass<Object> r1) {
        Intrinsics.checkNotNullParameter(r1, "rootClass");
        return JvmClassMappingKt.getJavaClass(r1).isArray();
    }

    public static final Map<KClass<?>, KSerializer<?>> initBuiltins() {
        Map $this$initBuiltins_u24lambda_u2414 = MapsKt.createMapBuilder();
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));     // Catch: ClassNotFoundException -> L5 NoClassDefFoundError -> L7
    L42:
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());     // Catch: ClassNotFoundException -> L11 NoClassDefFoundError -> L13
    L44:
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());     // Catch: ClassNotFoundException -> L17 NoClassDefFoundError -> L19
    L48:
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());     // Catch: ClassNotFoundException -> L23 NoClassDefFoundError -> L25
    L50:
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());     // Catch: ClassNotFoundException -> L29 NoClassDefFoundError -> L31
    L46:
        $this$initBuiltins_u24lambda_u2414.put(Reflection.getOrCreateKotlinClass(Uuid.class), BuiltinSerializersKt.serializer(Uuid.Companion));     // Catch: ClassNotFoundException -> L35 NoClassDefFoundError -> L37
    L39:
        return MapsKt.build($this$initBuiltins_u24lambda_u2414);
    }

    private static final void loadSafe(Function0<Unit> r2) {
        r2.invoke();     // Catch: ClassNotFoundException -> L5 NoClassDefFoundError -> L7
    L11:
        return;
    L12:
        return;
    }
}
