package com.luchime.huiyuan;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/luchime/huiyuan/UsageStats;", "", "totalQuestions", "", "randomDraws", "streakDays", "lastActiveDate", "", "categoryCounts", "", "<init>", "(IIILjava/lang/String;Ljava/util/Map;)V", "getTotalQuestions", "()I", "getRandomDraws", "getStreakDays", "getLastActiveDate", "()Ljava/lang/String;", "getCategoryCounts", "()Ljava/util/Map;", "totalInteractions", "getTotalInteractions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UsageStats {
    public static final int $stable = 0;
    private final Map<String, Integer> categoryCounts;
    private final String lastActiveDate;
    private final int randomDraws;
    private final int streakDays;
    private final int totalQuestions;

    static {
        $stable = 8;
    }

    public UsageStats() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        Map r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UsageStats copy$default(UsageStats r0, int r1, int r2, int r3, String r4, Map r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.totalQuestions;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.randomDraws;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.streakDays;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.lastActiveDate;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.categoryCounts;
    L17:
        String r8 = r4;
        Map r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.totalQuestions;
    }

    public final int component2() {
        return this.randomDraws;
    }

    public final int component3() {
        return this.streakDays;
    }

    public final String component4() {
        return this.lastActiveDate;
    }

    public final Map<String, Integer> component5() {
        return this.categoryCounts;
    }

    public final UsageStats copy(int r8, int r9, int r10, String r11, Map<String, Integer> r12) {
        Intrinsics.checkNotNullParameter(r12, "categoryCounts");
        return new UsageStats(r8, r9, r10, r11, r12);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof UsageStats) == true) goto L8;
        return false;
    L8:
        UsageStats r1 = (UsageStats) r6;
        if (this.totalQuestions == r1.totalQuestions) goto L12;
        return false;
    L12:
        if (this.randomDraws == r1.randomDraws) goto L15;
        return false;
    L15:
        if (this.streakDays == r1.streakDays) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.lastActiveDate, r1.lastActiveDate) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.categoryCounts, r1.categoryCounts) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r1 = ((((Integer.hashCode(this.totalQuestions) * 31) + Integer.hashCode(this.randomDraws)) * 31) + Integer.hashCode(this.streakDays)) * 31;
        if (this.lastActiveDate != null) goto L5;
        int r2 = 0;
    L7:
        return ((r1 + r2) * 31) + this.categoryCounts.hashCode();
    L5:
        r2 = this.lastActiveDate.hashCode();
        goto L7
    }

    public String toString() {
        return "UsageStats(totalQuestions=" + this.totalQuestions + ", randomDraws=" + this.randomDraws + ", streakDays=" + this.streakDays + ", lastActiveDate=" + this.lastActiveDate + ", categoryCounts=" + this.categoryCounts + ")";
    }

    public UsageStats(int totalQuestions, int randomDraws, int streakDays, String lastActiveDate, Map<String, Integer> r6) {
        Intrinsics.checkNotNullParameter(r6, "categoryCounts");
        this.totalQuestions = totalQuestions;
        this.randomDraws = randomDraws;
        this.streakDays = streakDays;
        this.lastActiveDate = lastActiveDate;
        this.categoryCounts = r6;
    }

    public /* synthetic */ UsageStats(int r2, int r3, int r4, String r5, Map r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        Map r9 = MapsKt.emptyMap();
    L18:
        String r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L17:
        r9 = r6;
        goto L18
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
