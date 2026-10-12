package kotlinx.serialization.modules;

import androidx.autofill.HintConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.internal.PlatformKt;

/* JADX INFO: compiled from: SerializersModuleBuilders.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001a0\tH\u0016JQ\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062/\u0010\u001e\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b( \u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000bH\u0016JF\u0010!\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b\"\b\b\u0001\u0010#*\u0002H\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H#0\tH\u0016JK\u0010'\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062)\u0010(\u001a%\u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b()\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\f0\u000bH\u0016JM\u0010*\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062+\u0010+\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\u00140\u000bH\u0016J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J2\u0010/\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0017H\u0001JS\u00102\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062)\u0010(\u001a%\u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b()\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\f0\u000b2\u0006\u00101\u001a\u00020\u0017H\u0001JU\u00103\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062+\u0010+\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\u00140\u000b2\u0006\u00101\u001a\u00020\u0017H\u0001JP\u00104\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b\"\b\b\u0001\u0010#*\u0002H\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u0002H#0\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u0002H#0\t2\b\b\u0002\u00101\u001a\u00020\u0017H\u0001J\b\u00107\u001a\u00020.H\u0001R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u000bj\u0006\u0012\u0002\b\u0003`\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RI\u0010\u0010\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u000bj\u0006\u0012\u0002\b\u0003`\u00150\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "class2ContextualProvider", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "polyBase2Serializers", "Lkotlinx/serialization/KSerializer;", "polyBase2DefaultSerializerProvider", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2NamedSerializers", "", "polyBase2DefaultDeserializerProvider", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "hasInterfaceContextualSerializers", "", "contextual", "", "T", "", "kClass", "serializer", "provider", "", "typeArgumentsSerializers", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "polymorphicDefaultDeserializer", "defaultDeserializerProvider", "include", "module", "Lkotlinx/serialization/modules/SerializersModule;", "registerSerializer", "forClass", "allowOverwrite", "registerDefaultPolymorphicSerializer", "registerDefaultPolymorphicDeserializer", "registerPolymorphicSerializer", "concreteClass", "concreteSerializer", "build", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    private final Map<KClass<?>, ContextualProvider> class2ContextualProvider;
    private boolean hasInterfaceContextualSerializers;
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void polymorphicDefault(KClass<Base> r1, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> r2) {
        SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, r1, r2);
    }

    public SerializersModuleBuilder() {
        this.class2ContextualProvider = new HashMap();
        this.polyBase2Serializers = new HashMap();
        this.polyBase2DefaultSerializerProvider = new HashMap();
        this.polyBase2NamedSerializers = new HashMap();
        this.polyBase2DefaultDeserializerProvider = new HashMap();
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> r8, KSerializer<T> r9) {
        Intrinsics.checkNotNullParameter(r8, "kClass");
        Intrinsics.checkNotNullParameter(r9, "serializer");
        registerSerializer$default(this, r8, new ContextualProvider.Argless(r9), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> r8, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> r9) {
        Intrinsics.checkNotNullParameter(r8, "kClass");
        Intrinsics.checkNotNullParameter(r9, "provider");
        registerSerializer$default(this, r8, new ContextualProvider.WithTypeArguments(r9), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(KClass<Base> r9, KClass<Sub> r10, KSerializer<Sub> r11) {
        Intrinsics.checkNotNullParameter(r9, "baseClass");
        Intrinsics.checkNotNullParameter(r10, "actualClass");
        Intrinsics.checkNotNullParameter(r11, "actualSerializer");
        registerPolymorphicSerializer$default(this, r9, r10, r11, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(KClass<Base> r2, Function1<? super Base, ? extends SerializationStrategy<? super Base>> r3) {
        Intrinsics.checkNotNullParameter(r2, "baseClass");
        Intrinsics.checkNotNullParameter(r3, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(r2, r3, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(KClass<Base> r2, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> r3) {
        Intrinsics.checkNotNullParameter(r2, "baseClass");
        Intrinsics.checkNotNullParameter(r3, "defaultDeserializerProvider");
        registerDefaultPolymorphicDeserializer(r2, r3, false);
    }

    public final void include(SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder r0, KClass r1, ContextualProvider r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = false;
    L5:
        r0.registerSerializer(r1, r2, r3);
    }

    public final <T> void registerSerializer(KClass<T> r5, ContextualProvider provider, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(r5, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (allowOverwrite == true) goto L11;
        ContextualProvider previous = this.class2ContextualProvider.get(r5);
        if (previous == null) goto L11;
        if (Intrinsics.areEqual(previous, provider) == true) goto L11;
        throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + r5 + " already registered in this module");
    L11:
        this.class2ContextualProvider.put(r5, provider);
        if (PlatformKt.isInterface(r5) == false) goto L15;
        this.hasInterfaceContextualSerializers = true;
        return;
    }

    public final <Base> void registerDefaultPolymorphicSerializer(KClass<Base> r5, Function1<? super Base, ? extends SerializationStrategy<? super Base>> r6, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(r5, "baseClass");
        Intrinsics.checkNotNullParameter(r6, "defaultSerializerProvider");
        Function1<?, SerializationStrategy<?>> r0 = this.polyBase2DefaultSerializerProvider.get(r5);
        if (r0 != null) goto L5;
    L10:
        this.polyBase2DefaultSerializerProvider.put(r5, r6);
        return;
    L5:
        if (Intrinsics.areEqual(r0, r6) == true) goto L10;
        if (allowOverwrite == true) goto L10;
        throw new IllegalArgumentException("Default serializers provider for " + r5 + " is already registered: " + r0);
    }

    public final <Base> void registerDefaultPolymorphicDeserializer(KClass<Base> r5, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> r6, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(r5, "baseClass");
        Intrinsics.checkNotNullParameter(r6, "defaultDeserializerProvider");
        Function1<String, DeserializationStrategy<?>> r0 = this.polyBase2DefaultDeserializerProvider.get(r5);
        if (r0 != null) goto L5;
    L10:
        this.polyBase2DefaultDeserializerProvider.put(r5, r6);
        return;
    L5:
        if (Intrinsics.areEqual(r0, r6) == true) goto L10;
        if (allowOverwrite == true) goto L10;
        throw new IllegalArgumentException("Default deserializers provider for " + r5 + " is already registered: " + r0);
    }

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder r0, KClass r1, KClass r2, KSerializer r3, boolean r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = false;
    L5:
        r0.registerPolymorphicSerializer(r1, r2, r3, r4);
    }

    public final <Base, Sub extends Base> void registerPolymorphicSerializer(KClass<Base> r11, KClass<Sub> r12, KSerializer<Sub> r13, boolean allowOverwrite) {
        Intrinsics.checkNotNullParameter(r11, "baseClass");
        Intrinsics.checkNotNullParameter(r12, "concreteClass");
        Intrinsics.checkNotNullParameter(r13, "concreteSerializer");
        String name = r13.getDescriptor().getSerialName();
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> r1 = this.polyBase2Serializers;
        Map<KClass<?>, KSerializer<?>> r3 = r1.get(r11);
        if (r3 != null) goto L5;
        Map<KClass<?>, KSerializer<?>> r6 = new HashMap();
        r1.put(r11, r6);
    L6:
        Map<KClass<?>, KSerializer<?>> r2 = r6;
        KSerializer<?> r4 = r2.get(r12);
        Map<KClass<?>, Map<String, KSerializer<?>>> r5 = this.polyBase2NamedSerializers;
        Map<String, KSerializer<?>> r7 = r5.get(r11);
        if (r7 != null) goto L9;
        Map<String, KSerializer<?>> r8 = new HashMap();
        r5.put(r11, r8);
    L10:
        Map<String, KSerializer<?>> r9 = r8;
        if (allowOverwrite == false) goto L16;
        if (r4 == null) goto L14;
        r9.remove(r4.getDescriptor().getSerialName());
    L14:
        r2.put(r12, r13);
        r9.put(name, r13);
        return;
    L16:
        if (r4 != null) goto L18;
    L22:
        KSerializer<?> r10 = r9.get(name);
        if (r10 == null) goto L36;
        Map<KClass<?>, KSerializer<?>> r14 = this.polyBase2Serializers.get(r11);
        Intrinsics.checkNotNull(r14);
        Iterator r15 = MapsKt.asSequence(r14).iterator();
    L26:
        if (r15.hasNext() == false) goto L33;
        Object r16 = r15.next();
        Map.Entry it = (Map.Entry) r16;
        if (it.getValue() != r10) goto L30;
        boolean r17 = true;
    L31:
        if (r17 == false) goto L26;
    L34:
        Map.Entry conflictingClass = (Map.Entry) r16;
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + r11 + "' have the same serial name '" + name + "': '" + r12 + "' and '" + conflictingClass + '\'');
    L30:
        r17 = false;
        goto L31
    L33:
        r16 = null;
        goto L34
    L36:
        r2.put(r12, r13);
        r9.put(name, r13);
        return;
    L18:
        if (Intrinsics.areEqual(r4, r13) == false) goto L21;
        KSerializer<?> r18 = r9.remove(r4.getDescriptor().getSerialName());
        goto L22
    L21:
        throw new SerializerAlreadyRegisteredException(r11, r12);
    L9:
        r8 = r7;
        goto L10
    L5:
        r6 = r3;
        goto L6
    }

    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }
}
