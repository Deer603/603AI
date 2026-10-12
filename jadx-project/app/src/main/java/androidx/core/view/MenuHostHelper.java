package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class MenuHostHelper {
    private final CopyOnWriteArrayList<MenuProvider> mMenuProviders;
    private final Runnable mOnInvalidateMenuCallback;
    private final Map<MenuProvider, LifecycleContainer> mProviderToLifecycleContainers;

    private static class LifecycleContainer {
        final Lifecycle mLifecycle;
        private LifecycleEventObserver mObserver;

        LifecycleContainer(Lifecycle lifecycle, LifecycleEventObserver observer) {
            this.mLifecycle = lifecycle;
            this.mObserver = observer;
            this.mLifecycle.addObserver(observer);
        }

        void clearObservers() {
            this.mLifecycle.removeObserver(this.mObserver);
            this.mObserver = null;
        }
    }

    public MenuHostHelper(Runnable onInvalidateMenuCallback) {
        this.mMenuProviders = new CopyOnWriteArrayList();
        this.mProviderToLifecycleContainers = new HashMap();
        this.mOnInvalidateMenuCallback = onInvalidateMenuCallback;
    }

    public void onPrepareMenu(Menu menu) {
        Iterator<MenuProvider> r0 = this.mMenuProviders.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        MenuProvider menuProvider = r0.next();
        menuProvider.onPrepareMenu(menu);
        goto L4
    }

    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Iterator<MenuProvider> r0 = this.mMenuProviders.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        MenuProvider menuProvider = r0.next();
        menuProvider.onCreateMenu(menu, menuInflater);
        goto L4
    }

    public boolean onMenuItemSelected(MenuItem item) {
        Iterator<MenuProvider> r0 = this.mMenuProviders.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        MenuProvider menuProvider = r0.next();
        if (menuProvider.onMenuItemSelected(item) == false) goto L4;
        return true;
    L10:
        return false;
    }

    public void onMenuClosed(Menu menu) {
        Iterator<MenuProvider> r0 = this.mMenuProviders.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        MenuProvider menuProvider = r0.next();
        menuProvider.onMenuClosed(menu);
        goto L4
    }

    public void addMenuProvider(MenuProvider provider) {
        this.mMenuProviders.add(provider);
        this.mOnInvalidateMenuCallback.run();
    }

    public void addMenuProvider(final MenuProvider provider, LifecycleOwner owner) {
        addMenuProvider(provider);
        Lifecycle lifecycle = owner.getLifecycle();
        LifecycleContainer lifecycleContainer = this.mProviderToLifecycleContainers.remove(provider);
        if (lifecycleContainer == null) goto L5;
        lifecycleContainer.clearObservers();
    L5:
        LifecycleEventObserver observer = new MenuHostHelper$$ExternalSyntheticLambda1(this, provider);
        this.mProviderToLifecycleContainers.put(provider, new LifecycleContainer(lifecycle, observer));
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$0$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m7253lambda$addMenuProvider$0$androidxcoreviewMenuHostHelper(MenuProvider provider, LifecycleOwner source, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) goto L6;
        removeMenuProvider(provider);
        return;
    }

    public void addMenuProvider(final MenuProvider provider, LifecycleOwner owner, final Lifecycle.State state) {
        Lifecycle lifecycle = owner.getLifecycle();
        LifecycleContainer lifecycleContainer = this.mProviderToLifecycleContainers.remove(provider);
        if (lifecycleContainer == null) goto L5;
        lifecycleContainer.clearObservers();
    L5:
        LifecycleEventObserver observer = new MenuHostHelper$$ExternalSyntheticLambda0(this, state, provider);
        this.mProviderToLifecycleContainers.put(provider, new LifecycleContainer(lifecycle, observer));
    }

    /* JADX INFO: renamed from: lambda$addMenuProvider$1$androidx-core-view-MenuHostHelper, reason: not valid java name */
    /* synthetic */ void m7254lambda$addMenuProvider$1$androidxcoreviewMenuHostHelper(Lifecycle.State state, MenuProvider provider, LifecycleOwner source, Lifecycle.Event event) {
        if (event != Lifecycle.Event.upTo(state)) goto L6;
        addMenuProvider(provider);
        return;
    L6:
        if (event != Lifecycle.Event.ON_DESTROY) goto L9;
        removeMenuProvider(provider);
        return;
    L9:
        if (event != Lifecycle.Event.downFrom(state)) goto L14;
        this.mMenuProviders.remove(provider);
        this.mOnInvalidateMenuCallback.run();
        return;
    }

    public void removeMenuProvider(MenuProvider provider) {
        this.mMenuProviders.remove(provider);
        LifecycleContainer lifecycleContainer = this.mProviderToLifecycleContainers.remove(provider);
        if (lifecycleContainer == null) goto L5;
        lifecycleContainer.clearObservers();
    L5:
        this.mOnInvalidateMenuCallback.run();
    }
}
