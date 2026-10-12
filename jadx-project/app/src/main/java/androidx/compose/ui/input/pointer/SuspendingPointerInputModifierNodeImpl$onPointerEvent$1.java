package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {717, 719}, m = "invokeSuspend", n = {}, s = {})
final class SuspendingPointerInputModifierNodeImpl$onPointerEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl this$0;

    SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(SuspendingPointerInputModifierNodeImpl r2, Continuation<? super SuspendingPointerInputModifierNodeImpl$onPointerEvent$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this.this$0, r4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SuspendingPointerInputModifierNodeImpl$onPointerEvent$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        ResultKt.throwOnFailure($result);
    L20:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        goto L20
    L8:
        ResultKt.throwOnFailure($result);
        Function2 r1 = SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(this.this$0);
        SuspendingPointerInputModifierNodeImpl r2 = this.this$0;
        if (r1 == null) goto L14;
        Function2 r3 = SuspendingPointerInputModifierNodeImpl.access$get_deprecatedPointerInputHandler$p(r2);
        Intrinsics.checkNotNull(r3);
        SuspendingPointerInputModifierNodeImpl r4 = this.this$0;
        this.label = 1;
        if (r3.invoke(r4, this) != r0) goto L20;
        return r0;
    L14:
        PointerInputEventHandler $this$invokeSuspend_u24lambda_u240 = r2.getPointerInputEventHandler();
        SuspendingPointerInputModifierNodeImpl r5 = this.this$0;
        this.label = 2;
        if ($this$invokeSuspend_u24lambda_u240.invoke(r5, this) != r0) goto L20;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
