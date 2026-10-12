package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.internal.SynchronizedObject;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: ViewModelProviderImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "store", "Landroidx/lifecycle/ViewModelStore;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "key", "", "getViewModel$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewModelProviderImpl {
    private final CreationExtras defaultExtras;
    private final ViewModelProvider.Factory factory;
    private final SynchronizedObject lock;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.store = store;
        this.factory = factory;
        this.defaultExtras = defaultExtras;
        this.lock = new SynchronizedObject();
    }

    public static final /* synthetic */ CreationExtras access$getDefaultExtras$p(ViewModelProviderImpl $this) {
        return $this.defaultExtras;
    }

    public static final /* synthetic */ ViewModelProvider.Factory access$getFactory$p(ViewModelProviderImpl $this) {
        return $this.factory;
    }

    public static final /* synthetic */ ViewModelStore access$getStore$p(ViewModelProviderImpl $this) {
        return $this.store;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl r0, KClass r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(r1);
    L6:
        return r0.getViewModel$lifecycle_viewmodel_release(r1, r2);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(KClass<T> r11, String r12) {
        Intrinsics.checkNotNullParameter(r11, "modelClass");
        Intrinsics.checkNotNullParameter(r12, "key");
        SynchronizedObject r0 = this.lock;
        monitor-enter(r0);
        T r4 = (T) access$getStore$p(this).get(r12);
        if (r11.isInstance(r4) == true) goto L8;
        MutableCreationExtras r5 = new MutableCreationExtras(access$getDefaultExtras$p(this));     // Catch: Throwable -> L15
        r5.set(ViewModelProvider.VIEW_MODEL_KEY, r12);     // Catch: Throwable -> L15
        ViewModel r6 = ViewModelProviderImpl_androidKt.createViewModel(access$getFactory$p(this), r11, r5);     // Catch: Throwable -> L15
        access$getStore$p(this).put(r12, r6);     // Catch: Throwable -> L15
        r4 = (T) r6;
    L13:
        monitor-exit(r0);
        return r4;
    L8:
        if ((access$getFactory$p(this) instanceof ViewModelProvider.OnRequeryFactory) == false) goto L10;
        ViewModelProvider.OnRequeryFactory r7 = (ViewModelProvider.OnRequeryFactory) access$getFactory$p(this);     // Catch: Throwable -> L15
        Intrinsics.checkNotNull(r4);     // Catch: Throwable -> L15
        r7.onRequery(r4);     // Catch: Throwable -> L15
    L10:
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    }
}
