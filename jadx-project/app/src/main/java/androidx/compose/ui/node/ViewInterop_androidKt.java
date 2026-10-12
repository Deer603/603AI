package androidx.compose.ui.node;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ViewInterop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a1\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\bH\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"viewAdaptersKey", "", "tagKey", "key", "", "getOrAddAdapter", "T", "Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "id", "factory", "Lkotlin/Function0;", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "getViewAdapter", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = 0;

    public static final <T extends ViewAdapter> T getOrAddAdapter(View $this$getOrAddAdapter, int id, Function0<? extends T> r18) {
        MergedViewAdapter this_$iv = getViewAdapter($this$getOrAddAdapter);
        List<ViewAdapter> r2 = this_$iv.getAdapters();
        int index$iv$iv$iv = 0;
        int r7 = r2.size();
    L3:
        T r8 = null;
        if (index$iv$iv$iv >= r7) goto L12;
        ViewAdapter item$iv$iv$iv = r2.get(index$iv$iv$iv);
        ViewAdapter it$iv$iv = item$iv$iv$iv;
        ViewAdapter it$iv = it$iv$iv;
        if (it$iv.getId() != id) goto L8;
        boolean r14 = true;
    L9:
        if (r14 == true) goto L14;
        index$iv$iv$iv = index$iv$iv$iv + 1;
    L14:
        if ((it$iv$iv instanceof ViewAdapter) == false) goto L16;
        r8 = (T) it$iv$iv;
    L16:
        if (r8 != null) goto L21;
        T r3 = r18.invoke();
        this_$iv.getAdapters().add(r3);
        return r3;
    L21:
        return r8;
    L8:
        r14 = false;
        goto L9
    L12:
        it$iv$iv = null;
        goto L14
    }

    public static final int tagKey(String key) {
        return 50331648 | key.hashCode();
    }

    static {
        viewAdaptersKey = tagKey("ViewAdapter");
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View $this$getViewAdapterIfExists) {
        Object r0 = $this$getViewAdapterIfExists.getTag(viewAdaptersKey);
        if ((r0 instanceof MergedViewAdapter) == true) goto L7;
        return null;
    L7:
        return (MergedViewAdapter) r0;
    }

    public static final MergedViewAdapter getViewAdapter(View $this$getViewAdapter) {
        Object r0 = $this$getViewAdapter.getTag(viewAdaptersKey);
        if ((r0 instanceof MergedViewAdapter) == false) goto L5;
        MergedViewAdapter adapter = (MergedViewAdapter) r0;
    L6:
        if (adapter != null) goto L9;
        MergedViewAdapter adapter2 = new MergedViewAdapter();
        $this$getViewAdapter.setTag(viewAdaptersKey, adapter2);
        return adapter2;
    L9:
        return adapter;
    L5:
        adapter = null;
        goto L6
    }
}
