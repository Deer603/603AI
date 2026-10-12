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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HuiyuanAppKt$HuiyuanApp$1$1(List<ChatRecord> list, HuiyuanEngine huiyuanEngine, SnapshotStateList<TimelineItem> snapshotStateList, MutableLongState mutableLongState, MutableState<AIModel> mutableState, AppRepository appRepository, Continuation<? super HuiyuanAppKt$HuiyuanApp$1$1> continuation) {
        super(2, continuation);
        this.$initialMessages = list;
        this.$engine = huiyuanEngine;
        this.$timeline = snapshotStateList;
        this.$nextId$delegate = mutableLongState;
        this.$selectedModel$delegate = mutableState;
        this.$repository = appRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuiyuanAppKt$HuiyuanApp$1$1(this.$initialMessages, this.$engine, this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$repository, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HuiyuanAppKt$HuiyuanApp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$initialMessages.isEmpty()) {
                    this.label = 1;
                    if (DelayKt.delay(300L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HuiyuanAppKt.HuiyuanApp$appendMessage$default(this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$repository, false, this.$engine.getGreeting(), "问候", null, 128, null);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                HuiyuanAppKt.HuiyuanApp$appendMessage$default(this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$repository, false, this.$engine.getGreeting(), "问候", null, 128, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
