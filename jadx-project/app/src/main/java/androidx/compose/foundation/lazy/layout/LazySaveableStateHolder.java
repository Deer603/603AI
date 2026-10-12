package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB7\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\fJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0002\b\u0014H\u0017¢\u0006\u0002\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0096\u0001J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0096\u0001J\u001c\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0005H\u0016J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0013H\u0096\u0001J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "parentRegistry", "restoredValues", "", "", "", "", "wrappedHolder", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/util/Map;Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "wrappedRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Landroidx/compose/runtime/saveable/SaveableStateHolder;)V", "previouslyComposedKeys", "Landroidx/collection/MutableScatterSet;", "SaveableStateProvider", "", "key", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "canBeSaved", "", "value", "consumeRestored", "performSave", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "removeState", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public static final Companion Companion = null;
    private final MutableScatterSet<Object> previouslyComposedKeys;
    private final SaveableStateHolder wrappedHolder;
    private final SaveableStateRegistry wrappedRegistry;

    /* JADX INFO: compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "()V", "saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "", "", "", "parentRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "wrappedHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(final SaveableStateRegistry parentRegistry, final SaveableStateHolder wrappedHolder) {
            return SaverKt.Saver(LazySaveableStateHolder$Companion$saver$1.INSTANCE, new LazySaveableStateHolder$Companion$saver$2(parentRegistry, wrappedHolder));
        }
    }

    static {
        Companion = new Companion(null);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object r2) {
        return this.wrappedRegistry.canBeSaved(r2);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String r2) {
        return this.wrappedRegistry.consumeRestored(r2);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String r2, Function0<? extends Object> r3) {
        return this.wrappedRegistry.registerProvider(r2, r3);
    }

    public LazySaveableStateHolder(SaveableStateRegistry wrappedRegistry, SaveableStateHolder wrappedHolder) {
        this.wrappedRegistry = wrappedRegistry;
        this.wrappedHolder = wrappedHolder;
        this.previouslyComposedKeys = ScatterSetKt.mutableScatterSetOf();
    }

    public static final /* synthetic */ MutableScatterSet access$getPreviouslyComposedKeys$p(LazySaveableStateHolder $this) {
        return $this.previouslyComposedKeys;
    }

    public LazySaveableStateHolder(final SaveableStateRegistry parentRegistry, Map<String, ? extends List<? extends Object>> r3, SaveableStateHolder wrappedHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(r3, new AnonymousClass1(parentRegistry)), wrappedHolder);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        ScatterSet this_$iv = this.previouslyComposedKeys;
        Object[] elements$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L19;
        int r12 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r17 = true;
    L12:
        if (r17 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object it = elements$iv[index$iv$iv];
        this.wrappedHolder.removeState(it);
    L15:
        slot$iv$iv = slot$iv$iv >> r12;
        j$iv$iv = j$iv$iv + 1;
        r12 = r12;
        this_$iv = this_$iv;
        goto L7
    L11:
        r17 = false;
        goto L12
    L16:
        ScatterSet this_$iv2 = this_$iv;
        if (bitCount$iv$iv != r12) goto L25;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L25;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        goto L4
    L19:
        this_$iv2 = this_$iv;
    L25:
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object key, Function2<? super Composer, ? super Integer, Unit> r9, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-697180401);
        ComposerKt.sourceInformation($composer, "C(SaveableStateProvider)P(1)75@3301L35,76@3367L109,76@3345L131:LazySaveableStateHolder.kt#wow0x6");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-697180401, $changed, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
    L5:
        this.wrappedHolder.SaveableStateProvider(key, r9, $composer, ($changed & 14) | ($changed & 112));
        ComposerKt.sourceInformationMarkerStart($composer, 622442072, "CC(remember):LazySaveableStateHolder.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(this) | $composer.changedInstance(key);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = (Function1) new LazySaveableStateHolder$SaveableStateProvider$1$1(this, key);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(key, (Function1) it$iv, $composer, $changed & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object key) {
        this.wrappedHolder.removeState(key);
    }
}
