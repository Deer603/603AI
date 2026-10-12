package androidx.savedstate.serialization;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: SavedStateDecoder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b\u001a;\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"decodeFromSavedState", "T", "", "savedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoderKt {
    public static /* synthetic */ Object decodeFromSavedState$default(Bundle savedState, SavedStateConfiguration configuration, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        configuration = SavedStateConfiguration.DEFAULT;
    L5:
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SerializersModule r6 = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeFromSavedState(SerializersKt.serializer(r6, null), savedState, configuration);
    }

    public static final /* synthetic */ <T> T decodeFromSavedState(Bundle r4, SavedStateConfiguration r5) {
        Intrinsics.checkNotNullParameter(r4, "savedState");
        Intrinsics.checkNotNullParameter(r5, "configuration");
        SerializersModule r1 = r5.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromSavedState(SerializersKt.serializer(r1, null), r4, r5);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(DeserializationStrategy r0, Bundle r1, SavedStateConfiguration r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = SavedStateConfiguration.DEFAULT;
    L6:
        return decodeFromSavedState(r0, r1, r2);
    }

    public static final <T> T decodeFromSavedState(DeserializationStrategy<? extends T> r1, Bundle r2, SavedStateConfiguration r3) {
        Intrinsics.checkNotNullParameter(r1, "deserializer");
        Intrinsics.checkNotNullParameter(r2, "savedState");
        Intrinsics.checkNotNullParameter(r3, "configuration");
        return (T) new SavedStateDecoder(r2, r3).decodeSerializableValue(r1);
    }

    public static final <T> T decodeFromSavedState(DeserializationStrategy<? extends T> r2, Bundle r3) {
        Intrinsics.checkNotNullParameter(r2, "deserializer");
        Intrinsics.checkNotNullParameter(r3, "savedState");
        return (T) decodeFromSavedState$default(r2, r3, null, 4, null);
    }
}
