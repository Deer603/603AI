package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.internal.CanonicalName_jvmKt;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.SavedStateDecoderKt;
import androidx.savedstate.serialization.SavedStateEncoderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: SavedStateHandleDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H\u00010\u0003B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002J$\u0010\u001a\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0096\u0002¢\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/serialization/SavedStateHandleDelegate;", "T", "", "Lkotlin/properties/ReadWriteProperty;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "serializer", "Lkotlinx/serialization/KSerializer;", "key", "", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "init", "Lkotlin/Function0;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function0;)V", "value", "Ljava/lang/Object;", "loadValue", "(Ljava/lang/String;)Ljava/lang/Object;", "registerSave", "", "createDefaultKey", "thisRef", "property", "Lkotlin/reflect/KProperty;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SavedStateHandleDelegate<T> implements ReadWriteProperty<Object, T> {
    private final SavedStateConfiguration configuration;
    private final Function0<T> init;
    private final String key;
    private final SavedStateHandle savedStateHandle;
    private final KSerializer<T> serializer;
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleDelegate(SavedStateHandle savedStateHandle, KSerializer<T> r3, String key, SavedStateConfiguration configuration, Function0<? extends T> r6) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(r3, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(r6, "init");
        this.savedStateHandle = savedStateHandle;
        this.serializer = r3;
        this.key = key;
        this.configuration = configuration;
        this.init = r6;
    }

    private final T loadValue(String r5) {
        Bundle r0 = (Bundle) this.savedStateHandle.get(r5);
        if (r0 != null) goto L7;
        return null;
    L7:
        return (T) SavedStateDecoderKt.decodeFromSavedState(this.serializer, r0, this.configuration);
    }

    private final void registerSave(String key) {
        this.savedStateHandle.setSavedStateProvider(key, new SavedStateHandleDelegate$$ExternalSyntheticLambda0(this));
    }

    static final Bundle registerSave$lambda$1(SavedStateHandleDelegate this$0) {
        KSerializer<T> r0 = this$0.serializer;
        Object r1 = this$0.value;
        if (r1 != null) goto L6;
        Intrinsics.throwUninitializedPropertyAccessException("value");
        r1 = Unit.INSTANCE;
    L6:
        return SavedStateEncoderKt.encodeToSavedState(r0, r1, this$0.configuration);
    }

    private final String createDefaultKey(Object thisRef, KProperty<?> r5) {
        if (thisRef == null) goto L4;
        String classNamePrefix = CanonicalName_jvmKt.getCanonicalName(Reflection.getOrCreateKotlinClass(thisRef.getClass())) + '.';
    L6:
        return classNamePrefix + r5.getName();
    L4:
        classNamePrefix = "";
        goto L6
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(Object r3, KProperty<?> r4) {
        Intrinsics.checkNotNullParameter(r4, "property");
        if (this.value != null) goto L11;
        String r0 = this.key;
        if (r0 != null) goto L7;
        r0 = createDefaultKey(r3, r4);
    L7:
        registerSave(r0);
        T r1 = loadValue(r0);
        if (r1 != null) goto L10;
        r1 = this.init.invoke();
    L10:
        this.value = r1;
    L11:
        T r2 = this.value;
        if (r2 != null) goto L15;
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return (T) Unit.INSTANCE;
    L15:
        return r2;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object thisRef, KProperty<?> r3, T r4) {
        Intrinsics.checkNotNullParameter(r3, "property");
        Intrinsics.checkNotNullParameter(r4, "value");
        if (this.value != null) goto L8;
        String qualifiedKey = this.key;
        if (qualifiedKey != null) goto L7;
        qualifiedKey = createDefaultKey(thisRef, r3);
    L7:
        registerSave(qualifiedKey);
    L8:
        this.value = r4;
    }
}
