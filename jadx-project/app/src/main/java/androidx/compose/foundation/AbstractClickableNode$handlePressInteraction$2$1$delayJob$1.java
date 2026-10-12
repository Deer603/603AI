package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
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
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1257, 1260}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode r2, long r3, MutableInteractionSource r5, Continuation<? super AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> r6) {
        this.this$0 = r2;
        this.$offset = r3;
        this.$interactionSource = r5;
        super(2, r6);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, r8);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

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
        PressInteraction.Press press = (PressInteraction.Press) this.L$0;
        ResultKt.throwOnFailure($result);
    L18:
        AbstractClickableNode.access$setPressInteraction$p(this.this$0, press);
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
    L14:
        PressInteraction.Press press2 = new PressInteraction.Press(this.$offset, null);
        this.L$0 = press2;
        this.label = 2;
        if (this.$interactionSource.emit(press2, this) != r0) goto L17;
        return r0;
    L17:
        press = press2;
        goto L18
    L8:
        ResultKt.throwOnFailure($result);
        if (AbstractClickableNode.access$delayPressInteraction(this.this$0) == false) goto L14;
        this.label = 1;
        if (DelayKt.delay(Clickable_androidKt.getTapIndicationDelay(), this) != r0) goto L14;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
