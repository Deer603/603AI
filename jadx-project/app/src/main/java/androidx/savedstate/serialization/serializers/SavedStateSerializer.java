package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: BuiltInSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/serialization/serializers/SavedStateSerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Landroid/os/Bundle;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateSerializer implements KSerializer<Bundle> {
    public static final SavedStateSerializer INSTANCE = null;
    private static final SerialDescriptor descriptor = null;

    private SavedStateSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (Bundle) value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        INSTANCE = new SavedStateSerializer();
        descriptor = SerialDescriptorsKt.buildClassSerialDescriptor$default("androidx.savedstate.SavedState", new SerialDescriptor[0], null, 4, null);
    }

    public void serialize(Encoder encoder, Bundle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if ((encoder instanceof SavedStateEncoder) == false) goto L11;
        SavedStateEncoder $this$serialize_u24lambda_u243 = (SavedStateEncoder) encoder;
        if (Intrinsics.areEqual($this$serialize_u24lambda_u243.getKey$savedstate_release(), "") == false) goto L7;
        Bundle $this$write$iv = $this$serialize_u24lambda_u243.getSavedState$savedstate_release();
        Bundle $this$serialize_u24lambda_u243_u24lambda_u241 = SavedStateWriter.m7357constructorimpl($this$write$iv);
        SavedStateWriter.m7361putAllimpl($this$serialize_u24lambda_u243_u24lambda_u241, value);
        return;
    L7:
        Bundle $this$write$iv2 = $this$serialize_u24lambda_u243.getSavedState$savedstate_release();
        Bundle $this$serialize_u24lambda_u243_u24lambda_u242 = SavedStateWriter.m7357constructorimpl($this$write$iv2);
        SavedStateWriter.m7384putSavedStateimpl($this$serialize_u24lambda_u243_u24lambda_u242, $this$serialize_u24lambda_u243.getKey$savedstate_release(), value);
        return;
    L11:
        throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), encoder).toString());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Bundle deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if ((decoder instanceof SavedStateDecoder) == false) goto L11;
        SavedStateDecoder $this$deserialize_u24lambda_u246 = (SavedStateDecoder) decoder;
        if (Intrinsics.areEqual($this$deserialize_u24lambda_u246.getKey$savedstate_release(), "") == true) goto L12;
        Bundle $this$read$iv = $this$deserialize_u24lambda_u246.getSavedState$savedstate_release();
        Bundle $this$deserialize_u24lambda_u246_u24lambda_u245 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7328getSavedStateimpl($this$deserialize_u24lambda_u246_u24lambda_u245, $this$deserialize_u24lambda_u246.getKey$savedstate_release());
    L12:
        return $this$deserialize_u24lambda_u246.getSavedState$savedstate_release();
    L11:
        throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().getSerialName(), decoder).toString());
    }
}
