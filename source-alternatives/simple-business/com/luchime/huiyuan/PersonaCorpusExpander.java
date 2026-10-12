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
    public static final int $stable = 0;
    private static final Set<Character> END_PUNCTUATION = null;
    public static final PersonaCorpusExpander INSTANCE = null;

    /* JADX INFO: compiled from: PersonaCorpusExpander.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[EnginePersona.values().length];
            r0[EnginePersona.PIAO.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[EnginePersona.GUIGUI.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[EnginePersona.TANGO.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[EnginePersona.HUIYUAN.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    private PersonaCorpusExpander() {
    }

    public static final /* synthetic */ String access$sentence(PersonaCorpusExpander $this, String value) {
        return $this.sentence(value);
    }

    public final boolean isUsableCategory(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        String r0 = category;
        int r3 = 0;
    L4:
        if (r3 >= r0.length()) goto L12;
        if (r0.charAt(r3) == '?') goto L8;
        char r6 = 1;
    L9:
        if (r6 != 0) goto L10;
        r3 = r3 + 1;
        goto L4
    L10:
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (StringsKt.contains$default(category, 65533, false, 2, null) == false) goto L17;
        return false;
    L17:
        return true;
    L8:
        r6 = 0;
        goto L9
    L12:
        r1 = false;
        goto L13
    }

    public final List<LexiconEntry> expand(List<LexiconEntry> r40, EnginePersona persona, int targetPerCategory) {
        Iterable r0 = r40;
        Intrinsics.checkNotNullParameter(r0, "sourceEntries");
        Intrinsics.checkNotNullParameter(persona, "persona");
        if (persona == EnginePersona.HUIYUAN) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L59;
        if (((Collection) r0).isEmpty() == true) goto L57;
        Iterable r4 = r0;
        Collection r7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r4, 10));
        Iterator r11 = r4.iterator();
    L11:
        if (r11.hasNext() == false) goto L13;
        r7.add(((LexiconEntry) r11.next()).getCategory());
        goto L11
    L13:
        Iterable r5 = CollectionsKt.distinct((List) r7);
        int r6 = 0;
        Collection r8 = new ArrayList();
        Iterable r9 = r5;
        Iterator r12 = r9.iterator();
    L15:
        if (r12.hasNext() == false) goto L55;
        String r15 = (String) r12.next();
        Collection r16 = new ArrayList();
        Iterator r20 = r0.iterator();
    L18:
        if (r20.hasNext() == false) goto L23;
        Object r10 = r20.next();
        if (Intrinsics.areEqual(((LexiconEntry) r10).getCategory(), r15) == false) goto L18;
        r16.add(r10);
        goto L18
    L23:
        List r13 = (List) r16;
        List r14 = CollectionsKt.listOf(r15);
        Collection r17 = new ArrayList();
        Iterator r21 = r13.iterator();
    L25:
        if (r21.hasNext() == false) goto L27;
        CollectionsKt.addAll(r17, ((LexiconEntry) r21.next()).getKeys());
        goto L25
    L27:
        List r1 = CollectionsKt.distinct(CollectionsKt.plus(r14, (List) r17));
        LinkedHashMap r18 = new LinkedHashMap();
        Iterator r19 = r13.iterator();
    L29:
        if (r19.hasNext() == false) goto L31;
        Iterable r22 = r5;
        LexiconEntry r23 = (LexiconEntry) r19.next();
        r18.putIfAbsent(StringsKt.trim(r23.getText()).toString(), r23);
        r5 = r22;
        r6 = r6;
        goto L29
    L31:
        Iterable r24 = r5;
        int r25 = r6;
        Iterable r26 = INSTANCE.actionStems(persona);
        int r27 = 0;
        Collection r28 = new ArrayList();
        Iterator r29 = r26.iterator();
    L33:
        if (r29.hasNext() == false) goto L39;
        String r110 = (String) r29.next();
        Iterable r111 = INSTANCE.actionMethods(persona);
        Iterable r30 = r26;
        int r31 = r27;
        Iterable r210 = r9;
        Collection r32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r111, 10));
        Iterable r33 = r111;
        Iterator r34 = r33.iterator();
    L36:
        if (r34.hasNext() == false) goto L38;
        String r35 = (String) r34.next();
        Iterable r112 = r111;
        r32.add(StringsKt.replace$default(r110, "{category}", r15, false, 4, null) + " " + StringsKt.replace$default(r35, "{category}", r15, false, 4, null));
        r33 = r33;
        r111 = r112;
        r110 = r110;
        goto L36
    L38:
        CollectionsKt.addAll(r28, (List) r32);
        r9 = r210;
        r26 = r30;
        r27 = r31;
        goto L33
    L39:
        Iterable r211 = r9;
        List r36 = (List) r28;
        Iterator r113 = SequencesKt.sequence(new PersonaCorpusExpander$expand$4$2(r13, r36, INSTANCE.checks(persona, r15), null)).iterator();
    L41:
        if (r113.hasNext() == false) goto L47;
        List r114 = r36;
        String r37 = (String) r113.next();
        List r115 = r13;
        if (r18.size() >= targetPerCategory) goto L45;
        r18.putIfAbsent(r37, new LexiconEntry(r15, r1, r37));
    L45:
        r36 = r114;
        r13 = r115;
        goto L41
    L47:
        if (r18.size() < targetPerCategory) goto L49;
        boolean r38 = true;
    L50:
        if (r38 == false) goto L53;
        Collection r39 = r18.values();
        Intrinsics.checkNotNullExpressionValue(r39, "<get-values>(...)");
        CollectionsKt.addAll(r8, CollectionsKt.take(r39, targetPerCategory));
        r0 = r40;
        r5 = r24;
        r6 = r25;
        r9 = r211;
        goto L15
    L53:
        throw new IllegalArgumentException((persona + " 的「" + r15 + "」只有 " + r18.size() + " 条，未达到 " + targetPerCategory + " 条").toString());
    L49:
        r38 = false;
        goto L50
    L55:
        return (List) r8;
    L57:
        throw new IllegalArgumentException("角色原始网页语料不能为空".toString());
    L59:
        throw new IllegalArgumentException("困困使用认知语料扩展器".toString());
    L5:
        r3 = false;
        goto L6
    }

    private final List<String> actionStems(EnginePersona persona) {
        switch(WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1: goto L11;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        throw new IllegalStateException("困困不走角色扩展".toString());
    L12:
        return CollectionsKt.listOf(new String[]{"说到「{category}」，本熊先给你能执行的结论", "探戈处理「{category}」跟排 Linux 故障一样，先抓主因", "老子虽然困，但「{category}」这事不能瞎猜", "本熊不灌鸡汤，「{category}」直接看输入、状态和结果", "Zzz…探戈醒一下，「{category}」按最短路径处理"});
    L13:
        return CollectionsKt.listOf(new String[]{"说到「{category}」，龟龟先陪你把问题理顺呀", "龟龟歪着小脑袋看「{category}」，会先温柔地拆开来", "按龟龟这只卷毛龟的习惯，「{category}」要耐心一点点做", "龟龟当 RM 队长时就知道，「{category}」不能只靠着急", "龟龟把「{category}」记进小本本，陪你一步一步确认"});
    L11:
        return CollectionsKt.listOf(new String[]{"说到「{category}」，本朴不跟你绕弯子", "这事放到 deskpark 主场，本朴先把话说明白", "按朴AI的脾气，「{category}」先别整虚的", "老子做「{category}」只认能落地的东西", "花衬衫一穿，本朴就按项目负责人的办法处理「{category}」"});
    }

    private final List<String> actionMethods(EnginePersona persona) {
        switch(WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1: goto L11;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L7;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        throw new IllegalStateException("困困不走角色扩展".toString());
    L12:
        return CollectionsKt.listOf(new String[]{"先复现，再看日志，最后只改一个变量", "先确认环境、版本和边界条件，别上来就重装", "先做最小实验，把猜测变成能验证的假设", "先保留现场和数据，再动手排除故障", "先选成本最低的路径跑通，复杂方案留到真有必要时"});
    L13:
        return CollectionsKt.listOf(new String[]{"先把目标拆成小步骤，每一步都留出检查的位置", "先照顾好安全边界，再慢慢调参数和节奏", "先记录现象、条件和变化，不让感觉替代证据", "先做一个小实验，成功了再开心地往前拱", "先问清楚你真正担心什么，龟龟再陪你选办法"});
    L11:
        return CollectionsKt.listOf(new String[]{"先把目标、资源和截止时间摊在桌面上", "先做最小可用版本，别一上来把排场整得比结果大", "先把最容易翻车的环节单独试一遍", "先找一个能当场验证的动作，做完再继续朴", "先分清这是技术问题、执行问题，还是有人在扯犊子"});
    }

    private final List<String> checks(EnginePersona persona, String category) {
        switch(WhenMappings.$EnumSwitchMapping$0[persona.ordinal()]) {
            case 1: goto L10;
            case 2: goto L9;
            case 3: goto L8;
            case 4: goto L7;
            default: goto L5;
        };
    L8:
        Iterable checks = CollectionsKt.listOf(new String[]{"看退出码、日志和可复现结果，别看玄学", "能用最小样例复现才算抓到问题", "先确认没有数据损失和不可逆操作", "性能数据要测，不能靠体感吹", "边界条件跑一遍，别等上线再 kernel panic", "版本、权限、路径和依赖都要对得上", "改动前后做对照，确认真是这个变量", "能回滚才动手，不能回滚先备份", "别把警告当成功，也别把成功编译当真机验证", "结果稳定跑三次，本熊才勉强点头", "命令和输入要留记录，省得下次重新挨饿", "不要为了炫技把简单问题写成内核模块", "时间复杂度和实际规模都要算", "资源占用别把机器吃得比本熊还胖", "错误路径也要测，不然迟早半夜叫醒老子", "如果现象变了，就回到最后一个已知正常状态", "先解决根因，再清理表面报错", "事实不够就继续采样，别强行下结论", "确认方案真能维护，不是一次性魔法", "验证完就收工，探戈饿了，吃什么？"});
    L11:
        Iterable r1 = checks;
        Collection r2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r1, 10));
        Iterator r6 = r1.iterator();
    L13:
        if (r6.hasNext() == false) goto L16;
        r2.add("在「" + category + "」里，" + ((String) r6.next()));
        goto L13
    L16:
        return (List) r2;
    L9:
        checks = CollectionsKt.listOf(new String[]{"龟龟会看结果是否稳定，也会看过程有没有伤到你", "每一步都能复现，龟龟才放心呀", "参数变化要记下来，不能只凭感觉哦", "安全、健康和设备边界要放在第一位", "如果出现异常就先停下，不要硬扛", "小范围验证通过，再慢慢扩大", "确认目标真的达成，而不是看起来很热闹", "给自己留一点休息和回退空间", "把不确定的地方标出来，龟龟陪你继续查", "问问当事人的感受，不替别人做决定", "数据和现场现象要互相对得上", "不要因为一次成功就忽略长期稳定性", "步骤最好让队友也能看懂和复现", "成本、时间和风险都要温柔地算进去", "先保护弱小个体，再谈效率", "能少折腾一次，就少折腾一次", "结果不理想也没关系，记录下来就是进步", "别忘了检查电源、连接和环境这些基础项", "龟龟会陪你复盘哪一步最有效", "做完记得喘口气，贴贴～"});
        goto L11
    L10:
        checks = CollectionsKt.listOf(new String[]{"能不能在主场当场跑起来", "结果是不是比嘴硬更有说服力", "成本和收益能不能对上", "最坏情况能不能兜住", "是不是有人只会喊口号", "关键参数有没有记下来", "下一步有没有具体负责人", "今晚能不能做出第一版", "失败后能不能快速撤回来", "有没有把用户真正要的东西搞清楚", "是不是为了面子堆了没用的功能", "能不能用一句话说清结果", "现场的人能不能照着复现", "有没有留下备份和退路", "是否值得本朴继续投入时间", "有没有先解决最卡脖子的地方", "结果能不能经得住第二次测试", "是否比原方案更省事", "做完有没有明确交付物", "如果还不行，就把日志和现象甩过来，本朴继续朴"});
        goto L11
    L5:
        throw new NoWhenBranchMatchedException();
    L7:
        throw new IllegalStateException("困困不走角色扩展".toString());
    }

    private final String sentence(String value) {
        String clean = StringsKt.trim(value).toString();
        if (CollectionsKt.contains(END_PUNCTUATION, StringsKt.lastOrNull(clean)) == false) goto L6;
        return clean;
    L6:
        return clean + "。";
    }

    static {
        INSTANCE = new PersonaCorpusExpander();
        END_PUNCTUATION = SetsKt.setOf(new Character[]{(char) 12290, (char) 65281, (char) 65311, (char) 65307, '.', '!', '?', ';', (char) 65374, '~'});
        $stable = 8;
    }
}
