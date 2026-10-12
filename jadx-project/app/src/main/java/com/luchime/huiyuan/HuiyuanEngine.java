package com.luchime.huiyuan;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u008d\u0001\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010$\u001a\u00020!J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J\b\u0010&\u001a\u00020\u0006H\u0002J\b\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u0006H\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\b\u0010+\u001a\u00020\u0006H\u0002J\b\u0010,\u001a\u00020\u0006H\u0002J\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u0006J\u0010\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0004J!\u00103\u001a\u0002H4\"\u0004\b\u0000\u001042\f\u00105\u001a\b\u0012\u0004\u0012\u0002H40\u0003H\u0002¢\u0006\u0002\u00106R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/luchime/huiyuan/HuiyuanEngine;", "", "lexicon", "", "Lcom/luchime/huiyuan/LexiconEntry;", "generic", "", "greeting", "prefixes", "suffixes", "random", "Lkotlin/random/Random;", "matchingEntries", "characterPrefixes", "characterSuffixes", "persona", "Lcom/luchime/huiyuan/EnginePersona;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V", "getLexicon", "()Ljava/util/List;", "getGreeting", "()Ljava/lang/String;", "dimensionCount", "", "getDimensionCount", "()I", "categoryCounts", "", "getCategoryCounts", "()Ljava/util/Map;", "entriesByDimension", "analyze", "Lcom/luchime/huiyuan/ReplyResult;", "text", "buildThinkSteps", "result", "randomThinkSteps", "personaName", "libraryName", "dimensionLabel", "searchSteps", "toolSteps", "wrapperName", "extractorName", "randomOne", "isGreeting", "", "matchEntry", "wrap", "entry", "pick", "T", "values", "(Ljava/util/List;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HuiyuanEngine {
    public static final long LOG_AFTER_RESPONSE_MS = 400;
    public static final long RESPONSE_PADDING_MS = 480;
    public static final long STEP_INTERVAL_MS = 430;
    public static final int TARGET_ENTRIES_PER_DIMENSION = 1000;
    private final Map<String, Integer> categoryCounts;
    private final List<String> characterPrefixes;
    private final List<String> characterSuffixes;
    private final int dimensionCount;
    private final Map<String, List<LexiconEntry>> entriesByDimension;
    private final List<String> generic;
    private final String greeting;
    private final List<LexiconEntry> lexicon;
    private final List<LexiconEntry> matchingEntries;
    private final EnginePersona persona;
    private final List<String> prefixes;
    private final Random random;
    private final List<String> suffixes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final int $stable = 8;
    private static final Regex GREETING_REGEX = new Regex("^(你好|您好|hi|hello|在吗|在不在|哈喽|嗨|喂)", RegexOption.IGNORE_CASE);
    private static final Set<String> GREETINGS = SetsKt.setOf((Object[]) new String[]{"你好", "您好", "在吗", "hi", "hello", "哈喽", "嗨"});
    private static final List<String> KUN_KUN_PREFIX = CollectionsKt.listOf((Object[]) new String[]{"困困来啦～ ", "困困觉得呀，", "让困困想想哦——", "困困想和你说，", "困困歪头想想：", "呼～困困泡完水来答你啦："});
    private static final List<String> KUN_KUN_SUFFIX = CollectionsKt.listOf((Object[]) new String[]{"～困困说的哦", "（困困歪头）", "困困陪你一起想通它～", "要相信困困呀", "困困会一直陪着你哒～"});
    private static final List<String> SEARCH_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🔍 正在检索高认知语录库…", "📡 正在联网比对认知资料…", "🗂 正在调取历史语录索引…"});
    private static final List<String> TOOL_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🧠 调用工具「认知索引器」匹配维度…", "⚙️ 调用工具「语义映射器」解析关键词…", "🔧 调用工具「维度分类器」做聚类…"});
    private static final List<String> PIAO_PREFIX = CollectionsKt.listOf((Object[]) new String[]{"老子来了——", "本朴觉得吧，", "让老子朴一朴——", "你这个问题，", "操，老子得先说一句：", "卷毛企鹅上线："});
    private static final List<String> PIAO_SUFFIX = CollectionsKt.listOf((Object[]) new String[]{"鸡巴飞了，散会。", "——朴一朴，就这样。", "你懂个鸡巴？", "老子说完，爱听不听。", "去 deskpark 主场找老子。", "朴朴看，不行再骂。"});
    private static final List<String> PIAO_SEARCH_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🐧 朴AI正在检索朴语录库…", "📡 朴AI正在调取deskpark主场索引…", "🗂 朴AI翻开自己的花衬衫口袋…"});
    private static final List<String> PIAO_TOOL_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🧠 调用工具「朴式语义检索器」匹配维度…", "⚙️ 调用工具「卷毛分类器」解析关键词…", "🔧 调用工具「超声波定向过滤器」聚类…"});
    private static final List<String> GUIGUI_PREFIX = CollectionsKt.listOf((Object[]) new String[]{"龟龟来啦～ ", "龟龟觉得呀，", "让龟龟想想哦——", "龟龟想和你说，", "龟龟歪头想想：", "嘿嘿，卷毛龟上线：", "龟龟的小脑袋转起来啦："});
    private static final List<String> GUIGUI_SUFFIX = CollectionsKt.listOf((Object[]) new String[]{"～龟龟说的哦", "（龟龟缩头害羞）", "龟龟会一直陪着你哒～", "要相信龟龟呀", "贴贴～", "龟龟说完啦，你要好好的哦"});
    private static final List<String> GUIGUI_SEARCH_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🐢 龟龟正在检索龟龟语录库…", "📡 龟龟正在调取知识索引…", "🗂 龟龟翻开自己的小本本…"});
    private static final List<String> GUIGUI_TOOL_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🧠 调用工具「龟龟语义检索器」匹配维度…", "⚙️ 调用工具「卷毛知识分类器」解析关键词…", "🔧 调用工具「土家族文化过滤器」聚类…"});
    private static final List<String> TANGO_PREFIX = CollectionsKt.listOf((Object[]) new String[]{"探戈来啦～ ", "本熊觉得呀，", "让探戈想想哦——", "探戈歪着大脑袋想想：", "本熊擦擦口水说：", "Zzz…啊？好好好本熊说：", "探戈挠挠肚子："});
    private static final List<String> TANGO_SUFFIX = CollectionsKt.listOf((Object[]) new String[]{"～探戈说的哦", "（本熊打了个哈欠）", "Zzz…", "探戈说完要去打呼噜了", "你吃了吗？本熊饿了。", "别问本熊人生建议啊，本熊认知约等于 NULL"});
    private static final List<String> TANGO_SEARCH_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🐻 探戈正在翻语录库…", "📡 探戈正在调取知识索引…", "🗂 探戈翻开自己的小本本…", "🍖 探戈先擦了擦口水再开始检索…"});
    private static final List<String> TANGO_TOOL_STEPS = CollectionsKt.listOf((Object[]) new String[]{"🧠 调用工具「探戈语义检索器」匹配维度…", "⚙️ 调用工具「胖熊知识分类器」解析关键词…", "🔧 调用工具「低认知过滤器」聚类…", "💻 调用工具「Linux命令行检索器」匹配…"});

    /* JADX INFO: compiled from: HuiyuanEngine.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnginePersona.values().length];
            try {
                iArr[EnginePersona.HUIYUAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[EnginePersona.PIAO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[EnginePersona.GUIGUI.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[EnginePersona.TANGO.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HuiyuanEngine(List<LexiconEntry> lexicon, List<String> generic, String greeting, List<String> prefixes, List<String> suffixes, Random random, List<LexiconEntry> matchingEntries, List<String> characterPrefixes, List<String> characterSuffixes, EnginePersona persona) {
        Object arrayList;
        Intrinsics.checkNotNullParameter(lexicon, "lexicon");
        Intrinsics.checkNotNullParameter(generic, "generic");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(prefixes, "prefixes");
        Intrinsics.checkNotNullParameter(suffixes, "suffixes");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(matchingEntries, "matchingEntries");
        Intrinsics.checkNotNullParameter(characterPrefixes, "characterPrefixes");
        Intrinsics.checkNotNullParameter(characterSuffixes, "characterSuffixes");
        Intrinsics.checkNotNullParameter(persona, "persona");
        this.lexicon = lexicon;
        this.generic = generic;
        this.greeting = greeting;
        this.prefixes = prefixes;
        this.suffixes = suffixes;
        this.random = random;
        this.matchingEntries = matchingEntries;
        this.characterPrefixes = characterPrefixes;
        this.characterSuffixes = characterSuffixes;
        this.persona = persona;
        Iterable iterable = this.lexicon;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LexiconEntry) it.next()).getCategory());
        }
        this.dimensionCount = CollectionsKt.toSet((List) arrayList2).size();
        final Iterable iterable2 = this.lexicon;
        this.categoryCounts = GroupingKt.eachCount(new Grouping<LexiconEntry, String>() { // from class: com.luchime.huiyuan.HuiyuanEngine$special$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<LexiconEntry> sourceIterator() {
                return iterable2.iterator();
            }

            @Override // kotlin.collections.Grouping
            public String keyOf(LexiconEntry element) {
                return element.getCategory();
            }
        });
        Iterable iterable3 = this.lexicon;
        Map linkedHashMap = new LinkedHashMap();
        for (Object obj : iterable3) {
            Iterable iterable4 = iterable3;
            String category = ((LexiconEntry) obj).getCategory();
            Object obj2 = linkedHashMap.get(category);
            if (obj2 == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(category, arrayList);
            } else {
                arrayList = obj2;
            }
            ((List) arrayList).add(obj);
            iterable3 = iterable4;
        }
        this.entriesByDimension = linkedHashMap;
    }

    public final List<LexiconEntry> getLexicon() {
        return this.lexicon;
    }

    public final String getGreeting() {
        return this.greeting;
    }

    public final int getDimensionCount() {
        return this.dimensionCount;
    }

    public final Map<String, Integer> getCategoryCounts() {
        return this.categoryCounts;
    }

    public final ReplyResult analyze(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String clean = StringsKt.trim((CharSequence) text).toString();
        if (isGreeting(clean)) {
            return new ReplyResult("greet", this.greeting, "问候", null, "问候");
        }
        LexiconEntry entry = matchEntry(clean);
        if (entry == null) {
            return new ReplyResult("generic", wrap(new LexiconEntry("通用", CollectionsKt.emptyList(), (String) pick(this.generic))), "通用", null, "通用兜底");
        }
        return new ReplyResult("entry", wrap(entry), entry.getCategory(), entry, entry.getCategory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<String> buildThinkSteps(ReplyResult result) {
        String str;
        Intrinsics.checkNotNullParameter(result, "result");
        String[] strArr = new String[6];
        strArr[0] = pick(searchSteps());
        strArr[1] = "📚 已载入 " + this.lexicon.size() + " 条" + libraryName() + " / " + this.dimensionCount + " 个" + dimensionLabel();
        strArr[2] = pick(toolSteps());
        if (result.getEntry() != null) {
            str = "✅ 命中维度：「" + result.getDimension() + "」";
        } else {
            str = "⚠️ 没命中关键词，" + personaName() + "切到通用兜底池";
        }
        strArr[3] = str;
        strArr[4] = "🛠 调用工具「" + wrapperName() + "」组织回复…";
        strArr[5] = "✨ 输出准备完成";
        return CollectionsKt.listOf((Object[]) strArr);
    }

    public final List<String> randomThinkSteps() {
        return CollectionsKt.listOf((Object[]) new String[]{"🎲 随机模式：" + personaName() + "跳过语义解析…", "📚 已载入 " + this.lexicon.size() + " 条" + libraryName() + " / " + this.dimensionCount + " 个" + dimensionLabel(), "🛠 调用工具「" + extractorName() + "」…", "✨ 输出准备完成"});
    }

    private final String personaName() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return "困困";
            case 2:
                return "朴AI";
            case 3:
                return "龟龟";
            case 4:
                return "探戈";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String libraryName() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return "语录";
            case 2:
                return "朴语录";
            case 3:
                return "龟龟语录";
            case 4:
                return "探戈语录";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String dimensionLabel() {
        return this.persona == EnginePersona.HUIYUAN ? "认知维度" : "知识维度";
    }

    private final List<String> searchSteps() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return SEARCH_STEPS;
            case 2:
                return PIAO_SEARCH_STEPS;
            case 3:
                return GUIGUI_SEARCH_STEPS;
            case 4:
                return TANGO_SEARCH_STEPS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final List<String> toolSteps() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return TOOL_STEPS;
            case 2:
                return PIAO_TOOL_STEPS;
            case 3:
                return GUIGUI_TOOL_STEPS;
            case 4:
                return TANGO_TOOL_STEPS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String wrapperName() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return "语录包装器";
            case 2:
                return "朴式语气包装器";
            case 3:
                return "龟龟语气包装器";
            case 4:
                return "探戈语气包装器";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String extractorName() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.persona.ordinal()]) {
            case 1:
                return "语录抽取器";
            case 2:
                return "朴语录抽取器";
            case 3:
                return "龟龟语录抽取器";
            case 4:
                return "探戈语录抽取器";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ReplyResult randomOne() {
        if (nextDouble() < 0.7d) {
            LexiconEntry entry = (LexiconEntry) pick(this.lexicon);
            return new ReplyResult("entry", wrap(entry), entry.getCategory(), entry, entry.getCategory());
        }
        return new ReplyResult("generic", wrap(new LexiconEntry("通用", CollectionsKt.emptyList(), (String) pick(this.generic))), "通用", null, "通用兜底");
    }

    public final boolean isGreeting(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String clean = StringsKt.trim((CharSequence) text).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(clean, "toLowerCase(...)");
        if (clean.length() == 0) {
            return false;
        }
        return GREETING_REGEX.containsMatchIn(clean) || GREETINGS.contains(clean);
    }

    public final LexiconEntry matchEntry(String text) {
        int i;
        String input;
        String str;
        LinkedHashMap matchedEntriesByDimension;
        Iterable iterable;
        int i2;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(text, "text");
        String input2 = text.toLowerCase(Locale.ROOT);
        String str2 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(input2, "toLowerCase(...)");
        final LinkedHashMap bestByDimension = new LinkedHashMap();
        final LinkedHashMap sumByDimension = new LinkedHashMap();
        LinkedHashMap matchedEntriesByDimension2 = new LinkedHashMap();
        Iterable<LexiconEntry> iterable2 = this.matchingEntries;
        for (LexiconEntry lexiconEntry : iterable2) {
            Iterable keys = lexiconEntry.getKeys();
            if ((keys instanceof Collection) && ((Collection) keys).isEmpty()) {
                input = input2;
                str = str2;
                matchedEntriesByDimension = matchedEntriesByDimension2;
                iterable = iterable2;
                i2 = 0;
                i = 0;
            } else {
                i = 0;
                Iterator it = keys.iterator();
                while (it.hasNext()) {
                    input2 = input2;
                    matchedEntriesByDimension2 = matchedEntriesByDimension2;
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, str2);
                    str2 = str2;
                    iterable2 = iterable2;
                    if (StringsKt.contains$default((CharSequence) input2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                        i++;
                        if (i < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                input = input2;
                str = str2;
                matchedEntriesByDimension = matchedEntriesByDimension2;
                iterable = iterable2;
                i2 = 0;
            }
            if (i > 0) {
                String category = lexiconEntry.getCategory();
                LinkedHashMap linkedHashMap = bestByDimension;
                Integer num = (Integer) bestByDimension.get(category);
                linkedHashMap.put(category, Integer.valueOf(Math.max(num != null ? num.intValue() : i2, i)));
                LinkedHashMap linkedHashMap2 = sumByDimension;
                Integer num2 = (Integer) sumByDimension.get(category);
                linkedHashMap2.put(category, Integer.valueOf((num2 != null ? num2.intValue() : i2) + i));
                LinkedHashMap linkedHashMap3 = matchedEntriesByDimension;
                Object obj = linkedHashMap3.get(category);
                if (obj == null) {
                    arrayList = new ArrayList();
                    linkedHashMap3.put(category, arrayList);
                } else {
                    arrayList = obj;
                }
                ((List) arrayList).add(lexiconEntry);
            }
            iterable2 = iterable;
            input2 = input;
            matchedEntriesByDimension2 = matchedEntriesByDimension;
            str2 = str;
        }
        LinkedHashMap matchedEntriesByDimension3 = matchedEntriesByDimension2;
        if (bestByDimension.isEmpty()) {
            return null;
        }
        Set setKeySet = bestByDimension.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        final Comparator comparator = new Comparator() { // from class: com.luchime.huiyuan.HuiyuanEngine$matchEntry$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer num3 = (Integer) bestByDimension.get((String) t2);
                Integer num4 = num3 != null ? num3 : (Comparable) 0;
                Integer num5 = (Integer) bestByDimension.get((String) t);
                return ComparisonsKt.compareValues(num4, num5 != null ? num5 : (Comparable) 0);
            }
        };
        String topDimension = (String) CollectionsKt.first(CollectionsKt.sortedWith(setKeySet, new Comparator() { // from class: com.luchime.huiyuan.HuiyuanEngine$matchEntry$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int previousCompare = comparator.compare(t, t2);
                if (previousCompare != 0) {
                    return previousCompare;
                }
                int i3 = (Integer) sumByDimension.get((String) t2);
                if (i3 == null) {
                    i3 = 0;
                }
                Integer num3 = i3;
                Integer num4 = (Integer) sumByDimension.get((String) t);
                return ComparisonsKt.compareValues(num3, num4 != null ? num4 : (Comparable) 0);
            }
        }));
        List<LexiconEntry> list = this.entriesByDimension.get(topDimension);
        if (list == null) {
            list = (List) MapsKt.getValue(matchedEntriesByDimension3, topDimension);
        }
        return (LexiconEntry) pick(list);
    }

    public final String wrap(LexiconEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder sb = new StringBuilder();
        sb.append((String) pick(this.characterPrefixes));
        sb.append(' ');
        if (nextDouble() < 0.5d) {
            sb.append((String) pick(this.prefixes));
            sb.append(' ');
        }
        sb.append(entry.getText());
        if (nextDouble() < 0.4d) {
            sb.append(' ');
            sb.append((String) pick(this.suffixes));
        }
        if (nextDouble() < 0.5d) {
            sb.append(' ');
            sb.append((String) pick(this.characterSuffixes));
        }
        return sb.toString();
    }

    private final <T> T pick(List<? extends T> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("网页引擎数据池不能为空".toString());
        }
        return values.get(nextInt(values.size()));
    }

    /* JADX INFO: compiled from: HuiyuanEngine.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J<\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010+\u001a\u00020,H\u0002JU\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u000e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u00100\u001a\u0002012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b2J\f\u00103\u001a\u000204*\u000205H\u0002J\f\u00106\u001a\u000207*\u000205H\u0002J\u0012\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u000209H\u0002J*\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/luchime/huiyuan/HuiyuanEngine$Companion;", "", "<init>", "()V", "STEP_INTERVAL_MS", "", "RESPONSE_PADDING_MS", "LOG_AFTER_RESPONSE_MS", "TARGET_ENTRIES_PER_DIMENSION", "", "GREETING_REGEX", "Lkotlin/text/Regex;", "GREETINGS", "", "", "KUN_KUN_PREFIX", "", "KUN_KUN_SUFFIX", "SEARCH_STEPS", "TOOL_STEPS", "PIAO_PREFIX", "PIAO_SUFFIX", "PIAO_SEARCH_STEPS", "PIAO_TOOL_STEPS", "GUIGUI_PREFIX", "GUIGUI_SUFFIX", "GUIGUI_SEARCH_STEPS", "GUIGUI_TOOL_STEPS", "TANGO_PREFIX", "TANGO_SUFFIX", "TANGO_SEARCH_STEPS", "TANGO_TOOL_STEPS", "fromAssets", "Lcom/luchime/huiyuan/HuiyuanEngine;", "context", "Landroid/content/Context;", "piaoFromAssets", "guiguiFromAssets", "tangoFromAssets", "characterEngine", "assetName", "characterPrefixes", "characterSuffixes", "persona", "Lcom/luchime/huiyuan/EnginePersona;", "fromJson", "json", "corpusJson", "random", "Lkotlin/random/Random;", "fromJson$app", "toBlueprint", "Lcom/luchime/huiyuan/CorpusBlueprint;", "Lorg/json/JSONObject;", "toEntry", "Lcom/luchime/huiyuan/LexiconEntry;", "toStringList", "Lorg/json/JSONArray;", "cross", "first", "second", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final HuiyuanEngine fromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            InputStream inputStreamOpen = context.getAssets().open("huiyuan_engine.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String json = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                InputStream inputStreamOpen2 = context.getAssets().open("corpus_blueprints.json");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen2, "open(...)");
                Reader inputStreamReader2 = new InputStreamReader(inputStreamOpen2, Charsets.UTF_8);
                BufferedReader bufferedReader2 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                try {
                    String corpusJson = TextStreamsKt.readText(bufferedReader2);
                    CloseableKt.closeFinally(bufferedReader2, null);
                    return fromJson$app$default(this, json, corpusJson, null, null, null, null, 60, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(bufferedReader, th3);
                    throw th4;
                }
            }
        }

        public final HuiyuanEngine piaoFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            InputStream inputStreamOpen = context.getAssets().open("piaoai_engine.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String json = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return fromJson$app$default(this, json, null, null, HuiyuanEngine.PIAO_PREFIX, HuiyuanEngine.PIAO_SUFFIX, EnginePersona.PIAO, 6, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        }

        public final HuiyuanEngine guiguiFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return characterEngine(context, "guigui_engine.json", HuiyuanEngine.GUIGUI_PREFIX, HuiyuanEngine.GUIGUI_SUFFIX, EnginePersona.GUIGUI);
        }

        public final HuiyuanEngine tangoFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return characterEngine(context, "tango_engine.json", HuiyuanEngine.TANGO_PREFIX, HuiyuanEngine.TANGO_SUFFIX, EnginePersona.TANGO);
        }

        private final HuiyuanEngine characterEngine(Context context, String assetName, List<String> characterPrefixes, List<String> characterSuffixes, EnginePersona persona) throws IOException {
            InputStream inputStreamOpen = context.getAssets().open(assetName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String json = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                return fromJson$app$default(this, json, null, null, characterPrefixes, characterSuffixes, persona, 6, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HuiyuanEngine fromJson$app$default(Companion companion, String str, String str2, Random random, List list, List list2, EnginePersona enginePersona, int i, Object obj) {
            return companion.fromJson$app(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Random.INSTANCE : random, (i & 8) != 0 ? HuiyuanEngine.KUN_KUN_PREFIX : list, (i & 16) != 0 ? HuiyuanEngine.KUN_KUN_SUFFIX : list2, (i & 32) != 0 ? EnginePersona.HUIYUAN : enginePersona);
        }

        public final HuiyuanEngine fromJson$app(String json, String corpusJson, Random random, List<String> characterPrefixes, List<String> characterSuffixes, EnginePersona persona) throws JSONException {
            List<LexiconEntry> listExpand;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(random, "random");
            Intrinsics.checkNotNullParameter(characterPrefixes, "characterPrefixes");
            Intrinsics.checkNotNullParameter(characterSuffixes, "characterSuffixes");
            Intrinsics.checkNotNullParameter(persona, "persona");
            JSONObject root = new JSONObject(json);
            List entries = new ArrayList();
            JSONArray baseEntries = root.getJSONArray("lexicon");
            int length = baseEntries.length();
            for (int i = 0; i < length; i++) {
                Companion companion = HuiyuanEngine.INSTANCE;
                JSONObject jSONObject = baseEntries.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                LexiconEntry entry = companion.toEntry(jSONObject);
                if (PersonaCorpusExpander.INSTANCE.isUsableCategory(entry.getCategory())) {
                    entries.add(entry);
                }
            }
            JSONArray dimensions = root.getJSONArray("anxietyDims");
            int length2 = dimensions.length();
            int i2 = 0;
            while (i2 < length2) {
                JSONArray baseEntries2 = baseEntries;
                JSONObject jSONObject2 = dimensions.getJSONObject(i2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                JSONArray dimensions2 = dimensions;
                Companion companion2 = HuiyuanEngine.INSTANCE;
                int i3 = length2;
                JSONArray jSONArray = jSONObject2.getJSONArray("seeds");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
                List<String> stringList = companion2.toStringList(jSONArray);
                Companion companion3 = HuiyuanEngine.INSTANCE;
                JSONArray jSONArray2 = jSONObject2.getJSONArray("subject");
                Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
                List<String> stringList2 = companion3.toStringList(jSONArray2);
                Companion companion4 = HuiyuanEngine.INSTANCE;
                int i4 = i2;
                JSONArray jSONArray3 = jSONObject2.getJSONArray(NotificationCompat.CATEGORY_EVENT);
                Intrinsics.checkNotNullExpressionValue(jSONArray3, "getJSONArray(...)");
                List<String> stringList3 = companion4.toStringList(jSONArray3);
                Companion companion5 = HuiyuanEngine.INSTANCE;
                JSONArray jSONArray4 = jSONObject2.getJSONArray("feeling");
                Intrinsics.checkNotNullExpressionValue(jSONArray4, "getJSONArray(...)");
                List<String> stringList4 = companion5.toStringList(jSONArray4);
                Companion companion6 = HuiyuanEngine.INSTANCE;
                JSONArray jSONArray5 = jSONObject2.getJSONArray("topic");
                Intrinsics.checkNotNullExpressionValue(jSONArray5, "getJSONArray(...)");
                List<String> stringList5 = companion6.toStringList(jSONArray5);
                CollectionsKt.addAll(linkedHashSet, stringList);
                CollectionsKt.addAll(linkedHashSet, HuiyuanEngine.INSTANCE.cross(stringList2, stringList3));
                CollectionsKt.addAll(linkedHashSet, HuiyuanEngine.INSTANCE.cross(stringList3, stringList4));
                CollectionsKt.addAll(linkedHashSet, HuiyuanEngine.INSTANCE.cross(stringList2, stringList4));
                CollectionsKt.addAll(linkedHashSet, stringList5);
                Companion companion7 = HuiyuanEngine.INSTANCE;
                JSONArray jSONArray6 = jSONObject2.getJSONArray("replies");
                Intrinsics.checkNotNullExpressionValue(jSONArray6, "getJSONArray(...)");
                Iterable<String> stringList6 = companion7.toStringList(jSONArray6);
                for (String str : stringList6) {
                    List<String> list = stringList2;
                    Iterable iterable = stringList6;
                    String string = jSONObject2.getString("cat");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    entries.add(new LexiconEntry(string, CollectionsKt.toList(linkedHashSet), str));
                    stringList2 = list;
                    stringList3 = stringList3;
                    stringList4 = stringList4;
                    stringList6 = iterable;
                    jSONObject2 = jSONObject2;
                }
                i2 = i4 + 1;
                baseEntries = baseEntries2;
                dimensions = dimensions2;
                length2 = i3;
            }
            List<LexiconEntry> list2 = CollectionsKt.toList(entries);
            if (persona != EnginePersona.HUIYUAN) {
                listExpand = PersonaCorpusExpander.INSTANCE.expand(list2, persona, 1000);
            } else if (corpusJson != null) {
                JSONObject corpusRoot = new JSONObject(corpusJson);
                JSONArray blueprintArray = corpusRoot.getJSONArray("blueprints");
                int length3 = blueprintArray.length();
                ArrayList arrayList = new ArrayList(length3);
                int i5 = 0;
                while (i5 < length3) {
                    int i6 = i5;
                    JSONObject corpusRoot2 = corpusRoot;
                    Companion companion8 = HuiyuanEngine.INSTANCE;
                    JSONObject jSONObject3 = blueprintArray.getJSONObject(i6);
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
                    arrayList.add(companion8.toBlueprint(jSONObject3));
                    i5 = i6 + 1;
                    corpusRoot = corpusRoot2;
                }
                ArrayList blueprints = arrayList;
                listExpand = CorpusExpander.INSTANCE.expand(list2, blueprints, 1000);
            } else {
                listExpand = list2;
            }
            JSONArray jSONArray7 = root.getJSONArray("generic");
            Intrinsics.checkNotNullExpressionValue(jSONArray7, "getJSONArray(...)");
            List<String> stringList7 = toStringList(jSONArray7);
            String string2 = root.getString("greet");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            JSONArray jSONArray8 = root.getJSONArray("prefix");
            Intrinsics.checkNotNullExpressionValue(jSONArray8, "getJSONArray(...)");
            List<String> stringList8 = toStringList(jSONArray8);
            JSONArray jSONArray9 = root.getJSONArray("suffix");
            Intrinsics.checkNotNullExpressionValue(jSONArray9, "getJSONArray(...)");
            return new HuiyuanEngine(listExpand, stringList7, string2, stringList8, toStringList(jSONArray9), random, list2, characterPrefixes, characterSuffixes, persona);
        }

        private final CorpusBlueprint toBlueprint(JSONObject $this$toBlueprint) throws JSONException {
            String string = $this$toBlueprint.getString("cat");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONArray jSONArray = $this$toBlueprint.getJSONArray("keys");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            List<String> stringList = toStringList(jSONArray);
            JSONArray jSONArray2 = $this$toBlueprint.getJSONArray("perspectives");
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
            List<String> stringList2 = toStringList(jSONArray2);
            JSONArray jSONArray3 = $this$toBlueprint.getJSONArray("actions");
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "getJSONArray(...)");
            List<String> stringList3 = toStringList(jSONArray3);
            JSONArray jSONArray4 = $this$toBlueprint.getJSONArray("checks");
            Intrinsics.checkNotNullExpressionValue(jSONArray4, "getJSONArray(...)");
            return new CorpusBlueprint(string, stringList, stringList2, stringList3, toStringList(jSONArray4));
        }

        private final LexiconEntry toEntry(JSONObject $this$toEntry) throws JSONException {
            String string = $this$toEntry.getString("cat");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONArray jSONArray = $this$toEntry.getJSONArray("keys");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            List<String> stringList = toStringList(jSONArray);
            String string2 = $this$toEntry.getString("text");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new LexiconEntry(string, stringList, string2);
        }

        private final List<String> toStringList(JSONArray $this$toStringList) {
            int length = $this$toStringList.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add($this$toStringList.getString(i));
            }
            return arrayList;
        }

        private final List<String> cross(List<String> first, List<String> second) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            for (String str : first) {
                Iterator it = second.iterator();
                while (it.hasNext()) {
                    listCreateListBuilder.add(str + ((String) it.next()));
                }
            }
            return CollectionsKt.build(listCreateListBuilder);
        }
    }
}
