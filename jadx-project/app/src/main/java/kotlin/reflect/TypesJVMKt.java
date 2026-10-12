package kotlin.reflect;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u000f8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "computeJavaType", "forceWrapper", "", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "typeToString", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[KVariance.values().length];
            r0[KVariance.IN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[KVariance.INVARIANT.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[KVariance.OUT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ Type access$computeJavaType(KType $receiver, boolean forceWrapper) {
        return computeJavaType($receiver, forceWrapper);
    }

    public static final /* synthetic */ String access$typeToString(Type type) {
        return typeToString(type);
    }

    public static /* synthetic */ void getJavaType$annotations(KType r0) {
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection r0) {
    }

    public static final Type getJavaType(KType $this$javaType) {
        Intrinsics.checkNotNullParameter($this$javaType, "<this>");
        if (($this$javaType instanceof KTypeBase) == false) goto L9;
        Type it = ((KTypeBase) $this$javaType).getJavaType();
        if (it == null) goto L9;
        return it;
    L9:
        return computeJavaType$default($this$javaType, false, 1, null);
    }

    static /* synthetic */ Type computeJavaType$default(KType r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        return computeJavaType(r0, r1);
    }

    private static final Type computeJavaType(KType $this$computeJavaType, boolean forceWrapper) {
        KClassifier classifier = $this$computeJavaType.getClassifier();
        if ((classifier instanceof KTypeParameter) == false) goto L7;
        return new TypeVariableImpl((KTypeParameter) classifier);
    L7:
        if ((classifier instanceof KClass) == false) goto L42;
        KClass r1 = (KClass) classifier;
        if (forceWrapper == false) goto L11;
        Class jClass = JvmClassMappingKt.getJavaObjectType(r1);
    L12:
        List<KTypeProjection> r2 = $this$computeJavaType.getArguments();
        if (r2.isEmpty() == false) goto L17;
        return jClass;
    L17:
        if (jClass.isArray() == false) goto L40;
        if (jClass.getComponentType().isPrimitive() == true) goto L21;
        KTypeProjection r3 = (KTypeProjection) CollectionsKt.singleOrNull(r2);
        if (r3 == null) goto L38;
        KVariance variance = r3.component1();
        KType elementType = r3.component2();
        if (variance != null) goto L27;
        int r5 = -1;
    L28:
        switch(r5) {
            case -1: goto L36;
            case 0: goto L30;
            case 1: goto L36;
            case 2: goto L31;
            case 3: goto L31;
            default: goto L30;
        };
    L31:
        Intrinsics.checkNotNull(elementType);
        Type javaElementType = computeJavaType$default(elementType, false, 1, null);
        if ((javaElementType instanceof Class) == false) goto L44;
        return jClass;
    L44:
        return new GenericArrayTypeImpl(javaElementType);
    L30:
        throw new NoWhenBranchMatchedException();
    L36:
        return jClass;
    L27:
        r5 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        goto L28
    L38:
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + $this$computeJavaType);
    L21:
        return jClass;
    L40:
        return createPossiblyInnerType(jClass, r2);
    L11:
        jClass = JvmClassMappingKt.getJavaClass(r1);
        goto L12
    L42:
        throw new UnsupportedOperationException("Unsupported type classifier: " + $this$computeJavaType);
    }

    private static final Type createPossiblyInnerType(Class<?> r12, List<KTypeProjection> r13) {
        Class<?> r0 = r12.getDeclaringClass();
        if (r0 != null) goto L11;
        List<KTypeProjection> $this$map$iv = r13;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r5 = $this$map$iv.iterator();
    L6:
        if (r5.hasNext() == false) goto L9;
        Object item$iv$iv = r5.next();
        KTypeProjection p0 = (KTypeProjection) item$iv$iv;
        destination$iv$iv.add(getJavaType(p0));
        goto L6
    L9:
        return new ParameterizedTypeImpl(r12, null, (List) destination$iv$iv);
    L11:
        if (Modifier.isStatic(r12.getModifiers()) == false) goto L18;
        Class<?> r2 = r0;
        List<KTypeProjection> $this$map$iv2 = r13;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        Iterator r7 = $this$map$iv2.iterator();
    L14:
        if (r7.hasNext() == false) goto L17;
        Object item$iv$iv2 = r7.next();
        KTypeProjection p1 = (KTypeProjection) item$iv$iv2;
        destination$iv$iv2.add(getJavaType(p1));
        goto L14
    L17:
        return new ParameterizedTypeImpl(r12, r2, (List) destination$iv$iv2);
    L18:
        int n = r12.getTypeParameters().length;
        Type r3 = createPossiblyInnerType(r0, r13.subList(n, r13.size()));
        Iterable $this$map$iv3 = r13.subList(0, n);
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv3, 10));
        Iterator r8 = $this$map$iv3.iterator();
    L20:
        if (r8.hasNext() == false) goto L23;
        Object item$iv$iv3 = r8.next();
        KTypeProjection p2 = (KTypeProjection) item$iv$iv3;
        destination$iv$iv3.add(getJavaType(p2));
        goto L20
    L23:
        return new ParameterizedTypeImpl(r12, r3, (List) destination$iv$iv3);
    }

    private static final Type getJavaType(KTypeProjection $this$javaType) {
        KVariance variance = $this$javaType.getVariance();
        if (variance == null) goto L5;
        KType type = $this$javaType.getType();
        Intrinsics.checkNotNull(type);
        switch(WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
            case 1: goto L13;
            case 2: goto L15;
            case 3: goto L14;
            default: goto L9;
        };
    L9:
        throw new NoWhenBranchMatchedException();
    L14:
        return new WildcardTypeImpl(computeJavaType(type, true), null);
    L15:
        return computeJavaType(type, true);
    L13:
        return new WildcardTypeImpl(null, computeJavaType(type, true));
    L5:
        return WildcardTypeImpl.Companion.getSTAR();
    }

    private static final String typeToString(Type type) {
        if ((type instanceof Class) == false) goto L9;
        if (((Class) type).isArray() == false) goto L7;
        Sequence unwrap = SequencesKt.generateSequence(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) SequencesKt.last(unwrap)).getName() + StringsKt.repeat("[]", SequencesKt.count(unwrap));
    L7:
        String r0 = ((Class) type).getName();
        Intrinsics.checkNotNullExpressionValue(r0, "getName(...)");
        return r0;
    L9:
        return type.toString();
    }
}
