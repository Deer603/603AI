package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "T", "Ljava/io/Serializable;", "Lkotlinx/serialization/KSerializer;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/io/Serializable;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/io/Serializable;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JavaSerializableSerializer<T extends Serializable> implements KSerializer<T> {
    private final SerialDescriptor descriptor;

    public JavaSerializableSerializer() {
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor$default("java.io.Serializable", new SerialDescriptor[0], null, 4, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (Serializable) value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public final void serialize(Encoder encoder, T r9) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r9, "value");
        if ((encoder instanceof SavedStateEncoder) == false) goto L7;
        SavedStateEncoder $this$serialize_u24lambda_u242 = (SavedStateEncoder) encoder;
        Bundle $this$write$iv = $this$serialize_u24lambda_u242.getSavedState$savedstate_release();
        Bundle $this$serialize_u24lambda_u242_u24lambda_u241 = SavedStateWriter.m7357constructorimpl($this$write$iv);
        SavedStateWriter.m7377putJavaSerializableimpl($this$serialize_u24lambda_u242_u24lambda_u241, $this$serialize_u24lambda_u242.getKey$savedstate_release(), r9);
        return;
    L7:
        throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.getSerialName(), encoder).toString());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder r10) {
        Intrinsics.checkNotNullParameter(r10, "decoder");
        if ((r10 instanceof SavedStateDecoder) == false) goto L7;
        SavedStateDecoder r0 = (SavedStateDecoder) r10;
        T r6 = (T) SavedStateReader.m7309getJavaSerializableimpl(SavedStateReader.m7271constructorimpl(r0.getSavedState$savedstate_release()), r0.getKey$savedstate_release(), Reflection.getOrCreateKotlinClass(Serializable.class));
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.JavaSerializableSerializer");
        return r6;
    L7:
        throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.getSerialName(), r10).toString());
    }
}
