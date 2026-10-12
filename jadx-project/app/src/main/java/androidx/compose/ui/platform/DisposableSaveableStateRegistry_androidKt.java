package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DisposableSaveableStateRegistry.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a \u0010\u0011\u001a\u00020\u0012*\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013H\u0002\u001a \u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00140\u0013*\u00020\u0012H\u0002\"\u001e\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"AcceptableClasses", "", "Ljava/lang/Class;", "", "[Ljava/lang/Class;", "DisposableSaveableStateRegistry", "Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "view", "Landroid/view/View;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "id", "", "savedStateRegistryOwner", "canBeSavedToBundle", "", "value", "toBundle", "Landroid/os/Bundle;", "", "", "toMap", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DisposableSaveableStateRegistry_androidKt {
    private static final Class<? extends Object>[] AcceptableClasses = null;

    public static final /* synthetic */ boolean access$canBeSavedToBundle(Object value) {
        return canBeSavedToBundle(value);
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(View view, SavedStateRegistryOwner owner) {
        Object r0 = view.getParent();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.view.View");
        View composeView = (View) r0;
        Object r1 = composeView.getTag(R.id.compose_view_saveable_id_tag);
        if ((r1 instanceof String) == false) goto L5;
        String idFromTag = (String) r1;
    L6:
        if (idFromTag != null) goto L8;
        String id = String.valueOf(composeView.getId());
    L10:
        return DisposableSaveableStateRegistry(id, owner);
    L8:
        id = idFromTag;
        goto L10
    L5:
        idFromTag = null;
        goto L6
    }

    public static final DisposableSaveableStateRegistry DisposableSaveableStateRegistry(String id, SavedStateRegistryOwner savedStateRegistryOwner) {
        final String key = SaveableStateRegistry.class.getSimpleName() + ':' + id;
        final SavedStateRegistry androidxRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle bundle = androidxRegistry.consumeRestoredStateForKey(key);
        if (bundle == null) goto L5;
        Map<String, List<Object>> r3 = toMap(bundle);
    L6:
        final SaveableStateRegistry saveableStateRegistry = SaveableStateRegistryKt.SaveableStateRegistry(r3, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.INSTANCE);
        androidxRegistry.registerSavedStateProvider(key, new DisposableSaveableStateRegistry_androidKt$$ExternalSyntheticLambda0(saveableStateRegistry));     // Catch: IllegalArgumentException -> L9
        final boolean registered = true;
    L12:
        return new DisposableSaveableStateRegistry(saveableStateRegistry, new AnonymousClass1(registered, androidxRegistry, key));
    L10:
        registered = false;
        goto L12
    L5:
        r3 = null;
        goto L6
    }

    static final Bundle DisposableSaveableStateRegistry$lambda$0(SaveableStateRegistry $saveableStateRegistry) {
        return toBundle($saveableStateRegistry.performSave());
    }

    private static final boolean canBeSavedToBundle(Object value) {
        if ((value instanceof SnapshotMutableState) == false) goto L18;
        if (((SnapshotMutableState) value).getPolicy() != SnapshotStateKt.neverEqualPolicy()) goto L7;
    L12:
        Object stateValue = ((SnapshotMutableState) value).getValue();
        if (stateValue != null) goto L16;
        return true;
    L16:
        return canBeSavedToBundle(stateValue);
    L7:
        if (((SnapshotMutableState) value).getPolicy() == SnapshotStateKt.structuralEqualityPolicy()) goto L12;
        if (((SnapshotMutableState) value).getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) goto L12;
        return false;
    L18:
        if ((value instanceof Function) == true) goto L20;
    L22:
        Class<? extends Object>[] r0 = AcceptableClasses;
        int r3 = r0.length;
        int r4 = 0;
    L23:
        if (r4 >= r3) goto L28;
        if (r0[r4].isInstance(value) == true) goto L26;
        r4 = r4 + 1;
        goto L23
    L26:
        return true;
    L28:
        return false;
    L20:
        if ((value instanceof Serializable) == false) goto L22;
        return false;
    }

    static {
        AcceptableClasses = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    }

    private static final Map<String, List<Object>> toMap(Bundle $this$toMap) {
        Map map = new LinkedHashMap();
        Iterable $this$forEach$iv = $this$toMap.keySet();
        Iterator r3 = $this$forEach$iv.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        Object element$iv = r3.next();
        String key = (String) element$iv;
        ArrayList list = $this$toMap.getParcelableArrayList(key);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
        map.put(key, list);
        goto L4
    L7:
        return map;
    }

    private static final Bundle toBundle(Map<String, ? extends List<? extends Object>> r10) {
        Bundle bundle = new Bundle();
        Iterator<Map.Entry<String, ? extends List<? extends Object>>> r3 = r10.entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L11;
        Map.Entry<String, ? extends List<? extends Object>> r4 = r3.next();
        String key = r4.getKey();
        List<? extends Object> r7 = r4.getValue();
        if ((r7 instanceof ArrayList) == false) goto L8;
        ArrayList<? extends Parcelable> r8 = (ArrayList) r7;
    L9:
        bundle.putParcelableArrayList(key, r8);
        goto L4
    L8:
        r8 = new ArrayList(r7);
        goto L9
    L11:
        return bundle;
    }
}
