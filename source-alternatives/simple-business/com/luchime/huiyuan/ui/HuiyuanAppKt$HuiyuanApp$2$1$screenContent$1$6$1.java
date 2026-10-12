package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.HuiyuanEngine;
import com.luchime.huiyuan.UsageStats;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final /* synthetic */ class HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final /* synthetic */ MutableState<Job> $activeGenerationJob$delegate;
    final /* synthetic */ MutableLongState $conversationGeneration$delegate;
    final /* synthetic */ HuiyuanEngine $engine;
    final /* synthetic */ AppHaptics $haptics;
    final /* synthetic */ MutableState<Boolean> $isGenerating$delegate;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<AIModel> $selectedModel$delegate;
    final /* synthetic */ MutableState<AppTab> $selectedTab$delegate;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
    final /* synthetic */ MutableState<UsageStats> $usageStats$delegate;

    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1(HuiyuanEngine r17, AppRepository r18, MutableState<Boolean> r19, MutableState<UsageStats> r20, SnapshotStateList<TimelineItem> r21, CoroutineScope r22, MutableLongState r23, MutableLongState r24, MutableState<Job> r25, MutableState<AIModel> r26, AppHaptics r27, MutableState<AppTab> r28) {
        this.$engine = r17;
        this.$repository = r18;
        this.$isGenerating$delegate = r19;
        this.$usageStats$delegate = r20;
        this.$timeline = r21;
        this.$scope = r22;
        this.$conversationGeneration$delegate = r23;
        this.$nextId$delegate = r24;
        this.$activeGenerationJob$delegate = r25;
        this.$selectedModel$delegate = r26;
        this.$haptics = r27;
        this.$selectedTab$delegate = r28;
        super(0, Intrinsics.Kotlin.class, "randomOne", "HuiyuanApp$randomOne(Lcom/luchime/huiyuan/HuiyuanEngine;Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/luchime/huiyuan/ui/AppHaptics;Landroidx/compose/runtime/MutableState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HuiyuanAppKt.access$HuiyuanApp$randomOne(this.$engine, this.$repository, this.$isGenerating$delegate, this.$usageStats$delegate, this.$timeline, this.$scope, this.$conversationGeneration$delegate, this.$nextId$delegate, this.$activeGenerationJob$delegate, this.$selectedModel$delegate, this.$haptics, this.$selectedTab$delegate);
    }
}
