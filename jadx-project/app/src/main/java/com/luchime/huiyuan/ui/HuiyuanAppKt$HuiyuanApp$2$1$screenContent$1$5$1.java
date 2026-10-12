package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.HuiyuanEngine;
import com.luchime.huiyuan.UsageStats;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONException;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$5$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    final /* synthetic */ MutableState<Job> $activeGenerationJob$delegate;
    final /* synthetic */ MutableLongState $conversationGeneration$delegate;
    final /* synthetic */ HuiyuanEngine $engine;
    final /* synthetic */ AppHaptics $haptics;
    final /* synthetic */ MutableState<String> $input$delegate;
    final /* synthetic */ MutableState<Boolean> $isGenerating$delegate;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<AIModel> $selectedModel$delegate;
    final /* synthetic */ MutableState<AppTab> $selectedTab$delegate;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
    final /* synthetic */ MutableState<UsageStats> $usageStats$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$5$1(HuiyuanEngine huiyuanEngine, AppRepository appRepository, MutableState<Boolean> mutableState, SnapshotStateList<TimelineItem> snapshotStateList, MutableLongState mutableLongState, MutableState<AIModel> mutableState2, MutableState<String> mutableState3, MutableState<UsageStats> mutableState4, CoroutineScope coroutineScope, MutableLongState mutableLongState2, MutableState<Job> mutableState5, AppHaptics appHaptics, MutableState<AppTab> mutableState6) {
        super(1, Intrinsics.Kotlin.class, "submit", "HuiyuanApp$submit(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.$engine = huiyuanEngine;
        this.$repository = appRepository;
        this.$isGenerating$delegate = mutableState;
        this.$timeline = snapshotStateList;
        this.$nextId$delegate = mutableLongState;
        this.$selectedModel$delegate = mutableState2;
        this.$input$delegate = mutableState3;
        this.$usageStats$delegate = mutableState4;
        this.$scope = coroutineScope;
        this.$conversationGeneration$delegate = mutableLongState2;
        this.$activeGenerationJob$delegate = mutableState5;
        this.$haptics = appHaptics;
        this.$selectedTab$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) throws JSONException {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) throws JSONException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        HuiyuanAppKt.HuiyuanApp$submit(this.$engine, this.$repository, this.$isGenerating$delegate, this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$input$delegate, this.$usageStats$delegate, this.$scope, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$haptics, this.$selectedTab$delegate, p0);
    }
}
