package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: SavedStateEncoder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b\u001a;\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010\u0005\u001a\u0002H\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"encodeToSavedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "T", "", "value", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "(Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoderKt {
    public static /* synthetic */ Bundle encodeToSavedState$default(Object value, SavedStateConfiguration configuration, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L5;
        configuration = SavedStateConfiguration.DEFAULT;
    L5:
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SerializersModule r6 = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(SerializersKt.serializer(r6, null), value, configuration);
    }

    public static final /* synthetic */ <T> Bundle encodeToSavedState(T r4, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(r4, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        SerializersModule r1 = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToSavedState(SerializersKt.serializer(r1, null), r4, configuration);
    }

    public static /* synthetic */ Bundle encodeToSavedState$default(SerializationStrategy r0, Object r1, SavedStateConfiguration r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = SavedStateConfiguration.DEFAULT;
    L6:
        return encodeToSavedState(r0, r1, r2);
    }

    public static final <T> Bundle encodeToSavedState(SerializationStrategy<? super T> r13, T r14, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(r13, "serializer");
        Intrinsics.checkNotNullParameter(r14, "value");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map initialState$iv = MapsKt.emptyMap();
        if (initialState$iv.isEmpty() == false) goto L5;
        Pair[] pairs$iv = new Pair[0];
    L10:
        Bundle result = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairs$iv, pairs$iv.length));
        SavedStateWriter.m7357constructorimpl(result);
        new SavedStateEncoder(result, configuration).encodeSerializableValue(r13, r14);
        return result;
    L5:
        Collection destination$iv$iv$iv = new ArrayList(initialState$iv.size());
        Iterator r8 = initialState$iv.entrySet().iterator();
    L7:
        if (r8.hasNext() == false) goto L9;
        Map.Entry item$iv$iv$iv = (Map.Entry) r8.next();
        String key$iv = (String) item$iv$iv$iv.getKey();
        Object value$iv = item$iv$iv$iv.getValue();
        destination$iv$iv$iv.add(TuplesKt.to(key$iv, value$iv));
        goto L7
    L9:
        Collection $this$toTypedArray$iv$iv = (List) destination$iv$iv$iv;
        pairs$iv = (Pair[]) $this$toTypedArray$iv$iv.toArray(new Pair[0]);
        goto L10
    }

    public static final <T> Bundle encodeToSavedState(SerializationStrategy<? super T> r2, T r3) {
        Intrinsics.checkNotNullParameter(r2, "serializer");
        Intrinsics.checkNotNullParameter(r3, "value");
        return encodeToSavedState$default(r2, r3, null, 4, null);
    }
}
