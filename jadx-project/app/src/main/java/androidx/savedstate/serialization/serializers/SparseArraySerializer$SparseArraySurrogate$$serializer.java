package androidx.savedstate.serialization.serializers;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003J\u0015\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements GeneratedSerializer<SparseArraySerializer.SparseArraySurrogate<T>> {
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer<?> typeSerial0;

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        PluginGeneratedSerialDescriptor r0 = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        r0.addElement("keys", false);
        r0.addElement("values", false);
        this.descriptor = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(KSerializer<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "typeSerial0");
        this();
        this.typeSerial0 = r2;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{SparseArraySerializer.SparseArraySurrogate.access$get$childSerializers$cp()[0].getValue(), new ArrayListSerializer(this.typeSerial0)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor r0 = this.descriptor;
        CompositeDecoder r1 = decoder.beginStructure(r0);
        Lazy[] r2 = SparseArraySerializer.SparseArraySurrogate.access$get$childSerializers$cp();
        if (r1.decodeSequentially() == false) goto L5;
        List r3 = (List) r1.decodeSerializableElement(r0, 0, (DeserializationStrategy) r2[0].getValue(), null);
        List r4 = (List) r1.decodeSerializableElement(r0, 1, new ArrayListSerializer(this.typeSerial0), null);
        int r5 = 3;
    L15:
        r1.endStructure(r0);
        return new SparseArraySerializer.SparseArraySurrogate(r5, r3, r4, null);
    L5:
        boolean r9 = true;
        int r8 = 0;
        List r6 = null;
        List r7 = null;
    L6:
        if (r9 == false) goto L14;
        int r10 = r1.decodeElementIndex(r0);
        switch(r10) {
            case -1: goto L13;
            case 0: goto L12;
            case 1: goto L11;
            default: goto L10;
        };
    L10:
        throw new UnknownFieldException(r10);
    L12:
        r6 = (List) r1.decodeSerializableElement(r0, 0, (DeserializationStrategy) r2[0].getValue(), r6);
        r8 = r8 | 1;
        goto L6
    L13:
        r9 = false;
        goto L6
    L11:
        r7 = (List) r1.decodeSerializableElement(r0, 1, new ArrayListSerializer(this.typeSerial0), r7);
        r8 = r8 | 2;
        goto L6
    L14:
        r3 = r6;
        r4 = r7;
        r5 = r8;
        goto L15
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    public final void serialize(Encoder encoder, SparseArraySerializer.SparseArraySurrogate<T> r5) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r5, "value");
        SerialDescriptor r0 = this.descriptor;
        CompositeEncoder r1 = encoder.beginStructure(r0);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(r5, r1, r0, this.typeSerial0);
        r1.endStructure(r0);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (SparseArraySerializer.SparseArraySurrogate) value);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }
}
