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

    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$21$1(AppRepository r17, SnapshotStateList<TimelineItem> r18, HuiyuanEngine r19, MutableLongState r20, MutableState<Job> r21, MutableState<Boolean> r22, MutableState<List<FavoriteRecord>> r23, MutableState<UsageStats> r24, MutableState<AIModel> r25, MutableLongState r26, MutableState<AppTab> r27) {
        this.$repository = r17;
        this.$timeline = r18;
        this.$engine = r19;
        this.$conversationGeneration$delegate = r20;
        this.$activeGenerationJob$delegate = r21;
        this.$isGenerating$delegate = r22;
        this.$favorites$delegate = r23;
        this.$usageStats$delegate = r24;
        this.$selectedModel$delegate = r25;
        this.$nextId$delegate = r26;
        this.$selectedTab$delegate = r27;
        super(0, Intrinsics.Kotlin.class, "resetEverything", "HuiyuanApp$resetEverything(Lcom/luchime/huiyuan/AppRepository;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HuiyuanAppKt.access$HuiyuanApp$resetEverything(this.$repository, this.$timeline, this.$engine, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$isGenerating$delegate, this.$favorites$delegate, this.$usageStats$delegate, this.$selectedModel$delegate, this.$nextId$delegate, this.$selectedTab$delegate);
    }
}
