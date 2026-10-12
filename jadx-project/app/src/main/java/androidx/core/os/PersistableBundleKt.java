package androidx.core.os;

import android.os.PersistableBundle;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a=\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tH\u0007¨\u0006\n"}, d2 = {"persistableBundleOf", "Landroid/os/PersistableBundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "toPersistableBundle", "", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PersistableBundleKt {
    public static final PersistableBundle persistableBundleOf(Pair<String, ? extends Object>... r9) {
        PersistableBundle persistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(r9.length);
        int r3 = r9.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L6;
        Pair<String, ? extends Object> r5 = r9[r4];
        String key = r5.component1();
        Object value = r5.component2();
        PersistableBundleApi21ImplKt.putValue(persistableBundle, key, value);
        r4 = r4 + 1;
        goto L3
    L6:
        return persistableBundle;
    }

    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }

    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> r4) {
        PersistableBundle persistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(r4.size());
        Iterator<Map.Entry<String, ? extends Object>> r1 = r4.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        Map.Entry<String, ? extends Object> r2 = r1.next();
        String key = r2.getKey();
        Object value = r2.getValue();
        PersistableBundleApi21ImplKt.putValue(persistableBundle, key, value);
        goto L4
    L6:
        return persistableBundle;
    }
}
