package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.ChatRecord;
import com.luchime.huiyuan.HuiyuanEngine;
import java.util.List;
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

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$1$1", f = "HuiyuanApp.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
final class HuiyuanAppKt$HuiyuanApp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HuiyuanEngine $engine;
    final /* synthetic */ List<ChatRecord> $initialMessages;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ MutableState<AIModel> $selectedModel$delegate;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
    int label;

    HuiyuanAppKt$HuiyuanApp$1$1(List<ChatRecord> r2, HuiyuanEngine r3, SnapshotStateList<TimelineItem> r4, MutableLongState r5, MutableState<AIModel> r6, AppRepository r7, Continuation<? super HuiyuanAppKt$HuiyuanApp$1$1> r8) {
        this.$initialMessages = r2;
        this.$engine = r3;
        this.$timeline = r4;
        this.$nextId$delegate = r5;
        this.$selectedModel$delegate = r6;
        this.$repository = r7;
        super(2, r8);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r9, Continuation<?> r10) {
        return new HuiyuanAppKt$HuiyuanApp$1$1(this.$initialMessages, this.$engine, this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$repository, r10);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((HuiyuanAppKt$HuiyuanApp$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        HuiyuanAppKt.HuiyuanApp$appendMessage$default(this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$repository, false, this.$engine.getGreeting(), "问候", null, 128, null);
    L14:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        if (this.$initialMessages.isEmpty() == false) goto L14;
        this.label = 1;
        if (DelayKt.delay(300, this) != r0) goto L12;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
