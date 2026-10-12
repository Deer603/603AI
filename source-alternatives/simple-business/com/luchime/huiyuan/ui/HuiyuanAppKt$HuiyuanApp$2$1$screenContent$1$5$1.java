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

    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$5$1(HuiyuanEngine r17, AppRepository r18, MutableState<Boolean> r19, SnapshotStateList<TimelineItem> r20, MutableLongState r21, MutableState<AIModel> r22, MutableState<String> r23, MutableState<UsageStats> r24, CoroutineScope r25, MutableLongState r26, MutableState<Job> r27, AppHaptics r28, MutableState<AppTab> r29) {
        this.$engine = r17;
        this.$repository = r18;
        this.$isGenerating$delegate = r19;
        this.$timeline = r20;
        this.$nextId$delegate = r21;
        this.$selectedModel$delegate = r22;
        this.$input$delegate = r23;
        this.$usageStats$delegate = r24;
        this.$scope = r25;
        this.$conversationGeneration$delegate = r26;
        this.$activeGenerationJob$delegate = r27;
        this.$haptics = r28;
        this.$selectedTab$delegate = r29;
        super(1, Intrinsics.Kotlin.class, "submit", "HuiyuanApp$submit(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String r2) {
        invoke2(r2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        HuiyuanAppKt.access$HuiyuanApp$submit(this.$engine, this.$repository, this.$isGenerating$delegate, this.$timeline, this.$nextId$delegate, this.$selectedModel$delegate, this.$input$delegate, this.$usageStats$delegate, this.$scope, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$haptics, this.$selectedTab$delegate, p0);
    }
}
