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

    HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1(SnapshotStateList<TimelineItem> r7, AppRepository r8, HuiyuanEngine r9, MutableLongState r10, MutableState<Job> r11, MutableState<Boolean> r12, MutableLongState r13, MutableState<AIModel> r14) {
        this.$timeline = r7;
        this.$repository = r8;
        this.$engine = r9;
        this.$conversationGeneration$delegate = r10;
        this.$activeGenerationJob$delegate = r11;
        this.$isGenerating$delegate = r12;
        this.$nextId$delegate = r13;
        this.$selectedModel$delegate = r14;
        super(0, Intrinsics.Kotlin.class, "resetConversation", "HuiyuanApp$resetConversation(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/luchime/huiyuan/AppRepository;Lcom/luchime/huiyuan/HuiyuanEngine;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableLongState;Landroidx/compose/runtime/MutableState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HuiyuanAppKt.access$HuiyuanApp$resetConversation(this.$timeline, this.$repository, this.$engine, this.$conversationGeneration$delegate, this.$activeGenerationJob$delegate, this.$isGenerating$delegate, this.$nextId$delegate, this.$selectedModel$delegate);
    }
}
