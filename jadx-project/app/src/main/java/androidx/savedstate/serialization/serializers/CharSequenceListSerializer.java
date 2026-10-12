package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/savedstate/serialization/serializers/CharSequenceListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CharSequenceListSerializer implements KSerializer<List<? extends CharSequence>> {
    public static final CharSequenceListSerializer INSTANCE = null;
    private static final SerialDescriptor descriptor = null;

    private CharSequenceListSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (List) value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        INSTANCE = new CharSequenceListSerializer();
        descriptor = SerialDescriptorsKt.buildClassSerialDescriptor$default("kotlin.collections.List<kotlin.CharSequence>", new SerialDescriptor[0], null, 4, null);
    }

    public void serialize(Encoder encoder, List<? extends CharSequence> r9) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r9, "value");
        if ((encoder instanceof SavedStateEncoder) == false) goto L7;
        SavedStateEncoder $this$serialize_u24lambda_u242 = (SavedStateEncoder) encoder;
        Bundle $this$write$iv = $this$serialize_u24lambda_u242.getSavedState$savedstate_release();
        Bundle $this$serialize_u24lambda_u242_u24lambda_u241 = SavedStateWriter.m7357constructorimpl($this$write$iv);
        SavedStateWriter.m7369putCharSequenceListimpl($this$serialize_u24lambda_u242_u24lambda_u241, $this$serialize_u24lambda_u242.getKey$savedstate_release(), r9);
        return;
    L7:
        throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), encoder).toString());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public List<CharSequence> deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if ((decoder instanceof SavedStateDecoder) == false) goto L7;
        SavedStateDecoder $this$deserialize_u24lambda_u245 = (SavedStateDecoder) decoder;
        Bundle $this$read$iv = $this$deserialize_u24lambda_u245.getSavedState$savedstate_release();
        Bundle $this$deserialize_u24lambda_u245_u24lambda_u244 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7291getCharSequenceListimpl($this$deserialize_u24lambda_u245_u24lambda_u244, $this$deserialize_u24lambda_u245.getKey$savedstate_release());
    L7:
        throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), decoder).toString());
    }
}
