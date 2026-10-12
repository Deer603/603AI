package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;

/* JADX INFO: compiled from: SavedStateConfig.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"getDefaultSerializersModuleOnPlatform", "Lkotlinx/serialization/modules/SerializersModule;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfig_androidKt {
    public static final SerializersModule getDefaultSerializersModuleOnPlatform() {
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SizeSerializer r4 = SizeSerializer.INSTANCE;
        builder$iv.contextual(Reflection.getOrCreateKotlinClass(Size.class), r4);
        KSerializer serializer$iv = SizeFSerializer.INSTANCE;
        KClass r7 = Reflection.getOrCreateKotlinClass(SizeF.class);
        builder$iv.contextual(r7, serializer$iv);
        builder$iv.contextual(Reflection.getOrCreateKotlinClass(SparseArray.class), new SavedStateConfig_androidKt$$ExternalSyntheticLambda0());
        return builder$iv.build();
    }

    static final KSerializer getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        return new SparseArraySerializer((KSerializer) CollectionsKt.first(argSerializers));
    }
}
