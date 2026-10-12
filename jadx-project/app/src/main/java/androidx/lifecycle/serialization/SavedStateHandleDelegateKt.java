package androidx.lifecycle.serialization;

import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: SavedStateHandleDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0002*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\b\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\nH\u0086\bø\u0001\u0000\u001aT\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0002*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00030\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00030\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"saved", "Lkotlin/properties/ReadWriteProperty;", "", "T", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "init", "Lkotlin/Function0;", "serializer", "Lkotlinx/serialization/KSerializer;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateHandleDelegateKt {
    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateHandle $this$saved_u24default, String key, SavedStateConfiguration configuration, Function0 init, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        key = null;
    L6:
        if ((r6 & 2) == 0) goto L8;
        configuration = SavedStateConfiguration.DEFAULT;
    L8:
        Intrinsics.checkNotNullParameter($this$saved_u24default, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(init, "init");
        SerializersModule r8 = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved($this$saved_u24default, SerializersKt.serializer(r8, null), key, configuration, init);
    }

    public static final /* synthetic */ <T> ReadWriteProperty<Object, T> saved(SavedStateHandle $this$saved, String key, SavedStateConfiguration configuration, Function0<? extends T> r7) {
        Intrinsics.checkNotNullParameter($this$saved, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(r7, "init");
        SerializersModule r1 = configuration.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return saved($this$saved, SerializersKt.serializer(r1, null), key, configuration, r7);
    }

    public static /* synthetic */ ReadWriteProperty saved$default(SavedStateHandle r0, KSerializer r1, String r2, SavedStateConfiguration r3, Function0 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r3 = SavedStateConfiguration.DEFAULT;
    L9:
        return saved(r0, r1, r2, r3, r4);
    }

    public static final <T> ReadWriteProperty<Object, T> saved(SavedStateHandle $this$saved, KSerializer<T> r8, String key, SavedStateConfiguration configuration, Function0<? extends T> r11) {
        Intrinsics.checkNotNullParameter($this$saved, "<this>");
        Intrinsics.checkNotNullParameter(r8, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(r11, "init");
        return new SavedStateHandleDelegate($this$saved, r8, key, configuration, r11);
    }
}
