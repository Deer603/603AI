package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AccessibilityServiceStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AccessibilityServiceStateProvider_androidKt$ObserveState$3$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Function1<Lifecycle.Event, Unit> $handleEvent;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function0<Unit> $onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(LifecycleOwner r2, Function1<? super Lifecycle.Event, Unit> r3, Function0<Unit> r4) {
        this.$lifecycleOwner = r2;
        this.$handleEvent = r3;
        this.$onDispose = r4;
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DisposableEffectResult invoke(DisposableEffectScope r2) {
        return invoke2(r2);
    }

    static final void invoke$lambda$0(Function1 $handleEvent, LifecycleOwner r1, Lifecycle.Event event) {
        $handleEvent.invoke(event);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final DisposableEffectResult invoke2(DisposableEffectScope $this$DisposableEffect) {
        final Function1<Lifecycle.Event, Unit> r0 = this.$handleEvent;
        final LifecycleEventObserver observer = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$$ExternalSyntheticLambda0(r0);
        this.$lifecycleOwner.getLifecycle().addObserver(observer);
        final Function0<Unit> r1 = this.$onDispose;
        final LifecycleOwner r2 = this.$lifecycleOwner;
        return new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1$invoke$$inlined$onDispose$1(r1, r2, observer);
    }
}
