package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a,\u0010\u0000\u001a\u00020\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\n\u001a<\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\f\"\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\r\u001a0\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u00102\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002H\u00100\u0016¢\u0006\u0002\b\u0018\u001a \u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\u0004\b\u0000\u0010\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005¨\u0006\u001a"}, d2 = {"CompositionLocalProvider", "", "context", "Landroidx/compose/runtime/CompositionLocalContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionLocalContext;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "values", "", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "compositionLocalWithComputedDefaultOf", "defaultComputation", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "staticCompositionLocalOf", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CompositionLocalKt {
    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy r0, Function0 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = SnapshotStateKt.structuralEqualityPolicy();
    L6:
        return compositionLocalOf(r0, r1);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> r1, Function0<? extends T> r2) {
        return new DynamicProvidableCompositionLocal(r1, r2);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(Function0<? extends T> r1) {
        return new StaticProvidableCompositionLocal(r1);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(Function1<? super CompositionLocalAccessorScope, ? extends T> r1) {
        return new ComputedProvidableCompositionLocal(r1);
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?>[] r4, final Function2<? super Composer, ? super Integer, Unit> r5, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1390796515);
        ComposerKt.sourceInformation($composer2, "C(CompositionLocalProvider)P(1)363@16641L9:CompositionLocal.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1390796515, $changed, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:361)");
    L5:
        $composer2.startProviders(r4);
        r5.invoke($composer2, Integer.valueOf(($changed >> 3) & 14));
        $composer2.endProviders();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L12;
        r0.updateScope(new AnonymousClass1(r4, r5, $changed));
        return;
    }

    public static final void CompositionLocalProvider(final ProvidedValue<?> r4, final Function2<? super Composer, ? super Integer, Unit> r5, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1350970552);
        ComposerKt.sourceInformation($composer2, "C(CompositionLocalProvider)P(1)383@17375L9:CompositionLocal.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1350970552, $changed, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:381)");
    L5:
        $composer2.startProvider(r4);
        r5.invoke($composer2, Integer.valueOf(($changed >> 3) & 14));
        $composer2.endProvider();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L12;
        r0.updateScope(new AnonymousClass2(r4, r5, $changed));
        return;
    }

    public static final void CompositionLocalProvider(final CompositionLocalContext context, final Function2<? super Composer, ? super Integer, Unit> r18, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1853897736);
        ComposerKt.sourceInformation($composer2, "C(CompositionLocalProvider)P(1)400@18014L144:CompositionLocal.kt#9igjgp");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(context) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r18) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L33:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L38;
        r3.updateScope(new AnonymousClass4(context, r18, $changed));
        return;
    L38:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1853897736, $dirty, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:399)");
    L25:
        Map $this$map$iv = context.getCompositionLocals$runtime_release();
        Collection destination$iv$iv = new ArrayList($this$map$iv.size());
        Iterator<Map.Entry<CompositionLocal<Object>, ValueHolder<Object>>> r11 = $this$map$iv.entrySet().iterator();
    L27:
        if (r11.hasNext() == false) goto L29;
        Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> r12 = r11.next();
        destination$iv$iv.add(r12.getValue().toProvided(r12.getKey()));
        goto L27
    L29:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        ProvidedValue[] r4 = (ProvidedValue[]) $this$toTypedArray$iv.toArray(new ProvidedValue[0]);
        CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(r4, r4.length), r18, $composer2, $dirty & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
        goto L33
    L19:
        r8 = false;
        goto L21
    }
}
