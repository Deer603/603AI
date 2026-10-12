package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BE\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0002JK\u0010\u001e\u001a\u00020\u001a2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "saver", "Landroidx/compose/runtime/saveable/Saver;", "", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "key", "", "value", "inputs", "", "(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "entry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "[Ljava/lang/Object;", "Ljava/lang/Object;", "valueProvider", "Lkotlin/Function0;", "canBeSaved", "", "getValueIfInputsDidntChange", "([Ljava/lang/Object;)Ljava/lang/Object;", "onAbandoned", "", "onForgotten", "onRemembered", "register", "update", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    private SaveableStateRegistry.Entry entry;
    private Object[] inputs;
    private String key;
    private SaveableStateRegistry registry;
    private Saver<T, Object> saver;
    private T value;
    private final Function0<Object> valueProvider;

    public SaveableHolder(Saver<T, Object> r2, SaveableStateRegistry registry, String key, T r5, Object[] inputs) {
        this.saver = r2;
        this.registry = registry;
        this.key = key;
        this.value = r5;
        this.inputs = inputs;
        this.valueProvider = new SaveableHolder$valueProvider$1(this);
    }

    public static final /* synthetic */ Saver access$getSaver$p(SaveableHolder $this) {
        return $this.saver;
    }

    public static final /* synthetic */ Object access$getValue$p(SaveableHolder $this) {
        return $this.value;
    }

    public final void update(Saver<T, Object> r3, SaveableStateRegistry registry, String key, T r6, Object[] inputs) {
        boolean entryIsOutdated = false;
        if (this.registry == registry) goto L6;
        this.registry = registry;
        entryIsOutdated = true;
    L6:
        if (Intrinsics.areEqual(this.key, key) == true) goto L8;
        this.key = key;
        entryIsOutdated = true;
    L8:
        this.saver = r3;
        this.value = r6;
        this.inputs = inputs;
        if (this.entry == null) goto L16;
        if (entryIsOutdated == false) goto L17;
        SaveableStateRegistry.Entry r1 = this.entry;
        if (r1 == null) goto L14;
        r1.unregister();
    L14:
        this.entry = null;
        register();
        return;
    L17:
        return;
    }

    private final void register() {
        SaveableStateRegistry registry = this.registry;
        if (this.entry != null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L11;
        if (registry == null) goto L12;
        RememberSaveableKt.access$requireCanBeSaved(registry, this.valueProvider.invoke());
        this.entry = registry.registerProvider(this.key, this.valueProvider);
        return;
    L12:
        return;
    L11:
        throw new IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
    L5:
        r1 = false;
        goto L6
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(Object value) {
        SaveableStateRegistry registry = this.registry;
        if (registry != null) goto L5;
    L8:
        return true;
    L5:
        if (registry.canBeSaved(value) == true) goto L8;
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SaveableStateRegistry.Entry r0 = this.entry;
        if (r0 == null) goto L6;
        r0.unregister();
        return;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SaveableStateRegistry.Entry r0 = this.entry;
        if (r0 == null) goto L6;
        r0.unregister();
        return;
    }

    public final T getValueIfInputsDidntChange(Object[] inputs) {
        if (Arrays.equals(inputs, this.inputs) == true) goto L7;
        return null;
    L7:
        return this.value;
    }
}
