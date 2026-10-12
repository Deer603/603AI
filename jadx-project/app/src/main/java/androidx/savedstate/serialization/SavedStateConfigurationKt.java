package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import kotlinx.serialization.modules.SerializersModuleKt;

/* JADX INFO: compiled from: SavedStateConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"SavedStateConfiguration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "from", "builderAction", "Lkotlin/Function1;", "Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "DEFAULT_SERIALIZERS_MODULE", "Lkotlinx/serialization/modules/SerializersModule;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfigurationKt {
    private static final SerializersModule DEFAULT_SERIALIZERS_MODULE = null;

    public static final /* synthetic */ SerializersModule access$getDEFAULT_SERIALIZERS_MODULE$p() {
        return DEFAULT_SERIALIZERS_MODULE;
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration r0, Function1 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = SavedStateConfiguration.DEFAULT;
    L6:
        return SavedStateConfiguration(r0, r1);
    }

    public static final SavedStateConfiguration SavedStateConfiguration(SavedStateConfiguration from, Function1<? super SavedStateConfiguration.Builder, Unit> r2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(r2, "builderAction");
        SavedStateConfiguration.Builder r0 = new SavedStateConfiguration.Builder(from);
        r2.invoke(r0);
        return r0.build$savedstate_release();
    }

    public static final SavedStateConfiguration SavedStateConfiguration(Function1<? super SavedStateConfiguration.Builder, Unit> r2) {
        Intrinsics.checkNotNullParameter(r2, "builderAction");
        return SavedStateConfiguration$default(null, r2, 1, null);
    }

    static {
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SavedStateSerializer r4 = SavedStateSerializer.INSTANCE;
        builder$iv.contextual(Reflection.getOrCreateKotlinClass(Bundle.class), r4);
        DEFAULT_SERIALIZERS_MODULE = SerializersModuleKt.plus(builder$iv.build(), SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform());
    }
}
