package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0018\u0010\u0002\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u00126\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0007\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0090\u0002¢\u0006\u0002\b\u000eJ&\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0004H\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00042\u0006\u0010\u0015\u001a\u0002H\u0010H\u0090\u0002¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry1", "Lkotlin/Pair;", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "entries", "", "(Lkotlin/Pair;[Lkotlin/Pair;)V", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "contains", "", "key", "contains$ui_release", "get", "T", "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "set", "", "value", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    static {
    }

    public MultiLocalMap(Pair<? extends ModifierLocal<?>, ? extends Object> r4, Pair<? extends ModifierLocal<?>, ? extends Object>... r5) {
        super(null);
        this.map = SnapshotStateKt.mutableStateMapOf();
        this.map.put(r4.getFirst(), r4.getSecond());
        this.map.putAll(MapsKt.toMap(r5));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo5820set$ui_release(ModifierLocal<T> r2, T r3) {
        this.map.put(r2, r3);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> r2) {
        T r0 = (T) this.map.get(r2);
        if (r0 != null) goto L6;
        return null;
    L6:
        return r0;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> r2) {
        return this.map.containsKey(r2);
    }
}
