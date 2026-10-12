package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ReplaceWith;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes4.dex */
public final class MenuCompat {

    static class Api28Impl {
        private Api28Impl() {
        }

        static void setGroupDividerEnabled(Menu menu, boolean groupDividerEnabled) {
            menu.setGroupDividerEnabled(groupDividerEnabled);
        }
    }

    @ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void setShowAsAction(MenuItem item, int actionEnum) {
        item.setShowAsAction(actionEnum);
    }

    public static void setGroupDividerEnabled(Menu menu, boolean enabled) {
        if ((menu instanceof SupportMenu) == false) goto L6;
        ((SupportMenu) menu).setGroupDividerEnabled(enabled);
        return;
    L6:
        if (Build.VERSION.SDK_INT < 28) goto L10;
        Api28Impl.setGroupDividerEnabled(menu, enabled);
        return;
    }

    private MenuCompat() {
    }
}
