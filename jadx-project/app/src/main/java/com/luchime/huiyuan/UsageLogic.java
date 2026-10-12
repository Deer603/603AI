package com.luchime.huiyuan;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u000f"}, d2 = {"Lcom/luchime/huiyuan/UsageLogic;", "", "<init>", "()V", "nextStreak", "", "lastActiveDate", "", "currentStreak", "today", "Ljava/time/LocalDate;", "dailyIndex", "epochDay", "", "size", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UsageLogic {
    public static final int $stable = 0;
    public static final UsageLogic INSTANCE = new UsageLogic();

    private UsageLogic() {
    }

    public final int nextStreak(String lastActiveDate, int currentStreak, LocalDate today) {
        Object objM7425constructorimpl;
        Intrinsics.checkNotNullParameter(today, "today");
        String str = lastActiveDate;
        if (str == null || StringsKt.isBlank(str)) {
            return 1;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            UsageLogic usageLogic = this;
            objM7425constructorimpl = Result.m7425constructorimpl(LocalDate.parse(lastActiveDate));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM7425constructorimpl = Result.m7425constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7431isFailureimpl(objM7425constructorimpl)) {
            objM7425constructorimpl = null;
        }
        LocalDate previous = (LocalDate) objM7425constructorimpl;
        if (previous == null) {
            return 1;
        }
        if (Intrinsics.areEqual(previous, today)) {
            return RangesKt.coerceAtLeast(currentStreak, 1);
        }
        if (Intrinsics.areEqual(previous.plusDays(1L), today)) {
            return 1 + RangesKt.coerceAtLeast(currentStreak, 0);
        }
        return 1;
    }

    public final int dailyIndex(long epochDay, int size) {
        if (!(size > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return (int) Math.floorMod(epochDay, size);
    }
}
