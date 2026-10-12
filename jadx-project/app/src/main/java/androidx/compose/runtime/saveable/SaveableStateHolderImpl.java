package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003¢\u0006\u0002\u0010\bJ(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00150\u0018¢\u0006\u0002\b\u0019H\u0017¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J*\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003H\u0002J<\u0010\u001d\u001a\u00020\u0015*\u00020\r2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u00032\u0006\u0010\u0016\u001a\u00020\u0004H\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "savedStates", "", "", "", "", "", "(Ljava/util/Map;)V", "canBeSaved", "Lkotlin/Function1;", "", "parentSaveableStateRegistry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getParentSaveableStateRegistry", "()Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "setParentSaveableStateRegistry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;)V", "registries", "Landroidx/collection/MutableScatterMap;", "SaveableStateProvider", "", "key", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "saveAll", "saveTo", "map", "Companion", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final Companion Companion = null;
    private static final Saver<SaveableStateHolderImpl, ?> Saver = null;
    private final Function1<Object, Boolean> canBeSaved;
    private SaveableStateRegistry parentSaveableStateRegistry;
    private final MutableScatterMap<Object, SaveableStateRegistry> registries;
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* JADX INFO: compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.access$getSaver$cp();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SaveableStateHolderImpl(Map<Object, Map<String, List<Object>>> r2) {
        this.savedStates = r2;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new SaveableStateHolderImpl$canBeSaved$1(this);
    }

    public /* synthetic */ SaveableStateHolderImpl(LinkedHashMap r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new LinkedHashMap();
    L5:
        this(r1);
    }

    public static final /* synthetic */ MutableScatterMap access$getRegistries$p(SaveableStateHolderImpl $this) {
        return $this.registries;
    }

    public static final /* synthetic */ Map access$getSavedStates$p(SaveableStateHolderImpl $this) {
        return $this.savedStates;
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    public static final /* synthetic */ Map access$saveAll(SaveableStateHolderImpl $this) {
        return $this.saveAll();
    }

    public static final /* synthetic */ void access$saveTo(SaveableStateHolderImpl $this, SaveableStateRegistry $receiver, Map map, Object key) {
        $this.saveTo($receiver, map, key);
    }

    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void setParentSaveableStateRegistry(SaveableStateRegistry r1) {
        this.parentSaveableStateRegistry = r1;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void SaveableStateProvider(final Object key, Function2<? super Composer, ? super Integer, Unit> r19, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1198538093);
        ComposerKt.sourceInformation($composer, "C(SaveableStateProvider)P(1)70@3156L926:SaveableStateHolder.kt#r2ddri");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1198538093, $changed, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:69)");
    L5:
        int $changed$iv = $changed & 14;
        ComposerKt.sourceInformationMarkerStart($composer, 444418301, "CC(ReusableContent)P(1)138@5411L9:Composables.kt#9igjgp");
        $composer.startReusableGroup(ComposerKt.reuseKey, key);
        int r6 = ($changed$iv >> 3) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, 1358274032, "C71@3206L316,78@3535L135,82@3706L366,82@3683L389:SaveableStateHolder.kt#r2ddri");
        ComposerKt.sourceInformationMarkerStart($composer, -233279458, "CC(remember):SaveableStateHolder.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.Companion.getEmpty()) goto L8;
    L13:
        final SaveableStateRegistry registry = (SaveableStateRegistry) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(registry), r19, $composer, ProvidedValue.$stable | ($changed & 112));
        Unit r3 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -233263408, "CC(remember):SaveableStateHolder.kt#9igjgp");
        boolean invalid$iv = ($composer.changedInstance(this) | $composer.changedInstance(key)) | $composer.changedInstance(registry);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv = (Function1) new SaveableStateHolderImpl$SaveableStateProvider$1$1$1(this, key, registry);
        $composer.updateRememberedValue(value$iv);
        it$iv2 = value$iv;
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r3, (Function1) it$iv2, $composer, 6);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReusableGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        $composer.endReplaceGroup();
        return;
    L16:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L20;
    L8:
        if (this.canBeSaved.invoke(key).booleanValue() == false) goto L11;
        Object value$iv2 = SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(key), this.canBeSaved);
        $composer.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L13
    L11:
        throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
    }

    private final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> r1 = this.savedStates;
        ScatterMap this_$iv = this.registries;
        int $i$f$forEach = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L25;
    L4:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        ScatterMap this_$iv2 = this_$iv;
        int $i$f$forEach2 = $i$f$forEach;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int r3 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L7:
        if (j$iv$iv >= bitCount$iv$iv) goto L16;
        long value$iv$iv$iv = 255 & slot$iv$iv;
        if (value$iv$iv$iv >= 128) goto L11;
        boolean r19 = true;
    L12:
        if (r19 == false) goto L15;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object key = k$iv[index$iv$iv];
        SaveableStateRegistry registry = (SaveableStateRegistry) v$iv[index$iv$iv];
        saveTo(registry, r1, key);
    L15:
        slot$iv$iv = slot$iv$iv >> r3;
        j$iv$iv = j$iv$iv + 1;
        r3 = r3;
        k$iv = k$iv;
        goto L7
    L11:
        r19 = false;
        goto L12
    L16:
        Object[] k$iv2 = k$iv;
        if (bitCount$iv$iv != r3) goto L25;
    L20:
        if (i$iv$iv == lastIndex$iv$iv) goto L25;
        i$iv$iv = i$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$forEach = $i$f$forEach2;
        k$iv = k$iv2;
        goto L4
    L19:
        k$iv2 = k$iv;
    L25:
        if (r1.isEmpty() == false) goto L28;
        return null;
    L28:
        return r1;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(Object key) {
        if (this.registries.remove(key) != null) goto L6;
        this.savedStates.remove(key);
        return;
    }

    private final void saveTo(SaveableStateRegistry $this$saveTo, Map<Object, Map<String, List<Object>>> r4, Object key) {
        Map<String, List<Object>> r0 = $this$saveTo.performSave();
        if (r0.isEmpty() == false) goto L5;
        r4.remove(key);
        return;
    L5:
        r4.put(key, r0);
    }

    static {
        Companion = new Companion(null);
        Saver = SaverKt.Saver(SaveableStateHolderImpl$Companion$Saver$1.INSTANCE, SaveableStateHolderImpl$Companion$Saver$2.INSTANCE);
    }
}
