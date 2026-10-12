package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0011\u001a\u00028\u00022\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00028\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00028\u0000*\u00028\u0002X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00028\u0001*\u00028\u0002X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "key", "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "getValue", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {
    private final KSerializer<K> keySerializer;
    private final KSerializer<V> valueSerializer;

    public /* synthetic */ KeyValueSerializer(KSerializer r1, KSerializer r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    protected abstract K getKey(R r1);

    protected abstract V getValue(R r1);

    protected abstract R toResult(K r1, V r2);

    private KeyValueSerializer(KSerializer<K> r1, KSerializer<V> r2) {
        this.keySerializer = r1;
        this.valueSerializer = r2;
    }

    protected final KSerializer<K> getKeySerializer() {
        return this.keySerializer;
    }

    protected final KSerializer<V> getValueSerializer() {
        return this.valueSerializer;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, R r7) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        CompositeEncoder structuredEncoder = encoder.beginStructure(getDescriptor());
        structuredEncoder.encodeSerializableElement(getDescriptor(), 0, this.keySerializer, getKey(r7));
        structuredEncoder.encodeSerializableElement(getDescriptor(), 1, this.valueSerializer, getValue(r7));
        structuredEncoder.endStructure(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    public R deserialize(Decoder r18) {
        Intrinsics.checkNotNullParameter(r18, "decoder");
        SerialDescriptor r1 = getDescriptor();
        CompositeDecoder r5 = r18.beginStructure(r1);
        if (r5.decodeSequentially() == false) goto L5;
        R r8 = (R) toResult(CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r5, getDescriptor(), 0, getKeySerializer(), null, 8, null), CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r5, getDescriptor(), 1, getValueSerializer(), null, 8, null));
    L17:
        r5.endStructure(r1);
        return r8;
    L5:
        Object r14 = TuplesKt.access$getNULL$p();
        Object r15 = TuplesKt.access$getNULL$p();
    L6:
        int r7 = r5.decodeElementIndex(getDescriptor());
        switch(r7) {
            case -1: goto L13;
            case 0: goto L11;
            case 1: goto L10;
            default: goto L9;
        };
    L9:
        throw new SerializationException("Invalid index: " + r7);
    L11:
        r14 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r5, getDescriptor(), 0, getKeySerializer(), null, 8, null);
        goto L6
    L13:
        if (r14 == TuplesKt.access$getNULL$p()) goto L22;
        if (r15 == TuplesKt.access$getNULL$p()) goto L20;
        r8 = (R) toResult(r14, r15);
        goto L17
    L20:
        throw new SerializationException("Element 'value' is missing");
    L22:
        throw new SerializationException("Element 'key' is missing");
    L10:
        r15 = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(r5, getDescriptor(), 1, getValueSerializer(), null, 8, null);
        goto L6
    }
}
