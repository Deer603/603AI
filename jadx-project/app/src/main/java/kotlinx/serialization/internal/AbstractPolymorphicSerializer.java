package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J%\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u001dR\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "baseClass", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "decodeSequentially", "compositeDecoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    public abstract KClass<T> getBaseClass();

    public static final /* synthetic */ Object access$decodeSequentially(AbstractPolymorphicSerializer $this, CompositeDecoder compositeDecoder) {
        return $this.decodeSequentially(compositeDecoder);
    }

    public AbstractPolymorphicSerializer() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T r13) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r13, "value");
        SerializationStrategy<? super T> r0 = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, r13);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginStructure(descriptor$iv);
        composite$iv.encodeStringElement(getDescriptor(), 0, r0.getDescriptor().getSerialName());
        SerialDescriptor r7 = getDescriptor();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        composite$iv.encodeSerializableElement(r7, 1, r0, r13);
        composite$iv.endStructure(descriptor$iv);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder r15) {
        Intrinsics.checkNotNullParameter(r15, "decoder");
        SerialDescriptor r0 = getDescriptor();
        CompositeDecoder r3 = r15.beginStructure(r0);
        Ref.ObjectRef r5 = new Ref.ObjectRef();
        if (r3.decodeSequentially() == false) goto L5;
        T r6 = (T) access$decodeSequentially(this, r3);
    L20:
        r3.endStructure(r0);
        return r6;
    L5:
        Object r13 = null;
    L6:
        int r7 = r3.decodeElementIndex(getDescriptor());
        switch(r7) {
            case -1: goto L18;
            case 0: goto L16;
            case 1: goto L11;
            default: goto L8;
        };
    L8:
        StringBuilder r8 = new StringBuilder().append("Invalid index in polymorphic deserialization of ");
        String r9 = (String) r5.element;
        if (r9 != null) goto L25;
        r9 = "unknown class";
    L25:
        throw new SerializationException(r8.append(r9).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ").append(r7).toString());
    L16:
        r5.element = (T) r3.decodeStringElement(getDescriptor(), r7);
        goto L6
    L18:
        if (r13 == null) goto L23;
        Intrinsics.checkNotNull(r13, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
        r6 = (T) r13;
        goto L20
    L23:
        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) r5.element)).toString());
    L11:
        T r10 = r5.element;
        if (r10 == null) goto L15;
        r5.element = r10;
        r13 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r3, getDescriptor(), r7, PolymorphicSerializerKt.findPolymorphicSerializer(this, r3, (String) r5.element), null, 8, null);
        goto L6
    L15:
        throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
    }

    private final T decodeSequentially(CompositeDecoder r9) {
        DeserializationStrategy r4 = PolymorphicSerializerKt.findPolymorphicSerializer(this, r9, r9.decodeStringElement(getDescriptor(), 0));
        return (T) CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r9, getDescriptor(), 1, r4, null, 8, null);
    }

    @InternalSerializationApi
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().getPolymorphic(getBaseClass(), klassName);
    }

    @InternalSerializationApi
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T r4) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r4, "value");
        return encoder.getSerializersModule().getPolymorphic(getBaseClass(), r4);
    }
}
