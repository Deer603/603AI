package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00052 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006B%\b\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u0011*\u00028\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u0016J-\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00028\u00032\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0004¢\u0006\u0002\u0010!J-\u0010\"\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00028\u00032\u0006\u0010#\u001a\u00020$H\u0004¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010)R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "Builder", "", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "keySerializer", "Lkotlinx/serialization/KSerializer;", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "insertKeyValuePair", "", "index", "", "key", "value", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "readAll", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "builder", "startIndex", "size", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "readElement", "checkIndex", "", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "serialize", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final KSerializer<Key> keySerializer;
    private final KSerializer<Value> valueSerializer;

    public /* synthetic */ MapLikeSerializer(KSerializer r1, KSerializer r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    protected abstract void insertKeyValuePair(Builder r1, int r2, Key r3, Value r4);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ void readAll(CompositeDecoder decoder, Object builder, int startIndex, int size) {
        readAll(decoder, (Map) builder, startIndex, size);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ void readElement(CompositeDecoder decoder, int index, Object builder, boolean checkIndex) {
        readElement(decoder, index, (Map) builder, checkIndex);
    }

    public final KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    public final KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    private MapLikeSerializer(KSerializer<Key> r2, KSerializer<Value> r3) {
        super(null);
        this.keySerializer = r2;
        this.valueSerializer = r3;
    }

    protected final void readAll(CompositeDecoder decoder, Builder r7, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(r7, "builder");
        if (size < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L17;
        IntProgression r2 = RangesKt.step(RangesKt.until(0, size * 2), 2);
        int index = r2.getFirst();
        int r3 = r2.getLast();
        int r4 = r2.getStep();
        if (r4 <= 0) goto L10;
        if (index > r3) goto L10;
    L12:
        readElement(decoder, startIndex + index, r7, false);
        if (index == r3) goto L21;
        index = index + r4;
        goto L12
    L21:
        return;
    L10:
        if (r4 >= 0) goto L15;
        if (r3 <= index) goto L12;
        return;
    L15:
        return;
    L17:
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    L5:
        r1 = false;
        goto L6
    }

    protected final void readElement(CompositeDecoder decoder, int index, Builder r11, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(r11, "builder");
        Object key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), index, this.keySerializer, null, 8, null);
        if (checkIndex == false) goto L12;
        int it = decoder.decodeElementIndex(getDescriptor());
        if (it != (index + 1)) goto L7;
        boolean r4 = true;
    L8:
        if (r4 == false) goto L11;
        int it2 = it;
    L14:
        if (r11.containsKey(key) == true) goto L16;
    L18:
        Object value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), it2, this.valueSerializer, null, 8, null);
    L19:
        r11.put(key, value);
        return;
    L16:
        if ((this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind) == true) goto L18;
        value = decoder.decodeSerializableElement(getDescriptor(), it2, this.valueSerializer, MapsKt.getValue(r11, key));
        goto L19
    L11:
        throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + it).toString());
    L7:
        r4 = false;
        goto L8
    L12:
        it2 = index + 1;
        goto L14
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Collection r21) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = collectionSize(r21);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
        Iterator<Map.Entry<? extends Key, ? extends Value>> r10 = collectionIterator(r21);
        int index = 0;
    L4:
        if (r10.hasNext() == false) goto L6;
        Object element$iv = r10.next();
        Map.Entry<? extends Key, ? extends Value> r15 = (Map.Entry) element$iv;
        Key r0 = r15.getKey();
        Value r16 = r15.getValue();
        int size2 = size;
        int size3 = index + 1;
        composite$iv.encodeSerializableElement(getDescriptor(), index, getKeySerializer(), r0);
        index = size3 + 1;
        composite$iv.encodeSerializableElement(getDescriptor(), size3, getValueSerializer(), r16);
        size = size2;
        goto L4
    L6:
        composite$iv.endStructure(descriptor$iv);
    }
}
