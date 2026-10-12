package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/graphics/Rect;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super Rect>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    PipHintTrackerKt$trackPipAnimationHintView$flow$1(View r2, Continuation<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> r3) {
        this.$view = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super Rect> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super Rect> r3, Continuation<? super Unit> r4) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L14:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        final ProducerScope $this$callbackFlow = (ProducerScope) this.L$0;
        final View.OnLayoutChangeListener layoutChangeListener = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda0($this$callbackFlow);
        final View r3 = this.$view;
        final ViewTreeObserver.OnScrollChangedListener scrollChangeListener = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda1($this$callbackFlow, r3);
        final View r5 = this.$view;
        final ?? r4 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1($this$callbackFlow, r5, scrollChangeListener, layoutChangeListener);
        if (this.$view.isAttachedToWindow() == false) goto L10;
        $this$callbackFlow.mo8915trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(this.$view));
        this.$view.getViewTreeObserver().addOnScrollChangedListener(scrollChangeListener);
        this.$view.addOnLayoutChangeListener(layoutChangeListener);
    L10:
        this.$view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener) r4);
        final View r6 = this.$view;
        this.label = 1;
        if (ProduceKt.awaitClose($this$callbackFlow, new AnonymousClass1(r6, scrollChangeListener, layoutChangeListener, r4), this) != r0) goto L14;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, View v, int l, int t, int r, int b, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (l != oldLeft) goto L6;
        if (r != oldRight) goto L6;
        if (t != oldTop) goto L6;
        if (b != oldBottom) goto L6;
        return;
    L6:
        Intrinsics.checkNotNullExpressionValue(v, "v");
        $$this$callbackFlow.mo8915trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(v));
    }

    static final void invokeSuspend$lambda$1(ProducerScope $$this$callbackFlow, View $view) {
        $$this$callbackFlow.mo8915trySendJP2dKIU(PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow($view));
    }
}
