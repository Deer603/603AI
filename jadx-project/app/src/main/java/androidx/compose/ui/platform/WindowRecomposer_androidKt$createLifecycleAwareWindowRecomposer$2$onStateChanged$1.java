package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {388}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt.AnonymousClass2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ Ref.ObjectRef<MotionDurationScaleImpl> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref.ObjectRef<MotionDurationScaleImpl> r2, Recomposer r3, LifecycleOwner r4, WindowRecomposer_androidKt.AnonymousClass2 r5, View r6, Continuation<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> r7) {
        this.$systemDurationScaleSettingConsumer = r2;
        this.$recomposer = r3;
        this.$source = r4;
        this.$self = r5;
        this.$this_createLifecycleAwareWindowRecomposer = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 r0 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, r9);
        r0.L$0 = r8;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        switch(r1) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        Job durationScaleJob = (Job) this.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L22
    L18:
        if (durationScaleJob == null) goto L20;
        Job.DefaultImpls.cancel$default(durationScaleJob, null, 1, null);
    L20:
        this.$source.getLifecycle().removeObserver(this.$self);
        return Unit.INSTANCE;
    L9:
        ResultKt.throwOnFailure($result);
        CoroutineScope $this$launch = (CoroutineScope) this.L$0;
        MotionDurationScaleImpl it = this.$systemDurationScaleSettingConsumer.element;     // Catch: Throwable -> L22
        if (it == null) goto L13;
        StateFlow durationScaleStateFlow = WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());     // Catch: Throwable -> L22
        it.setScaleFactor(((Number) durationScaleStateFlow.getValue()).floatValue());     // Catch: Throwable -> L22
        Job r5 = BuildersKt.launch$default($this$launch, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(durationScaleStateFlow, it, null), 3, null);     // Catch: Throwable -> L22
    L14:
        durationScaleJob = r5;
        this.L$0 = durationScaleJob;     // Catch: Throwable -> L22
        this.label = 1;     // Catch: Throwable -> L22
        if (this.$recomposer.runRecomposeAndApplyChanges(this) != r0) goto L18;
        return r0;
    L13:
        r5 = null;
        goto L14
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L22:
        th = move-exception;
        if (r1 == 0) goto L25;
        Job.DefaultImpls.cancel$default(r1, null, 1, null);
    L25:
        this.$source.getLifecycle().removeObserver(this.$self);
        throw th;
    }
}
