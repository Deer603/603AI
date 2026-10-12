package androidx.compose.foundation;

import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", i = {0, 0}, l = {908, 912}, m = "invokeSuspend", n = {"minTime", "timeout"}, s = {"J$0", "J$1"})
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode r2, long r3, Continuation<? super CombinedClickableNode$onClickKeyUpEvent$2> r5) {
        this.this$0 = r2;
        this.$keyCode = r3;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, r6);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L18:
        this.this$0.getOnClick().invoke();
        return Unit.INSTANCE;
    L7:
        long timeout = this.J$1;
        long minTime = this.J$0;
        ResultKt.throwOnFailure($result);
    L11:
        CombinedClickableNode.DoubleKeyClickState r1 = (CombinedClickableNode.DoubleKeyClickState) CombinedClickableNode.access$getDoubleKeyClickStates$p(this.this$0).get(this.$keyCode);
        if (r1 == null) goto L15;
        r1.setDoubleTapMinTimeMillisElapsed(true);
    L15:
        this.label = 2;
        if (DelayKt.delay(timeout - minTime, this) != r0) goto L18;
        return r0;
    L8:
        ResultKt.throwOnFailure($result);
        ViewConfiguration configuration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
        minTime = configuration.getDoubleTapMinTimeMillis();
        timeout = configuration.getDoubleTapTimeoutMillis();
        this.J$0 = minTime;
        this.J$1 = timeout;
        this.label = 1;
        if (DelayKt.delay(minTime, this) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
