package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/activity/OnBackPressedDispatcher;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements Function0<OnBackPressedDispatcher> {
    final /* synthetic */ ComponentActivity this$0;

    ComponentActivity$onBackPressedDispatcher$2(ComponentActivity r2) {
        this.this$0 = r2;
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ OnBackPressedDispatcher invoke() {
        return invoke();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final OnBackPressedDispatcher invoke() {
        final ComponentActivity r1 = this.this$0;
        final OnBackPressedDispatcher dispatcher = new OnBackPressedDispatcher(new ComponentActivity$onBackPressedDispatcher$2$$ExternalSyntheticLambda0(r1));
        final ComponentActivity r2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) goto L5;
    L9:
        return dispatcher;
    L5:
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) == true) goto L7;
        new Handler(Looper.getMainLooper()).post(new ComponentActivity$onBackPressedDispatcher$2$$ExternalSyntheticLambda1(r2, dispatcher));
        goto L9
    L7:
        ComponentActivity.access$addObserverForBackInvoker(r2, dispatcher);
        goto L9
    }

    static final void invoke$lambda$0(ComponentActivity this$0) {
        ComponentActivity.access$onBackPressed$s1027565324(this$0);     // Catch: NullPointerException -> L4 IllegalStateException -> L9
    L16:
        return;
    L9:
        e = move-exception;
        if (Intrinsics.areEqual(e.getMessage(), "Can not perform this action after onSaveInstanceState") == false) goto L13;
        return;
    L13:
        throw e;
    L4:
        e = move-exception;
        if (Intrinsics.areEqual(e.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference") == true) goto L17;
        throw e;
    }

    static final void invoke$lambda$2$lambda$1(ComponentActivity this$0, OnBackPressedDispatcher $dispatcher) {
        ComponentActivity.access$addObserverForBackInvoker(this$0, $dispatcher);
    }
}
