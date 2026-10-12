package androidx.compose.ui.window;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\u001a\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/window/Api33Impl;", "", "()V", "createBackCallback", "Landroid/window/OnBackInvokedCallback;", "onDismissRequest", "Lkotlin/Function0;", "", "maybeRegisterBackCallback", "view", "Landroid/view/View;", "backCallback", "maybeUnregisterBackCallback", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Api33Impl {
    public static final Api33Impl INSTANCE = null;

    static {
        INSTANCE = new Api33Impl();
    }

    private Api33Impl() {
    }

    @JvmStatic
    public static final OnBackInvokedCallback createBackCallback(final Function0<Unit> r1) {
        return new Api33Impl$$ExternalSyntheticLambda0(r1);
    }

    static final void createBackCallback$lambda$0(Function0 $onDismissRequest) {
        if ($onDismissRequest == null) goto L5;
        $onDismissRequest.invoke();
        return;
    }

    @JvmStatic
    public static final void maybeRegisterBackCallback(View view, Object backCallback) {
        if ((backCallback instanceof OnBackInvokedCallback) == false) goto L8;
        OnBackInvokedDispatcher r0 = view.findOnBackInvokedDispatcher();
        if (r0 == null) goto L9;
        r0.registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) backCallback);
        return;
    L9:
        return;
    }

    @JvmStatic
    public static final void maybeUnregisterBackCallback(View view, Object backCallback) {
        if ((backCallback instanceof OnBackInvokedCallback) == false) goto L8;
        OnBackInvokedDispatcher r0 = view.findOnBackInvokedDispatcher();
        if (r0 == null) goto L9;
        r0.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        return;
    L9:
        return;
    }
}
