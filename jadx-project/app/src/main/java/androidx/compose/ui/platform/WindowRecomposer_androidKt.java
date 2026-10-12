package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u001a \u0010\u0018\u001a\u00020\u0011*\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u001a\f\u0010\u001d\u001a\u0004\u0018\u00010\u0006*\u00020\b\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u00020\b*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0010\u001a\u00020\u0011*\u00020\b8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"animationScale", "", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/StateFlow;", "", "value", "Landroidx/compose/runtime/CompositionContext;", "compositionContext", "Landroid/view/View;", "getCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "contentChild", "getContentChild", "(Landroid/view/View;)Landroid/view/View;", "windowRecomposer", "Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getAnimationScaleFlowFor", "applicationContext", "createLifecycleAwareWindowRecomposer", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "findViewTreeCompositionContext", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowRecomposer_androidKt {
    private static final Map<Context, StateFlow<Float>> animationScale = null;

    public static final /* synthetic */ StateFlow access$getAnimationScaleFlowFor(Context applicationContext) {
        return getAnimationScaleFlowFor(applicationContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View r0) {
    }

    public static final CompositionContext getCompositionContext(View $this$compositionContext) {
        Object r0 = $this$compositionContext.getTag(R.id.androidx_compose_ui_view_composition_context);
        if ((r0 instanceof CompositionContext) == true) goto L7;
        return null;
    L7:
        return (CompositionContext) r0;
    }

    public static final void setCompositionContext(View $this$compositionContext, CompositionContext value) {
        $this$compositionContext.setTag(R.id.androidx_compose_ui_view_composition_context, value);
    }

    public static final CompositionContext findViewTreeCompositionContext(View $this$findViewTreeCompositionContext) {
        CompositionContext found = getCompositionContext($this$findViewTreeCompositionContext);
        if (found == null) goto L5;
        return found;
    L5:
        ViewParent parent = $this$findViewTreeCompositionContext.getParent();
    L6:
        if (found != null) goto L10;
        if ((parent instanceof View) == false) goto L10;
        found = getCompositionContext((View) parent);
        parent = parent.getParent();
    L10:
        return found;
    }

    static {
        animationScale = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    private static final StateFlow<Float> getAnimationScaleFlowFor(Context applicationContext) {
        Object lock$iv = animationScale;
        monitor-enter(lock$iv);
        Map<Context, StateFlow<Float>> r0 = animationScale;     // Catch: Throwable -> L12
        StateFlow<Float> r1 = r0.get(applicationContext);     // Catch: Throwable -> L12
        if (r1 != null) goto L8;
        ContentResolver resolver = applicationContext.getContentResolver();     // Catch: Throwable -> L12
        Uri animationScaleUri = Settings.Global.getUriFor("animator_duration_scale");     // Catch: Throwable -> L12
        final Channel channel = ChannelKt.Channel$default(-1, null, null, 6, null);     // Catch: Throwable -> L12
        final Handler r2 = HandlerCompat.createAsync(Looper.getMainLooper());     // Catch: Throwable -> L12
        StateFlow<Float> r3 = FlowKt.stateIn(FlowKt.flow(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(resolver, animationScaleUri, new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1(channel, r2), channel, applicationContext, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0, 0, 3, null), Float.valueOf(Settings.Global.getFloat(applicationContext.getContentResolver(), "animator_duration_scale", 1.0f)));     // Catch: Throwable -> L12
        r0.put(applicationContext, r3);     // Catch: Throwable -> L12
    L9:
        StateFlow<Float> r4 = r3;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        return r4;
    L8:
        r3 = r1;
    L12:
        th = move-exception;
        throw th;
    }

    private static final View getContentChild(View $this$contentChild) {
        View self = $this$contentChild;
        ViewParent parent = self.getParent();
    L4:
        if ((parent instanceof View) == false) goto L9;
        if (((View) parent).getId() == 16908290) goto L7;
        self = parent;
        parent = self.getParent();
        goto L4
    L7:
        return self;
    L9:
        return self;
    }

    public static final Recomposer getWindowRecomposer(View $this$windowRecomposer) {
        boolean value$iv = $this$windowRecomposer.isAttachedToWindow();
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + $this$windowRecomposer + " is not attached to a window");
    L5:
        View rootView = getContentChild($this$windowRecomposer);
        CompositionContext rootParentRef = getCompositionContext(rootView);
        if (rootParentRef != null) goto L9;
        return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(rootView);
    L9:
        if ((rootParentRef instanceof Recomposer) == false) goto L13;
        return (Recomposer) rootParentRef;
    L13:
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View r0, EmptyCoroutineContext r1, Lifecycle r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = EmptyCoroutineContext.INSTANCE;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = null;
    L9:
        return createLifecycleAwareWindowRecomposer(r0, r1, r2);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    public static final Recomposer createLifecycleAwareWindowRecomposer(final View $this$createLifecycleAwareWindowRecomposer, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        if (coroutineContext.get(ContinuationInterceptor.Key) != null) goto L5;
    L8:
        CoroutineContext baseContext = AndroidUiDispatcher.Companion.getCurrentThread().plus(coroutineContext);
    L9:
        MonotonicFrameClock it = (MonotonicFrameClock) baseContext.get(MonotonicFrameClock.Key);
        Lifecycle viewTreeLifecycle = null;
        if (it == null) goto L12;
        PausableMonotonicFrameClock $this$createLifecycleAwareWindowRecomposer_u24lambda_u244_u24lambda_u243 = new PausableMonotonicFrameClock(it);
        $this$createLifecycleAwareWindowRecomposer_u24lambda_u244_u24lambda_u243.pause();
    L13:
        final PausableMonotonicFrameClock pausableClock = $this$createLifecycleAwareWindowRecomposer_u24lambda_u244_u24lambda_u243;
        final Ref.ObjectRef systemDurationScaleSettingConsumer = new Ref.ObjectRef();
        MotionDurationScale motionDurationScale = (MotionDurationScale) baseContext.get(MotionDurationScale.Key);
        if (motionDurationScale != null) goto L17;
        ?? r1 = new MotionDurationScaleImpl();
        systemDurationScaleSettingConsumer.element = r1;
        motionDurationScale = (MotionDurationScale) r1;
    L17:
        if (pausableClock == null) goto L19;
        EmptyCoroutineContext r3 = pausableClock;
    L20:
        CoroutineContext contextWithClockAndMotionScale = baseContext.plus(r3).plus(motionDurationScale);
        final Recomposer recomposer = new Recomposer(contextWithClockAndMotionScale);
        recomposer.pauseCompositionFrameClock();
        final CoroutineScope runRecomposeScope = CoroutineScopeKt.CoroutineScope(contextWithClockAndMotionScale);
        if (lifecycle != null) goto L25;
        LifecycleOwner r4 = ViewTreeLifecycleOwner.get($this$createLifecycleAwareWindowRecomposer);
        if (r4 == null) goto L27;
        viewTreeLifecycle = r4.getLifecycle();
    L27:
        if (viewTreeLifecycle == null) goto L30;
        $this$createLifecycleAwareWindowRecomposer.addOnAttachStateChangeListener(new AnonymousClass1($this$createLifecycleAwareWindowRecomposer, recomposer));
        viewTreeLifecycle.addObserver(new AnonymousClass2(runRecomposeScope, pausableClock, recomposer, systemDurationScaleSettingConsumer, $this$createLifecycleAwareWindowRecomposer));
        return recomposer;
    L30:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + $this$createLifecycleAwareWindowRecomposer);
        throw new KotlinNothingValueException();
    L25:
        viewTreeLifecycle = lifecycle;
        goto L27
    L19:
        r3 = EmptyCoroutineContext.INSTANCE;
        goto L20
    L12:
        $this$createLifecycleAwareWindowRecomposer_u24lambda_u244_u24lambda_u243 = null;
        goto L13
    L5:
        if (coroutineContext.get(MonotonicFrameClock.Key) == null) goto L8;
        baseContext = coroutineContext;
        goto L9
    }
}
