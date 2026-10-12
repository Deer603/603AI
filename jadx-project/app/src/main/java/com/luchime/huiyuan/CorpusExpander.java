package com.luchime.huiyuan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
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
    public static final CorpusExpander INSTANCE = new CorpusExpander();
    private static final Set<Character> END_PUNCTUATION = SetsKt.setOf((Object[]) new Character[]{(char) 12290, (char) 65281, (char) 65311, (char) 65307, '.', '!', '?', ';'});
    public static final int $stable = 8;

    private CorpusExpander() {
    }

    public final List<LexiconEntry> expand(List<LexiconEntry> sourceEntries, List<CorpusBlueprint> blueprints, int targetPerCategory) {
        Iterable sourceEntries2 = sourceEntries;
        Intrinsics.checkNotNullParameter(sourceEntries2, "sourceEntries");
        Intrinsics.checkNotNullParameter(blueprints, "blueprints");
        if (((Collection) sourceEntries2).isEmpty()) {
            throw new IllegalArgumentException("原始网页语料不能为空".toString());
        }
        if (!(targetPerCategory > 0)) {
            throw new IllegalArgumentException("每类语料目标必须大于零".toString());
        }
        Iterable iterable = sourceEntries2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((LexiconEntry) it.next()).getCategory());
        }
        List<String> categoryOrder = CollectionsKt.distinct((List) arrayList);
        List<CorpusBlueprint> list = blueprints;
        Map blueprintByCategory = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            blueprintByCategory.put(((CorpusBlueprint) obj).getCategory(), obj);
        }
        if (!(blueprintByCategory.size() == blueprints.size())) {
            throw new IllegalArgumentException("语料蓝图分类不能重复".toString());
        }
        if (!Intrinsics.areEqual(blueprintByCategory.keySet(), CollectionsKt.toSet(categoryOrder))) {
            throw new IllegalArgumentException(("语料蓝图必须完整覆盖网页的 " + categoryOrder.size() + " 个维度").toString());
        }
        Collection arrayList2 = new ArrayList();
        for (String str : categoryOrder) {
            CorpusBlueprint corpusBlueprint = (CorpusBlueprint) MapsKt.getValue(blueprintByCategory, str);
            if (corpusBlueprint.getPerspectives().isEmpty()) {
                throw new IllegalArgumentException((str + " 缺少认知视角").toString());
            }
            if (corpusBlueprint.getActions().isEmpty()) {
                throw new IllegalArgumentException((str + " 缺少行动建议").toString());
            }
            if (corpusBlueprint.getChecks().isEmpty()) {
                throw new IllegalArgumentException((str + " 缺少校验方法").toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Collection arrayList3 = new ArrayList();
            for (Object obj2 : sourceEntries2) {
                if (Intrinsics.areEqual(((LexiconEntry) obj2).getCategory(), str)) {
                    arrayList3.add(obj2);
                }
            }
            Iterable<LexiconEntry> iterable2 = (List) arrayList3;
            for (LexiconEntry lexiconEntry : iterable2) {
                linkedHashMap.putIfAbsent(StringsKt.trim((CharSequence) lexiconEntry.getText()).toString(), lexiconEntry);
                iterable2 = iterable2;
            }
            Iterable iterablePlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(str), (Iterable) corpusBlueprint.getKeys());
            List categoryOrder2 = categoryOrder;
            Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterablePlus, 10));
            Iterator it2 = iterablePlus.iterator();
            while (it2.hasNext()) {
                arrayList4.add(StringsKt.trim((CharSequence) it2.next()).toString());
            }
            Iterable iterable3 = (List) arrayList4;
            int i = 0;
            Collection arrayList5 = new ArrayList();
            for (Object obj3 : iterable3) {
                int i2 = i;
                if (((String) obj3).length() > 0) {
                    arrayList5.add(obj3);
                }
                i = i2;
            }
            List listDistinct = CollectionsKt.distinct((List) arrayList5);
            Sequence<String> sequenceExpansionSequence = INSTANCE.expansionSequence(corpusBlueprint);
            for (String str2 : sequenceExpansionSequence) {
                Sequence<String> sequence = sequenceExpansionSequence;
                CorpusBlueprint corpusBlueprint2 = corpusBlueprint;
                if (linkedHashMap.size() < targetPerCategory) {
                    linkedHashMap.putIfAbsent(str2, new LexiconEntry(str, listDistinct, str2));
                }
                sequenceExpansionSequence = sequence;
                corpusBlueprint = corpusBlueprint2;
            }
            if (!(linkedHashMap.size() >= targetPerCategory)) {
                throw new IllegalArgumentException((str + " 去重后只有 " + linkedHashMap.size() + " 条，未达到 " + targetPerCategory + " 条").toString());
            }
            Collection collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            CollectionsKt.addAll(arrayList2, CollectionsKt.take(collectionValues, targetPerCategory));
            sourceEntries2 = sourceEntries;
            categoryOrder = categoryOrder2;
        }
        return (List) arrayList2;
    }

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CorpusBlueprint corpusBlueprint, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$blueprint = corpusBlueprint;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$blueprint, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:13:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:22:0x01b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a7 -> B:11:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00c0 -> B:14:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0179 -> B:20:0x0186). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
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
                Method dump skipped, instruction units count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luchime.huiyuan.CorpusExpander.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final Sequence<String> expansionSequence(CorpusBlueprint blueprint) {
        return SequencesKt.sequence(new AnonymousClass1(blueprint, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void appendSentence(StringBuilder $this$appendSentence, String sentence) {
        String clean = StringsKt.trim((CharSequence) sentence).toString();
        if (clean.length() == 0) {
            return;
        }
        if ($this$appendSentence.length() > 0) {
            $this$appendSentence.append(' ');
        }
        $this$appendSentence.append(clean);
        if (!END_PUNCTUATION.contains(Character.valueOf(StringsKt.last(clean)))) {
            $this$appendSentence.append((char) 12290);
        }
    }
}
