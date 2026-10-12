package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"installForLifecycle", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewCompositionStrategy_androidKt {
    public static final /* synthetic */ Function0 access$installForLifecycle(AbstractComposeView view, Lifecycle lifecycle) {
        return installForLifecycle(view, lifecycle);
    }

    private static final Function0<Unit> installForLifecycle(final AbstractComposeView view, final Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L10;
        final LifecycleEventObserver observer = new ViewCompositionStrategy_androidKt$$ExternalSyntheticLambda0(view);
        lifecycle.addObserver(observer);
        return new AnonymousClass2(lifecycle, observer);
    L10:
        throw new IllegalStateException(("Cannot configure " + view + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    L5:
        r0 = false;
        goto L6
    }

    static final void installForLifecycle$lambda$1(AbstractComposeView $view, LifecycleOwner r1, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) goto L6;
        $view.disposeComposition();
        return;
    }
}
