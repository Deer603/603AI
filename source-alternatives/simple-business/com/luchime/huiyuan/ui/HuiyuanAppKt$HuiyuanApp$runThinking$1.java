package com.luchime.huiyuan.ui;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.LexiconEntry;
import com.luchime.huiyuan.ReplyResult;
import com.luchime.huiyuan.StreamingTextPolicy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
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

    /* JADX INFO: renamed from: com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.luchime.huiyuan.ui.HuiyuanAppKt$HuiyuanApp$runThinking$1$2", f = "HuiyuanApp.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $thinkId;
        final /* synthetic */ SnapshotStateList<TimelineItem> $timeline;
        int label;

        AnonymousClass2(SnapshotStateList<TimelineItem> r2, long r3, Continuation<? super AnonymousClass2> r5) {
            this.$timeline = r2;
            this.$thinkId = r3;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            return new AnonymousClass2(this.$timeline, this.$thinkId, r6);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L10:
            SnapshotStateList<TimelineItem> r1 = this.$timeline;
            final long r2 = this.$thinkId;
            CollectionsKt.removeAll(r1, new HuiyuanAppKt$HuiyuanApp$runThinking$1$2$$ExternalSyntheticLambda0(r2));
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            this.label = 1;
            if (DelayKt.delay(400, this) != r0) goto L10;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        static final boolean invokeSuspend$lambda$0(long $thinkId, TimelineItem it) {
            if (it.getId() != $thinkId) goto L5;
            return true;
        L5:
            return false;
        }
    }

    HuiyuanAppKt$HuiyuanApp$runThinking$1(List<String> r17, long r18, SnapshotStateList<TimelineItem> r20, ReplyResult r21, AIModel r22, CoroutineScope r23, AppHaptics r24, MutableLongState r25, long r26, MutableLongState r28, MutableState<AppTab> r29, AppRepository r30, MutableState<Boolean> r31, MutableState<Job> r32, Continuation<? super HuiyuanAppKt$HuiyuanApp$runThinking$1> r33) {
        this.$steps = r17;
        this.$generation = r18;
        this.$timeline = r20;
        this.$result = r21;
        this.$generationModel = r22;
        this.$scope = r23;
        this.$haptics = r24;
        this.$conversationGeneration$delegate = r25;
        this.$thinkId = r26;
        this.$nextId$delegate = r28;
        this.$selectedTab$delegate = r29;
        this.$repository = r30;
        this.$isGenerating$delegate = r31;
        this.$activeGenerationJob$delegate = r32;
        super(2, r33);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r20, Continuation<?> r21) {
        return new HuiyuanAppKt$HuiyuanApp$runThinking$1(this.$steps, this.$generation, this.$timeline, this.$result, this.$generationModel, this.$scope, this.$haptics, this.$conversationGeneration$delegate, this.$thinkId, this.$nextId$delegate, this.$selectedTab$delegate, this.$repository, this.$isGenerating$delegate, this.$activeGenerationJob$delegate, r21);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((HuiyuanAppKt$HuiyuanApp$runThinking$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00f8 -> B:16:0x00fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0349 -> B:85:0x0359). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0364 -> B:87:0x0378). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L9;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        int r2 = this.I$4;
        int r7 = this.I$3;
        int r8 = this.I$2;
        int r9 = this.I$1;
        int r10 = this.I$0;
        long r11 = this.J$1;
        long responseId = this.J$0;
        String r15 = (String) this.L$9;
        Object r3 = this.L$8;
        Iterator r4 = (Iterator) this.L$7;
        MutableState<AppTab> r6 = (MutableState) this.L$6;
        MutableLongState r5 = (MutableLongState) this.L$5;
        Object r17 = r1;
        AppHaptics r18 = (AppHaptics) this.L$4;
        List r12 = (SnapshotStateList) this.L$3;
        Iterable r13 = (Iterable) this.L$2;
        List<String> r14 = (List) this.L$1;
        StringBuilder rendered = (StringBuilder) this.L$0;
        ResultKt.throwOnFailure($result);
        long responseId2 = responseId;
        Iterator r16 = r4;
        List r19 = r12;
        Iterable r110 = r13;
        List<String> r20 = r14;
        int r21 = r9;
        HuiyuanAppKt$HuiyuanApp$runThinking$1 r22 = this;
        Object $result2 = $result;
    L85:
        StringBuilder rendered2 = rendered;
        HuiyuanAppKt$HuiyuanApp$runThinking$1 r23 = r22;
        Object r24 = r17;
        AppHaptics r25 = r18;
        Iterable r111 = r110;
        int r112 = r21;
    L87:
        Object $result3 = $result2;
        long responseId3 = responseId2;
    L49:
        int r113 = r112;
        if (r16.hasNext() == false) goto L88;
        Object r114 = r16.next();
        r110 = r111;
        int r115 = r113 + 1;
        if (r113 >= 0) goto L54;
        CollectionsKt.throwIndexOverflow();
    L54:
        Object r26 = r24;
        String r27 = (String) r114;
        r21 = r115;
        if (r11 != HuiyuanAppKt.access$HuiyuanApp$lambda$31(r5)) goto L57;
        rendered2.append(r27);
        int r28 = 0;
        Iterator<TimelineItem> r29 = r19.iterator();
    L60:
        if (r29.hasNext() == false) goto L68;
        if (((TimelineItem) r29.next()).getId() != responseId3) goto L64;
        boolean r210 = true;
    L65:
        if (r210 == true) goto L69;
        r28 = r28 + 1;
    L69:
        int r211 = r28;
        if (r211 < 0) goto L72;
        int r116 = r211;
        TimelineItem r117 = r19.get(r116);
        Intrinsics.checkNotNull(r117, "null cannot be cast to non-null type com.luchime.huiyuan.ui.TimelineItem.Message");
        TimelineItem.Message r212 = (TimelineItem.Message) r117;
        String r118 = rendered2.toString();
        Intrinsics.checkNotNullExpressionValue(r118, "toString(...)");
        r19.set(r116, TimelineItem.Message.copy$default(r212, 0, false, r118, null, null, 0, false, null, 251, null));
    L74:
        if (HuiyuanAppKt.access$HuiyuanApp$lambda$16(r6) != AppTab.CHAT) goto L78;
        int r119 = r113;
        if (StreamingTextPolicy.INSTANCE.shouldTick(r119, r27) == false) goto L80;
        r25.perform(HapticCue.STREAM_TICK);
    L80:
        if (r119 == CollectionsKt.getLastIndex(r20)) goto L86;
        long responseId4 = r11;
        long r120 = StreamingTextPolicy.INSTANCE.delayAfter(r27);
        r23.L$0 = rendered2;
        r23.L$1 = r20;
        r23.L$2 = SpillingKt.nullOutSpilledVariable(r110);
        r23.L$3 = r19;
        r23.L$4 = r25;
        r23.L$5 = r5;
        r23.L$6 = r6;
        r23.L$7 = r16;
        r23.L$8 = SpillingKt.nullOutSpilledVariable(r114);
        r23.L$9 = SpillingKt.nullOutSpilledVariable(r27);
        r23.J$0 = responseId3;
        responseId2 = responseId3;
        r23.J$1 = responseId4;
        int r121 = r10;
        r23.I$0 = r121;
        r23.I$1 = r21;
        r23.I$2 = r119;
        r23.I$3 = 0;
        r23.I$4 = r116;
        r23.label = 3;
        if (DelayKt.delay(r120, r23) != r26) goto L84;
        return r26;
    L84:
        r18 = r25;
        r22 = r23;
        rendered = rendered2;
        r17 = r26;
        r10 = r121;
        r11 = responseId4;
        $result2 = $result3;
        goto L85
    L86:
        responseId2 = responseId3;
        $result2 = $result3;
        r24 = r26;
        r10 = r10;
        r11 = r11;
        r111 = r110;
        r112 = r21;
        goto L87
    L78:
        r119 = r113;
        goto L80
    L72:
        r116 = r211;
        goto L74
    L64:
        r210 = false;
        goto L65
    L68:
        r28 = -1;
        goto L69
    L57:
        return Unit.INSTANCE;
    L88:
        long responseId5 = responseId3;
        if (r23.$generation != HuiyuanAppKt.access$HuiyuanApp$lambda$31(r23.$conversationGeneration$delegate)) goto L91;
        int r30 = 0;
        Iterator<TimelineItem> r31 = r23.$timeline.iterator();
    L94:
        if (r31.hasNext() == false) goto L102;
        if (((TimelineItem) r31.next()).getId() != responseId5) goto L98;
        boolean r32 = true;
    L99:
        if (r32 == true) goto L100;
        r30 = r30 + 1;
        goto L94
    L100:
        int r122 = r30;
    L103:
        int messageIndex = r122;
        if (messageIndex < 0) goto L106;
        TimelineItem r33 = r23.$timeline.get(messageIndex);
        Intrinsics.checkNotNull(r33, "null cannot be cast to non-null type com.luchime.huiyuan.ui.TimelineItem.Message");
        TimelineItem.Message current = (TimelineItem.Message) r33;
        r23.$timeline.set(messageIndex, TimelineItem.Message.copy$default(current, 0, false, r23.$result.getText(), null, null, 0, false, null, 187, null));
    L106:
        HuiyuanAppKt.access$HuiyuanApp$persistConversation(r23.$repository, r23.$timeline);
        if (HuiyuanAppKt.access$HuiyuanApp$lambda$16(r23.$selectedTab$delegate) != AppTab.CHAT) goto L110;
        r23.$haptics.perform(HapticCue.STREAM_COMPLETE);
    L110:
        if (r23.$generation != HuiyuanAppKt.access$HuiyuanApp$lambda$31(r23.$conversationGeneration$delegate)) goto L113;
        HuiyuanAppKt.access$HuiyuanApp$lambda$35(r23.$isGenerating$delegate, false);
        HuiyuanAppKt.access$HuiyuanApp$lambda$38(r23.$activeGenerationJob$delegate, null);
    L113:
        return Unit.INSTANCE;
    L98:
        r32 = false;
        goto L99
    L102:
        r122 = -1;
        goto L103
    L91:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        r23 = this;
        Object $result4 = $result;
    L41:
        if (r23.$generation != HuiyuanAppKt.access$HuiyuanApp$lambda$31(r23.$conversationGeneration$delegate)) goto L43;
        long responseId6 = HuiyuanAppKt.access$HuiyuanApp$lambda$28(r23.$nextId$delegate);
        HuiyuanAppKt.access$HuiyuanApp$lambda$29(r23.$nextId$delegate, 1 + responseId6);
        SnapshotStateList<TimelineItem> r34 = r23.$timeline;
        String r213 = r23.$result.getTag();
        LexiconEntry r35 = r23.$result.getEntry();
        if (r35 == null) goto L47;
        String r214 = r35.getText();
    L48:
        r34.add(new TimelineItem.Message(responseId6, false, "", r213, r214, 0, true, r23.$generationModel, 32, null));
        BuildersKt.launch$default(r23.$scope, null, null, new AnonymousClass2(r23.$timeline, r23.$thinkId, null), 3, null);
        rendered2 = new StringBuilder(r23.$result.getText().length());
        r20 = StreamingTextPolicy.INSTANCE.units(r23.$result.getText());
        List<String> r36 = r20;
        long r37 = r23.$generation;
        r19 = r23.$timeline;
        r25 = r23.$haptics;
        MutableLongState r123 = r23.$conversationGeneration$delegate;
        MutableState<AppTab> r124 = r23.$selectedTab$delegate;
        r112 = 0;
        r16 = r36.iterator();
        $result3 = $result4;
        r111 = r36;
        r24 = r1;
        responseId3 = responseId6;
        r5 = r123;
        r6 = r124;
        r10 = 0;
        r11 = r37;
        goto L49
    L47:
        r214 = null;
        goto L48
    L43:
        return Unit.INSTANCE;
    L8:
        int r38 = this.I$1;
        int r39 = this.I$0;
        long r40 = this.J$1;
        long r41 = this.J$0;
        String r42 = (String) this.L$5;
        Object r43 = this.L$4;
        Iterator r44 = (Iterator) this.L$3;
        MutableLongState r125 = (MutableLongState) this.L$2;
        List r126 = (SnapshotStateList) this.L$1;
        Iterable r127 = (Iterable) this.L$0;
        ResultKt.throwOnFailure($result);
        String r128 = r42;
        r23 = this;
        int r45 = r39;
        Object r46 = r1;
        Object $result5 = $result;
    L17:
        if (r41 != HuiyuanAppKt.access$HuiyuanApp$lambda$31(r125)) goto L19;
        int r129 = 0;
        Iterator<TimelineItem> r130 = r126.iterator();
    L22:
        if (r130.hasNext() == false) goto L30;
        if (((TimelineItem) r130.next()).getId() != r40) goto L26;
        boolean r215 = true;
    L27:
        if (r215 == true) goto L31;
        r129 = r129 + 1;
    L31:
        int r131 = r129;
        if (r131 < 0) goto L35;
        Object $result6 = r126.get(r131);
        Intrinsics.checkNotNull($result6, "null cannot be cast to non-null type com.luchime.huiyuan.ui.TimelineItem.ThinkLog");
        TimelineItem.ThinkLog r132 = (TimelineItem.ThinkLog) $result6;
        r126.set(r131, TimelineItem.ThinkLog.copy$default(r132, 0, CollectionsKt.plus(r132.getLines(), r128), null, 5, null));
    L35:
        Object $result7 = $result5;
    L11:
        if (r44.hasNext() == false) goto L36;
        Object r133 = r44.next();
        r128 = (String) r133;
        r23.L$0 = SpillingKt.nullOutSpilledVariable(r127);
        r23.L$1 = r126;
        r23.L$2 = r125;
        r23.L$3 = r44;
        r23.L$4 = SpillingKt.nullOutSpilledVariable(r133);
        r23.L$5 = r128;
        r23.J$0 = r41;
        r23.J$1 = r40;
        r23.I$0 = r45;
        r23.I$1 = 0;
        r23.label = 1;
        Object $result8 = $result7;
        if (DelayKt.delay(430, r23) != r46) goto L15;
        return r46;
    L15:
        r38 = 0;
        $result5 = $result8;
        goto L17
    L36:
        Object $result9 = $result7;
        r23.L$0 = null;
        r23.L$1 = null;
        r23.L$2 = null;
        r23.L$3 = null;
        r23.L$4 = null;
        r23.L$5 = null;
        r23.label = 2;
        if (DelayKt.delay(480, r23) != r46) goto L39;
        return r46;
    L39:
        r1 = r46;
        $result4 = $result9;
        goto L41
    L26:
        r215 = false;
        goto L27
    L30:
        r129 = -1;
        goto L31
    L19:
        return Unit.INSTANCE;
    L9:
        ResultKt.throwOnFailure($result);
        Iterable r47 = this.$steps;
        long r48 = this.$generation;
        List r49 = this.$timeline;
        MutableLongState r50 = this.$conversationGeneration$delegate;
        long r51 = this.$thinkId;
        r45 = 0;
        r44 = r47.iterator();
        r127 = r47;
        r126 = r49;
        r125 = r50;
        r23 = this;
        r41 = r48;
        r40 = r51;
        r46 = r1;
        $result7 = $result;
        goto L11
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
