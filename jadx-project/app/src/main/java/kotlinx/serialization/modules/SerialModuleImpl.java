package kotlinx.serialization.modules;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Bî\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012*\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012.\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003\u0012&\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012A\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\n\"\b\b\u0000\u0010\u001b*\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0\u00042\u0006\u0010\u001e\u001a\u0002H\u001bH\u0016¢\u0006\u0002\u0010\u001fJ4\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u0012\"\b\b\u0000\u0010\u001b*\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0\u00042\b\u0010 \u001a\u0004\u0018\u00010\rH\u0016J:\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u0007\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\u0010\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R6\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RI\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "class2ContextualFactory", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "polyBase2Serializers", "Lkotlinx/serialization/KSerializer;", "polyBase2DefaultSerializerProvider", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2NamedSerializers", "", "polyBase2DefaultDeserializerProvider", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "hasInterfaceContextualSerializers", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "getPolymorphic", "T", "", "baseClass", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "getContextual", "kClass", "typeArgumentsSerializers", "", "dumpTo", "", "collector", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerialModuleImpl extends SerializersModule {
    private final Map<KClass<?>, ContextualProvider> class2ContextualFactory;
    private final boolean hasInterfaceContextualSerializers;
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;

    @Override // kotlinx.serialization.modules.SerializersModule
    public boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core() {
        return this.hasInterfaceContextualSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerialModuleImpl(Map<KClass<?>, ? extends ContextualProvider> r2, Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> r3, Map<KClass<?>, ? extends Function1<?, ? extends SerializationStrategy<?>>> r4, Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> r5, Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> r6, boolean hasInterfaceContextualSerializers) {
        Intrinsics.checkNotNullParameter(r2, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(r3, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(r4, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(r5, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(r6, "polyBase2DefaultDeserializerProvider");
        super(null);
        this.class2ContextualFactory = r2;
        this.polyBase2Serializers = r3;
        this.polyBase2DefaultSerializerProvider = r4;
        this.polyBase2NamedSerializers = r5;
        this.polyBase2DefaultDeserializerProvider = r6;
        this.hasInterfaceContextualSerializers = hasInterfaceContextualSerializers;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> SerializationStrategy<T> getPolymorphic(KClass<? super T> r5, T r6) {
        Intrinsics.checkNotNullParameter(r5, "baseClass");
        Intrinsics.checkNotNullParameter(r6, "value");
        if (r5.isInstance(r6) == true) goto L5;
        return null;
    L5:
        Map<KClass<?>, KSerializer<?>> r0 = this.polyBase2Serializers.get(r5);
        if (r0 == null) goto L8;
        SerializationStrategy r1 = (KSerializer) r0.get(Reflection.getOrCreateKotlinClass(r6.getClass()));
    L10:
        if ((r1 instanceof SerializationStrategy) == false) goto L12;
        SerializationStrategy registered = r1;
    L13:
        if (registered == null) goto L15;
        return registered;
    L15:
        Function1<?, SerializationStrategy<?>> r2 = this.polyBase2DefaultSerializerProvider.get(r5);
        if (TypeIntrinsics.isFunctionOfArity(r2, 1) == false) goto L18;
        Function1<?, SerializationStrategy<?>> r3 = r2;
    L19:
        if (r3 != null) goto L21;
        return null;
    L21:
        return (SerializationStrategy) r3.invoke(r6);
    L18:
        r3 = null;
        goto L19
    L12:
        registered = null;
        goto L13
    L8:
        r1 = null;
        goto L10
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> DeserializationStrategy<T> getPolymorphic(KClass<? super T> r5, String serializedClassName) {
        Intrinsics.checkNotNullParameter(r5, "baseClass");
        Map<String, KSerializer<?>> r0 = this.polyBase2NamedSerializers.get(r5);
        if (r0 == null) goto L5;
        KSerializer<?> r1 = r0.get(serializedClassName);
    L7:
        if ((r1 instanceof KSerializer) == true) goto L10;
        r1 = null;
    L10:
        if (r1 != null) goto L12;
        Function1<String, DeserializationStrategy<?>> r2 = this.polyBase2DefaultDeserializerProvider.get(r5);
        if (TypeIntrinsics.isFunctionOfArity(r2, 1) == false) goto L16;
        Function1<String, DeserializationStrategy<?>> r3 = r2;
    L17:
        if (r3 != null) goto L19;
        return null;
    L19:
        return (DeserializationStrategy) r3.invoke(serializedClassName);
    L16:
        r3 = null;
        goto L17
    L12:
        return r1;
    L5:
        r1 = null;
        goto L7
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> KSerializer<T> getContextual(KClass<T> r4, List<? extends KSerializer<?>> r5) {
        Intrinsics.checkNotNullParameter(r4, "kClass");
        Intrinsics.checkNotNullParameter(r5, "typeArgumentsSerializers");
        ContextualProvider r0 = this.class2ContextualFactory.get(r4);
        if (r0 == null) goto L5;
        KSerializer<?> r1 = r0.invoke(r5);
    L7:
        if ((r1 instanceof KSerializer) == true) goto L9;
        return null;
    L9:
        return (KSerializer<T>) r1;
    L5:
        r1 = null;
        goto L7
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public void dumpTo(SerializersModuleCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Iterator<Map.Entry<KClass<?>, ContextualProvider>> r4 = this.class2ContextualFactory.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L14;
        Map.Entry<KClass<?>, ContextualProvider> r5 = r4.next();
        KClass<?> r8 = r5.getKey();
        ContextualProvider serial = r5.getValue();
        if ((serial instanceof ContextualProvider.Argless) == true) goto L7;
        if ((serial instanceof ContextualProvider.WithTypeArguments) == false) goto L13;
        collector.contextual(r8, ((ContextualProvider.WithTypeArguments) serial).getProvider());
        goto L4
    L13:
        throw new NoWhenBranchMatchedException();
    L7:
        Intrinsics.checkNotNull(r8, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<?> r6 = ((ContextualProvider.Argless) serial).getSerializer();
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        collector.contextual(r8, r6);
        goto L4
    L14:
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> r2 = this.polyBase2Serializers;
        int $i$f$forEach = 0;
        Iterator<Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>>> r7 = r2.entrySet().iterator();
    L16:
        if (r7.hasNext() == false) goto L22;
        Map.Entry<KClass<?>, Map<KClass<?>, KSerializer<?>>> r9 = r7.next();
        KClass<?> r10 = r9.getKey();
        Iterator<Map.Entry<KClass<?>, KSerializer<?>>> r12 = r9.getValue().entrySet().iterator();
    L19:
        if (r12.hasNext() == false) goto L16;
        Map.Entry<KClass<?>, KSerializer<?>> r13 = r12.next();
        KClass<?> r15 = r13.getKey();
        KSerializer<?> r16 = r13.getValue();
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        Intrinsics.checkNotNull(r15, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        Intrinsics.checkNotNull(r16, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        collector.polymorphic(r10, r15, r16);
        r2 = r2;
        $i$f$forEach = $i$f$forEach;
        goto L19
    L22:
        Iterator<Map.Entry<KClass<?>, Function1<?, SerializationStrategy<?>>>> r11 = this.polyBase2DefaultSerializerProvider.entrySet().iterator();
    L24:
        if (r11.hasNext() == false) goto L26;
        Map.Entry<KClass<?>, Function1<?, SerializationStrategy<?>>> r14 = r11.next();
        KClass<?> r17 = r14.getKey();
        Function1<?, SerializationStrategy<?>> r18 = r14.getValue();
        Intrinsics.checkNotNull(r17, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        Intrinsics.checkNotNull(r18, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
        collector.polymorphicDefaultSerializer(r17, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r18, 1));
        goto L24
    L26:
        Iterator<Map.Entry<KClass<?>, Function1<String, DeserializationStrategy<?>>>> r19 = this.polyBase2DefaultDeserializerProvider.entrySet().iterator();
    L28:
        if (r19.hasNext() == false) goto L31;
        Map.Entry<KClass<?>, Function1<String, DeserializationStrategy<?>>> r20 = r19.next();
        KClass<?> r21 = r20.getKey();
        Function1<String, DeserializationStrategy<?>> r110 = r20.getValue();
        Intrinsics.checkNotNull(r21, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        Intrinsics.checkNotNull(r110, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
        collector.polymorphicDefaultDeserializer(r21, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r110, 1));
        goto L28
    }
}
