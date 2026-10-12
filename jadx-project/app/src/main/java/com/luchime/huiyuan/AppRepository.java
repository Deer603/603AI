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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AppRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J\u0006\u0010 \u001a\u00020\rR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/luchime/huiyuan/AppRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "loadMessages", "", "Lcom/luchime/huiyuan/ChatRecord;", "saveMessages", "", AppRepository.KEY_MESSAGES, "clearMessages", "loadSelectedModel", "", "saveSelectedModel", "model", "loadFavorites", "Lcom/luchime/huiyuan/FavoriteRecord;", "saveFavorites", AppRepository.KEY_FAVORITES, "recordInteraction", "Lcom/luchime/huiyuan/UsageStats;", "category", "randomDraw", "", "loadStats", "saveStats", "stats", "clearEverything", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppRepository {
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
    public static final int $stable = 8;

    public AppRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.preferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
    }

    public final List<ChatRecord> loadMessages() {
        Object objM7425constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AppRepository appRepository = this;
            int i = 0;
            JSONArray jSONArray = new JSONArray(appRepository.preferences.getString(KEY_MESSAGES, "[]"));
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                long j = jSONObject.getLong("id");
                boolean z = jSONObject.getBoolean("isUser");
                String string = jSONObject.getString("text");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String strOptString = jSONObject.optString("tag");
                Intrinsics.checkNotNull(strOptString);
                String str = !StringsKt.isBlank(strOptString) ? strOptString : null;
                String strOptString2 = jSONObject.optString("sourceQuote");
                Intrinsics.checkNotNull(strOptString2);
                String str2 = !StringsKt.isBlank(strOptString2) ? strOptString2 : null;
                AppRepository appRepository2 = appRepository;
                long jOptLong = jSONObject.optLong("timestamp", System.currentTimeMillis());
                String strOptString3 = jSONObject.optString("modelId", "HUIYUAN");
                Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                arrayList.add(new ChatRecord(j, z, string, str, str2, jOptLong, strOptString3));
                i2++;
                appRepository = appRepository2;
                i = i;
            }
            objM7425constructorimpl = Result.m7425constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7425constructorimpl = Result.m7425constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m7431isFailureimpl(objM7425constructorimpl)) {
            objM7425constructorimpl = listEmptyList;
        }
        return (List) objM7425constructorimpl;
    }

    public final void saveMessages(List<ChatRecord> messages) throws JSONException {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Iterable<ChatRecord> recent = CollectionsKt.takeLast(messages, 300);
        JSONArray array = new JSONArray();
        for (ChatRecord chatRecord : recent) {
            JSONObject jSONObjectPut = new JSONObject().put("id", chatRecord.getId()).put("isUser", chatRecord.isUser()).put("text", chatRecord.getText());
            String tag = chatRecord.getTag();
            String str = "";
            if (tag == null) {
                tag = "";
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("tag", tag);
            String sourceQuote = chatRecord.getSourceQuote();
            if (sourceQuote != null) {
                str = sourceQuote;
            }
            array.put(jSONObjectPut2.put("sourceQuote", str).put("timestamp", chatRecord.getTimestamp()).put("modelId", chatRecord.getModelId()));
        }
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString(KEY_MESSAGES, array.toString());
        editorEdit.apply();
    }

    public final void clearMessages() {
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.remove(KEY_MESSAGES);
        editorEdit.apply();
    }

    public final String loadSelectedModel() {
        String string = this.preferences.getString(KEY_SELECTED_MODEL, "HUIYUAN");
        return string == null ? "HUIYUAN" : string;
    }

    public final void saveSelectedModel(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString(KEY_SELECTED_MODEL, model);
        editorEdit.apply();
    }

    public final List<FavoriteRecord> loadFavorites() {
        Object objM7425constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONArray jSONArray = new JSONArray(this.preferences.getString(KEY_FAVORITES, "[]"));
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("text");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject.getString("category");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(new FavoriteRecord(string, string2, jSONObject.optLong("savedAt", System.currentTimeMillis())));
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((FavoriteRecord) obj).getText())) {
                    arrayList2.add(obj);
                }
            }
            objM7425constructorimpl = Result.m7425constructorimpl(arrayList2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7425constructorimpl = Result.m7425constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m7431isFailureimpl(objM7425constructorimpl)) {
            objM7425constructorimpl = listEmptyList;
        }
        return (List) objM7425constructorimpl;
    }

    public final void saveFavorites(List<FavoriteRecord> favorites) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        JSONArray array = new JSONArray();
        HashSet hashSet = new HashSet();
        ArrayList<FavoriteRecord> arrayList = new ArrayList();
        for (Object obj : favorites) {
            if (hashSet.add(((FavoriteRecord) obj).getText())) {
                arrayList.add(obj);
            }
        }
        for (FavoriteRecord favoriteRecord : arrayList) {
            array.put(new JSONObject().put("text", favoriteRecord.getText()).put("category", favoriteRecord.getCategory()).put("savedAt", favoriteRecord.getSavedAt()));
        }
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString(KEY_FAVORITES, array.toString());
        editorEdit.apply();
    }

    public final UsageStats recordInteraction(String category, boolean randomDraw) throws JSONException {
        Intrinsics.checkNotNullParameter(category, "category");
        UsageStats usageStatsLoadStats = loadStats();
        LocalDate localDateNow = LocalDate.now();
        Map<String, Integer> mutableMap = MapsKt.toMutableMap(usageStatsLoadStats.getCategoryCounts());
        Integer num = mutableMap.get(category);
        mutableMap.put(category, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        int totalQuestions = usageStatsLoadStats.getTotalQuestions() + (!randomDraw ? 1 : 0);
        int randomDraws = usageStatsLoadStats.getRandomDraws() + (randomDraw ? 1 : 0);
        UsageLogic usageLogic = UsageLogic.INSTANCE;
        String lastActiveDate = usageStatsLoadStats.getLastActiveDate();
        int streakDays = usageStatsLoadStats.getStreakDays();
        Intrinsics.checkNotNull(localDateNow);
        UsageStats usageStatsCopy = usageStatsLoadStats.copy(totalQuestions, randomDraws, usageLogic.nextStreak(lastActiveDate, streakDays, localDateNow), localDateNow.toString(), mutableMap);
        saveStats(usageStatsCopy);
        return usageStatsCopy;
    }

    public final UsageStats loadStats() {
        Object objM7425constructorimpl;
        String str = "{}";
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = this.preferences.getString(KEY_CATEGORY_COUNTS, "{}");
            if (string != null) {
                str = string;
            }
            JSONObject jSONObject = new JSONObject(str);
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String str2 = (String) itKeys.next();
                mapCreateMapBuilder.put(str2, Integer.valueOf(jSONObject.optInt(str2, 0)));
            }
            objM7425constructorimpl = Result.m7425constructorimpl(MapsKt.build(mapCreateMapBuilder));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7425constructorimpl = Result.m7425constructorimpl(ResultKt.createFailure(th));
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (Result.m7431isFailureimpl(objM7425constructorimpl)) {
            objM7425constructorimpl = mapEmptyMap;
        }
        Map counts = (Map) objM7425constructorimpl;
        return new UsageStats(this.preferences.getInt(KEY_TOTAL_QUESTIONS, 0), this.preferences.getInt(KEY_RANDOM_DRAWS, 0), this.preferences.getInt(KEY_STREAK_DAYS, 0), this.preferences.getString(KEY_LAST_ACTIVE_DATE, null), counts);
    }

    private final void saveStats(UsageStats stats) throws JSONException {
        JSONObject counts = new JSONObject();
        for (Map.Entry<String, Integer> entry : stats.getCategoryCounts().entrySet()) {
            counts.put(entry.getKey(), entry.getValue().intValue());
        }
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putInt(KEY_TOTAL_QUESTIONS, stats.getTotalQuestions());
        editorEdit.putInt(KEY_RANDOM_DRAWS, stats.getRandomDraws());
        editorEdit.putInt(KEY_STREAK_DAYS, stats.getStreakDays());
        editorEdit.putString(KEY_LAST_ACTIVE_DATE, stats.getLastActiveDate());
        editorEdit.putString(KEY_CATEGORY_COUNTS, counts.toString());
        editorEdit.apply();
    }

    public final void clearEverything() {
        SharedPreferences preferences = this.preferences;
        Intrinsics.checkNotNullExpressionValue(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }
}
