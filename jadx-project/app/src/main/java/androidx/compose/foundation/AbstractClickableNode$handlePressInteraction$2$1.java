package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", i = {0, 1, 2}, l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope r2, long r3, MutableInteractionSource r5, AbstractClickableNode r6, Continuation<? super AbstractClickableNode$handlePressInteraction$2$1> r7) {
        this.$this_handlePressInteraction = r2;
        this.$offset = r3;
        this.$interactionSource = r5;
        this.this$0 = r6;
        super(2, r7);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        AbstractClickableNode$handlePressInteraction$2$1 r0 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, r9);
        r0.L$0 = r8;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L11;
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L7;
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);
    L42:
        AbstractClickableNode.access$setPressInteraction$p(this.this$0, null);
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        goto L42
    L8:
        PressInteraction.Release release = (PressInteraction.Release) this.L$0;
        ResultKt.throwOnFailure($result);
    L26:
        this.L$0 = null;
        this.label = 4;
        if (this.$interactionSource.emit(release, this) != r0) goto L42;
        return r0;
    L9:
        boolean success = this.Z$0;
        ResultKt.throwOnFailure($result);
    L21:
        if (success == false) goto L42;
        PressInteraction.Press press = new PressInteraction.Press(this.$offset, null);
        PressInteraction.Release release2 = new PressInteraction.Release(press);
        this.L$0 = release2;
        this.label = 3;
        if (this.$interactionSource.emit(press, this) != r0) goto L25;
        return r0;
    L25:
        release = release2;
        goto L26
    L10:
        Job delayJob = (Job) this.L$0;
        ResultKt.throwOnFailure($result);
        Job delayJob2 = delayJob;
    L15:
        boolean success2 = ((Boolean) $result).booleanValue();
        if (delayJob2.isActive() == false) goto L31;
        this.L$0 = null;
        this.Z$0 = success2;
        this.label = 2;
        if (JobKt.cancelAndJoin(delayJob2, this) != r0) goto L20;
        return r0;
    L20:
        success = success2;
        $result = $result;
        goto L21
    L31:
        PressInteraction.Press pressInteraction = AbstractClickableNode.access$getPressInteraction$p(this.this$0);
        if (pressInteraction == null) goto L42;
        MutableInteractionSource r4 = this.$interactionSource;
        if (success2 == false) goto L36;
        PressInteraction endInteraction = new PressInteraction.Release(pressInteraction);
    L37:
        this.L$0 = null;
        this.label = 5;
        if (r4.emit(endInteraction, this) != r0) goto L40;
        return r0;
    L40:
        $result = $result;
        goto L42
    L36:
        endInteraction = new PressInteraction.Cancel(pressInteraction);
        goto L37
    L11:
        ResultKt.throwOnFailure($result);
        CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
        Job delayJob3 = BuildersKt.launch$default($this$coroutineScope, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, null), 3, null);
        this.L$0 = delayJob3;
        this.label = 1;
        Object r3 = this.$this_handlePressInteraction.tryAwaitRelease(this);
        if (r3 != r0) goto L14;
        return r0;
    L14:
        $result = r3;
        delayJob2 = delayJob3;
        goto L15
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
