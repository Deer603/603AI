package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J.\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0015H\u0086\b¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "()V", "adapters", "", "getAdapters", "()Ljava/util/List;", "id", "", "getId", "()I", "didInsert", "", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "didUpdate", "get", "T", "factory", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "willInsert", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 0;
    private final List<ViewAdapter> adapters;
    private final int id;

    static {
        $stable = 8;
    }

    public MergedViewAdapter() {
        this.adapters = new ArrayList();
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    public final <T extends ViewAdapter> T get(int id, Function0<? extends T> r17) {
        List<ViewAdapter> r1 = getAdapters();
        int index$iv$iv = 0;
        int r6 = r1.size();
    L3:
        T r7 = null;
        if (index$iv$iv >= r6) goto L12;
        ViewAdapter item$iv$iv = r1.get(index$iv$iv);
        ViewAdapter it$iv = item$iv$iv;
        ViewAdapter it = it$iv;
        if (it.getId() != id) goto L8;
        boolean r13 = true;
    L9:
        if (r13 == true) goto L14;
        index$iv$iv = index$iv$iv + 1;
    L14:
        if ((it$iv instanceof ViewAdapter) == false) goto L16;
        r7 = (T) it$iv;
    L16:
        if (r7 == null) goto L18;
        return r7;
    L18:
        T r2 = r17.invoke();
        getAdapters().add(r2);
        return r2;
    L8:
        r13 = false;
        goto L9
    L12:
        it$iv = null;
        goto L14
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(View view, ViewGroup parent) {
        List<ViewAdapter> r0 = this.adapters;
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        ViewAdapter it = (ViewAdapter) item$iv;
        it.willInsert(view, parent);
        index$iv = index$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(View view, ViewGroup parent) {
        List<ViewAdapter> r0 = this.adapters;
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        ViewAdapter it = (ViewAdapter) item$iv;
        it.didInsert(view, parent);
        index$iv = index$iv + 1;
        goto L3
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(View view, ViewGroup parent) {
        List<ViewAdapter> r0 = this.adapters;
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L6;
        Object item$iv = r0.get(index$iv);
        ViewAdapter it = (ViewAdapter) item$iv;
        it.didUpdate(view, parent);
        index$iv = index$iv + 1;
        goto L3
    }
}
