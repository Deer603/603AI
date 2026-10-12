package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SelectionGestures.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", i = {0}, l = {283}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super DownResolution>, Object> {
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long r2, Ref.LongRef r4, Continuation<? super SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> r5) {
        this.$pointerId = r2;
        this.$overSlop = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 r0 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, r6);
        r0.L$0 = r5;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super DownResolution> r4) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super DownResolution> r3) {
        return invoke2(r2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r2 = true;
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        AwaitPointerEventScope $this$withTimeoutOrNull = (AwaitPointerEventScope) this.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$withTimeoutOrNull2 = $this$withTimeoutOrNull;
    L11:
        PointerInputChange firstDragPastSlop = (PointerInputChange) $result;
        if (firstDragPastSlop == null) goto L20;
        long $this$isSpecified$iv = this.$overSlop.element;
        if ((9223372034707292159L & $this$isSpecified$iv) != InlineClassHelperKt.UnspecifiedPackedFloats) goto L17;
        r2 = false;
    L17:
        if (r2 == false) goto L20;
        return DownResolution.Drag;
    L20:
        PointerInputChange currentChange = (PointerInputChange) CollectionsKt.first($this$withTimeoutOrNull2.getCurrentEvent().getChanges());
        if (PointerEventKt.changedToUpIgnoreConsumed(currentChange) == false) goto L24;
        currentChange.consume();
        return DownResolution.Up;
    L24:
        return DownResolution.Cancel;
    L7:
        ResultKt.throwOnFailure($result);
        $this$withTimeoutOrNull2 = (AwaitPointerEventScope) this.L$0;
        long r3 = this.$pointerId;
        final Ref.LongRef r6 = this.$overSlop;
        this.L$0 = $this$withTimeoutOrNull2;
        this.label = 1;
        Object r4 = DragGestureDetectorKt.m426awaitTouchSlopOrCancellationjO51t88($this$withTimeoutOrNull2, r3, new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1(r6), this);
        if (r4 != r0) goto L10;
        return r0;
    L10:
        $result = r4;
        goto L11
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
