package com.luchime.huiyuan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PersonaCorpusExpander.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/luchime/huiyuan/PersonaCorpusExpander;", "", "<init>", "()V", "isUsableCategory", "", "category", "", "expand", "", "Lcom/luchime/huiyuan/LexiconEntry;", "sourceEntries", "persona", "Lcom/luchime/huiyuan/EnginePersona;", "targetPerCategory", "", "actionStems", "actionMethods", "checks", "sentence", "value", "END_PUNCTUATION", "", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PersonaCorpusExpander {
    public static final PersonaCorpusExpander INSTANCE = new PersonaCorpusExpander();
    private static final Set<Character> END_PUNCTUATION = SetsKt.setOf((Object[]) new Character[]{(char) 12290, (char) 65281, (char) 65311, (char) 65307, '.', '!', '?', ';', (char) 65374, '~'});
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PersonaCorpusExpander.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnginePersona.values().length];
            try {
                iArr[EnginePersona.PIAO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnginePersona.GUIGUI.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnginePersona.TANGO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnginePersona.HUIYUAN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PersonaCorpusExpander() {
    }

    public final boolean isUsableCategory(String category) {
        boolean z;
        Intrinsics.checkNotNullParameter(category, "category");
        String str = category;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if ((str.charAt(i) != '?' ? (char) 1 : (char) 0) != 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        return z && !StringsKt.contains$default((CharSequence) category, (char) 65533, false, 2, (Object) null);
    }

    public final List<LexiconEntry> expand(List<LexiconEntry> sourceEntries, EnginePersona persona, int targetPerCategory) {
        Iterable sourceEntries2 = sourceEntries;
        Intrinsics.checkNotNullParameter(sourceEntries2, "sourceEntries");
        Intrinsics.checkNotNullParameter(persona, "persona");
        if (!(persona != EnginePersona.HUIYUAN)) {
            throw new IllegalArgumentException("困困使用认知语料扩展器".toString());
        }
        if (((Collection) sourceEntries2).isEmpty()) {
            throw new IllegalArgumentException("角色原始网页语料不能为空".toString());
        }
        Iterable iterable = sourceEntries2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((LexiconEntry) it.next()).getCategory());
        }
        Iterable iterableDistinct = CollectionsKt.distinct((List) arrayList);
        int i = 0;
        Collection arrayList2 = new ArrayList();
        Iterable<String> iterable2 = iterableDistinct;
        for (String str : iterable2) {
            Collection arrayList3 = new ArrayList();
            for (Object obj : sourceEntries2) {
                if (Intrinsics.areEqual(((LexiconEntry) obj).getCategory(), str)) {
                    arrayList3.add(obj);
                }
            }
            List<LexiconEntry> list = (List) arrayList3;
            List listListOf = CollectionsKt.listOf(str);
            Collection arrayList4 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList4, ((LexiconEntry) it2.next()).getKeys());
            }
            List listDistinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) listListOf, arrayList4));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (LexiconEntry lexiconEntry : list) {
                Iterable iterable3 = iterableDistinct;
                linkedHashMap.putIfAbsent(StringsKt.trim((CharSequence) lexiconEntry.getText()).toString(), lexiconEntry);
                iterableDistinct = iterable3;
                i = i;
            }
            Iterable iterable4 = iterableDistinct;
            int i2 = i;
            Iterable<String> iterableActionStems = INSTANCE.actionStems(persona);
            int i3 = 0;
            Collection arrayList5 = new ArrayList();
            for (String str2 : iterableActionStems) {
                Iterable iterableActionMethods = INSTANCE.actionMethods(persona);
                Iterable iterable5 = iterableActionStems;
                int i4 = i3;
                Iterable iterable6 = iterable2;
                Collection arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableActionMethods, 10));
                Iterable iterable7 = iterableActionMethods;
                Iterator it3 = iterable7.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(StringsKt.replace$default(str2, "{category}", str, false, 4, (Object) null) + " " + StringsKt.replace$default((String) it3.next(), "{category}", str, false, 4, (Object) null));
                    iterable7 = iterable7;
                    iterableActionMethods = iterableActionMethods;
                    str2 = str2;
                }
                CollectionsKt.addAll(arrayList5, (List) arrayList6);
                iterable2 = iterable6;
                iterableActionStems = iterable5;
                i3 = i4;
            }
            Iterable iterable8 = iterable2;
            List list2 = (List) arrayList5;
            for (String str3 : SequencesKt.sequence(new PersonaCorpusExpander$expand$4$2(list, list2, INSTANCE.checks(persona, str), null))) {
                List list3 = list2;
                List list4 = list;
                if (linkedHashMap.size() < targetPerCategory) {
                    linkedHashMap.putIfAbsent(str3, new LexiconEntry(str, listDistinct, str3));
                }
                list2 = list3;
                list = list4;
            }
            if (!(linkedHashMap.size() >= targetPerCategory)) {
                throw new IllegalArgumentException((persona + " 的「" + str + "」只有 " + linkedHashMap.size() + " 条，未达到 " + targetPerCategory + " 条").toString());
            }
            Collection collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            CollectionsKt.addAll(arrayList2, CollectionsKt.take(collectionValues, targetPerCategory));
            sourceEntries2 = sourceEntries;
            iterableDistinct = iterable4;
            i = i2;
            iterable2 = iterable8;
        }
        return (List) arrayList2;
    }

    private final List<String> actionStems(EnginePersona persona) {
        switch (WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1:
                return CollectionsKt.listOf((Object[]) new String[]{"说到「{category}」，本朴不跟你绕弯子", "这事放到 deskpark 主场，本朴先把话说明白", "按朴AI的脾气，「{category}」先别整虚的", "老子做「{category}」只认能落地的东西", "花衬衫一穿，本朴就按项目负责人的办法处理「{category}」"});
            case 2:
                return CollectionsKt.listOf((Object[]) new String[]{"说到「{category}」，龟龟先陪你把问题理顺呀", "龟龟歪着小脑袋看「{category}」，会先温柔地拆开来", "按龟龟这只卷毛龟的习惯，「{category}」要耐心一点点做", "龟龟当 RM 队长时就知道，「{category}」不能只靠着急", "龟龟把「{category}」记进小本本，陪你一步一步确认"});
            case 3:
                return CollectionsKt.listOf((Object[]) new String[]{"说到「{category}」，本熊先给你能执行的结论", "探戈处理「{category}」跟排 Linux 故障一样，先抓主因", "老子虽然困，但「{category}」这事不能瞎猜", "本熊不灌鸡汤，「{category}」直接看输入、状态和结果", "Zzz…探戈醒一下，「{category}」按最短路径处理"});
            case 4:
                throw new IllegalStateException("困困不走角色扩展".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final List<String> actionMethods(EnginePersona persona) {
        switch (WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1:
                return CollectionsKt.listOf((Object[]) new String[]{"先把目标、资源和截止时间摊在桌面上", "先做最小可用版本，别一上来把排场整得比结果大", "先把最容易翻车的环节单独试一遍", "先找一个能当场验证的动作，做完再继续朴", "先分清这是技术问题、执行问题，还是有人在扯犊子"});
            case 2:
                return CollectionsKt.listOf((Object[]) new String[]{"先把目标拆成小步骤，每一步都留出检查的位置", "先照顾好安全边界，再慢慢调参数和节奏", "先记录现象、条件和变化，不让感觉替代证据", "先做一个小实验，成功了再开心地往前拱", "先问清楚你真正担心什么，龟龟再陪你选办法"});
            case 3:
                return CollectionsKt.listOf((Object[]) new String[]{"先复现，再看日志，最后只改一个变量", "先确认环境、版本和边界条件，别上来就重装", "先做最小实验，把猜测变成能验证的假设", "先保留现场和数据，再动手排除故障", "先选成本最低的路径跑通，复杂方案留到真有必要时"});
            case 4:
                throw new IllegalStateException("困困不走角色扩展".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final List<String> checks(EnginePersona persona, String category) {
        Iterable checks;
        switch (WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1:
                checks = CollectionsKt.listOf((Object[]) new String[]{"能不能在主场当场跑起来", "结果是不是比嘴硬更有说服力", "成本和收益能不能对上", "最坏情况能不能兜住", "是不是有人只会喊口号", "关键参数有没有记下来", "下一步有没有具体负责人", "今晚能不能做出第一版", "失败后能不能快速撤回来", "有没有把用户真正要的东西搞清楚", "是不是为了面子堆了没用的功能", "能不能用一句话说清结果", "现场的人能不能照着复现", "有没有留下备份和退路", "是否值得本朴继续投入时间", "有没有先解决最卡脖子的地方", "结果能不能经得住第二次测试", "是否比原方案更省事", "做完有没有明确交付物", "如果还不行，就把日志和现象甩过来，本朴继续朴"});
                break;
            case 2:
                checks = CollectionsKt.listOf((Object[]) new String[]{"龟龟会看结果是否稳定，也会看过程有没有伤到你", "每一步都能复现，龟龟才放心呀", "参数变化要记下来，不能只凭感觉哦", "安全、健康和设备边界要放在第一位", "如果出现异常就先停下，不要硬扛", "小范围验证通过，再慢慢扩大", "确认目标真的达成，而不是看起来很热闹", "给自己留一点休息和回退空间", "把不确定的地方标出来，龟龟陪你继续查", "问问当事人的感受，不替别人做决定", "数据和现场现象要互相对得上", "不要因为一次成功就忽略长期稳定性", "步骤最好让队友也能看懂和复现", "成本、时间和风险都要温柔地算进去", "先保护弱小个体，再谈效率", "能少折腾一次，就少折腾一次", "结果不理想也没关系，记录下来就是进步", "别忘了检查电源、连接和环境这些基础项", "龟龟会陪你复盘哪一步最有效", "做完记得喘口气，贴贴～"});
                break;
            case 3:
                checks = CollectionsKt.listOf((Object[]) new String[]{"看退出码、日志和可复现结果，别看玄学", "能用最小样例复现才算抓到问题", "先确认没有数据损失和不可逆操作", "性能数据要测，不能靠体感吹", "边界条件跑一遍，别等上线再 kernel panic", "版本、权限、路径和依赖都要对得上", "改动前后做对照，确认真是这个变量", "能回滚才动手，不能回滚先备份", "别把警告当成功，也别把成功编译当真机验证", "结果稳定跑三次，本熊才勉强点头", "命令和输入要留记录，省得下次重新挨饿", "不要为了炫技把简单问题写成内核模块", "时间复杂度和实际规模都要算", "资源占用别把机器吃得比本熊还胖", "错误路径也要测，不然迟早半夜叫醒老子", "如果现象变了，就回到最后一个已知正常状态", "先解决根因，再清理表面报错", "事实不够就继续采样，别强行下结论", "确认方案真能维护，不是一次性魔法", "验证完就收工，探戈饿了，吃什么？"});
                break;
            case 4:
                throw new IllegalStateException("困困不走角色扩展".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        Iterable iterable = checks;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add("在「" + category + "」里，" + ((String) it.next()));
        }
        return (List) arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String sentence(String value) {
        String clean = StringsKt.trim((CharSequence) value).toString();
        return CollectionsKt.contains(END_PUNCTUATION, StringsKt.lastOrNull(clean)) ? clean : clean + "。";
    }
}
