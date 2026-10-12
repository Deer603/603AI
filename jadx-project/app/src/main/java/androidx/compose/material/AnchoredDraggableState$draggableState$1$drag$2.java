package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material/AnchoredDragScope;", "it", "Landroidx/compose/material/DraggableAnchors;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
final class AnchoredDraggableState$draggableState$1$drag$2<T> extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 r2, Function2<? super DragScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super AnchoredDraggableState$draggableState$1$drag$2> r4) {
        this.this$0 = r2;
        this.$block = r3;
        super(3, r4);
    }

    public final Object invoke(AnchoredDragScope r4, DraggableAnchors<T> r5, Continuation<? super Unit> r6) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, r6).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Continuation<? super Unit> r4) {
        return invoke(r2, (DraggableAnchors) r3, r4);
    }

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
    L12:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        AnchoredDraggableState$draggableState$1$dragScope$1 $this$invokeSuspend_u24lambda_u240 = AnchoredDraggableState$draggableState$1.access$getDragScope$p(this.this$0);
        Function2<DragScope, Continuation<? super Unit>, Object> r2 = this.$block;
        this.label = 1;
        if (r2.invoke($this$invokeSuspend_u24lambda_u240, this) != r0) goto L12;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
