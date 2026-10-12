package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: SavedStateEncoder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u0000¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"encodeFormatSpecificTypesOnPlatform", "", "T", "Landroidx/savedstate/serialization/SavedStateEncoder;", "strategy", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Landroidx/savedstate/serialization/SavedStateEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Z", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean encodeFormatSpecificTypesOnPlatform(SavedStateEncoder $this$encodeFormatSpecificTypesOnPlatform, SerializationStrategy<? super T> r4, T r5) {
        Intrinsics.checkNotNullParameter($this$encodeFormatSpecificTypesOnPlatform, "<this>");
        Intrinsics.checkNotNullParameter(r4, "strategy");
        SerialDescriptor r0 = r4.getDescriptor();
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor()) == false) goto L6;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.CharSequence");
        CharSequenceSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (CharSequence) r5);
        return true;
    L6:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor()) == false) goto L9;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type android.os.Parcelable");
        DefaultParcelableSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (Parcelable) r5);
        return true;
    L9:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor()) == false) goto L12;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type java.io.Serializable");
        DefaultJavaSerializableSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (Serializable) r5);
        return true;
    L12:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor()) == false) goto L15;
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type android.os.IBinder");
        IBinderSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (IBinder) r5);
        return true;
    L15:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) == false) goto L17;
    L47:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
        CharSequenceArraySerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (CharSequence[]) r5);
        return true;
    L17:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor()) == true) goto L47;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) == false) goto L22;
    L46:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
        CharSequenceListSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (List) r5);
        return true;
    L22:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor()) == true) goto L46;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) == false) goto L27;
    L45:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
        ParcelableArraySerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (Parcelable[]) r5);
        return true;
    L27:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor()) == true) goto L45;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) == false) goto L32;
    L44:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
        ParcelableListSerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (List) r5);
        return true;
    L32:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor()) == true) goto L44;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) == false) goto L37;
    L43:
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        SparseParcelableArraySerializer.INSTANCE.serialize($this$encodeFormatSpecificTypesOnPlatform, (SparseArray) r5);
        return true;
    L37:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) == true) goto L43;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor()) == true) goto L43;
        return false;
    }
}
