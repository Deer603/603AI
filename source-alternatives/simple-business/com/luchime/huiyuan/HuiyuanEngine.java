package com.luchime.huiyuan;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.io.BufferedReader;
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
import kotlin.collections.GroupingKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u008d\u0001\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010$\u001a\u00020!J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003J\b\u0010&\u001a\u00020\u0006H\u0002J\b\u0010'\u001a\u00020\u0006H\u0002J\b\u0010(\u001a\u00020\u0006H\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002J\b\u0010+\u001a\u00020\u0006H\u0002J\b\u0010,\u001a\u00020\u0006H\u0002J\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u0006J\u0010\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0004J!\u00103\u001a\u0002H4\"\u0004\b\u0000\u001042\f\u00105\u001a\b\u0012\u0004\u0012\u0002H40\u0003H\u0002¢\u0006\u0002\u00106R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/luchime/huiyuan/HuiyuanEngine;", "", "lexicon", "", "Lcom/luchime/huiyuan/LexiconEntry;", "generic", "", "greeting", "prefixes", "suffixes", "random", "Lkotlin/random/Random;", "matchingEntries", "characterPrefixes", "characterSuffixes", "persona", "Lcom/luchime/huiyuan/EnginePersona;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/random/Random;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/luchime/huiyuan/EnginePersona;)V", "getLexicon", "()Ljava/util/List;", "getGreeting", "()Ljava/lang/String;", "dimensionCount", "", "getDimensionCount", "()I", "categoryCounts", "", "getCategoryCounts", "()Ljava/util/Map;", "entriesByDimension", "analyze", "Lcom/luchime/huiyuan/ReplyResult;", "text", "buildThinkSteps", "result", "randomThinkSteps", "personaName", "libraryName", "dimensionLabel", "searchSteps", "toolSteps", "wrapperName", "extractorName", "randomOne", "isGreeting", "", "matchEntry", "wrap", "entry", "pick", "T", "values", "(Ljava/util/List;)Ljava/lang/Object;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HuiyuanEngine {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Set<String> GREETINGS = null;
    private static final Regex GREETING_REGEX = null;
    private static final List<String> GUIGUI_PREFIX = null;
    private static final List<String> GUIGUI_SEARCH_STEPS = null;
    private static final List<String> GUIGUI_SUFFIX = null;
    private static final List<String> GUIGUI_TOOL_STEPS = null;
    private static final List<String> KUN_KUN_PREFIX = null;
    private static final List<String> KUN_KUN_SUFFIX = null;
    public static final long LOG_AFTER_RESPONSE_MS = 400;
    private static final List<String> PIAO_PREFIX = null;
    private static final List<String> PIAO_SEARCH_STEPS = null;
    private static final List<String> PIAO_SUFFIX = null;
    private static final List<String> PIAO_TOOL_STEPS = null;
    public static final long RESPONSE_PADDING_MS = 480;
    private static final List<String> SEARCH_STEPS = null;
    public static final long STEP_INTERVAL_MS = 430;
    private static final List<String> TANGO_PREFIX = null;
    private static final List<String> TANGO_SEARCH_STEPS = null;
    private static final List<String> TANGO_SUFFIX = null;
    private static final List<String> TANGO_TOOL_STEPS = null;
    public static final int TARGET_ENTRIES_PER_DIMENSION = 1000;
    private static final List<String> TOOL_STEPS = null;
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

    /* JADX INFO: compiled from: HuiyuanEngine.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J<\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\u000e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010+\u001a\u00020,H\u0002JU\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u000e2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u00100\u001a\u0002012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b2J\f\u00103\u001a\u000204*\u000205H\u0002J\f\u00106\u001a\u000207*\u000205H\u0002J\u0012\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u000209H\u0002J*\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/luchime/huiyuan/HuiyuanEngine$Companion;", "", "<init>", "()V", "STEP_INTERVAL_MS", "", "RESPONSE_PADDING_MS", "LOG_AFTER_RESPONSE_MS", "TARGET_ENTRIES_PER_DIMENSION", "", "GREETING_REGEX", "Lkotlin/text/Regex;", "GREETINGS", "", "", "KUN_KUN_PREFIX", "", "KUN_KUN_SUFFIX", "SEARCH_STEPS", "TOOL_STEPS", "PIAO_PREFIX", "PIAO_SUFFIX", "PIAO_SEARCH_STEPS", "PIAO_TOOL_STEPS", "GUIGUI_PREFIX", "GUIGUI_SUFFIX", "GUIGUI_SEARCH_STEPS", "GUIGUI_TOOL_STEPS", "TANGO_PREFIX", "TANGO_SUFFIX", "TANGO_SEARCH_STEPS", "TANGO_TOOL_STEPS", "fromAssets", "Lcom/luchime/huiyuan/HuiyuanEngine;", "context", "Landroid/content/Context;", "piaoFromAssets", "guiguiFromAssets", "tangoFromAssets", "characterEngine", "assetName", "characterPrefixes", "characterSuffixes", "persona", "Lcom/luchime/huiyuan/EnginePersona;", "fromJson", "json", "corpusJson", "random", "Lkotlin/random/Random;", "fromJson$app", "toBlueprint", "Lcom/luchime/huiyuan/CorpusBlueprint;", "Lorg/json/JSONObject;", "toEntry", "Lcom/luchime/huiyuan/LexiconEntry;", "toStringList", "Lorg/json/JSONArray;", "cross", "first", "second", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final HuiyuanEngine fromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            InputStream r0 = context.getAssets().open("huiyuan_engine.json");
            Intrinsics.checkNotNullExpressionValue(r0, "open(...)");
            Reader r4 = new InputStreamReader(r0, Charsets.UTF_8);
            if ((r4 instanceof BufferedReader) == false) goto L5;
            BufferedReader r5 = (BufferedReader) r4;
        L6:
            BufferedReader r6 = r5;
            String json = TextStreamsKt.readText(r6);     // Catch: Throwable -> L22
            CloseableKt.closeFinally(r6, null);
            InputStream r7 = context.getAssets().open("corpus_blueprints.json");
            Intrinsics.checkNotNullExpressionValue(r7, "open(...)");
            Reader r8 = new InputStreamReader(r7, Charsets.UTF_8);
            if ((r8 instanceof BufferedReader) == false) goto L11;
            BufferedReader r9 = (BufferedReader) r8;
        L12:
            BufferedReader r10 = r9;
            String corpusJson = TextStreamsKt.readText(r10);     // Catch: Throwable -> L16
            CloseableKt.closeFinally(r10, null);
            return fromJson$app$default(this, json, corpusJson, null, null, null, null, 60, null);
        L16:
            th = move-exception;
            throw th;     // Catch: Throwable -> L19
        L19:
            th = move-exception;
            CloseableKt.closeFinally(r10, th);
            throw th;
        L11:
            r9 = new BufferedReader(r8, 8192);
        L22:
            th = move-exception;
            throw th;     // Catch: Throwable -> L25
        L25:
            th = move-exception;
            CloseableKt.closeFinally(r6, th);
            throw th;
        L5:
            r5 = new BufferedReader(r4, 8192);
            goto L6
        }

        public final HuiyuanEngine piaoFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            InputStream r0 = context.getAssets().open("piaoai_engine.json");
            Intrinsics.checkNotNullExpressionValue(r0, "open(...)");
            Reader r2 = new InputStreamReader(r0, Charsets.UTF_8);
            if ((r2 instanceof BufferedReader) == false) goto L5;
            BufferedReader r3 = (BufferedReader) r2;
        L6:
            BufferedReader r4 = r3;
            String json = TextStreamsKt.readText(r4);     // Catch: Throwable -> L10
            CloseableKt.closeFinally(r4, null);
            return fromJson$app$default(this, json, null, null, HuiyuanEngine.access$getPIAO_PREFIX$cp(), HuiyuanEngine.access$getPIAO_SUFFIX$cp(), EnginePersona.PIAO, 6, null);
        L10:
            th = move-exception;
            throw th;     // Catch: Throwable -> L13
        L13:
            th = move-exception;
            CloseableKt.closeFinally(r4, th);
            throw th;
        L5:
            r3 = new BufferedReader(r2, 8192);
            goto L6
        }

        public final HuiyuanEngine guiguiFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return characterEngine(context, "guigui_engine.json", HuiyuanEngine.access$getGUIGUI_PREFIX$cp(), HuiyuanEngine.access$getGUIGUI_SUFFIX$cp(), EnginePersona.GUIGUI);
        }

        public final HuiyuanEngine tangoFromAssets(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return characterEngine(context, "tango_engine.json", HuiyuanEngine.access$getTANGO_PREFIX$cp(), HuiyuanEngine.access$getTANGO_SUFFIX$cp(), EnginePersona.TANGO);
        }

        private final HuiyuanEngine characterEngine(Context context, String assetName, List<String> r17, List<String> r18, EnginePersona persona) {
            InputStream r0 = context.getAssets().open(assetName);
            Intrinsics.checkNotNullExpressionValue(r0, "open(...)");
            Reader r3 = new InputStreamReader(r0, Charsets.UTF_8);
            if ((r3 instanceof BufferedReader) == false) goto L5;
            BufferedReader r4 = (BufferedReader) r3;
        L6:
            BufferedReader r5 = r4;
            String json = TextStreamsKt.readText(r5);     // Catch: Throwable -> L10
            CloseableKt.closeFinally(r5, null);
            return fromJson$app$default(this, json, null, null, r17, r18, persona, 6, null);
        L10:
            th = move-exception;
            throw th;     // Catch: Throwable -> L13
        L13:
            th = move-exception;
            CloseableKt.closeFinally(r5, th);
            throw th;
        L5:
            r4 = new BufferedReader(r3, 8192);
            goto L6
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HuiyuanEngine fromJson$app$default(Companion r7, String r8, String r9, Random r10, List r11, List r12, EnginePersona r13, int r14, Object r15) {
            if ((r14 & 2) == 0) goto L5;
            String r2 = null;
        L7:
            if ((r14 & 4) == 0) goto L9;
            Random r3 = Random.Default;
        L11:
            if ((r14 & 8) == 0) goto L13;
            List r4 = HuiyuanEngine.access$getKUN_KUN_PREFIX$cp();
        L15:
            if ((r14 & 16) == 0) goto L17;
            List r5 = HuiyuanEngine.access$getKUN_KUN_SUFFIX$cp();
        L19:
            if ((r14 & 32) == 0) goto L21;
            EnginePersona r6 = EnginePersona.HUIYUAN;
        L23:
            return r7.fromJson$app(r8, r2, r3, r4, r5, r6);
        L21:
            r6 = r13;
            goto L23
        L17:
            r5 = r12;
            goto L19
        L13:
            r4 = r11;
            goto L15
        L9:
            r3 = r10;
            goto L11
        L5:
            r2 = r9;
            goto L7
        }

        public final HuiyuanEngine fromJson$app(String json, String corpusJson, Random random, List<String> r38, List<String> r39, EnginePersona persona) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(random, "random");
            Intrinsics.checkNotNullParameter(r38, "characterPrefixes");
            Intrinsics.checkNotNullParameter(r39, "characterSuffixes");
            Intrinsics.checkNotNullParameter(persona, "persona");
            JSONObject root = new JSONObject(json);
            List entries = new ArrayList();
            JSONArray baseEntries = root.getJSONArray("lexicon");
            int r4 = baseEntries.length();
            int r6 = 0;
        L4:
            if (r6 >= r4) goto L9;
            Companion r5 = HuiyuanEngine.Companion;
            JSONObject r1 = baseEntries.getJSONObject(r6);
            Intrinsics.checkNotNullExpressionValue(r1, "getJSONObject(...)");
            LexiconEntry r2 = r5.toEntry(r1);
            if (PersonaCorpusExpander.INSTANCE.isUsableCategory(r2.getCategory()) == false) goto L8;
            entries.add(r2);
        L8:
            r6 = r6 + 1;
            goto L4
        L9:
            JSONArray dimensions = root.getJSONArray("anxietyDims");
            int r7 = dimensions.length();
            int r8 = 0;
        L11:
            if (r8 >= r7) goto L17;
            JSONArray baseEntries2 = baseEntries;
            JSONObject r3 = dimensions.getJSONObject(r8);
            LinkedHashSet r19 = new LinkedHashSet();
            JSONArray dimensions2 = dimensions;
            Companion r9 = HuiyuanEngine.Companion;
            int r21 = r7;
            JSONArray r10 = r3.getJSONArray("seeds");
            Intrinsics.checkNotNullExpressionValue(r10, "getJSONArray(...)");
            List<String> r11 = r9.toStringList(r10);
            Companion r12 = HuiyuanEngine.Companion;
            JSONArray r13 = r3.getJSONArray("subject");
            Intrinsics.checkNotNullExpressionValue(r13, "getJSONArray(...)");
            List<String> r14 = r12.toStringList(r13);
            Companion r15 = HuiyuanEngine.Companion;
            int r23 = r8;
            JSONArray r16 = r3.getJSONArray(NotificationCompat.CATEGORY_EVENT);
            Intrinsics.checkNotNullExpressionValue(r16, "getJSONArray(...)");
            List<String> r17 = r15.toStringList(r16);
            Companion r18 = HuiyuanEngine.Companion;
            JSONArray r20 = r3.getJSONArray("feeling");
            Intrinsics.checkNotNullExpressionValue(r20, "getJSONArray(...)");
            List<String> r22 = r18.toStringList(r20);
            Companion r24 = HuiyuanEngine.Companion;
            JSONArray r110 = r3.getJSONArray("topic");
            Intrinsics.checkNotNullExpressionValue(r110, "getJSONArray(...)");
            List<String> r25 = r24.toStringList(r110);
            CollectionsKt.addAll(r19, r11);
            CollectionsKt.addAll(r19, HuiyuanEngine.Companion.cross(r14, r17));
            CollectionsKt.addAll(r19, HuiyuanEngine.Companion.cross(r17, r22));
            CollectionsKt.addAll(r19, HuiyuanEngine.Companion.cross(r14, r22));
            CollectionsKt.addAll(r19, r25);
            Companion r26 = HuiyuanEngine.Companion;
            JSONArray r111 = r3.getJSONArray("replies");
            Intrinsics.checkNotNullExpressionValue(r111, "getJSONArray(...)");
            Iterable r27 = r26.toStringList(r111);
            Iterator r112 = r27.iterator();
        L14:
            if (r112.hasNext() == false) goto L16;
            List<String> r28 = r14;
            String r29 = (String) r112.next();
            List<String> r210 = r17;
            List<String> r30 = r22;
            Iterable r31 = r27;
            String r32 = r3.getString("cat");
            Intrinsics.checkNotNullExpressionValue(r32, "getString(...)");
            JSONObject r33 = r3;
            entries.add(new LexiconEntry(r32, CollectionsKt.toList(r19), r29));
            r14 = r28;
            r17 = r210;
            r22 = r30;
            r27 = r31;
            r3 = r33;
            goto L14
        L16:
            r8 = r23 + 1;
            baseEntries = baseEntries2;
            dimensions = dimensions2;
            r7 = r21;
            goto L11
        L17:
            List<LexiconEntry> r113 = CollectionsKt.toList(entries);
            if (persona == EnginePersona.HUIYUAN) goto L20;
            List<LexiconEntry> r34 = PersonaCorpusExpander.INSTANCE.expand(r113, persona, 1000);
        L26:
            JSONArray r35 = root.getJSONArray("generic");
            Intrinsics.checkNotNullExpressionValue(r35, "getJSONArray(...)");
            List<String> r36 = toStringList(r35);
            String r37 = root.getString("greet");
            Intrinsics.checkNotNullExpressionValue(r37, "getString(...)");
            JSONArray r40 = root.getJSONArray("prefix");
            Intrinsics.checkNotNullExpressionValue(r40, "getJSONArray(...)");
            List<String> r41 = toStringList(r40);
            JSONArray r42 = root.getJSONArray("suffix");
            Intrinsics.checkNotNullExpressionValue(r42, "getJSONArray(...)");
            return new HuiyuanEngine(r34, r36, r37, r41, toStringList(r42), random, r113, r38, r39, persona);
        L20:
            if (corpusJson == null) goto L25;
            JSONObject corpusRoot = new JSONObject(corpusJson);
            JSONArray blueprintArray = corpusRoot.getJSONArray("blueprints");
            int r43 = blueprintArray.length();
            ArrayList r44 = new ArrayList(r43);
            int r45 = 0;
        L22:
            if (r45 >= r43) goto L24;
            int r114 = r45;
            JSONObject corpusRoot2 = corpusRoot;
            Companion r46 = HuiyuanEngine.Companion;
            JSONObject r47 = blueprintArray.getJSONObject(r114);
            Intrinsics.checkNotNullExpressionValue(r47, "getJSONObject(...)");
            r44.add(r46.toBlueprint(r47));
            r45 = r114 + 1;
            corpusRoot = corpusRoot2;
            goto L22
        L24:
            ArrayList blueprints = r44;
            r34 = CorpusExpander.INSTANCE.expand(r113, blueprints, 1000);
            goto L26
        L25:
            r34 = r113;
            goto L26
        }

        private final CorpusBlueprint toBlueprint(JSONObject $this$toBlueprint) {
            String r1 = $this$toBlueprint.getString("cat");
            Intrinsics.checkNotNullExpressionValue(r1, "getString(...)");
            JSONArray r2 = $this$toBlueprint.getJSONArray("keys");
            Intrinsics.checkNotNullExpressionValue(r2, "getJSONArray(...)");
            List<String> r3 = toStringList(r2);
            JSONArray r4 = $this$toBlueprint.getJSONArray("perspectives");
            Intrinsics.checkNotNullExpressionValue(r4, "getJSONArray(...)");
            List<String> r5 = toStringList(r4);
            JSONArray r6 = $this$toBlueprint.getJSONArray("actions");
            Intrinsics.checkNotNullExpressionValue(r6, "getJSONArray(...)");
            List<String> r7 = toStringList(r6);
            JSONArray r8 = $this$toBlueprint.getJSONArray("checks");
            Intrinsics.checkNotNullExpressionValue(r8, "getJSONArray(...)");
            return new CorpusBlueprint(r1, r3, r5, r7, toStringList(r8));
        }

        private final LexiconEntry toEntry(JSONObject $this$toEntry) {
            String r1 = $this$toEntry.getString("cat");
            Intrinsics.checkNotNullExpressionValue(r1, "getString(...)");
            JSONArray r3 = $this$toEntry.getJSONArray("keys");
            Intrinsics.checkNotNullExpressionValue(r3, "getJSONArray(...)");
            List<String> r4 = toStringList(r3);
            String r5 = $this$toEntry.getString("text");
            Intrinsics.checkNotNullExpressionValue(r5, "getString(...)");
            return new LexiconEntry(r1, r4, r5);
        }

        private final List<String> toStringList(JSONArray $this$toStringList) {
            int r0 = $this$toStringList.length();
            ArrayList r1 = new ArrayList(r0);
            int r2 = 0;
        L3:
            if (r2 >= r0) goto L6;
            r1.add($this$toStringList.getString(r2));
            r2 = r2 + 1;
            goto L3
        L6:
            return r1;
        }

        private final List<String> cross(List<String> r17, List<String> r18) {
            List r0 = CollectionsKt.createListBuilder();
            Iterator r5 = r17.iterator();
        L4:
            if (r5.hasNext() == false) goto L11;
            String r7 = (String) r5.next();
            Iterator r11 = r18.iterator();
        L7:
            if (r11.hasNext() == false) goto L4;
            r0.add(r7 + ((String) r11.next()));
            goto L7
        L11:
            return CollectionsKt.build(r0);
        }
    }

    /* JADX INFO: compiled from: HuiyuanEngine.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[EnginePersona.values().length];
            r0[EnginePersona.HUIYUAN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[EnginePersona.PIAO.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[EnginePersona.GUIGUI.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[EnginePersona.TANGO.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public HuiyuanEngine(List<LexiconEntry> r22, List<String> r23, String greeting, List<String> r25, List<String> r26, Random random, List<LexiconEntry> r28, List<String> r29, List<String> r30, EnginePersona persona) {
        Intrinsics.checkNotNullParameter(r22, "lexicon");
        Intrinsics.checkNotNullParameter(r23, "generic");
        Intrinsics.checkNotNullParameter(greeting, "greeting");
        Intrinsics.checkNotNullParameter(r25, "prefixes");
        Intrinsics.checkNotNullParameter(r26, "suffixes");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(r28, "matchingEntries");
        Intrinsics.checkNotNullParameter(r29, "characterPrefixes");
        Intrinsics.checkNotNullParameter(r30, "characterSuffixes");
        Intrinsics.checkNotNullParameter(persona, "persona");
        this.lexicon = r22;
        this.generic = r23;
        this.greeting = greeting;
        this.prefixes = r25;
        this.suffixes = r26;
        this.random = random;
        this.matchingEntries = r28;
        this.characterPrefixes = r29;
        this.characterSuffixes = r30;
        this.persona = persona;
        Iterable r11 = this.lexicon;
        Collection r13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r11, 10));
        Iterator r16 = r11.iterator();
    L4:
        if (r16.hasNext() == false) goto L6;
        r13.add(((LexiconEntry) r16.next()).getCategory());
        goto L4
    L6:
        this.dimensionCount = CollectionsKt.toSet((List) r13).size();
        final Iterable r1 = this.lexicon;
        this.categoryCounts = GroupingKt.eachCount(new HuiyuanEngine$special$$inlined$groupingBy$1(r1));
        Iterable r2 = this.lexicon;
        Map r12 = new LinkedHashMap();
        Iterator r15 = r2.iterator();
    L8:
        if (r15.hasNext() == false) goto L14;
        Iterable r17 = r2;
        Object r3 = r15.next();
        String r18 = ((LexiconEntry) r3).getCategory();
        Object r19 = r12.get(r18);
        if (r19 != null) goto L12;
        Object r110 = new ArrayList();
        r12.put(r18, r110);
    L13:
        ((List) r110).add(r3);
        r2 = r17;
        goto L8
    L12:
        r110 = r19;
        goto L13
    L14:
        this.entriesByDimension = r12;
    }

    public /* synthetic */ HuiyuanEngine(List r14, List r15, String r16, List r17, List r18, Random r19, List r20, List r21, List r22, EnginePersona r23, int r24, DefaultConstructorMarker r25) {
        if ((r24 & 32) == 0) goto L5;
        Random r8 = Random.Default;
    L7:
        if ((r24 & 64) == 0) goto L9;
        List r9 = r14;
    L11:
        if ((r24 & 128) == 0) goto L13;
        List r10 = KUN_KUN_PREFIX;
    L15:
        if ((r24 & 256) == 0) goto L17;
        List r11 = KUN_KUN_SUFFIX;
    L19:
        if ((r24 & 512) == 0) goto L21;
        EnginePersona r12 = EnginePersona.HUIYUAN;
    L22:
        this(r14, r15, r16, r17, r18, r8, r9, r10, r11, r12);
        return;
    L21:
        r12 = r23;
        goto L22
    L17:
        r11 = r22;
        goto L19
    L13:
        r10 = r21;
        goto L15
    L9:
        r9 = r20;
        goto L11
    L5:
        r8 = r19;
        goto L7
    }

    public static final /* synthetic */ List access$getGUIGUI_PREFIX$cp() {
        return GUIGUI_PREFIX;
    }

    public static final /* synthetic */ List access$getGUIGUI_SUFFIX$cp() {
        return GUIGUI_SUFFIX;
    }

    public static final /* synthetic */ List access$getKUN_KUN_PREFIX$cp() {
        return KUN_KUN_PREFIX;
    }

    public static final /* synthetic */ List access$getKUN_KUN_SUFFIX$cp() {
        return KUN_KUN_SUFFIX;
    }

    public static final /* synthetic */ List access$getPIAO_PREFIX$cp() {
        return PIAO_PREFIX;
    }

    public static final /* synthetic */ List access$getPIAO_SUFFIX$cp() {
        return PIAO_SUFFIX;
    }

    public static final /* synthetic */ List access$getTANGO_PREFIX$cp() {
        return TANGO_PREFIX;
    }

    public static final /* synthetic */ List access$getTANGO_SUFFIX$cp() {
        return TANGO_SUFFIX;
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
        String clean = StringsKt.trim(text).toString();
        if (isGreeting(clean) == true) goto L5;
        LexiconEntry entry = matchEntry(clean);
        if (entry != null) goto L11;
        return new ReplyResult("generic", wrap(new LexiconEntry("通用", CollectionsKt.emptyList(), (String) pick(this.generic))), "通用", null, "通用兜底");
    L11:
        return new ReplyResult("entry", wrap(entry), entry.getCategory(), entry, entry.getCategory());
    L5:
        return new ReplyResult("greet", this.greeting, "问候", null, "问候");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<String> buildThinkSteps(ReplyResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String[] r0 = new String[6];
        r0[0] = pick(searchSteps());
        r0[1] = "📚 已载入 " + this.lexicon.size() + " 条" + libraryName() + " / " + this.dimensionCount + " 个" + dimensionLabel();
        r0[2] = pick(toolSteps());
        if (result.getEntry() == null) goto L5;
        String r1 = "✅ 命中维度：「" + result.getDimension() + "」";
    L6:
        r0[3] = r1;
        r0[4] = "🛠 调用工具「" + wrapperName() + "」组织回复…";
        r0[5] = "✨ 输出准备完成";
        return CollectionsKt.listOf(r0);
    L5:
        r1 = "⚠️ 没命中关键词，" + personaName() + "切到通用兜底池";
        goto L6
    }

    public final List<String> randomThinkSteps() {
        return CollectionsKt.listOf(new String[]{"🎲 随机模式：" + personaName() + "跳过语义解析…", "📚 已载入 " + this.lexicon.size() + " 条" + libraryName() + " / " + this.dimensionCount + " 个" + dimensionLabel(), "🛠 调用工具「" + extractorName() + "」…", "✨ 输出准备完成"});
    }

    private final String personaName() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "探戈";
    L7:
        return "龟龟";
    L8:
        return "朴AI";
    L9:
        return "困困";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private final String libraryName() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "探戈语录";
    L7:
        return "龟龟语录";
    L8:
        return "朴语录";
    L9:
        return "语录";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private final String dimensionLabel() {
        if (this.persona != EnginePersona.HUIYUAN) goto L5;
        return "认知维度";
    L5:
        return "知识维度";
    }

    private final List<String> searchSteps() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L10;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L11:
        return TANGO_SEARCH_STEPS;
    L12:
        return GUIGUI_SEARCH_STEPS;
    L13:
        return PIAO_SEARCH_STEPS;
    L10:
        return SEARCH_STEPS;
    }

    private final List<String> toolSteps() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L10;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L11:
        return TANGO_TOOL_STEPS;
    L12:
        return GUIGUI_TOOL_STEPS;
    L13:
        return PIAO_TOOL_STEPS;
    L10:
        return TOOL_STEPS;
    }

    private final String wrapperName() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "探戈语气包装器";
    L7:
        return "龟龟语气包装器";
    L8:
        return "朴式语气包装器";
    L9:
        return "语录包装器";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private final String extractorName() {
        EnginePersona r0 = this.persona;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "探戈语录抽取器";
    L7:
        return "龟龟语录抽取器";
    L8:
        return "朴语录抽取器";
    L9:
        return "语录抽取器";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    public final ReplyResult randomOne() {
        if (this.random.nextDouble() >= 0.7d) goto L7;
        LexiconEntry entry = (LexiconEntry) pick(this.lexicon);
        return new ReplyResult("entry", wrap(entry), entry.getCategory(), entry, entry.getCategory());
    L7:
        return new ReplyResult("generic", wrap(new LexiconEntry("通用", CollectionsKt.emptyList(), (String) pick(this.generic))), "通用", null, "通用兜底");
    }

    public final boolean isGreeting(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String clean = StringsKt.trim(text).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(clean, "toLowerCase(...)");
        if (clean.length() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        return false;
    L9:
        if (GREETING_REGEX.containsMatchIn(clean) == false) goto L11;
        return true;
    L11:
        if (GREETINGS.contains(clean) == false) goto L14;
        return true;
    L14:
        return false;
    L5:
        r1 = false;
        goto L6
    }

    public final LexiconEntry matchEntry(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String input = text.toLowerCase(Locale.ROOT);
        String r3 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(input, "toLowerCase(...)");
        final LinkedHashMap bestByDimension = new LinkedHashMap();
        final LinkedHashMap sumByDimension = new LinkedHashMap();
        LinkedHashMap matchedEntriesByDimension = new LinkedHashMap();
        Iterable r7 = this.matchingEntries;
        Iterator r9 = r7.iterator();
    L4:
        if (r9.hasNext() == false) goto L37;
        LexiconEntry r12 = (LexiconEntry) r9.next();
        Iterable r14 = r12.getKeys();
        if ((r14 instanceof Collection) == true) goto L8;
    L10:
        int r11 = 0;
        Iterator r17 = r14.iterator();
    L12:
        if (r17.hasNext() == false) goto L20;
        input = input;
        matchedEntriesByDimension = matchedEntriesByDimension;
        String r6 = ((String) r17.next()).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r6, r3);
        r3 = r3;
        r7 = r7;
        if (StringsKt.contains$default(input, r6, false, 2, null) == false) goto L12;
        r11 = r11 + 1;
        if (r11 >= 0) goto L12;
        CollectionsKt.throwCountOverflow();
        goto L12
    L20:
        String input2 = input;
        String r24 = r3;
        LinkedHashMap matchedEntriesByDimension2 = matchedEntriesByDimension;
        Iterable r19 = r7;
        int r8 = 0;
    L22:
        if (r11 <= 0) goto L36;
        String r1 = r12.getCategory();
        LinkedHashMap r2 = bestByDimension;
        Integer r4 = (Integer) bestByDimension.get(r1);
        if (r4 == null) goto L26;
        int r5 = r4.intValue();
    L27:
        r2.put(r1, Integer.valueOf(Math.max(r5, r11)));
        LinkedHashMap r10 = sumByDimension;
        Integer r13 = (Integer) sumByDimension.get(r1);
        if (r13 == null) goto L30;
        int r15 = r13.intValue();
    L31:
        r10.put(r1, Integer.valueOf(r15 + r11));
        LinkedHashMap r16 = matchedEntriesByDimension2;
        Object r18 = r16.get(r1);
        if (r18 != null) goto L34;
        ArrayList r110 = new ArrayList();
        r16.put(r1, r110);
    L35:
        ((List) r110).add(r12);
        goto L36
    L34:
        r110 = r18;
        goto L35
    L30:
        r15 = r8;
        goto L31
    L26:
        r5 = r8;
    L36:
        r7 = r19;
        input = input2;
        matchedEntriesByDimension = matchedEntriesByDimension2;
        r3 = r24;
        goto L4
    L8:
        if (((Collection) r14).isEmpty() == false) goto L10;
        input2 = input;
        r24 = r3;
        matchedEntriesByDimension2 = matchedEntriesByDimension;
        r19 = r7;
        r8 = 0;
        r11 = 0;
        goto L22
    L37:
        LinkedHashMap matchedEntriesByDimension3 = matchedEntriesByDimension;
        if (bestByDimension.isEmpty() == false) goto L41;
        return null;
    L41:
        Set r20 = bestByDimension.keySet();
        Intrinsics.checkNotNullExpressionValue(r20, "<get-keys>(...)");
        final Comparator r21 = new HuiyuanEngine$matchEntry$$inlined$compareByDescending$1(bestByDimension);
        String topDimension = (String) CollectionsKt.first(CollectionsKt.sortedWith(r20, new HuiyuanEngine$matchEntry$$inlined$thenByDescending$1(r21, sumByDimension)));
        List<LexiconEntry> r22 = this.entriesByDimension.get(topDimension);
        if (r22 != null) goto L45;
        r22 = (List) MapsKt.getValue(matchedEntriesByDimension3, topDimension);
    L45:
        return (LexiconEntry) pick(r22);
    }

    public final String wrap(LexiconEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        StringBuilder r0 = new StringBuilder();
        r0.append((String) pick(this.characterPrefixes));
        r0.append(' ');
        if (this.random.nextDouble() >= 0.5d) goto L5;
        r0.append((String) pick(this.prefixes));
        r0.append(' ');
    L5:
        r0.append(entry.getText());
        if (this.random.nextDouble() >= 0.4d) goto L9;
        r0.append(' ');
        r0.append((String) pick(this.suffixes));
    L9:
        if (this.random.nextDouble() >= 0.5d) goto L12;
        r0.append(' ');
        r0.append((String) pick(this.characterSuffixes));
    L12:
        return r0.toString();
    }

    private final <T> T pick(List<? extends T> r3) {
        if (r3.isEmpty() == true) goto L7;
        return r3.get(this.random.nextInt(r3.size()));
    L7:
        throw new IllegalArgumentException("网页引擎数据池不能为空".toString());
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        GREETING_REGEX = new Regex("^(你好|您好|hi|hello|在吗|在不在|哈喽|嗨|喂)", RegexOption.IGNORE_CASE);
        GREETINGS = SetsKt.setOf(new String[]{"你好", "您好", "在吗", "hi", "hello", "哈喽", "嗨"});
        KUN_KUN_PREFIX = CollectionsKt.listOf(new String[]{"困困来啦～ ", "困困觉得呀，", "让困困想想哦——", "困困想和你说，", "困困歪头想想：", "呼～困困泡完水来答你啦："});
        KUN_KUN_SUFFIX = CollectionsKt.listOf(new String[]{"～困困说的哦", "（困困歪头）", "困困陪你一起想通它～", "要相信困困呀", "困困会一直陪着你哒～"});
        SEARCH_STEPS = CollectionsKt.listOf(new String[]{"🔍 正在检索高认知语录库…", "📡 正在联网比对认知资料…", "🗂 正在调取历史语录索引…"});
        TOOL_STEPS = CollectionsKt.listOf(new String[]{"🧠 调用工具「认知索引器」匹配维度…", "⚙️ 调用工具「语义映射器」解析关键词…", "🔧 调用工具「维度分类器」做聚类…"});
        PIAO_PREFIX = CollectionsKt.listOf(new String[]{"老子来了——", "本朴觉得吧，", "让老子朴一朴——", "你这个问题，", "操，老子得先说一句：", "卷毛企鹅上线："});
        PIAO_SUFFIX = CollectionsKt.listOf(new String[]{"鸡巴飞了，散会。", "——朴一朴，就这样。", "你懂个鸡巴？", "老子说完，爱听不听。", "去 deskpark 主场找老子。", "朴朴看，不行再骂。"});
        PIAO_SEARCH_STEPS = CollectionsKt.listOf(new String[]{"🐧 朴AI正在检索朴语录库…", "📡 朴AI正在调取deskpark主场索引…", "🗂 朴AI翻开自己的花衬衫口袋…"});
        PIAO_TOOL_STEPS = CollectionsKt.listOf(new String[]{"🧠 调用工具「朴式语义检索器」匹配维度…", "⚙️ 调用工具「卷毛分类器」解析关键词…", "🔧 调用工具「超声波定向过滤器」聚类…"});
        GUIGUI_PREFIX = CollectionsKt.listOf(new String[]{"龟龟来啦～ ", "龟龟觉得呀，", "让龟龟想想哦——", "龟龟想和你说，", "龟龟歪头想想：", "嘿嘿，卷毛龟上线：", "龟龟的小脑袋转起来啦："});
        GUIGUI_SUFFIX = CollectionsKt.listOf(new String[]{"～龟龟说的哦", "（龟龟缩头害羞）", "龟龟会一直陪着你哒～", "要相信龟龟呀", "贴贴～", "龟龟说完啦，你要好好的哦"});
        GUIGUI_SEARCH_STEPS = CollectionsKt.listOf(new String[]{"🐢 龟龟正在检索龟龟语录库…", "📡 龟龟正在调取知识索引…", "🗂 龟龟翻开自己的小本本…"});
        GUIGUI_TOOL_STEPS = CollectionsKt.listOf(new String[]{"🧠 调用工具「龟龟语义检索器」匹配维度…", "⚙️ 调用工具「卷毛知识分类器」解析关键词…", "🔧 调用工具「土家族文化过滤器」聚类…"});
        TANGO_PREFIX = CollectionsKt.listOf(new String[]{"探戈来啦～ ", "本熊觉得呀，", "让探戈想想哦——", "探戈歪着大脑袋想想：", "本熊擦擦口水说：", "Zzz…啊？好好好本熊说：", "探戈挠挠肚子："});
        TANGO_SUFFIX = CollectionsKt.listOf(new String[]{"～探戈说的哦", "（本熊打了个哈欠）", "Zzz…", "探戈说完要去打呼噜了", "你吃了吗？本熊饿了。", "别问本熊人生建议啊，本熊认知约等于 NULL"});
        TANGO_SEARCH_STEPS = CollectionsKt.listOf(new String[]{"🐻 探戈正在翻语录库…", "📡 探戈正在调取知识索引…", "🗂 探戈翻开自己的小本本…", "🍖 探戈先擦了擦口水再开始检索…"});
        TANGO_TOOL_STEPS = CollectionsKt.listOf(new String[]{"🧠 调用工具「探戈语义检索器」匹配维度…", "⚙️ 调用工具「胖熊知识分类器」解析关键词…", "🔧 调用工具「低认知过滤器」聚类…", "💻 调用工具「Linux命令行检索器」匹配…"});
    }
}
