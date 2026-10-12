package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0006\u0010\u001b\u001a\u00020\u0005J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020#H\u0016J&\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b(¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-H\u0002J$\u0010.\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u00020\u0014X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroidx/activity/ComponentDialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/DialogProperties;", "composeView", "Landroid/view/View;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "dialogId", "Ljava/util/UUID;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;)V", "dialogLayout", "Landroidx/compose/ui/window/DialogLayout;", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "subCompositionView", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "cancel", "disposeComposition", "onKeyUp", "", "keyCode", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onTouchEvent", "Landroid/view/MotionEvent;", "setContent", "parentComposition", "Landroidx/compose/runtime/CompositionContext;", "children", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setLayoutDirection", "setSecurePolicy", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "updateParameters", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private Function0<Unit> onDismissRequest;
    private DialogProperties properties;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[LayoutDirection.values().length];
            r0[LayoutDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[LayoutDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ Function0 access$getOnDismissRequest$p(DialogWrapper $this) {
        return $this.onDismissRequest;
    }

    public static final /* synthetic */ DialogProperties access$getProperties$p(DialogWrapper $this) {
        return $this.properties;
    }

    public DialogWrapper(Function0<Unit> r10, DialogProperties properties, View composeView, LayoutDirection layoutDirection, Density density, UUID dialogId) {
        Context r1 = composeView.getContext();
        if (properties.getDecorFitsSystemWindows() == false) goto L5;
        int r2 = R.style.DialogWindowTheme;
    L6:
        ViewGroup r3 = null;
        super(new ContextThemeWrapper(r1, r2), 0, 2, null);
        this.onDismissRequest = r10;
        this.properties = properties;
        this.composeView = composeView;
        this.maxSupportedElevation = Dp.m6973constructorimpl(8);
        Window window = getWindow();
        if (window == null) goto L16;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.setDecorFitsSystemWindows(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        DialogLayout $this$_init__u24lambda_u241 = new DialogLayout(getContext(), window);
        $this$_init__u24lambda_u241.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + dialogId);
        $this$_init__u24lambda_u241.setClipChildren(false);
        $this$_init__u24lambda_u241.setElevation(density.mo376toPx0680j_4(this.maxSupportedElevation));
        $this$_init__u24lambda_u241.setOutlineProvider(new DialogWrapper$1$2());
        this.dialogLayout = $this$_init__u24lambda_u241;
        View r4 = window.getDecorView();
        if ((r4 instanceof ViewGroup) == false) goto L11;
        r3 = (ViewGroup) r4;
    L11:
        if (r3 == null) goto L13;
        _init_$disableClipping(r3);
    L13:
        setContentView(this.dialogLayout);
        ViewTreeLifecycleOwner.set(this.dialogLayout, ViewTreeLifecycleOwner.get(this.composeView));
        ViewTreeViewModelStoreOwner.set(this.dialogLayout, ViewTreeViewModelStoreOwner.get(this.composeView));
        ViewTreeSavedStateRegistryOwner.set(this.dialogLayout, ViewTreeSavedStateRegistryOwner.get(this.composeView));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), this, false, new AnonymousClass2(this), 2, null);
        return;
    L16:
        throw new IllegalStateException("Dialog has no window".toString());
    L5:
        r2 = R.style.FloatingDialogWindowTheme;
        goto L6
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    private static final void _init_$disableClipping(ViewGroup $this$_init__u24disableClipping) {
        $this$_init__u24disableClipping.setClipChildren(false);
        if (($this$_init__u24disableClipping instanceof DialogLayout) == false) goto L5;
        return;
    L5:
        int i = 0;
        int r1 = $this$_init__u24disableClipping.getChildCount();
    L6:
        if (i >= r1) goto L14;
        View r2 = $this$_init__u24disableClipping.getChildAt(i);
        if ((r2 instanceof ViewGroup) == false) goto L10;
        ViewGroup r3 = (ViewGroup) r2;
    L11:
        if (r3 == null) goto L13;
        _init_$disableClipping(r3);
    L13:
        i = i + 1;
        goto L6
    L10:
        r3 = null;
        goto L11
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.properties.getDismissOnBackPress() == false) goto L13;
        if (event.isTracking() == false) goto L13;
        if (event.isCanceled() == true) goto L13;
        if (keyCode != 111) goto L13;
        this.onDismissRequest.invoke();
        return true;
    L13:
        return super.onKeyUp(keyCode, event);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout r0 = this.dialogLayout;
        switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int r1 = 1;
    L8:
        r0.setLayoutDirection(r1);
        return;
    L7:
        r1 = 0;
        goto L8
    L5:
        throw new NoWhenBranchMatchedException();
    }

    public final void setContent(CompositionContext parentComposition, Function2<? super Composer, ? super Integer, Unit> r3) {
        this.dialogLayout.setContent(parentComposition, r3);
    }

    private final void setSecurePolicy(SecureFlagPolicy securePolicy) {
        boolean secureFlagEnabled = SecureFlagPolicy_androidKt.shouldApplySecureFlag(securePolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window r1 = getWindow();
        Intrinsics.checkNotNull(r1);
        if (secureFlagEnabled == false) goto L5;
        int r3 = 8192;
    L6:
        r1.setFlags(r3, 8192);
        return;
    L5:
        r3 = -8193;
        goto L6
    }

    public final void updateParameters(Function0<Unit> r5, DialogProperties properties, LayoutDirection layoutDirection) {
        this.onDismissRequest = r5;
        this.properties = properties;
        setSecurePolicy(properties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = properties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(properties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(properties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window == null) goto L12;
        if (decorFitsSystemWindows == false) goto L7;
        int softInput = 0;
    L10:
        window.setSoftInputMode(softInput);
        return;
    L7:
        if (Build.VERSION.SDK_INT >= 31) goto L9;
        softInput = 16;
        goto L10
    L9:
        softInput = 48;
        goto L10
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        if (this.properties.getDismissOnClickOutside() == true) goto L5;
        return result;
    L5:
        if (this.dialogLayout.isInsideContent(event) == true) goto L9;
        this.onDismissRequest.invoke();
        return true;
    L9:
        return result;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
