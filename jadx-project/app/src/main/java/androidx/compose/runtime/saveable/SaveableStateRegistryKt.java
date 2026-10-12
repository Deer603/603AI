package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: SaveableStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u000fH\u0002\u001a0\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00130\u0011\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00130\u0007H\u0002\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"LocalSaveableStateRegistry", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "getLocalSaveableStateRegistry", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "SaveableStateRegistry", "restoredValues", "", "", "", "", "canBeSaved", "Lkotlin/Function1;", "", "fastIsBlank", "", "toMutableScatterMap", "Landroidx/collection/MutableScatterMap;", "K", "V", "runtime-saveable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SaveableStateRegistryKt {
    private static final ProvidableCompositionLocal<SaveableStateRegistry> LocalSaveableStateRegistry = null;

    public static final /* synthetic */ boolean access$fastIsBlank(CharSequence $receiver) {
        return fastIsBlank($receiver);
    }

    public static final /* synthetic */ MutableScatterMap access$toMutableScatterMap(Map $receiver) {
        return toMutableScatterMap($receiver);
    }

    public static final SaveableStateRegistry SaveableStateRegistry(Map<String, ? extends List<? extends Object>> r1, Function1<Object, Boolean> r2) {
        return new SaveableStateRegistryImpl(r1, r2);
    }

    static {
        LocalSaveableStateRegistry = CompositionLocalKt.staticCompositionLocalOf(SaveableStateRegistryKt$LocalSaveableStateRegistry$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<SaveableStateRegistry> getLocalSaveableStateRegistry() {
        return LocalSaveableStateRegistry;
    }

    private static final boolean fastIsBlank(CharSequence $this$fastIsBlank) {
        int i = 0;
        int r2 = $this$fastIsBlank.length();
    L3:
        if (i >= r2) goto L11;
        if (CharsKt.isWhitespace($this$fastIsBlank.charAt(i)) == false) goto L6;
        i = i + 1;
        goto L3
    L6:
        return false;
    L11:
        return true;
    }

    private static final <K, V> MutableScatterMap<K, V> toMutableScatterMap(Map<K, ? extends V> r5) {
        MutableScatterMap<K, V> r0 = new MutableScatterMap(r5.size());
        r0.putAll(r5);
        return r0;
    }
}
