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

    ChatScreenKt$ChatScreen$1$1(LazyListState r2, State<Boolean> r3, Continuation<? super ChatScreenKt$ChatScreen$1$1> r4) {
        this.$listState = r2;
        this.$shouldFollowOutput$delegate = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new ChatScreenKt$ChatScreen$1$1(this.$listState, this.$shouldFollowOutput$delegate, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((ChatScreenKt$ChatScreen$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        int lastIndex = this.I$0;
        ResultKt.throwOnFailure($result);
    L23:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
    L15:
        int lastIndex2 = this.$listState.getLayoutInfo().getTotalItemsCount() - 1;
        if (lastIndex2 < 0) goto L23;
        this.I$0 = lastIndex2;
        this.label = 2;
        if (LazyListState.animateScrollToItem$default(this.$listState, lastIndex2, 0, this, 2, null) != r0) goto L20;
        return r0;
    L20:
        lastIndex = lastIndex2;
        goto L23
    L8:
        ResultKt.throwOnFailure($result);
        if (ChatScreenKt.access$ChatScreen$lambda$6(this.$shouldFollowOutput$delegate) == false) goto L11;
        this.label = 1;
        if (DelayKt.delay(30, this) != r0) goto L15;
        return r0;
    L11:
        return Unit.INSTANCE;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
