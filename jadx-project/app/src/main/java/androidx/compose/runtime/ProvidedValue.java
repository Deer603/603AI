package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bj\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0002\b\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\b+R \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00078G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0002\b\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e¨\u0006,"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", "T", "", "compositionLocal", "Landroidx/compose/runtime/CompositionLocal;", "value", "explicitNull", "", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "state", "Landroidx/compose/runtime/MutableState;", "compute", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "isDynamic", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;ZLandroidx/compose/runtime/SnapshotMutationPolicy;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Z)V", "<set-?>", "canOverride", "getCanOverride", "()Z", "getCompositionLocal", "()Landroidx/compose/runtime/CompositionLocal;", "getCompute$runtime_release", "()Lkotlin/jvm/functions/Function1;", "effectiveValue", "getEffectiveValue$runtime_release$annotations", "()V", "getEffectiveValue$runtime_release", "()Ljava/lang/Object;", "isDynamic$runtime_release", "isStatic", "isStatic$runtime_release", "getMutationPolicy$runtime_release", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "providedValue", "Ljava/lang/Object;", "getState$runtime_release", "()Landroidx/compose/runtime/MutableState;", "getValue$annotations", "getValue", "ifNotAlreadyProvided", "ifNotAlreadyProvided$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ProvidedValue<T> {
    public static final int $stable = 0;
    private boolean canOverride;
    private final CompositionLocal<T> compositionLocal;
    private final Function1<CompositionLocalAccessorScope, T> compute;
    private final boolean explicitNull;
    private final boolean isDynamic;
    private final SnapshotMutationPolicy<T> mutationPolicy;
    private final T providedValue;
    private final MutableState<T> state;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getEffectiveValue$runtime_release$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProvidedValue(CompositionLocal<T> r2, T r3, boolean explicitNull, SnapshotMutationPolicy<T> r5, MutableState<T> r6, Function1<? super CompositionLocalAccessorScope, ? extends T> r7, boolean isDynamic) {
        this.compositionLocal = r2;
        this.explicitNull = explicitNull;
        this.mutationPolicy = r5;
        this.state = r6;
        this.compute = r7;
        this.isDynamic = isDynamic;
        this.providedValue = r3;
        this.canOverride = true;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime_release() {
        return this.mutationPolicy;
    }

    public final MutableState<T> getState$runtime_release() {
        return this.state;
    }

    public final Function1<CompositionLocalAccessorScope, T> getCompute$runtime_release() {
        return this.compute;
    }

    public final boolean isDynamic$runtime_release() {
        return this.isDynamic;
    }

    public final T getValue() {
        return this.providedValue;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.explicitNull == false) goto L6;
        return null;
    L6:
        if (this.state == null) goto L9;
        return this.state.getValue();
    L9:
        if (this.providedValue != null) goto L11;
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    L11:
        return this.providedValue;
    }

    public final boolean isStatic$runtime_release() {
        if (this.explicitNull == true) goto L7;
        if (getValue() != null) goto L7;
    L9:
        return false;
    L7:
        if (this.isDynamic == true) goto L9;
        return true;
    }

    public final ProvidedValue<T> ifNotAlreadyProvided$runtime_release() {
        this.canOverride = false;
        return this;
    }
}
