package com.luchime.huiyuan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: CorpusExpander.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u0011*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/luchime/huiyuan/CorpusExpander;", "", "<init>", "()V", "expand", "", "Lcom/luchime/huiyuan/LexiconEntry;", "sourceEntries", "blueprints", "Lcom/luchime/huiyuan/CorpusBlueprint;", "targetPerCategory", "", "expansionSequence", "Lkotlin/sequences/Sequence;", "", "blueprint", "appendSentence", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sentence", "END_PUNCTUATION", "", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CorpusExpander {
    public static final int $stable = 0;
    private static final Set<Character> END_PUNCTUATION = null;
    public static final CorpusExpander INSTANCE = null;

    /* JADX INFO: renamed from: com.luchime.huiyuan.CorpusExpander$expansionSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: CorpusExpander.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "com.luchime.huiyuan.CorpusExpander$expansionSequence$1", f = "CorpusExpander.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach\\1", "element\\1", "perspective\\2", "$this$forEach\\3", "element\\3", "action\\4", "$this$forEach\\5", "element\\5", "check\\6", "$i$f$forEach\\1\\61", "$i$a$-forEach-CorpusExpander$expansionSequence$1$1\\2\\87\\0", "$i$f$forEach\\3\\62", "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1\\4\\88\\2", "$i$f$forEach\\5\\63", "$i$a$-forEach-CorpusExpander$expansionSequence$1$1$1$1\\6\\89\\4"}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$8", "L$9", "L$10", "L$12", "L$13", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CorpusBlueprint $blueprint;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        AnonymousClass1(CorpusBlueprint r2, Continuation<? super AnonymousClass1> r3) {
            this.$blueprint = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$blueprint, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super String> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope<? super String> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a7 -> B:11:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00c0 -> B:14:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0179 -> B:20:0x0186). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SequenceScope $this$sequence = (SequenceScope) this.L$0;
            Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            int r3 = this.I$5;
            int r4 = this.I$4;
            int r5 = this.I$3;
            int r6 = this.I$2;
            int r7 = this.I$1;
            int r8 = this.I$0;
            String r9 = (String) this.L$13;
            Object r10 = this.L$12;
            Iterator r11 = (Iterator) this.L$11;
            Iterable r12 = (Iterable) this.L$10;
            String r13 = (String) this.L$9;
            Object r14 = this.L$8;
            Iterator r15 = (Iterator) this.L$7;
            Iterable r1 = (Iterable) this.L$6;
            String r16 = (String) this.L$5;
            Object r17 = this.L$4;
            Iterator r18 = (Iterator) this.L$3;
            CorpusBlueprint r21 = (CorpusBlueprint) this.L$2;
            Iterable r19 = (Iterable) this.L$1;
            ResultKt.throwOnFailure($result);
            Iterable r110 = r19;
            Iterator r20 = r15;
            int r111 = r6;
            int r22 = r5;
            int r23 = r4;
            Object r24 = r2;
            SequenceScope $this$sequence2 = $this$sequence;
            Object r112 = r14;
            Iterable r113 = r1;
            String r25 = r13;
            Iterator r114 = r11;
            String r115 = r16;
            List<String> r116 = r12;
            int r117 = r7;
            int r26 = r8;
            Iterator r27 = r18;
            Object r28 = r17;
            AnonymousClass1 r118 = this;
            Object $result2 = $result;
        L20:
            Object $result3 = $result2;
            Object r29 = r24;
            int r30 = r23;
            AnonymousClass1 r31 = r118;
            Object r119 = r28;
            CorpusBlueprint r32 = r21;
            String r0 = r25;
        L15:
            if (r114.hasNext() == false) goto L21;
            Object r120 = r114.next();
            r28 = r119;
            String r121 = (String) r120;
            Iterable r210 = r113;
            StringBuilder r211 = new StringBuilder();
            Object r212 = r29;
            CorpusExpander.access$appendSentence(CorpusExpander.INSTANCE, r211, r115);
            CorpusExpander.access$appendSentence(CorpusExpander.INSTANCE, r211, r0);
            CorpusExpander.access$appendSentence(CorpusExpander.INSTANCE, r211, r121);
            String r33 = r211.toString();
            r31.L$0 = $this$sequence2;
            r31.L$1 = SpillingKt.nullOutSpilledVariable(r110);
            r31.L$2 = r32;
            r31.L$3 = r27;
            r31.L$4 = SpillingKt.nullOutSpilledVariable(r28);
            r31.L$5 = r115;
            r31.L$6 = SpillingKt.nullOutSpilledVariable(r210);
            r31.L$7 = r20;
            r31.L$8 = SpillingKt.nullOutSpilledVariable(r112);
            r31.L$9 = r0;
            r31.L$10 = SpillingKt.nullOutSpilledVariable(r116);
            r31.L$11 = r114;
            r31.L$12 = SpillingKt.nullOutSpilledVariable(r120);
            r31.L$13 = SpillingKt.nullOutSpilledVariable(r121);
            r31.I$0 = r26;
            r31.I$1 = r117;
            r31.I$2 = r111;
            r31.I$3 = r22;
            r31.I$4 = r30;
            r31.I$5 = 0;
            r25 = r0;
            r31.label = 1;
            if ($this$sequence2.yield(r33, r31) != r212) goto L19;
            return r212;
        L19:
            int r34 = r30;
            r24 = r212;
            r113 = r210;
            r21 = r32;
            r23 = r34;
            r118 = r31;
            $result2 = $result3;
            goto L20
        L21:
            Object r213 = r119;
            Iterator r122 = r20;
            SequenceScope $this$sequence3 = $this$sequence2;
            CorpusBlueprint r35 = r32;
            int r36 = r26;
            Iterator r37 = r27;
            AnonymousClass1 r38 = r31;
            String r39 = r115;
            int r123 = r117;
            int r124 = r111;
            Iterable r40 = r110;
            Object r41 = r213;
            List<String> r125 = r113;
            Object $result4 = $result3;
        L12:
            if (r122.hasNext() == false) goto L9;
            Object r126 = r122.next();
            r116 = r35.getChecks();
            $result3 = $result4;
            r20 = r122;
            r0 = (String) r126;
            r114 = r116.iterator();
            r111 = r124;
            r117 = r123;
            r119 = r41;
            r27 = r37;
            r22 = 0;
            r110 = r40;
            $this$sequence2 = $this$sequence3;
            r112 = r126;
            r113 = r125;
            r115 = r39;
            r31 = r38;
            r26 = r36;
            r32 = r35;
            r30 = 0;
        L9:
            if (r37.hasNext() == false) goto L24;
            r41 = r37.next();
            r39 = (String) r41;
            r123 = 0;
            r125 = r35.getActions();
            r124 = 0;
            r122 = r125.iterator();
            goto L12
        L24:
            return Unit.INSTANCE;
        L7:
            $this$sequence3 = $this$sequence;
            ResultKt.throwOnFailure($result);
            Iterable r42 = this.$blueprint.getPerspectives();
            CorpusBlueprint r43 = this.$blueprint;
            r38 = this;
            r37 = r42.iterator();
            r36 = 0;
            r35 = r43;
            r29 = r2;
            r40 = r42;
            $result4 = $result;
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private CorpusExpander() {
    }

    public static final /* synthetic */ void access$appendSentence(CorpusExpander $this, StringBuilder $receiver, String sentence) {
        $this.appendSentence($receiver, sentence);
    }

    public final List<LexiconEntry> expand(List<LexiconEntry> r28, List<CorpusBlueprint> r29, int targetPerCategory) {
        Iterable r0 = r28;
        Intrinsics.checkNotNullParameter(r0, "sourceEntries");
        Intrinsics.checkNotNullParameter(r29, "blueprints");
        if (((Collection) r0).isEmpty() == true) goto L88;
        if (targetPerCategory <= 0) goto L6;
        boolean r5 = true;
    L7:
        if (r5 == false) goto L86;
        Iterable r6 = r0;
        Collection r7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r6, 10));
        Iterator r11 = r6.iterator();
    L10:
        if (r11.hasNext() == false) goto L12;
        r7.add(((LexiconEntry) r11.next()).getCategory());
        goto L10
    L12:
        List categoryOrder = CollectionsKt.distinct((List) r7);
        List<CorpusBlueprint> r8 = r29;
        Map blueprintByCategory = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(r8, 10)), 16));
        Iterator r13 = r8.iterator();
    L14:
        if (r13.hasNext() == false) goto L17;
        Object r14 = r13.next();
        blueprintByCategory.put(((CorpusBlueprint) r14).getCategory(), r14);
        goto L14
    L17:
        if (blueprintByCategory.size() != r29.size()) goto L19;
        boolean r9 = true;
    L20:
        if (r9 == false) goto L84;
        if (Intrinsics.areEqual(blueprintByCategory.keySet(), CollectionsKt.toSet(categoryOrder)) == false) goto L82;
        Collection r10 = new ArrayList();
        Iterator r15 = categoryOrder.iterator();
    L25:
        if (r15.hasNext() == false) goto L80;
        String r16 = (String) r15.next();
        CorpusBlueprint r3 = (CorpusBlueprint) MapsKt.getValue(blueprintByCategory, r16);
        if (r3.getPerspectives().isEmpty() == true) goto L78;
        if (r3.getActions().isEmpty() == true) goto L76;
        if (r3.getChecks().isEmpty() == true) goto L74;
        LinkedHashMap r17 = new LinkedHashMap();
        Collection r20 = new ArrayList();
        Iterator r23 = r0.iterator();
    L34:
        if (r23.hasNext() == false) goto L40;
        Object r4 = r23.next();
        if (Intrinsics.areEqual(((LexiconEntry) r4).getCategory(), r16) == false) goto L34;
        r20.add(r4);
        goto L34
    L40:
        Iterable r12 = (List) r20;
        Iterator r18 = r12.iterator();
    L42:
        if (r18.hasNext() == false) goto L44;
        LexiconEntry r1 = (LexiconEntry) r18.next();
        r17.putIfAbsent(StringsKt.trim(r1.getText()).toString(), r1);
        r12 = r12;
        goto L42
    L44:
        Iterable r2 = CollectionsKt.plus(CollectionsKt.listOf(r16), r3.getKeys());
        List categoryOrder2 = categoryOrder;
        Collection r19 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r2, 10));
        Iterator r21 = r2.iterator();
    L46:
        if (r21.hasNext() == false) goto L48;
        r19.add(StringsKt.trim((String) r21.next()).toString());
        goto L46
    L48:
        Iterable r22 = (List) r19;
        int r24 = 0;
        Collection r25 = new ArrayList();
        Iterator r110 = r22.iterator();
    L50:
        if (r110.hasNext() == false) goto L58;
        int r26 = r24;
        Object r27 = r110.next();
        if (((String) r27).length() <= 0) goto L54;
        boolean r210 = true;
    L55:
        if (r210 == false) goto L57;
        r25.add(r27);
    L57:
        r24 = r26;
        goto L50
    L54:
        r210 = false;
        goto L55
    L58:
        List r30 = CollectionsKt.distinct((List) r25);
        Sequence<String> r31 = INSTANCE.expansionSequence(r3);
        Iterator<String> r32 = r31.iterator();
    L60:
        if (r32.hasNext() == false) goto L66;
        Sequence<String> r111 = r31;
        String r33 = (String) r32.next();
        CorpusBlueprint r211 = r3;
        if (r17.size() >= targetPerCategory) goto L64;
        r17.putIfAbsent(r33, new LexiconEntry(r16, r30, r33));
    L64:
        r31 = r111;
        r3 = r211;
        goto L60
    L66:
        if (r17.size() < targetPerCategory) goto L68;
        boolean r34 = true;
    L69:
        if (r34 == false) goto L72;
        Collection r35 = r17.values();
        Intrinsics.checkNotNullExpressionValue(r35, "<get-values>(...)");
        CollectionsKt.addAll(r10, CollectionsKt.take(r35, targetPerCategory));
        r0 = r28;
        categoryOrder = categoryOrder2;
        goto L25
    L72:
        throw new IllegalArgumentException((r16 + " 去重后只有 " + r17.size() + " 条，未达到 " + targetPerCategory + " 条").toString());
    L68:
        r34 = false;
        goto L69
    L74:
        throw new IllegalArgumentException((r16 + " 缺少校验方法").toString());
    L76:
        throw new IllegalArgumentException((r16 + " 缺少行动建议").toString());
    L78:
        throw new IllegalArgumentException((r16 + " 缺少认知视角").toString());
    L80:
        return (List) r10;
    L82:
        throw new IllegalArgumentException(("语料蓝图必须完整覆盖网页的 " + categoryOrder.size() + " 个维度").toString());
    L84:
        throw new IllegalArgumentException("语料蓝图分类不能重复".toString());
    L19:
        r9 = false;
        goto L20
    L86:
        throw new IllegalArgumentException("每类语料目标必须大于零".toString());
    L6:
        r5 = false;
        goto L7
    L88:
        throw new IllegalArgumentException("原始网页语料不能为空".toString());
    }

    private final Sequence<String> expansionSequence(CorpusBlueprint blueprint) {
        return SequencesKt.sequence(new AnonymousClass1(blueprint, null));
    }

    private final void appendSentence(StringBuilder $this$appendSentence, String sentence) {
        String clean = StringsKt.trim(sentence).toString();
        boolean r2 = true;
        if (clean.length() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return;
    L9:
        if ($this$appendSentence.length() > 0) goto L12;
        r2 = false;
    L12:
        if (r2 == false) goto L14;
        $this$appendSentence.append(' ');
    L14:
        $this$appendSentence.append(clean);
        if (END_PUNCTUATION.contains(Character.valueOf(StringsKt.last(clean))) == true) goto L18;
        $this$appendSentence.append(12290);
        return;
    L18:
        return;
    L5:
        r1 = false;
        goto L6
    }

    static {
        INSTANCE = new CorpusExpander();
        END_PUNCTUATION = SetsKt.setOf(new Character[]{(char) 12290, (char) 65281, (char) 65311, (char) 65307, '.', '!', '?', ';'});
        $stable = 8;
    }
}
