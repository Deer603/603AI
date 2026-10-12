package com.luchime.huiyuan.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
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

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$1$1", f = "ChatScreen.kt", i = {1}, l = {168, 170}, m = "invokeSuspend", n = {"lastIndex"}, s = {"I$0"})
final class ChatScreenKt$ChatScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<Boolean> $shouldFollowOutput$delegate;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$ChatScreen$1$1(LazyListState lazyListState, State<Boolean> state, Continuation<? super ChatScreenKt$ChatScreen$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$shouldFollowOutput$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$1$1(this.$listState, this.$shouldFollowOutput$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$ChatScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        int lastIndex;
        int lastIndex2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!ChatScreenKt.ChatScreen$lambda$6(this.$shouldFollowOutput$delegate)) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (DelayKt.delay(30L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lastIndex = getLayoutInfo().getTotalItemsCount() - 1;
                if (lastIndex >= 0) {
                    this.I$0 = lastIndex;
                    this.label = 2;
                    if (LazyListState.animateScrollToItem$default(this.$listState, lastIndex, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lastIndex2 = lastIndex;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                lastIndex = getLayoutInfo().getTotalItemsCount() - 1;
                if (lastIndex >= 0) {
                    this.I$0 = lastIndex;
                    this.label = 2;
                    if (LazyListState.animateScrollToItem$default(this.$listState, lastIndex, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lastIndex2 = lastIndex;
                }
                return Unit.INSTANCE;
            case 2:
                lastIndex2 = this.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
