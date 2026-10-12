package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.FavoriteRecord;
import com.luchime.huiyuan.HuiyuanEngine;
import com.luchime.huiyuan.UsageStats;
import java.util.List;
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
final /* synthetic */ class HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$21$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final /* synthetic */ MutableState<Job> $activeGenerationJob$delegate;
    final /* synthetic */ MutableLongState $conversationGeneration$delegate;
    final /* synthetic */ HuiyuanEngine $engine;
    final /* synthetic */ MutableState<List<FavoriteRecord>> $favorites$delegate;
    final /* synthetic */ MutableState<Boolean> $isGenerating$delegate;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ MutableState<AIModel> $selectedModel$delegate;
    final /* synthetic */ MutableState<AppTab> $selectedTab$delegate;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
    final /* synthetic */ MutableState<UsageStats> $usageStats$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$21$1(AppRepository appRepository, SnapshotStateList<TimelineItem> snapshotStateList, HuiyuanEngine huiyuanEngine, MutableLongState mutableLongState, MutableState<Job> mutableState, MutableState<Boolean> mutableState2, MutableState<List<FavoriteRecord>> mutableState3, MutableState<UsageStats> mutableState4, MutableState<AIModel> mutableState5, MutableLongState mutableLongState2, MutableState<AppTab> mutableState6) {
        super(0, Intrinsics.Kotlin.class, "resetEverything", "HuiyuanApp$resetEverything(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$repository = appRepository;
        this.$timeline = snapshotStateList;
        this.$engine = huiyuanEngine;
        this.$conversationGeneration$delegate = mutableLongState;
        this.$activeGenerationJob$delegate = mutableState;
        this.$isGenerating$delegate = mutableState2;
        this.$favorites$delegate = mutableState3;
        this.$usageStats$delegate = mutableState4;
        this.$selectedModel$delegate = mutableState5;
        this.$nextId$delegate = mutableLongState2;
        this.$selectedTab$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws JSONException {
        HuiyuanAppKt.HuiyuanApp$resetEverything(this.$repository, this.$timeline, this.$engine, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$isGenerating$delegate, this.$favorites$delegate, this.$usageStats$delegate, this.$selectedModel$delegate, this.$nextId$delegate, this.$selectedTab$delegate);
    }
}
