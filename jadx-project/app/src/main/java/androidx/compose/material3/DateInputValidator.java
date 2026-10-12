package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.DateInputFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J.\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 j\u0002`!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "errorDatePattern", "", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "currentStartDateMillis", "", "currentEndDateMillis", "(Lkotlin/ranges/IntRange;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrentEndDateMillis$material3_release", "()Ljava/lang/Long;", "setCurrentEndDateMillis$material3_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCurrentStartDateMillis$material3_release", "setCurrentStartDateMillis$material3_release", "validate", "dateToValidate", "Landroidx/compose/material3/internal/CalendarDate;", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "validate-XivgLIo", "(Landroidx/compose/material3/internal/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final IntRange yearRange;

    static {
    }

    public DateInputValidator(IntRange yearRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter dateFormatter, String errorDatePattern, String errorDateOutOfYearRange, String errorInvalidNotAllowed, String errorInvalidRangeInput, Long currentStartDateMillis, Long currentEndDateMillis) {
        this.yearRange = yearRange;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = dateFormatter;
        this.errorDatePattern = errorDatePattern;
        this.errorDateOutOfYearRange = errorDateOutOfYearRange;
        this.errorInvalidNotAllowed = errorInvalidNotAllowed;
        this.errorInvalidRangeInput = errorInvalidRangeInput;
        this.currentStartDateMillis = currentStartDateMillis;
        this.currentEndDateMillis = currentEndDateMillis;
    }

    public /* synthetic */ DateInputValidator(IntRange r2, SelectableDates r3, DateInputFormat r4, DatePickerFormatter r5, String r6, String r7, String r8, String r9, Long r10, Long r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 256) == 0) goto L6;
        r10 = null;
    L6:
        if ((r12 & 512) == 0) goto L8;
        Long r14 = null;
    L9:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r14);
        return;
    L8:
        r14 = r11;
        goto L9
    }

    public final Long getCurrentStartDateMillis$material3_release() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentStartDateMillis$material3_release(Long r1) {
        this.currentStartDateMillis = r1;
    }

    public final Long getCurrentEndDateMillis$material3_release() {
        return this.currentEndDateMillis;
    }

    public final void setCurrentEndDateMillis$material3_release(Long r1) {
        this.currentEndDateMillis = r1;
    }

    /* JADX INFO: renamed from: validate-XivgLIo, reason: not valid java name */
    public final String m2121validateXivgLIo(CalendarDate dateToValidate, int inputIdentifier, Locale locale) {
        if (dateToValidate != null) goto L7;
        String r2 = this.errorDatePattern;
        String r3 = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String r0 = String.format(r2, Arrays.copyOf(new Object[]{r3}, 1));
        Intrinsics.checkNotNullExpressionValue(r0, "format(this, *args)");
        return r0;
    L7:
        if (this.yearRange.contains(dateToValidate.getYear()) == true) goto L10;
        String r1 = String.format(this.errorDateOutOfYearRange, Arrays.copyOf(new Object[]{CalendarLocale_jvmKt.toLocalString$default(this.yearRange.getFirst(), 0, 0, false, 7, null), CalendarLocale_jvmKt.toLocalString$default(this.yearRange.getLast(), 0, 0, false, 7, null)}, 2));
        Intrinsics.checkNotNullExpressionValue(r1, "format(this, *args)");
        return r1;
    L10:
        SelectableDates $this$validate_XivgLIo_u24lambda_u240 = this.selectableDates;
        if ($this$validate_XivgLIo_u24lambda_u240.isSelectableYear(dateToValidate.getYear()) == true) goto L13;
    L35:
        String r14 = String.format(this.errorInvalidNotAllowed, Arrays.copyOf(new Object[]{DatePickerFormatter.formatDate$default(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(r14, "format(this, *args)");
        return r14;
    L13:
        if ($this$validate_XivgLIo_u24lambda_u240.isSelectableDate(dateToValidate.getUtcTimeMillis()) == false) goto L35;
        if (InputIdentifier.m2297equalsimpl0(inputIdentifier, InputIdentifier.Companion.m2303getStartDateInputJ2x2o4M()) == false) goto L24;
        long r4 = dateToValidate.getUtcTimeMillis();
        Long r5 = this.currentEndDateMillis;
        if (r5 == null) goto L20;
        long r6 = r5.longValue();
    L22:
        if (r4 < r6) goto L24;
    L32:
        return this.errorInvalidRangeInput;
    L20:
        r6 = Long.MAX_VALUE;
    L24:
        if (InputIdentifier.m2297equalsimpl0(inputIdentifier, InputIdentifier.Companion.m2301getEndDateInputJ2x2o4M()) == false) goto L33;
        long r7 = dateToValidate.getUtcTimeMillis();
        Long r8 = this.currentStartDateMillis;
        if (r8 == null) goto L28;
        long r9 = r8.longValue();
    L30:
        if (r7 < r9) goto L32;
        return "";
    L28:
        r9 = Long.MIN_VALUE;
        goto L30
    L33:
        return "";
    }
}
