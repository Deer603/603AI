package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0007\u001a\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\f\u001a\u00020\u0002*\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\"$\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"capturedKClass", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getCapturedKClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getContextualDescriptor", "Lkotlinx/serialization/modules/SerializersModule;", "descriptor", "getPolymorphicDescriptors", "", "withContext", "context", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ContextAwareKt {
    @ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(SerialDescriptor r0) {
    }

    public static final KClass<?> getCapturedKClass(SerialDescriptor $this$capturedKClass) {
        Intrinsics.checkNotNullParameter($this$capturedKClass, "<this>");
        if (($this$capturedKClass instanceof ContextDescriptor) == false) goto L6;
        return ((ContextDescriptor) $this$capturedKClass).kClass;
    L6:
        if (($this$capturedKClass instanceof SerialDescriptorForNullable) == true) goto L11;
        return null;
    L11:
        return getCapturedKClass(((SerialDescriptorForNullable) $this$capturedKClass).getOriginal$kotlinx_serialization_core());
    }

    @ExperimentalSerializationApi
    public static final SerialDescriptor getContextualDescriptor(SerializersModule $this$getContextualDescriptor, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter($this$getContextualDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> r0 = getCapturedKClass(descriptor);
        if (r0 == null) goto L8;
        KSerializer r3 = SerializersModule.getContextual$default($this$getContextualDescriptor, r0, null, 2, null);
        if (r3 != null) goto L7;
        return null;
    L7:
        return r3.getDescriptor();
    L8:
        return null;
    }

    @ExperimentalSerializationApi
    public static final List<SerialDescriptor> getPolymorphicDescriptors(SerializersModule $this$getPolymorphicDescriptors, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter($this$getPolymorphicDescriptors, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> r0 = getCapturedKClass(descriptor);
        if (r0 == null) goto L5;
        Map<KClass<?>, KSerializer<?>> r1 = ((SerialModuleImpl) $this$getPolymorphicDescriptors).polyBase2Serializers.get(r0);
        if (r1 == null) goto L9;
        Iterable r2 = r1.values();
    L10:
        if (r2 != null) goto L12;
        r2 = CollectionsKt.emptyList();
    L12:
        Iterable $this$map$iv = r2;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r6 = $this$map$iv.iterator();
    L14:
        if (r6.hasNext() == false) goto L17;
        Object item$iv$iv = r6.next();
        KSerializer it = (KSerializer) item$iv$iv;
        destination$iv$iv.add(it.getDescriptor());
        goto L14
    L17:
        return (List) destination$iv$iv;
    L9:
        r2 = null;
        goto L10
    L5:
        return CollectionsKt.emptyList();
    }

    public static final SerialDescriptor withContext(SerialDescriptor $this$withContext, KClass<?> r2) {
        Intrinsics.checkNotNullParameter($this$withContext, "<this>");
        Intrinsics.checkNotNullParameter(r2, "context");
        return new ContextDescriptor($this$withContext, r2);
    }
}
