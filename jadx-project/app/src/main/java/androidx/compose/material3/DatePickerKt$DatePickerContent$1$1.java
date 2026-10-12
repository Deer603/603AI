package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$1$1", f = "DatePicker.kt", i = {}, l = {1506}, m = "invokeSuspend", n = {}, s = {})
final class DatePickerKt$DatePickerContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ LazyListState $monthsListState;
    int label;

    DatePickerKt$DatePickerContent$1$1(LazyListState r2, int r3, Continuation<? super DatePickerKt$DatePickerContent$1$1> r4) {
        this.$monthsListState = r2;
        this.$monthIndex = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new DatePickerKt$DatePickerContent$1$1(this.$monthsListState, this.$monthIndex, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((DatePickerKt$DatePickerContent$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        DatePickerKt$DatePickerContent$1$1 r1 = this;
        ResultKt.throwOnFailure($result);
    L17:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        if (this.$monthsListState.isScrollInProgress() == true) goto L17;
        if (this.$monthsListState.getFirstVisibleItemIndex() == this.$monthIndex) goto L17;
        this.label = 1;
        if (LazyListState.scrollToItem$default(this.$monthsListState, this.$monthIndex, 0, this, 2, null) != r0) goto L14;
        return r0;
    L14:
        r1 = this;
        goto L17
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
