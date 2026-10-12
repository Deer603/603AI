package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.ReplyResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1", f = "HuiyuanApp.kt", i = {0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {170, 179, 219}, m = "invokeSuspend", n = {"$this$forEach\\1", "element\\1", "step\\2", "$i$f$forEach\\1\\169", "$i$a$-forEach-HuiyuanAppKt$HuiyuanApp$runThinking$1$1\\2\\580\\0", "rendered", "units", "$this$forEachIndexed\\5", "item\\5", "unit\\6", "responseId", "$i$f$forEachIndexed\\5\\202", "index\\5", "unitIndex\\6", "$i$a$-forEachIndexed-HuiyuanAppKt$HuiyuanApp$runThinking$1$3\\6\\590\\0", "messageIndex\\6"}, s = {"L$0", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$8", "L$9", "J$0", "I$0", "I$1", "I$2", "I$3", "I$4"})
final class HuiyuanAppKt$HuiyuanApp$runThinking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Job> $activeGenerationJob$delegate;
    final /* synthetic */ MutableLongState $conversationGeneration$delegate;
    final /* synthetic */ long $generation;
    final /* synthetic */ AIModel $generationModel;
    final /* synthetic */ AppHaptics $haptics;
    final /* synthetic */ MutableState<Boolean> $isGenerating$delegate;
    final /* synthetic */ MutableLongState $nextId$delegate;
    final /* synthetic */ AppRepository $repository;
    final /* synthetic */ ReplyResult $result;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<AppTab> $selectedTab$delegate;
    final /* synthetic */ List<String> $steps;
    final /* synthetic */ long $thinkId;
    final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HuiyuanAppKt$HuiyuanApp$runThinking$1(List<String> list, long j, SnapshotStateList<TimelineItem> snapshotStateList, ReplyResult replyResult, AIModel aIModel, CoroutineScope coroutineScope, AppHaptics appHaptics, MutableLongState mutableLongState, long j2, MutableLongState mutableLongState2, MutableState<AppTab> mutableState, AppRepository appRepository, MutableState<Boolean> mutableState2, MutableState<Job> mutableState3, Continuation<? super HuiyuanAppKt$HuiyuanApp$runThinking$1> continuation) {
        super(2, continuation);
        this.$steps = list;
        this.$generation = j;
        this.$timeline = snapshotStateList;
        this.$result = replyResult;
        this.$generationModel = aIModel;
        this.$scope = coroutineScope;
        this.$haptics = appHaptics;
        this.$conversationGeneration$delegate = mutableLongState;
        this.$thinkId = j2;
        this.$nextId$delegate = mutableLongState2;
        this.$selectedTab$delegate = mutableState;
        this.$repository = appRepository;
        this.$isGenerating$delegate = mutableState2;
        this.$activeGenerationJob$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HuiyuanAppKt$HuiyuanApp$runThinking$1(this.$steps, this.$generation, this.$timeline, this.$result, this.$generationModel, this.$scope, this.$haptics, this.$conversationGeneration$delegate, this.$thinkId, this.$nextId$delegate, this.$selectedTab$delegate, this.$repository, this.$isGenerating$delegate, this.$activeGenerationJob$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HuiyuanAppKt$HuiyuanApp$runThinking$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0117  */
    /* JADX WARN: Code duplicated, block: B:25:0x0129  */
    /* JADX WARN: Code duplicated, block: B:26:0x012c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0131 A[LOOP:2: B:21:0x0111->B:29:0x0131, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00f8 -> B:16:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0349 -> B:85:0x0359). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0364 -> B:87:0x0378). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            */
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2", f = "HuiyuanApp.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $thinkId;
        final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SnapshotStateList<TimelineItem> snapshotStateList, long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$timeline = snapshotStateList;
            this.$thinkId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$timeline, this.$thinkId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(400L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SnapshotStateList<TimelineItem> snapshotStateList = this.$timeline;
            final long j = this.$thinkId;
            CollectionsKt.removeAll((List) snapshotStateList, new Function1() { // from class: com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(HuiyuanAppKt$HuiyuanApp$runThinking$1.AnonymousClass2.invokeSuspend$lambda$0(j, (TimelineItem) obj));
                }
            });
            return Unit.INSTANCE;
        }

        static final boolean invokeSuspend$lambda$0(long $thinkId, TimelineItem it) {
            return it.getId() == $thinkId;
        }
    }
}
