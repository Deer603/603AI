package androidx.lifecycle;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    LifecycleRegistry getLifecycle();

    @Override // androidx.lifecycle.LifecycleOwner
    /* bridge */ /* synthetic */ default Lifecycle getLifecycle() {
        return getLifecycle();
    }
}
