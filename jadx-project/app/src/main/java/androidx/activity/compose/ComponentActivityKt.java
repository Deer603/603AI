package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\t¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DefaultActivityContentLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "setContent", "", "Landroidx/activity/ComponentActivity;", "parent", "Landroidx/compose/runtime/CompositionContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setOwners", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComponentActivityKt {
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = null;

    public static /* synthetic */ void setContent$default(ComponentActivity r0, CompositionContext r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = null;
    L5:
        setContent(r0, r1, r2);
    }

    public static final void setContent(ComponentActivity $this$setContent, CompositionContext parent, Function2<? super Composer, ? super Integer, Unit> r11) {
        View r0 = ((ViewGroup) $this$setContent.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        if ((r0 instanceof ComposeView) == false) goto L5;
        ComposeView existingComposeView = (ComposeView) r0;
    L7:
        if (existingComposeView == null) goto L9;
        ComposeView $this$setContent_u24lambda_u240 = existingComposeView;
        $this$setContent_u24lambda_u240.setParentCompositionContext(parent);
        $this$setContent_u24lambda_u240.setContent(r11);
        return;
    L9:
        ComposeView $this$setContent_u24lambda_u241 = new ComposeView($this$setContent, null, 0, 6, null);
        $this$setContent_u24lambda_u241.setParentCompositionContext(parent);
        $this$setContent_u24lambda_u241.setContent(r11);
        setOwners($this$setContent);
        $this$setContent.setContentView($this$setContent_u24lambda_u241, DefaultActivityContentLayoutParams);
        return;
    L5:
        existingComposeView = null;
        goto L7
    }

    static {
        DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    }

    private static final void setOwners(ComponentActivity $this$setOwners) {
        View decorView = $this$setOwners.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.get(decorView) != null) goto L6;
        ViewTreeLifecycleOwner.set(decorView, $this$setOwners);
    L6:
        if (ViewTreeViewModelStoreOwner.get(decorView) != null) goto L9;
        ViewTreeViewModelStoreOwner.set(decorView, $this$setOwners);
    L9:
        if (ViewTreeSavedStateRegistryOwner.get(decorView) != null) goto L12;
        ViewTreeSavedStateRegistryOwner.set(decorView, $this$setOwners);
        return;
    }
}
