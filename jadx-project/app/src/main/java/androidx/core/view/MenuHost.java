package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public interface MenuHost {
    void addMenuProvider(MenuProvider r1);

    void addMenuProvider(MenuProvider r1, LifecycleOwner r2);

    void addMenuProvider(MenuProvider r1, LifecycleOwner r2, Lifecycle.State r3);

    void invalidateMenu();

    void removeMenuProvider(MenuProvider r1);
}
