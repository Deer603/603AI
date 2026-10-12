package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {114, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Float>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ Channel<Unit> $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver r2, Uri r3, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r4, Channel<Unit> r5, Context r6, Continuation<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> r7) {
        this.$resolver = r2;
        this.$animationScaleUri = r3;
        this.$contentObserver = r4;
        this.$channel = r5;
        this.$applicationContext = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 r0 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, r9);
        r0.L$0 = r8;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Float> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Float> r3, Continuation<? super Unit> r4) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:38:0x0052). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L14;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ChannelIterator<Unit> r1 = (ChannelIterator) this.L$1;
        FlowCollector $this$flow = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
        ChannelIterator<Unit> r2 = r1;
        FlowCollector $this$flow2 = $this$flow;
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 r3 = this;
    L38:
        r3.L$0 = $this$flow2;     // Catch: Throwable -> L32
        r3.L$1 = r2;     // Catch: Throwable -> L32
        r3.label = 1;     // Catch: Throwable -> L32
        Object r4 = r2.hasNext(r3);     // Catch: Throwable -> L32
        if (r4 != $result2) goto L20;
        return $result2;
    L20:
        Object r8 = $result2;
        Object $result3 = $result;
        $result = r4;
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 r5 = r3;
        FlowCollector $this$flow3 = $this$flow2;
        Object r6 = r8;
    L43:
    L30:
        th = move-exception;
        th = th;
        r3 = r5;
    L36:
        r3.$resolver.unregisterContentObserver(r3.$contentObserver);
        throw th;
    L22:
        if (((Boolean) $result).booleanValue() == false) goto L28;
        r2.next();     // Catch: Throwable -> L30
        float newValue = Settings.Global.getFloat(r5.$applicationContext.getContentResolver(), "animator_duration_scale", 1.0f);     // Catch: Throwable -> L30
        r5.L$0 = $this$flow3;     // Catch: Throwable -> L30
        r5.L$1 = r2;     // Catch: Throwable -> L30
        r5.label = 2;     // Catch: Throwable -> L30
        if ($this$flow3.emit(Boxing.boxFloat(newValue), r5) != r6) goto L26;
        return r6;
    L26:
        $result = $result3;
        $result2 = r6;
        $this$flow2 = $this$flow3;
        r3 = r5;
        goto L38
    L28:
        r5.$resolver.unregisterContentObserver(r5.$contentObserver);
        return Unit.INSTANCE;
    L32:
        th = th;
        goto L36
    L9:
        ChannelIterator<Unit> r7 = (ChannelIterator) this.L$1;
        FlowCollector $this$flow4 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L12
        r5 = this;
        $this$flow3 = $this$flow4;
        r2 = r7;
        r6 = $result2;
        $result3 = $result;
        goto L43
    L14:
        ResultKt.throwOnFailure($result);
        $this$flow2 = (FlowCollector) this.L$0;
        this.$resolver.registerContentObserver(this.$animationScaleUri, false, this.$contentObserver);
        r2 = this.$channel.iterator();     // Catch: Throwable -> L34
        r3 = this;
    L34:
        th = th;
        r3 = this;
        goto L36
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L12:
        th = th;
        r3 = this;
        goto L36
    }
}
