package com.luchime.huiyuan;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AppRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J\u0006\u0010 \u001a\u00020\rR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/luchime/huiyuan/AppRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "loadMessages", "", "Lcom/luchime/huiyuan/ChatRecord;", "saveMessages", "", AppRepository.KEY_MESSAGES, "clearMessages", "loadSelectedModel", "", "saveSelectedModel", "model", "loadFavorites", "Lcom/luchime/huiyuan/FavoriteRecord;", "saveFavorites", AppRepository.KEY_FAVORITES, "recordInteraction", "Lcom/luchime/huiyuan/UsageStats;", "category", "randomDraw", "", "loadStats", "saveStats", "stats", "clearEverything", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppRepository {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final String KEY_CATEGORY_COUNTS = "category_counts";
    private static final String KEY_FAVORITES = "favorites";
    private static final String KEY_LAST_ACTIVE_DATE = "last_active_date";
    private static final String KEY_MESSAGES = "messages";
    private static final String KEY_RANDOM_DRAWS = "random_draws";
    private static final String KEY_SELECTED_MODEL = "selected_model";
    private static final String KEY_STREAK_DAYS = "streak_days";
    private static final String KEY_TOTAL_QUESTIONS = "total_questions";
    private static final int MAX_SAVED_MESSAGES = 300;
    private static final String PREFERENCES_NAME = "huiyuan_app_state_v2";
    private final SharedPreferences preferences;

    /* JADX INFO: compiled from: AppRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/luchime/huiyuan/AppRepository$Companion;", "", "<init>", "()V", "PREFERENCES_NAME", "", "MAX_SAVED_MESSAGES", "", "KEY_MESSAGES", "KEY_SELECTED_MODEL", "KEY_FAVORITES", "KEY_TOTAL_QUESTIONS", "KEY_RANDOM_DRAWS", "KEY_STREAK_DAYS", "KEY_LAST_ACTIVE_DATE", "KEY_CATEGORY_COUNTS", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public AppRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
    }

    public final List<ChatRecord> loadMessages() {
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L15
        AppRepository r1 = this;     // Catch: Throwable -> L15
        int r2 = 0;
        JSONArray r3 = new JSONArray(r1.preferences.getString(KEY_MESSAGES, "[]"));     // Catch: Throwable -> L15
        int r4 = r3.length();     // Catch: Throwable -> L15
        ArrayList r5 = new ArrayList(r4);     // Catch: Throwable -> L15
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L13;
        JSONObject r8 = r3.getJSONObject(r6);     // Catch: Throwable -> L15
        long r11 = r8.getLong("id");     // Catch: Throwable -> L15
        boolean r13 = r8.getBoolean("isUser");     // Catch: Throwable -> L15
        String r14 = r8.getString("text");     // Catch: Throwable -> L15
        Intrinsics.checkNotNullExpressionValue(r14, "getString(...)");     // Catch: Throwable -> L15
        String r9 = r8.optString("tag");     // Catch: Throwable -> L15
        Intrinsics.checkNotNull(r9);     // Catch: Throwable -> L15
        if (StringsKt.isBlank(r9) == true) goto L7;
        String r15 = r9;
    L8:
        String r10 = r8.optString("sourceQuote");     // Catch: Throwable -> L15
        Intrinsics.checkNotNull(r10);     // Catch: Throwable -> L15
        if (StringsKt.isBlank(r10) == true) goto L11;
        String r16 = r10;
    L12:
        AppRepository r20 = r1;
        long r17 = r8.optLong("timestamp", System.currentTimeMillis());     // Catch: Throwable -> L15
        String r7 = r8.optString("modelId", "HUIYUAN");     // Catch: Throwable -> L15
        Intrinsics.checkNotNullExpressionValue(r7, "optString(...)");     // Catch: Throwable -> L15
        r5.add(new ChatRecord(r11, r13, r14, r15, r16, r17, r7));     // Catch: Throwable -> L15
        r6 = r6 + 1;     // Catch: Throwable -> L15
        r1 = r20;
        r2 = r2;
        goto L3
    L11:
        r16 = null;
        goto L12
    L7:
        r15 = null;
        goto L8
    L13:
        Object r12 = Result.m7425constructorimpl(r5);     // Catch: Throwable -> L15
    L17:
        List r18 = CollectionsKt.emptyList();
        if (Result.m7431isFailureimpl(r12) == false) goto L21;
        r12 = r18;
    L21:
        return (List) r12;
    L15:
        th = move-exception;
        Result.Companion r19 = Result.Companion;
        r12 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L17
    }

    public final void saveMessages(List<ChatRecord> r14) {
        Intrinsics.checkNotNullParameter(r14, KEY_MESSAGES);
        Iterable recent = CollectionsKt.takeLast(r14, 300);
        JSONArray array = new JSONArray();
        Iterator r5 = recent.iterator();
    L4:
        if (r5.hasNext() == false) goto L13;
        ChatRecord r7 = (ChatRecord) r5.next();
        JSONObject r9 = new JSONObject().put("id", r7.getId()).put("isUser", r7.isUser()).put("text", r7.getText());
        String r10 = r7.getTag();
        String r11 = "";
        if (r10 != null) goto L8;
        r10 = "";
    L8:
        JSONObject r12 = r9.put("tag", r10);
        String r13 = r7.getSourceQuote();
        if (r13 == null) goto L12;
        r11 = r13;
    L12:
        array.put(r12.put("sourceQuote", r11).put("timestamp", r7.getTimestamp()).put("modelId", r7.getModelId()));
        goto L4
    L13:
        SharedPreferences r3 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r3, "preferences");
        SharedPreferences.Editor r6 = r3.edit();
        r6.putString(KEY_MESSAGES, array.toString());
        r6.apply();
    }

    public final void clearMessages() {
        SharedPreferences r0 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r0, "preferences");
        SharedPreferences.Editor r3 = r0.edit();
        r3.remove(KEY_MESSAGES);
        r3.apply();
    }

    public final String loadSelectedModel() {
        String r0 = this.preferences.getString(KEY_SELECTED_MODEL, "HUIYUAN");
        if (r0 != null) goto L6;
        return "HUIYUAN";
    L6:
        return r0;
    }

    public final void saveSelectedModel(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        SharedPreferences r0 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r0, "preferences");
        SharedPreferences.Editor r3 = r0.edit();
        r3.putString(KEY_SELECTED_MODEL, model);
        r3.apply();
    }

    public final List<FavoriteRecord> loadFavorites() {
        Result.Companion r1 = Result.Companion;     // Catch: Throwable -> L14
        JSONArray r3 = new JSONArray(this.preferences.getString(KEY_FAVORITES, "[]"));     // Catch: Throwable -> L14
        int r4 = r3.length();     // Catch: Throwable -> L14
        ArrayList r5 = new ArrayList(r4);     // Catch: Throwable -> L14
        int r6 = 0;
    L4:
        if (r6 >= r4) goto L6;
        JSONObject r9 = r3.getJSONObject(r6);     // Catch: Throwable -> L14
        String r11 = r9.getString("text");     // Catch: Throwable -> L14
        Intrinsics.checkNotNullExpressionValue(r11, "getString(...)");     // Catch: Throwable -> L14
        String r12 = r9.getString("category");     // Catch: Throwable -> L14
        Intrinsics.checkNotNullExpressionValue(r12, "getString(...)");     // Catch: Throwable -> L14
        r5.add(new FavoriteRecord(r11, r12, r9.optLong("savedAt", System.currentTimeMillis())));     // Catch: Throwable -> L14
        r6 = r6 + 1;     // Catch: Throwable -> L14
        goto L4
    L6:
        HashSet r7 = new HashSet();     // Catch: Throwable -> L14
        ArrayList r8 = new ArrayList();     // Catch: Throwable -> L14
        Iterator r10 = r5.iterator();     // Catch: Throwable -> L14
    L8:
        if (r10.hasNext() == false) goto L12;
        Object r13 = r10.next();     // Catch: Throwable -> L14
        if (r7.add(((FavoriteRecord) r13).getText()) == false) goto L8;
        r8.add(r13);     // Catch: Throwable -> L14
        goto L8
    L12:
        Object r0 = Result.m7425constructorimpl(r8);     // Catch: Throwable -> L14
    L16:
        List r2 = CollectionsKt.emptyList();
        if (Result.m7431isFailureimpl(r0) == false) goto L20;
        r0 = r2;
    L20:
        return (List) r0;
    L14:
        th = move-exception;
        Result.Companion r14 = Result.Companion;
        r0 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L16
    }

    public final void saveFavorites(List<FavoriteRecord> r13) {
        Intrinsics.checkNotNullParameter(r13, KEY_FAVORITES);
        JSONArray array = new JSONArray();
        HashSet r4 = new HashSet();
        ArrayList r5 = new ArrayList();
        Iterator r6 = r13.iterator();
    L4:
        if (r6.hasNext() == false) goto L8;
        Object r7 = r6.next();
        if (r4.add(((FavoriteRecord) r7).getText()) == false) goto L4;
        r5.add(r7);
        goto L4
    L8:
        Iterator r8 = r5.iterator();
    L10:
        if (r8.hasNext() == false) goto L12;
        FavoriteRecord r9 = (FavoriteRecord) r8.next();
        array.put(new JSONObject().put("text", r9.getText()).put("category", r9.getCategory()).put("savedAt", r9.getSavedAt()));
        goto L10
    L12:
        SharedPreferences r2 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r2, "preferences");
        SharedPreferences.Editor r10 = r2.edit();
        r10.putString(KEY_FAVORITES, array.toString());
        r10.apply();
    }

    public final UsageStats recordInteraction(String r9, boolean r10) {
        Intrinsics.checkNotNullParameter(r9, "category");
        UsageStats r1 = loadStats();
        LocalDate r0 = LocalDate.now();
        Map<String, Integer> r6 = MapsKt.toMutableMap(r1.getCategoryCounts());
        Integer r4 = r6.get(r9);
        if (r4 == null) goto L5;
        int r5 = r4.intValue();
    L6:
        r6.put(r9, Integer.valueOf(r5 + 1));
        int r2 = r1.getTotalQuestions() + (!r10 ? 1 : 0);
        int r3 = r1.getRandomDraws() + (r10 ? 1 : 0);
        UsageLogic r7 = UsageLogic.INSTANCE;
        String r8 = r1.getLastActiveDate();
        int r11 = r1.getStreakDays();
        Intrinsics.checkNotNull(r0);
        UsageStats r12 = r1.copy(r2, r3, r7.nextStreak(r8, r11, r0), r0.toString(), r6);
        saveStats(r12);
        return r12;
    L5:
        r5 = 0;
        goto L6
    }

    public final UsageStats loadStats() {
        String r0 = "{}";
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L13
        String r5 = this.preferences.getString(KEY_CATEGORY_COUNTS, "{}");     // Catch: Throwable -> L13
        if (r5 == null) goto L7;
        r0 = r5;
    L7:
        JSONObject r4 = new JSONObject(r0);     // Catch: Throwable -> L13
        Map r1 = MapsKt.createMapBuilder();     // Catch: Throwable -> L13
        Iterator<String> r7 = r4.keys();     // Catch: Throwable -> L13
        Intrinsics.checkNotNullExpressionValue(r7, "keys(...)");     // Catch: Throwable -> L13
    L9:
        if (r7.hasNext() == false) goto L11;
        String r10 = (String) r7.next();     // Catch: Throwable -> L13
        r1.put(r10, Integer.valueOf(r4.optInt(r10, 0)));     // Catch: Throwable -> L13
        goto L9
    L11:
        Object r3 = Result.m7425constructorimpl(MapsKt.build(r1));     // Catch: Throwable -> L13
    L15:
        Map r6 = MapsKt.emptyMap();
        if (Result.m7431isFailureimpl(r3) == false) goto L18;
        r3 = r6;
    L18:
        Map counts = (Map) r3;
        return new UsageStats(this.preferences.getInt(KEY_TOTAL_QUESTIONS, 0), this.preferences.getInt(KEY_RANDOM_DRAWS, 0), this.preferences.getInt(KEY_STREAK_DAYS, 0), this.preferences.getString(KEY_LAST_ACTIVE_DATE, null), counts);
    L13:
        th = move-exception;
        Result.Companion r8 = Result.Companion;
        r3 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L15
    }

    private final void saveStats(UsageStats stats) {
        JSONObject counts = new JSONObject();
        Iterator<Map.Entry<String, Integer>> r3 = stats.getCategoryCounts().entrySet().iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        Map.Entry<String, Integer> r4 = r3.next();
        counts.put(r4.getKey(), r4.getValue().intValue());
        goto L4
    L6:
        SharedPreferences r1 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r1, "preferences");
        SharedPreferences.Editor r5 = r1.edit();
        r5.putInt(KEY_TOTAL_QUESTIONS, stats.getTotalQuestions());
        r5.putInt(KEY_RANDOM_DRAWS, stats.getRandomDraws());
        r5.putInt(KEY_STREAK_DAYS, stats.getStreakDays());
        r5.putString(KEY_LAST_ACTIVE_DATE, stats.getLastActiveDate());
        r5.putString(KEY_CATEGORY_COUNTS, counts.toString());
        r5.apply();
    }

    public final void clearEverything() {
        SharedPreferences r0 = this.preferences;
        Intrinsics.checkNotNullExpressionValue(r0, "preferences");
        SharedPreferences.Editor r3 = r0.edit();
        r3.clear();
        r3.apply();
    }
}
