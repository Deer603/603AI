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
    public static final UsageLogic INSTANCE = null;

    static {
        INSTANCE = new UsageLogic();
    }

    private UsageLogic() {
    }

    public final int nextStreak(String lastActiveDate, int currentStreak, LocalDate today) {
        Intrinsics.checkNotNullParameter(today, "today");
        String r0 = lastActiveDate;
        if (r0 != null) goto L5;
    L8:
        boolean r1 = true;
    L9:
        if (r1 == false) goto L29;
        return 1;
    L29:
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L13
        UsageLogic r3 = this;     // Catch: Throwable -> L13
        Object r4 = Result.m7425constructorimpl(LocalDate.parse(lastActiveDate));     // Catch: Throwable -> L13
    L16:
        if (Result.m7431isFailureimpl(r4) == false) goto L18;
        r4 = null;
    L18:
        LocalDate previous = (LocalDate) r4;
        if (previous != null) goto L22;
        return 1;
    L22:
        if (Intrinsics.areEqual(previous, today) == false) goto L25;
        return RangesKt.coerceAtLeast(currentStreak, 1);
    L25:
        if (Intrinsics.areEqual(previous.plusDays(1), today) == true) goto L31;
        return 1;
    L31:
        return 1 + RangesKt.coerceAtLeast(currentStreak, 0);
    L13:
        th = move-exception;
        Result.Companion r5 = Result.Companion;
        r4 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L16
    L5:
        if (StringsKt.isBlank(r0) == true) goto L8;
        r1 = false;
        goto L9
    }

    public final int dailyIndex(long epochDay, int size) {
        if (size <= 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L9;
        return (int) Math.floorMod(epochDay, size);
    L9:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L4:
        r0 = false;
        goto L5
    }
}
