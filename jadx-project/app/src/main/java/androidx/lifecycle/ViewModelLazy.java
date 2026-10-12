package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BC\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Lkotlin/Lazy;", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "factoryProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cached", "Landroidx/lifecycle/ViewModel;", "value", "getValue", "()Landroidx/lifecycle/ViewModel;", "isInitialized", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    private VM cached;
    private final Function0<CreationExtras> extrasProducer;
    private final Function0<ViewModelProvider.Factory> factoryProducer;
    private final Function0<ViewModelStore> storeProducer;
    private final KClass<VM> viewModelClass;

    @Override // kotlin.Lazy
    public /* bridge */ /* synthetic */ Object getValue() {
        return getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(KClass<VM> r2, Function0<? extends ViewModelStore> r3, Function0<? extends ViewModelProvider.Factory> r4, Function0<? extends CreationExtras> r5) {
        Intrinsics.checkNotNullParameter(r2, "viewModelClass");
        Intrinsics.checkNotNullParameter(r3, "storeProducer");
        Intrinsics.checkNotNullParameter(r4, "factoryProducer");
        Intrinsics.checkNotNullParameter(r5, "extrasProducer");
        this.viewModelClass = r2;
        this.storeProducer = r3;
        this.factoryProducer = r4;
        this.extrasProducer = r5;
    }

    public /* synthetic */ ViewModelLazy(KClass r1, Function0 r2, Function0 r3, Function0 r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = new ViewModelLazy$$ExternalSyntheticLambda0();
    L5:
        this(r1, r2, r3, r4);
    }

    static final CreationExtras.Empty _init_$lambda$0() {
        return CreationExtras.Empty.INSTANCE;
    }

    public ViewModelLazy(KClass<VM> r9, Function0<? extends ViewModelStore> r10, Function0<? extends ViewModelProvider.Factory> r11) {
        Intrinsics.checkNotNullParameter(r9, "viewModelClass");
        Intrinsics.checkNotNullParameter(r10, "storeProducer");
        Intrinsics.checkNotNullParameter(r11, "factoryProducer");
        Function0 r5 = null;
        this(r9, r10, r11, r5, 8, null);
    }

    @Override // kotlin.Lazy
    public VM getValue() {
        VM r0 = this.cached;
        if (r0 != null) goto L6;
        ViewModelStore r1 = this.storeProducer.invoke();
        ViewModelProvider.Factory r2 = this.factoryProducer.invoke();
        CreationExtras r3 = this.extrasProducer.invoke();
        VM r4 = (VM) ViewModelProvider.Companion.create(r1, r2, r3).get(this.viewModelClass);
        this.cached = r4;
        return r4;
    L6:
        return r0;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        if (this.cached == null) goto L5;
        return true;
    L5:
        return false;
    }
}
