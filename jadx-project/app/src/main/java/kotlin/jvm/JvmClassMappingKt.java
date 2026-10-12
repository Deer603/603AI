package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0010\n\u0002\b\u0005\u001a\u001f\u0010\u0014\u001a\u00020\u0015\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0002\u0010\u0017\"-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038G¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"-\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"+\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007\"+\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0011\";\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00038Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007\"'\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0019*\u0002H\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\";\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u0001\"\u000e\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u0002H\u001d0\u001e*\b\u0012\u0004\u0012\u0002H\u001d0\u001e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"java", "Ljava/lang/Class;", "T", "Lkotlin/reflect/KClass;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaPrimitiveType", "", "getJavaPrimitiveType", "javaObjectType", "getJavaObjectType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "javaClass", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "annotationClass", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "declaringJavaClass", "E", "", "getDeclaringJavaClass$annotations", "(Ljava/lang/Enum;)V", "getDeclaringJavaClass", "(Ljava/lang/Enum;)Ljava/lang/Class;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class JvmClassMappingKt {
    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r0) {
    }

    public static /* synthetic */ void getJavaClass$annotations(KClass r0) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(KClass r0) {
    }

    public static final <T> Class<T> getJavaClass(KClass<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Class<T> r0 = (Class<T>) ((ClassBasedDeclarationContainer) r2).getJClass();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return r0;
    }

    public static final <T> Class<T> getJavaPrimitiveType(KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Class thisJClass = ((ClassBasedDeclarationContainer) r3).getJClass();
        if (thisJClass.isPrimitive() == false) goto L6;
        Intrinsics.checkNotNull(thisJClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
        return thisJClass;
    L6:
        String r1 = thisJClass.getName();
        if (r1 != null) goto L9;
    L47:
        return null;
    L9:
        switch(r1.hashCode()) {
            case -2056817302: goto L44;
            case -527879800: goto L40;
            case -515992664: goto L36;
            case 155276373: goto L32;
            case 344809556: goto L28;
            case 398507100: goto L24;
            case 398795216: goto L20;
            case 399092968: goto L16;
            case 761287205: goto L12;
            default: goto L47;
        };
    L12:
        if (r1.equals("java.lang.Double") == false) goto L47;
        return Double.TYPE;
    L16:
        if (r1.equals("java.lang.Void") == false) goto L47;
        return Void.TYPE;
    L20:
        if (r1.equals("java.lang.Long") == false) goto L47;
        return Long.TYPE;
    L24:
        if (r1.equals("java.lang.Byte") == false) goto L47;
        return Byte.TYPE;
    L28:
        if (r1.equals("java.lang.Boolean") == false) goto L47;
        return Boolean.TYPE;
    L32:
        if (r1.equals("java.lang.Character") == false) goto L47;
        return Character.TYPE;
    L36:
        if (r1.equals("java.lang.Short") == false) goto L47;
        return Short.TYPE;
    L40:
        if (r1.equals("java.lang.Float") == false) goto L47;
        return Float.TYPE;
    L44:
        if (r1.equals("java.lang.Integer") == false) goto L47;
        return Integer.TYPE;
    }

    public static final <T> Class<T> getJavaObjectType(KClass<T> r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Class thisJClass = ((ClassBasedDeclarationContainer) r4).getJClass();
        if (thisJClass.isPrimitive() == true) goto L6;
        Intrinsics.checkNotNull(thisJClass, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return thisJClass;
    L6:
        String r1 = thisJClass.getName();
        if (r1 != null) goto L9;
        Class r2 = thisJClass;
    L48:
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return r2;
    L9:
        switch(r1.hashCode()) {
            case -1325958191: goto L44;
            case 104431: goto L40;
            case 3039496: goto L36;
            case 3052374: goto L32;
            case 3327612: goto L28;
            case 3625364: goto L24;
            case 64711720: goto L20;
            case 97526364: goto L16;
            case 109413500: goto L12;
            default: goto L50;
        };
    L50:
        r2 = thisJClass;
        goto L48
    L12:
        if (r1.equals("short") == false) goto L51;
        r2 = Short.class;
        goto L48
    L51:
        r2 = thisJClass;
        goto L48
    L16:
        if (r1.equals("float") == false) goto L52;
        r2 = Float.class;
        goto L48
    L52:
        r2 = thisJClass;
        goto L48
    L20:
        if (r1.equals("boolean") == false) goto L53;
        r2 = Boolean.class;
        goto L48
    L53:
        r2 = thisJClass;
        goto L48
    L24:
        if (r1.equals("void") == false) goto L54;
        r2 = Void.class;
        goto L48
    L54:
        r2 = thisJClass;
        goto L48
    L28:
        if (r1.equals("long") == false) goto L55;
        r2 = Long.class;
        goto L48
    L55:
        r2 = thisJClass;
        goto L48
    L32:
        if (r1.equals("char") == false) goto L56;
        r2 = Character.class;
        goto L48
    L56:
        r2 = thisJClass;
        goto L48
    L36:
        if (r1.equals("byte") == false) goto L57;
        r2 = Byte.class;
        goto L48
    L57:
        r2 = thisJClass;
        goto L48
    L40:
        if (r1.equals("int") == false) goto L58;
        r2 = Integer.class;
        goto L48
    L58:
        r2 = thisJClass;
        goto L48
    L44:
        if (r1.equals("double") == false) goto L59;
        r2 = Double.class;
        goto L48
    L59:
        r2 = thisJClass;
        goto L48
    }

    public static final <T> KClass<T> getKotlinClass(Class<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return Reflection.getOrCreateKotlinClass(r1);
    }

    public static final <T> Class<T> getJavaClass(T r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Class<T> r1 = (Class<T>) r3.getClass();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return r1;
    }

    public static final <T> Class<KClass<T>> getRuntimeClassOfKClassInstance(KClass<T> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Class<KClass<T>> r1 = (Class<KClass<T>>) r3.getClass();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return r1;
    }

    public static final /* synthetic */ boolean isArrayOf(Object[] $this$isArrayOf) {
        Intrinsics.checkNotNullParameter($this$isArrayOf, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return Object.class.isAssignableFrom($this$isArrayOf.getClass().getComponentType());
    }

    public static final <T extends Annotation> KClass<? extends T> getAnnotationClass(T r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Class<? extends Annotation> r0 = r2.annotationType();
        Intrinsics.checkNotNullExpressionValue(r0, "annotationType(...)");
        KClass<? extends T> r1 = getKotlinClass(r0);
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return r1;
    }

    private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(Enum<E> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Class<E> r0 = r2.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(r0, "getDeclaringClass(...)");
        return r0;
    }
}
