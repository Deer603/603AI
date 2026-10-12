package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0002\u0010\nJ(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0002\b\u0010H\u0086\u0004J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0002\u0010\nJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013H\u0010¢\u0006\u0002\b\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "defaultFactory", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "defaultProvidedValue", "Landroidx/compose/runtime/ProvidedValue;", "value", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "provides", "providesComputed", "compute", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "providesDefault", "updatedStateOf", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "valueHolderOf", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    static {
    }

    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T r1);

    public ProvidableCompositionLocal(Function0<? extends T> r2) {
        super(r2, null);
    }

    public final ProvidedValue<T> provides(T r2) {
        return defaultProvidedValue$runtime_release(r2);
    }

    public final ProvidedValue<T> providesDefault(T r2) {
        return defaultProvidedValue$runtime_release(r2).ifNotAlreadyProvided$runtime_release();
    }

    public final ProvidedValue<T> providesComputed(Function1<? super CompositionLocalAccessorScope, ? extends T> r9) {
        return new ProvidedValue(this, null, false, null, null, r9, false);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    public ValueHolder<T> updatedStateOf$runtime_release(ProvidedValue<T> r4, ValueHolder<T> r5) {
        ValueHolder<T> r1 = null;
        if ((r5 instanceof DynamicValueHolder) == false) goto L10;
        if (r4.isDynamic$runtime_release() == false) goto L8;
        ((DynamicValueHolder) r5).getState().setValue(r4.getEffectiveValue$runtime_release());
        r1 = (DynamicValueHolder) r5;
    L8:
        r1 = r1;
    L24:
        if (r1 == null) goto L26;
        return r1;
    L26:
        return valueHolderOf(r4);
    L10:
        if ((r5 instanceof StaticValueHolder) == false) goto L18;
        if (r4.isStatic$runtime_release() == true) goto L14;
    L16:
        r1 = r1;
        goto L24
    L14:
        if (Intrinsics.areEqual(r4.getEffectiveValue$runtime_release(), ((StaticValueHolder) r5).getValue()) == false) goto L16;
        r1 = (StaticValueHolder) r5;
        goto L16
    L18:
        if ((r5 instanceof ComputedValueHolder) == false) goto L24;
        if (r4.getCompute$runtime_release() != ((ComputedValueHolder) r5).getCompute()) goto L22;
        r1 = (ComputedValueHolder) r5;
    L22:
        r1 = r1;
        goto L24
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> r4) {
        if (r4.isDynamic$runtime_release() == false) goto L12;
        MutableState<T> r1 = r4.getState$runtime_release();
        if (r1 != null) goto L19;
        T r2 = r4.getValue();
        SnapshotMutationPolicy<T> r3 = r4.getMutationPolicy$runtime_release();
        if (r3 != null) goto L9;
        r3 = SnapshotStateKt.structuralEqualityPolicy();
    L9:
        r1 = SnapshotStateKt.mutableStateOf(r2, r3);
    L19:
        return new DynamicValueHolder(r1);
    L12:
        if (r4.getCompute$runtime_release() == null) goto L15;
        return new ComputedValueHolder(r4.getCompute$runtime_release());
    L15:
        if (r4.getState$runtime_release() == null) goto L18;
        return new DynamicValueHolder(r4.getState$runtime_release());
    L18:
        return new StaticValueHolder(r4.getEffectiveValue$runtime_release());
    }
}
