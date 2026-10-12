package androidx.savedstate.serialization;

import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: SavedStateDecoder.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b0\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u000b"}, d2 = {"decodeFormatSpecificTypesOnPlatform", "T", "Landroidx/savedstate/serialization/SavedStateDecoder;", "strategy", "Lkotlinx/serialization/DeserializationStrategy;", "(Landroidx/savedstate/serialization/SavedStateDecoder;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "getArrayKClass", "Lkotlin/reflect/KClass;", "", "", "referenceArraySerializer", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoder_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T decodeFormatSpecificTypesOnPlatform(SavedStateDecoder r4, DeserializationStrategy<? extends T> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "strategy");
        SerialDescriptor r0 = r5.getDescriptor();
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceDescriptor()) == false) goto L6;
        return (T) CharSequenceSerializer.INSTANCE.deserialize(r4);
    L6:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableDescriptor()) == false) goto L9;
        return (T) DefaultParcelableSerializer.INSTANCE.deserialize(r4);
    L9:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicJavaSerializableDescriptor()) == false) goto L12;
        return (T) DefaultJavaSerializableSerializer.INSTANCE.deserialize(r4);
    L12:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicIBinderDescriptor()) == false) goto L15;
        return (T) IBinderSerializer.INSTANCE.deserialize(r4);
    L15:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getCharSequenceArrayDescriptor()) == true) goto L47;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceArrayDescriptor()) == true) goto L47;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getCharSequenceListDescriptor()) == true) goto L57;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicCharSequenceListDescriptor()) == true) goto L57;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getParcelableArrayDescriptor()) == false) goto L28;
        Parcelable[] r1 = ParcelableArraySerializer.INSTANCE.deserialize(r4);
        KClass<Object[]> r2 = getArrayKClass(r5);
        return (T) Arrays.copyOf(r1, r1.length, JvmClassMappingKt.getJavaClass(r2));
    L28:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableArrayDescriptor()) == false) goto L31;
        return (T) ParcelableArraySerializer.INSTANCE.deserialize(r4);
    L31:
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getParcelableListDescriptor()) == true) goto L56;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicParcelableListDescriptor()) == true) goto L56;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getSparseParcelableArrayDescriptor()) == true) goto L55;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getPolymorphicSparseParcelableArrayDescriptor()) == true) goto L55;
        if (Intrinsics.areEqual(r0, SavedStateCodecUtils_androidKt.getNullablePolymorphicSparseParcelableArrayDescriptor()) == true) goto L55;
        return null;
    L55:
        return (T) SparseParcelableArraySerializer.INSTANCE.deserialize(r4);
    L56:
        return (T) ParcelableListSerializer.INSTANCE.deserialize(r4);
    L57:
        return (T) CharSequenceListSerializer.INSTANCE.deserialize(r4);
    L47:
        return (T) CharSequenceArraySerializer.INSTANCE.deserialize(r4);
    }

    private static final KClass<Object[]> getArrayKClass(DeserializationStrategy<?> r1) {
        Object r0 = r1.deserialize(EmptyArrayDecoder.INSTANCE);
        Intrinsics.checkNotNull(r0);
        return Reflection.getOrCreateKotlinClass(r0.getClass());
    }
}
