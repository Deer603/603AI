package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: SavedStateViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\tB%\b\u0017\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0003\u0010\fJ-\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J-\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u001bJ+\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u001a¢\u0006\u0002\u0010\u001eJ%\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0016¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014H\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "factory", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Ljava/lang/Class;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    private Application application;
    private Bundle defaultArgs;
    private final ViewModelProvider.Factory factory;
    private Lifecycle lifecycle;
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this(application, owner, null);
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner owner, Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = defaultArgs;
        this.application = application;
        if (application == null) goto L5;
        ViewModelProvider.AndroidViewModelFactory r0 = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
    L6:
        this.factory = r0;
        return;
    L5:
        r0 = new ViewModelProvider.AndroidViewModelFactory();
        goto L6
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(KClass<T> r2, CreationExtras r3) {
        Intrinsics.checkNotNullParameter(r2, "modelClass");
        Intrinsics.checkNotNullParameter(r3, "extras");
        return (T) create(JvmClassMappingKt.getJavaClass(r2), r3);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> r6, CreationExtras r7) {
        Intrinsics.checkNotNullParameter(r6, "modelClass");
        Intrinsics.checkNotNullParameter(r7, "extras");
        String r0 = (String) r7.get(ViewModelProvider.VIEW_MODEL_KEY);
        if (r0 == null) goto L29;
        if (r7.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null) goto L23;
        if (r7.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) goto L23;
        Application r1 = (Application) r7.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean r2 = AndroidViewModel.class.isAssignableFrom(r6);
        if (r2 == false) goto L12;
        if (r1 == null) goto L12;
        Constructor r3 = SavedStateViewModelFactory_androidKt.findMatchingConstructor(r6, SavedStateViewModelFactory_androidKt.access$getANDROID_VIEWMODEL_SIGNATURE$p());
    L14:
        if (r3 == null) goto L16;
        if (r2 == false) goto L30;
        if (r1 == null) goto L30;
        return (T) SavedStateViewModelFactory_androidKt.newInstance(r6, r3, new Object[]{r1, SavedStateHandleSupport.createSavedStateHandle(r7)});
    L30:
        return (T) SavedStateViewModelFactory_androidKt.newInstance(r6, r3, new Object[]{SavedStateHandleSupport.createSavedStateHandle(r7)});
    L16:
        return (T) this.factory.create(r6, r7);
    L12:
        r3 = SavedStateViewModelFactory_androidKt.findMatchingConstructor(r6, SavedStateViewModelFactory_androidKt.access$getVIEWMODEL_SIGNATURE$p());
    L23:
        if (this.lifecycle == null) goto L27;
        return (T) create(r0, r6);
    L27:
        throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
    L29:
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final <T extends ViewModel> T create(String r8, Class<T> r9) {
        Intrinsics.checkNotNullParameter(r8, "key");
        Intrinsics.checkNotNullParameter(r9, "modelClass");
        Lifecycle r0 = this.lifecycle;
        if (r0 == null) goto L26;
        boolean r1 = AndroidViewModel.class.isAssignableFrom(r9);
        if (r1 == true) goto L7;
    L9:
        Constructor r2 = SavedStateViewModelFactory_androidKt.findMatchingConstructor(r9, SavedStateViewModelFactory_androidKt.access$getVIEWMODEL_SIGNATURE$p());
    L11:
        if (r2 == null) goto L13;
        SavedStateRegistry r3 = this.savedStateRegistry;
        Intrinsics.checkNotNull(r3);
        SavedStateHandleController r4 = LegacySavedStateHandleController.create(r3, r0, r8, this.defaultArgs);
        if (r1 == true) goto L20;
    L22:
        T r5 = (T) SavedStateViewModelFactory_androidKt.newInstance(r9, r2, new Object[]{r4.getHandle()});
    L23:
        T r6 = r5;
        r6.addCloseable(LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, r4);
        return r5;
    L20:
        if (this.application == null) goto L22;
        Application r7 = this.application;
        Intrinsics.checkNotNull(r7);
        r5 = (T) SavedStateViewModelFactory_androidKt.newInstance(r9, r2, new Object[]{r7, r4.getHandle()});
        goto L23
    L13:
        if (this.application == null) goto L16;
        return (T) this.factory.create(r9);
    L16:
        return (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(r9);
    L7:
        if (this.application == null) goto L9;
        r2 = SavedStateViewModelFactory_androidKt.findMatchingConstructor(r9, SavedStateViewModelFactory_androidKt.access$getANDROID_VIEWMODEL_SIGNATURE$p());
        goto L11
    L26:
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> r3) {
        Intrinsics.checkNotNullParameter(r3, "modelClass");
        String r0 = r3.getCanonicalName();
        if (r0 == null) goto L7;
        return (T) create(r0, r3);
    L7:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle == null) goto L6;
        SavedStateRegistry r0 = this.savedStateRegistry;
        Intrinsics.checkNotNull(r0);
        Lifecycle r1 = this.lifecycle;
        Intrinsics.checkNotNull(r1);
        LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, r0, r1);
        return;
    }
}
