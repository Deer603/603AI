package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0004)*+,B\u0013\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\fH\u0001¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0007J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\n\u001a\u00020\u0007H\u0007J\b\u0010 \u001a\u00020\u0014H\u0003J\b\u0010!\u001a\u00020\u0014H\u0007J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000eH\u0007J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0007H\u0003J\b\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "onHasEnabledCallbacksChanged", "Landroidx/core/util/Consumer;", "", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "inProgressCallback", "Landroidx/activity/OnBackPressedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackPressedCallbacks", "Lkotlin/collections/ArrayDeque;", "addCallback", "", "onBackPressedCallback", "owner", "Landroidx/lifecycle/LifecycleOwner;", "addCancellableCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "dispatchOnBackCancelled", "dispatchOnBackProgressed", "backEvent", "Landroidx/activity/BackEventCompat;", "dispatchOnBackStarted", "onBackCancelled", "onBackPressed", "onBackProgressed", "onBackStarted", "setOnBackInvokedDispatcher", "invoker", "updateBackInvokedCallbackState", "shouldBeRegistered", "updateEnabledCallbacks", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final ArrayDeque<OnBackPressedCallback> onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001¨\u0006\u000e"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "()V", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "", "registerOnBackInvokedCallback", "dispatcher", "priority", "", "callback", "unregisterOnBackInvokedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = null;

        static {
            INSTANCE = new Api33Impl();
        }

        private Api33Impl() {
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int priority, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            OnBackInvokedDispatcher onBackInvokedDispatcher = (OnBackInvokedDispatcher) dispatcher;
            OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback) callback;
            onBackInvokedDispatcher.registerOnBackInvokedCallback(priority, onBackInvokedCallback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            OnBackInvokedDispatcher onBackInvokedDispatcher = (OnBackInvokedDispatcher) dispatcher;
            OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback) callback;
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
        }

        static final void createOnBackInvokedCallback$lambda$0(Function0 $onBackInvoked) {
            $onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final Function0<Unit> r2) {
            Intrinsics.checkNotNullParameter(r2, "onBackInvoked");
            return new OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0(r2);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jh\u0010\u0003\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "()V", "createOnBackAnimationCallback", "Landroid/window/OnBackInvokedCallback;", "onBackStarted", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "backEvent", "", "onBackProgressed", "onBackInvoked", "Lkotlin/Function0;", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = null;

        static {
            INSTANCE = new Api34Impl();
        }

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final Function1<? super BackEventCompat, Unit> r2, final Function1<? super BackEventCompat, Unit> r3, final Function0<Unit> r4, final Function0<Unit> r5) {
            Intrinsics.checkNotNullParameter(r2, "onBackStarted");
            Intrinsics.checkNotNullParameter(r3, "onBackProgressed");
            Intrinsics.checkNotNullParameter(r4, "onBackInvoked");
            Intrinsics.checkNotNullParameter(r5, "onBackCancelled");
            return new OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1(r2, r3, r4, r5);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "currentCancellable", "cancel", "", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher this$0, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = this$0;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            this.lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
            if (event != Lifecycle.Event.ON_START) goto L6;
            this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
            return;
        L6:
            if (event != Lifecycle.Event.ON_STOP) goto L11;
            Cancellable r0 = this.currentCancellable;
            if (r0 == null) goto L15;
            r0.cancel();
            return;
        L15:
            return;
        L11:
            if (event != Lifecycle.Event.ON_DESTROY) goto L17;
            cancel();
            return;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable r0 = this.currentCancellable;
            if (r0 == null) goto L5;
            r0.cancel();
        L5:
            this.currentCancellable = null;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "cancel", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher this$0, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = this$0;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            OnBackPressedDispatcher.access$getOnBackPressedCallbacks$p(this.this$0).remove(this.onBackPressedCallback);
            if (Intrinsics.areEqual(OnBackPressedDispatcher.access$getInProgressCallback$p(this.this$0), this.onBackPressedCallback) == false) goto L5;
            this.onBackPressedCallback.handleOnBackCancelled();
            OnBackPressedDispatcher.access$setInProgressCallback$p(this.this$0, null);
        L5:
            this.onBackPressedCallback.removeCancellable(this);
            Function0<Unit> r0 = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (r0 == null) goto L8;
            r0.invoke();
        L8:
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class C01551 extends FunctionReferenceImpl implements Function0<Unit> {
        C01551(Object r8) {
            super(0, r8, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.access$updateEnabledCallbacks((OnBackPressedDispatcher) this.receiver);
        }
    }

    public OnBackPressedDispatcher(Runnable fallbackOnBackPressed, Consumer<Boolean> r7) {
        this.fallbackOnBackPressed = fallbackOnBackPressed;
        this.onHasEnabledCallbacksChanged = r7;
        this.onBackPressedCallbacks = new ArrayDeque();
        if (Build.VERSION.SDK_INT >= 33) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 34) goto L7;
        OnBackInvokedCallback r0 = Api34Impl.INSTANCE.createOnBackAnimationCallback(new AnonymousClass1(this), new AnonymousClass2(this), new AnonymousClass3(this), new AnonymousClass4(this));
    L8:
        this.onBackInvokedCallback = r0;
        return;
    L7:
        r0 = Api33Impl.INSTANCE.createOnBackInvokedCallback(new AnonymousClass5(this));
        goto L8
    }

    public static final /* synthetic */ OnBackPressedCallback access$getInProgressCallback$p(OnBackPressedDispatcher $this) {
        return $this.inProgressCallback;
    }

    public static final /* synthetic */ ArrayDeque access$getOnBackPressedCallbacks$p(OnBackPressedDispatcher $this) {
        return $this.onBackPressedCallbacks;
    }

    public static final /* synthetic */ void access$onBackCancelled(OnBackPressedDispatcher $this) {
        $this.onBackCancelled();
    }

    public static final /* synthetic */ void access$onBackProgressed(OnBackPressedDispatcher $this, BackEventCompat backEvent) {
        $this.onBackProgressed(backEvent);
    }

    public static final /* synthetic */ void access$onBackStarted(OnBackPressedDispatcher $this, BackEventCompat backEvent) {
        $this.onBackStarted(backEvent);
    }

    public static final /* synthetic */ void access$setInProgressCallback$p(OnBackPressedDispatcher $this, OnBackPressedCallback r1) {
        $this.inProgressCallback = r1;
    }

    public static final /* synthetic */ void access$updateEnabledCallbacks(OnBackPressedDispatcher $this) {
        $this.updateEnabledCallbacks();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OnBackPressedDispatcher(Runnable fallbackOnBackPressed) {
        this(fallbackOnBackPressed, null);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    private final void updateBackInvokedCallbackState(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher dispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (dispatcher == null) goto L15;
        if (onBackInvokedCallback != null) goto L6;
        return;
    L6:
        if (shouldBeRegistered == true) goto L8;
    L10:
        if (shouldBeRegistered == false) goto L12;
        return;
    L12:
        if (this.backInvokedCallbackRegistered == false) goto L19;
        Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(dispatcher, onBackInvokedCallback);
        this.backInvokedCallbackRegistered = false;
        return;
    L19:
        return;
    L8:
        if (this.backInvokedCallbackRegistered == true) goto L10;
        Api33Impl.INSTANCE.registerOnBackInvokedCallback(dispatcher, 0, onBackInvokedCallback);
        this.backInvokedCallbackRegistered = true;
        return;
    }

    private final void updateEnabledCallbacks() {
        boolean hadEnabledCallbacks = this.hasEnabledCallbacks;
        Iterable $this$any$iv = this.onBackPressedCallbacks;
        boolean hasEnabledCallbacks = false;
        if (($this$any$iv instanceof Collection) == true) goto L5;
    L7:
        Iterator<OnBackPressedCallback> r3 = $this$any$iv.iterator();
    L9:
        if (r3.hasNext() == false) goto L14;
        Object element$iv = r3.next();
        OnBackPressedCallback it = (OnBackPressedCallback) element$iv;
        if (it.isEnabled() == false) goto L9;
        hasEnabledCallbacks = true;
    L14:
        this.hasEnabledCallbacks = hasEnabledCallbacks;
        if (hasEnabledCallbacks == hadEnabledCallbacks) goto L26;
        Consumer<Boolean> r1 = this.onHasEnabledCallbacksChanged;
        if (r1 == null) goto L20;
        r1.accept(Boolean.valueOf(hasEnabledCallbacks));
    L20:
        if (Build.VERSION.SDK_INT < 33) goto L27;
        updateBackInvokedCallbackState(hasEnabledCallbacks);
        return;
    L27:
        return;
    L26:
        return;
    L5:
        if (((Collection) $this$any$iv).isEmpty() == false) goto L7;
        goto L7
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable cancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(cancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return cancellable;
    }

    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) goto L5;
        return;
    L5:
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C01551(this));
    }

    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void dispatchOnBackStarted(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    private final void onBackStarted(BackEventCompat backEvent) {
        List $this$lastOrNull$iv = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> r2 = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
    L4:
        if (r2.hasPrevious() == false) goto L8;
        Object element$iv = r2.previous();
        OnBackPressedCallback it = (OnBackPressedCallback) element$iv;
        if (it.isEnabled() == false) goto L4;
    L9:
        OnBackPressedCallback callback = (OnBackPressedCallback) element$iv;
        if (this.inProgressCallback == null) goto L12;
        onBackCancelled();
    L12:
        this.inProgressCallback = callback;
        if (callback == null) goto L16;
        callback.handleOnBackStarted(backEvent);
        return;
    L16:
        return;
    L8:
        element$iv = null;
        goto L9
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    private final void onBackProgressed(BackEventCompat backEvent) {
        OnBackPressedCallback callback = this.inProgressCallback;
        if (callback != null) goto L13;
        List $this$lastOrNull$iv = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> r2 = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
    L6:
        if (r2.hasPrevious() == false) goto L10;
        Object element$iv = r2.previous();
        OnBackPressedCallback it = (OnBackPressedCallback) element$iv;
        if (it.isEnabled() == false) goto L6;
    L11:
        callback = (OnBackPressedCallback) element$iv;
        goto L13
    L10:
        element$iv = null;
    L13:
        if (callback == null) goto L16;
        callback.handleOnBackProgressed(backEvent);
        return;
    }

    public final void onBackPressed() {
        OnBackPressedCallback callback = this.inProgressCallback;
        if (callback != null) goto L12;
        List $this$lastOrNull$iv = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> r3 = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
    L6:
        if (r3.hasPrevious() == false) goto L10;
        Object element$iv = r3.previous();
        OnBackPressedCallback it = (OnBackPressedCallback) element$iv;
        if (it.isEnabled() == false) goto L6;
    L11:
        callback = (OnBackPressedCallback) element$iv;
        goto L12
    L10:
        element$iv = null;
    L12:
        this.inProgressCallback = null;
        if (callback == null) goto L16;
        callback.handleOnBackPressed();
        return;
    L16:
        Runnable r1 = this.fallbackOnBackPressed;
        if (r1 == null) goto L23;
        r1.run();
        return;
    }

    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    private final void onBackCancelled() {
        OnBackPressedCallback callback = this.inProgressCallback;
        if (callback != null) goto L12;
        List $this$lastOrNull$iv = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> r3 = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
    L6:
        if (r3.hasPrevious() == false) goto L10;
        Object element$iv = r3.previous();
        OnBackPressedCallback it = (OnBackPressedCallback) element$iv;
        if (it.isEnabled() == false) goto L6;
    L11:
        callback = (OnBackPressedCallback) element$iv;
        goto L12
    L10:
        element$iv = null;
    L12:
        this.inProgressCallback = null;
        if (callback == null) goto L16;
        callback.handleOnBackCancelled();
        return;
    }
}
