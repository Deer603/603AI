package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "year", "", "month", "dayOfMonth", "utcTimeMillis", "", "(IIIJ)V", "getDayOfMonth", "()I", "getMonth", "getUtcTimeMillis", "()J", "getYear", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "format", "", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "skeleton", "hashCode", "toString", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CalendarDate implements Comparable<CalendarDate> {
    public static final int $stable = 0;
    private final int dayOfMonth;
    private final int month;
    private final long utcTimeMillis;
    private final int year;

    static {
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate r0, int r1, int r2, int r3, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.year;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.month;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.dayOfMonth;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r4 = r0.utcTimeMillis;
    L14:
        long r8 = r4;
        int r5 = r3;
        int r9 = r1;
        return r0.copy(r9, r2, r5, r8);
    }

    public final int component1() {
        return this.year;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.dayOfMonth;
    }

    public final long component4() {
        return this.utcTimeMillis;
    }

    public final CalendarDate copy(int r7, int r8, int r9, long r10) {
        return new CalendarDate(r7, r8, r9, r10);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CalendarDate) == true) goto L8;
        return false;
    L8:
        CalendarDate r1 = (CalendarDate) r8;
        if (this.year == r1.year) goto L12;
        return false;
    L12:
        if (this.month == r1.month) goto L15;
        return false;
    L15:
        if (this.dayOfMonth == r1.dayOfMonth) goto L18;
        return false;
    L18:
        if (this.utcTimeMillis == r1.utcTimeMillis) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.dayOfMonth)) * 31) + Long.hashCode(this.utcTimeMillis);
    }

    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + ')';
    }

    public CalendarDate(int year, int month, int dayOfMonth, long utcTimeMillis) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.utcTimeMillis = utcTimeMillis;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CalendarDate r2) {
        return compareTo2(r2);
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(CalendarDate other) {
        return Intrinsics.compare(this.utcTimeMillis, other.utcTimeMillis);
    }

    public final String format(CalendarModel calendarModel, String skeleton) {
        return calendarModel.formatWithSkeleton(this, skeleton, calendarModel.getLocale());
    }
}
