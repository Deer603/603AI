package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.HuiyuanEngine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.json.JSONException;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final /* synthetic */ MutableState<Job> $activeGenerationJob$delegate;
    final /* synthetic */ MutableLongState $conversationGeneration$delegate;
    final /* synthetic */ HuiyuanEngine $engine;
    final /* synthetic */ MutableState<Boolean> $isGenerating$delegate;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ MutableState<AIModel> $selectedModel$delegate;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1(SnapshotStateList<TimelineItem> snapshotStateList, AppRepository appRepository, HuiyuanEngine huiyuanEngine, MutableLongState mutableLongState, MutableState<Job> mutableState, MutableState<Boolean> mutableState2, MutableLongState mutableLongState2, MutableState<AIModel> mutableState3) {
        super(0, Intrinsics.Kotlin.class, "resetConversation", "HuiyuanApp$resetConversation(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$timeline = snapshotStateList;
        this.$repository = appRepository;
        this.$engine = huiyuanEngine;
        this.$conversationGeneration$delegate = mutableLongState;
        this.$activeGenerationJob$delegate = mutableState;
        this.$isGenerating$delegate = mutableState2;
        this.$nextId$delegate = mutableLongState2;
        this.$selectedModel$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws JSONException {
        HuiyuanAppKt.HuiyuanApp$resetConversation(this.$timeline, this.$repository, this.$engine, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$isGenerating$delegate, this.$nextId$delegate, this.$selectedModel$delegate);
    }
}
