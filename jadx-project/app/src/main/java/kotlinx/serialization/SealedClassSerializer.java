package kotlinx.serialization;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BI\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\t\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\u0004\b\f\u0010\u0010J\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0016J%\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001b\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "T", "", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "serialName", "", "baseClass", "Lkotlin/reflect/KClass;", "subclasses", "", "subclassSerializers", "Lkotlinx/serialization/KSerializer;", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V", "classAnnotations", "", "(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "getBaseClass", "()Lkotlin/reflect/KClass;", "_annotations", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "class2Serializer", "", "serialName2Serializer", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final KClass<T> baseClass;
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
    private final Lazy descriptor$delegate;
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    public SealedClassSerializer(final String serialName, KClass<T> r19, KClass<? extends T>[] r20, KSerializer<? extends T>[] r21) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r19, "baseClass");
        Intrinsics.checkNotNullParameter(r20, "subclasses");
        Intrinsics.checkNotNullParameter(r21, "subclassSerializers");
        this.baseClass = r19;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new SealedClassSerializer$$ExternalSyntheticLambda0(serialName, this));
        if (r20.length != r21.length) goto L22;
        this.class2Serializer = MapsKt.toMap(ArraysKt.zip(r20, r21));
        final Iterable $this$groupingBy$iv = this.class2Serializer.entrySet();
        Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> r7 = new SealedClassSerializer$special$$inlined$groupingBy$1($this$groupingBy$iv);
        Map $this$mapValues$iv = new LinkedHashMap();
        Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> r10 = r7.sourceIterator();
    L6:
        if (r10.hasNext() == false) goto L15;
        Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> r11 = r10.next();
        String r12 = r7.keyOf(r11);
        Object accumulator$iv$iv = $this$mapValues$iv.get(r12);
        if (accumulator$iv$iv != null) goto L10;
        $this$mapValues$iv.containsKey(r12);
    L10:
        Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> r14 = r11;
        Map.Entry accumulator = (Map.Entry) accumulator$iv$iv;
        String key = r12;
        if (accumulator != null) goto L14;
        $this$mapValues$iv.put(r12, r14);
        goto L6
    L14:
        throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + key + "': '" + accumulator.getKey() + "', '" + r14.getKey() + '\'').toString());
    L15:
        Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValues$iv.size()));
        Iterable $this$associateByTo$iv$iv$iv = $this$mapValues$iv.entrySet();
        Iterator<T> r9 = $this$associateByTo$iv$iv$iv.iterator();
    L17:
        if (r9.hasNext() == false) goto L19;
        Object element$iv$iv$iv = r9.next();
        Map.Entry it$iv$iv = (Map.Entry) element$iv$iv$iv;
        Map.Entry it = (Map.Entry) element$iv$iv$iv;
        destination$iv$iv.put(it$iv$iv.getKey(), (KSerializer) ((Map.Entry) it.getValue()).getValue());
        goto L17
    L19:
        this.serialName2Serializer = destination$iv$iv;
        return;
    L22:
        throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
    }

    public SealedClassSerializer(String serialName, KClass<T> r3, KClass<? extends T>[] r4, KSerializer<? extends T>[] r5, Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r3, "baseClass");
        Intrinsics.checkNotNullParameter(r4, "subclasses");
        Intrinsics.checkNotNullParameter(r5, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this(serialName, r3, r4, r5);
        this._annotations = ArraysKt.asList(classAnnotations);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    static final SerialDescriptor descriptor_delegate$lambda$3(String $serialName, final SealedClassSerializer this$0) {
        return SerialDescriptorsKt.buildSerialDescriptor($serialName, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new SealedClassSerializer$$ExternalSyntheticLambda1(this$0));
    }

    static final Unit descriptor_delegate$lambda$3$lambda$2(final SealedClassSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        SerialDescriptor elementDescriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + this$0.getBaseClass().getSimpleName() + Typography.greater, SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new SealedClassSerializer$$ExternalSyntheticLambda2(this$0));
        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", elementDescriptor, null, false, 12, null);
        $this$buildSerialDescriptor.setAnnotations(this$0._annotations);
        return Unit.INSTANCE;
    }

    static final Unit descriptor_delegate$lambda$3$lambda$2$lambda$1(SealedClassSerializer this$0, ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
        Iterator<Map.Entry<String, KSerializer<? extends T>>> r2 = this$0.serialName2Serializer.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L7;
        Map.Entry<String, KSerializer<? extends T>> r3 = r2.next();
        String name = r3.getKey();
        ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, name, r3.getValue().getDescriptor(), null, false, 12, null);
        goto L4
    L7:
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> r0 = this.serialName2Serializer.get(klassName);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return super.findPolymorphicSerializerOrNull(decoder, klassName);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T r4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r4, "value");
        KSerializer<? extends T> r0 = this.class2Serializer.get(Reflection.getOrCreateKotlinClass(r4.getClass()));
        if (r0 == null) goto L5;
        KSerializer<? extends T> r1 = r0;
    L6:
        if (r1 != null) goto L10;
        return null;
    L10:
        return r1;
    L5:
        r1 = super.findPolymorphicSerializerOrNull(encoder, r4);
        goto L6
    }
}
