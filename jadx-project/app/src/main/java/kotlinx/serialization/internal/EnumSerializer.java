package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "serialName", "", "values", "", "<init>", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "[Ljava/lang/Enum;", "overriddenDescriptor", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "createUnmarkedDescriptor", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "toString", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {
    private final Lazy descriptor$delegate;
    private SerialDescriptor overriddenDescriptor;
    private final T[] values;

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (Enum) value);
    }

    public EnumSerializer(final String serialName, T[] r3) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r3, "values");
        this.values = r3;
        this.descriptor$delegate = LazyKt.lazy(new EnumSerializer$$ExternalSyntheticLambda0(this, serialName));
    }

    public EnumSerializer(String serialName, T[] r3, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r3, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this(serialName, r3);
        this.overriddenDescriptor = descriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer this$0, String $serialName) {
        SerialDescriptor r0 = this$0.overriddenDescriptor;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this$0.createUnmarkedDescriptor($serialName);
    }

    private final SerialDescriptor createUnmarkedDescriptor(String serialName) {
        EnumDescriptor d = new EnumDescriptor(serialName, this.values.length);
        T[] r1 = this.values;
        int r3 = r1.length;
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L6;
        PluginGeneratedSerialDescriptor.addElement$default(d, r1[r5].name(), false, 2, null);
        r5 = r5 + 1;
        goto L3
    L6:
        return d;
    }

    public void serialize(Encoder encoder, T r7) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r7, "value");
        int index = ArraysKt.indexOf(this.values, r7);
        if (index == (-1)) goto L6;
        encoder.encodeEnum(getDescriptor(), index);
        return;
    L6:
        StringBuilder r2 = new StringBuilder().append(r7).append(" is not a valid enum ").append(getDescriptor().getSerialName()).append(", must be one of ");
        String r3 = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        throw new SerializationException(r2.append(r3).toString());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int index = decoder.decodeEnum(getDescriptor());
        boolean r1 = false;
        if (index >= 0) goto L5;
    L7:
        if (r1 == false) goto L11;
        return this.values[index];
    L11:
        throw new SerializationException(index + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    L5:
        if (index >= this.values.length) goto L7;
        r1 = true;
        goto L7
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + Typography.greater;
    }
}
