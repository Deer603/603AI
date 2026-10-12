package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "gridStartCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "gridEndCoordinates", "firstIsSelectionStart", "", "lastIsSelectionEnd", "(JJZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFirstIsSelectionStart", "()Z", "getGridEndCoordinates-nOcc-ac", "()J", "J", "getGridStartCoordinates-nOcc-ac", "getLastIsSelectionEnd", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "()V", "calculateRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "month", "Landroidx/compose/material3/internal/CalendarMonth;", "startDate", "Landroidx/compose/material3/internal/CalendarDate;", "endDate", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth month, CalendarDate startDate, CalendarDate endDate) {
            if (startDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis()) goto L5;
            return null;
        L5:
            if (endDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis()) goto L8;
            return null;
        L8:
            if (startDate.getUtcTimeMillis() < month.getStartUtcTimeMillis()) goto L10;
            boolean r0 = true;
        L11:
            boolean firstIsSelectionStart = r0;
            if (endDate.getUtcTimeMillis() > month.getEndUtcTimeMillis()) goto L14;
            boolean lastIsSelectionEnd = true;
        L15:
            if (firstIsSelectionStart == false) goto L17;
            int startGridItemOffset = (month.getDaysFromStartOfWeekToFirstOfMonth() + startDate.getDayOfMonth()) - 1;
        L19:
            if (lastIsSelectionEnd == false) goto L21;
            int endGridItemOffset = (month.getDaysFromStartOfWeekToFirstOfMonth() + endDate.getDayOfMonth()) - 1;
        L22:
            long gridStartCoordinates = IntOffsetKt.IntOffset(startGridItemOffset % 7, startGridItemOffset / 7);
            long gridEndCoordinates = IntOffsetKt.IntOffset(endGridItemOffset % 7, endGridItemOffset / 7);
            return new SelectedRangeInfo(gridStartCoordinates, gridEndCoordinates, firstIsSelectionStart, lastIsSelectionEnd, null);
        L21:
            endGridItemOffset = (month.getDaysFromStartOfWeekToFirstOfMonth() + month.getNumberOfDays()) - 1;
            goto L22
        L17:
            startGridItemOffset = month.getDaysFromStartOfWeekToFirstOfMonth();
            goto L19
        L14:
            lastIsSelectionEnd = false;
            goto L15
        L10:
            r0 = false;
            goto L11
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ SelectedRangeInfo(long r1, long r3, boolean r5, boolean r6, DefaultConstructorMarker r7) {
        this(r1, r3, r5, r6);
    }

    private SelectedRangeInfo(long gridStartCoordinates, long gridEndCoordinates, boolean firstIsSelectionStart, boolean lastIsSelectionEnd) {
        this.gridStartCoordinates = gridStartCoordinates;
        this.gridEndCoordinates = gridEndCoordinates;
        this.firstIsSelectionStart = firstIsSelectionStart;
        this.lastIsSelectionEnd = lastIsSelectionEnd;
    }

    /* JADX INFO: renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2598getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    /* JADX INFO: renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2597getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }
}
