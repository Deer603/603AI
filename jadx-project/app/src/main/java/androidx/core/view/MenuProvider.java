package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes4.dex */
public interface MenuProvider {
    void onCreateMenu(Menu r1, MenuInflater r2);

    boolean onMenuItemSelected(MenuItem r1);

    default void onPrepareMenu(Menu menu) {
    }

    default void onMenuClosed(Menu menu) {
    }
}
