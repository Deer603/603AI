package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\b*\u00028\u0001H$¢\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b*\u00028\u0001H$¢\u0006\u0002\u0010\fJ\r\u0010\r\u001a\u00028\u0002H$¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\b*\u00028\u0002H$¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u0014*\u00028\u00022\u0006\u0010\u0015\u001a\u00020\bH$¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\"J\u001d\u0010#\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020$2\u0006\u0010\r\u001a\u00028\u0002H\u0002¢\u0006\u0002\u0010%J/\u0010&\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020$2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00022\b\b\u0002\u0010(\u001a\u00020)H$¢\u0006\u0002\u0010*J-\u0010+\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020$2\u0006\u0010\r\u001a\u00028\u00022\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH$¢\u0006\u0002\u0010-\u0082\u0001\u0002./¨\u00060"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "collectionSize", "", "(Ljava/lang/Object;)I", "collectionIterator", "", "(Ljava/lang/Object;)Ljava/util/Iterator;", "builder", "()Ljava/lang/Object;", "builderSize", "toResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "toBuilder", "checkCapacity", "", "size", "(Ljava/lang/Object;I)V", "serialize", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "merge", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "previous", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "readSize", "Lkotlinx/serialization/encoding/CompositeDecoder;", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;)I", "readElement", "index", "checkIndex", "", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/lang/Object;Z)V", "readAll", "startIndex", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/Object;II)V", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ AbstractCollectionSerializer(DefaultConstructorMarker r1) {
        this();
    }

    protected abstract Builder builder();

    protected abstract int builderSize(Builder r1);

    protected abstract void checkCapacity(Builder r1, int r2);

    protected abstract Iterator<Element> collectionIterator(Collection r1);

    protected abstract int collectionSize(Collection r1);

    protected abstract void readAll(CompositeDecoder r1, Builder r2, int r3, int r4);

    protected abstract void readElement(CompositeDecoder r1, int r2, Builder r3, boolean r4);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(Encoder r1, Collection r2);

    protected abstract Builder toBuilder(Collection r1);

    protected abstract Collection toResult(Builder r1);

    private AbstractCollectionSerializer() {
    }

    @InternalSerializationApi
    public final Collection merge(Decoder r10, Collection r11) {
        Intrinsics.checkNotNullParameter(r10, "decoder");
        if (r11 == null) goto L6;
        Builder r0 = toBuilder(r11);
        if (r0 == null) goto L6;
    L7:
        Builder r4 = r0;
        int r1 = builderSize(r4);
        CompositeDecoder r2 = r10.beginStructure(getDescriptor());
        if (r2.decodeSequentially() == false) goto L10;
        readAll(r2, r4, r1, readSize(r2, r4));
    L13:
        r2.endStructure(getDescriptor());
        return toResult(r4);
    L10:
        int r8 = r2.decodeElementIndex(getDescriptor());
        if (r8 == (-1)) goto L13;
        readElement$default(this, r2, r1 + r8, r4, false, 8, null);
    L6:
        r0 = builder();
        goto L7
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    private final int readSize(CompositeDecoder decoder, Builder r3) {
        int size = decoder.decodeCollectionSize(getDescriptor());
        checkCapacity(r3, size);
        return size;
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer r0, CompositeDecoder r1, int r2, Object r3, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 8) == 0) goto L6;
        r4 = true;
    L6:
        r0.readElement(r1, r2, r3, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }
}
