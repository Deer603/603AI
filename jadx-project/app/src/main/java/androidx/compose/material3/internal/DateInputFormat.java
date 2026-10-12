package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "patternWithDelimiters", "", "delimiter", "", "(Ljava/lang/String;C)V", "getDelimiter", "()C", "getPatternWithDelimiters", "()Ljava/lang/String;", "patternWithoutDelimiters", "getPatternWithoutDelimiters", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    static {
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat r0, String r1, char r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.patternWithDelimiters;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.delimiter;
    L9:
        return r0.copy(r1, r2);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String r2, char r3) {
        return new DateInputFormat(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof DateInputFormat) == true) goto L8;
        return false;
    L8:
        DateInputFormat r1 = (DateInputFormat) r6;
        if (Intrinsics.areEqual(this.patternWithDelimiters, r1.patternWithDelimiters) == true) goto L12;
        return false;
    L12:
        if (this.delimiter == r1.delimiter) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + Character.hashCode(this.delimiter);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }

    public DateInputFormat(String patternWithDelimiters, char delimiter) {
        this.patternWithDelimiters = patternWithDelimiters;
        this.delimiter = delimiter;
        this.patternWithoutDelimiters = StringsKt.replace$default(this.patternWithDelimiters, String.valueOf(this.delimiter), "", false, 4, null);
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }
}
