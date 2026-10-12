package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u000bH\u0081\b\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\r\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\rH\u0081\b\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e\"\u0004\b\u0000\u0010\f*\u0006\u0012\u0002\b\u00030\u000eH\u0081\b\u001a\u0010\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0000\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\u00020\u0016H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0018H\u0000\u001a6\u0010\u0019\u001a\u00020\u001a\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\f0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0080\bø\u0001\u0000\"\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"cachedSerialNames", "", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "EMPTY_DESCRIPTOR_ARRAY", "", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "compactArray", "", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "cast", "Lkotlinx/serialization/KSerializer;", "T", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/DeserializationStrategy;", "serializerNotRegistered", "", "Lkotlin/reflect/KClass;", "notRegisteredMessage", "className", "kclass", "", "Lkotlin/reflect/KType;", "typeOrThrow", "Lkotlin/reflect/KTypeProjection;", "elementsHashCodeBy", "", "K", "", "selector", "Lkotlin/Function1;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = null;

    public static final Set<String> cachedSerialNames(SerialDescriptor $this$cachedSerialNames) {
        Intrinsics.checkNotNullParameter($this$cachedSerialNames, "<this>");
        if (($this$cachedSerialNames instanceof CachedNames) == true) goto L5;
        HashSet result = new HashSet($this$cachedSerialNames.getElementsCount());
        int i = 0;
        int r2 = $this$cachedSerialNames.getElementsCount();
    L7:
        if (i >= r2) goto L10;
        result.add($this$cachedSerialNames.getElementName(i));
        i = i + 1;
        goto L7
    L10:
        return result;
    L5:
        return ((CachedNames) $this$cachedSerialNames).getSerialNames();
    }

    static {
        EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];
    }

    public static final SerialDescriptor[] compactArray(List<? extends SerialDescriptor> r4) {
        List<? extends SerialDescriptor> r2 = r4;
        if (r2 != null) goto L5;
    L8:
        boolean r3 = true;
    L9:
        if (r3 == true) goto L11;
        Collection r0 = r4;
    L12:
        if (r0 == null) goto L16;
        Collection $this$toTypedArray$iv = r0;
        SerialDescriptor[] r1 = (SerialDescriptor[]) $this$toTypedArray$iv.toArray(new SerialDescriptor[0]);
        if (r1 == null) goto L16;
        return r1;
    L16:
        return EMPTY_DESCRIPTOR_ARRAY;
    L11:
        r0 = null;
        goto L12
    L5:
        if (r2.isEmpty() == true) goto L8;
        r3 = false;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> KSerializer<T> cast(KSerializer<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> SerializationStrategy<T> cast(SerializationStrategy<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> DeserializationStrategy<T> cast(DeserializationStrategy<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1;
    }

    public static final Void serializerNotRegistered(KClass<?> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        throw new SerializationException(notRegisteredMessage(r2));
    }

    public static final String notRegisteredMessage(KClass<?> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        String r0 = r1.getSimpleName();
        if (r0 != null) goto L6;
        r0 = "<local class name not available>";
    L6:
        return notRegisteredMessage(r0);
    }

    public static final String notRegisteredMessage(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final KClass<Object> kclass(KType $this$kclass) {
        Intrinsics.checkNotNullParameter($this$kclass, "<this>");
        KClassifier t = $this$kclass.getClassifier();
        if ((t instanceof KClass) == false) goto L7;
        return (KClass) t;
    L7:
        if ((t instanceof KTypeParameter) == false) goto L11;
        throw new IllegalArgumentException("Captured type parameter " + t + " from generic non-reified function. Such functionality cannot be supported because " + t + " is erased, either specify serializer explicitly or make calling function inline with reified " + t + '.');
    L11:
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + t);
    }

    public static final KType typeOrThrow(KTypeProjection $this$typeOrThrow) {
        Intrinsics.checkNotNullParameter($this$typeOrThrow, "<this>");
        KType r0 = $this$typeOrThrow.getType();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + $this$typeOrThrow.getType()).toString());
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> r12, Function1<? super T, ? extends K> r13) {
        Intrinsics.checkNotNullParameter(r12, "<this>");
        Intrinsics.checkNotNullParameter(r13, "selector");
        int accumulator$iv = 1;
        Iterator<? extends T> r5 = r12.iterator();
    L4:
        if (r5.hasNext() == false) goto L11;
        Object element$iv = r5.next();
        int hash = accumulator$iv;
        int r10 = hash * 31;
        K r11 = r13.invoke(element$iv);
        if (r11 == null) goto L8;
        int r14 = r11.hashCode();
    L9:
        accumulator$iv = r10 + r14;
        goto L4
    L8:
        r14 = 0;
        goto L9
    L11:
        return accumulator$iv;
    }
}
