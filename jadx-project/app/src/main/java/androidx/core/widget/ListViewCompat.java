package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ListViewCompat {
    @ReplaceWith(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void scrollListBy(ListView listView, int y) {
        listView.scrollListBy(y);
    }

    @ReplaceWith(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean canScrollList(ListView listView, int direction) {
        return listView.canScrollList(direction);
    }

    private ListViewCompat() {
    }
}
