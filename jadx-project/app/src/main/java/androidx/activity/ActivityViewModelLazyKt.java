package androidx.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass1(ComponentActivity r2) {
            this.$this_viewModels = r2;
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
            return invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass2 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass2(ComponentActivity r2) {
            this.$this_viewModels = r2;
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ CreationExtras invoke() {
            return invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function0<ViewModelStore> {
        final /* synthetic */ ComponentActivity $this_viewModels;

        public AnonymousClass3(ComponentActivity r2) {
            this.$this_viewModels = r2;
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ ViewModelStore invoke() {
            return invoke();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements Function0<CreationExtras> {
        final /* synthetic */ Function0<CreationExtras> $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function0<? extends CreationExtras> r2, ComponentActivity r3) {
            this.$extrasProducer = r2;
            this.$this_viewModels = r3;
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            Function0<CreationExtras> r0 = this.$extrasProducer;
            if (r0 == null) goto L7;
            CreationExtras r1 = r0.invoke();
            if (r1 == null) goto L7;
            return r1;
        L7:
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ CreationExtras invoke() {
            return invoke();
        }
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity $this$viewModels_u24default, Function0 factoryProducer, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L5;
        factoryProducer = null;
    L5:
        Intrinsics.checkNotNullParameter($this$viewModels_u24default, "<this>");
        if (factoryProducer != null) goto L8;
        ActivityViewModelLazyKt$viewModels$factoryPromise$1 factoryPromise = new ActivityViewModelLazyKt$viewModels$factoryPromise$1($this$viewModels_u24default);
    L9:
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new AnonymousClass1($this$viewModels_u24default), factoryPromise, new AnonymousClass2($this$viewModels_u24default));
    L8:
        factoryPromise = factoryProducer;
        goto L9
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity $this$viewModels, Function0<? extends ViewModelProvider.Factory> r7) {
        Intrinsics.checkNotNullParameter($this$viewModels, "<this>");
        if (r7 != null) goto L5;
        ActivityViewModelLazyKt$viewModels$factoryPromise$1 r1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$1($this$viewModels);
    L6:
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new AnonymousClass1($this$viewModels), r1, new AnonymousClass2($this$viewModels));
    L5:
        r1 = r7;
        goto L6
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity $this$viewModels_u24default, Function0 extrasProducer, Function0 factoryProducer, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        extrasProducer = null;
    L6:
        if ((r7 & 2) == 0) goto L8;
        factoryProducer = null;
    L8:
        Intrinsics.checkNotNullParameter($this$viewModels_u24default, "<this>");
        if (factoryProducer != null) goto L11;
        ActivityViewModelLazyKt$viewModels$factoryPromise$2 factoryPromise = new ActivityViewModelLazyKt$viewModels$factoryPromise$2($this$viewModels_u24default);
    L12:
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new AnonymousClass3($this$viewModels_u24default), factoryPromise, new AnonymousClass4(extrasProducer, $this$viewModels_u24default));
    L11:
        factoryPromise = factoryProducer;
        goto L12
    }

    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity $this$viewModels, Function0<? extends CreationExtras> r7, Function0<? extends ViewModelProvider.Factory> r8) {
        Intrinsics.checkNotNullParameter($this$viewModels, "<this>");
        if (r8 != null) goto L5;
        ActivityViewModelLazyKt$viewModels$factoryPromise$2 r1 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2($this$viewModels);
    L6:
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(Reflection.getOrCreateKotlinClass(ViewModel.class), new AnonymousClass3($this$viewModels), r1, new AnonymousClass4(r7, $this$viewModels));
    L5:
        r1 = r8;
        goto L6
    }
}
