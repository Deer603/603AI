package com.luchime.huiyuan;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/luchime/huiyuan/UsageStats;", "", "totalQuestions", "", "randomDraws", "streakDays", "lastActiveDate", "", "categoryCounts", "", "<init>", "(IIILjava/lang/String;Ljava/util/Map;)V", "getTotalQuestions", "()I", "getRandomDraws", "getStreakDays", "getLastActiveDate", "()Ljava/lang/String;", "getCategoryCounts", "()Ljava/util/Map;", "totalInteractions", "getTotalInteractions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UsageStats {
    public static final int $stable = 8;
    private final Map<String, Integer> categoryCounts;
    private final String lastActiveDate;
    private final int randomDraws;
    private final int streakDays;
    private final int totalQuestions;

    public UsageStats() {
        this(0, 0, 0, null, null, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsageStats copy$default(UsageStats usageStats, int i, int i2, int i3, String str, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = usageStats.totalQuestions;
        }
        if ((i4 & 2) != 0) {
            i2 = usageStats.randomDraws;
        }
        if ((i4 & 4) != 0) {
            i3 = usageStats.streakDays;
        }
        if ((i4 & 8) != 0) {
            str = usageStats.lastActiveDate;
        }
        if ((i4 & 16) != 0) {
            map = usageStats.categoryCounts;
        }
        Map map2 = map;
        int i5 = i3;
        return usageStats.copy(i, i2, i5, str, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRandomDraws() {
        return this.randomDraws;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStreakDays() {
        return this.streakDays;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastActiveDate() {
        return this.lastActiveDate;
    }

    public final Map<String, Integer> component5() {
        return this.categoryCounts;
    }

    public final UsageStats copy(int totalQuestions, int randomDraws, int streakDays, String lastActiveDate, Map<String, Integer> categoryCounts) {
        Intrinsics.checkNotNullParameter(categoryCounts, "categoryCounts");
        return new UsageStats(totalQuestions, randomDraws, streakDays, lastActiveDate, categoryCounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageStats)) {
            return false;
        }
        UsageStats usageStats = (UsageStats) other;
        return this.totalQuestions == usageStats.totalQuestions && this.randomDraws == usageStats.randomDraws && this.streakDays == usageStats.streakDays && Intrinsics.areEqual(this.lastActiveDate, usageStats.lastActiveDate) && Intrinsics.areEqual(this.categoryCounts, usageStats.categoryCounts);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.totalQuestions) * 31) + Integer.hashCode(this.randomDraws)) * 31) + Integer.hashCode(this.streakDays)) * 31) + (this.lastActiveDate == null ? 0 : this.lastActiveDate.hashCode())) * 31) + this.categoryCounts.hashCode();
    }

    public String toString() {
        return "UsageStats(totalQuestions=" + this.totalQuestions + ", randomDraws=" + this.randomDraws + ", streakDays=" + this.streakDays + ", lastActiveDate=" + this.lastActiveDate + ", categoryCounts=" + this.categoryCounts + ")";
    }

    public UsageStats(int totalQuestions, int randomDraws, int streakDays, String lastActiveDate, Map<String, Integer> categoryCounts) {
        Intrinsics.checkNotNullParameter(categoryCounts, "categoryCounts");
        this.totalQuestions = totalQuestions;
        this.randomDraws = randomDraws;
        this.streakDays = streakDays;
        this.lastActiveDate = lastActiveDate;
        this.categoryCounts = categoryCounts;
    }

    public final int getTotalQuestions() {
        return this.totalQuestions;
    }

    public final int getRandomDraws() {
        return this.randomDraws;
    }

    public final int getStreakDays() {
        return this.streakDays;
    }

    public final String getLastActiveDate() {
        return this.lastActiveDate;
    }

    public final Map<String, Integer> getCategoryCounts() {
        return this.categoryCounts;
    }

    public final int getTotalInteractions() {
        return this.totalQuestions + this.randomDraws;
    }
}
