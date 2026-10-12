package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0087\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u00152\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "()V", "DateRangePickerHeadline", "", "selectedStartDateMillis", "", "selectedEndDateMillis", "displayMode", "Landroidx/compose/material3/DisplayMode;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "DateRangePickerHeadline-v84Udv0", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "startDateText", "", "endDateText", "startDatePlaceholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "endDatePlaceholder", "datesDelimiter", "DateRangePickerHeadline-0YIUgSQ", "(Ljava/lang/Long;Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerTitle", "DateRangePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = null;

    static {
        INSTANCE = new DateRangePickerDefaults();
    }

    private DateRangePickerDefaults() {
    }

    /* JADX INFO: renamed from: access$DateRangePickerHeadline-0YIUgSQ, reason: not valid java name */
    public static final /* synthetic */ void m2167access$DateRangePickerHeadline0YIUgSQ(DateRangePickerDefaults $this, Long selectedStartDateMillis, Long selectedEndDateMillis, int displayMode, DatePickerFormatter dateFormatter, Modifier modifier, String startDateText, String endDateText, Function2 startDatePlaceholder, Function2 endDatePlaceholder, Function2 datesDelimiter, Composer $composer, int $changed, int $changed1) {
        $this.m2166DateRangePickerHeadline0YIUgSQ(selectedStartDateMillis, selectedEndDateMillis, displayMode, dateFormatter, modifier, startDateText, endDateText, startDatePlaceholder, endDatePlaceholder, datesDelimiter, $composer, $changed, $changed1);
    }

    /* JADX INFO: renamed from: DateRangePickerTitle-hOD91z4, reason: not valid java name */
    public final void m2169DateRangePickerTitlehOD91z4(final int displayMode, Modifier modifier, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-1412719908);
        ComposerKt.sourceInformation($composer2, "C(DateRangePickerTitle)P(0:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r34 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L24:
        if (($dirty & 19) == 18) goto L26;
    L29:
        if (r4 == 0) goto L31;
        Modifier.Companion modifier2 = Modifier.Companion;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventStart(-1412719908, $dirty, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:338)");
    L36:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L38;
        $composer2.startReplaceGroup(980469064);
        ComposerKt.sourceInformation($composer2, "341@15673L48,341@15668L75");
        Strings.Companion r0 = Strings.Companion;
        TextKt.m2820Text4IGK_g(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_title), $composer2, 0), modifier2, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, $dirty & 112, 0, 131068);
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        final Modifier modifier3 = modifier2;
    L46:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L50;
        r7.updateScope(new DateRangePickerDefaults$DateRangePickerTitle$1(this, displayMode, modifier3, $changed, r34));
        return;
    L50:
        return;
    L38:
        int $dirty2 = $dirty;
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L41;
        $composer2.startReplaceGroup(980473063);
        ComposerKt.sourceInformation($composer2, "343@15798L47,343@15793L74");
        Strings.Companion r1 = Strings.Companion;
        TextKt.m2820Text4IGK_g(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_input_title), $composer2, 0), modifier2, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, $dirty2 & 112, 0, 131068);
        $composer3 = $composer2;
        $composer3.endReplaceGroup();
        goto L43
    L41:
        $composer3 = $composer2;
        $composer3.startReplaceGroup(329974917);
        $composer3.endReplaceGroup();
        goto L43
    L31:
        modifier2 = r5;
        goto L33
    L26:
        if ($composer2.getSkipping() == false) goto L29;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier3 = r5;
        goto L46
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(displayMode) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L12
    L10:
        r8 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: DateRangePickerHeadline-v84Udv0, reason: not valid java name */
    public final void m2168DateRangePickerHeadlinev84Udv0(final Long selectedStartDateMillis, final Long selectedEndDateMillis, final int displayMode, final DatePickerFormatter dateFormatter, Modifier modifier, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1611069472);
        ComposerKt.sourceInformation($composer2, "C(DateRangePickerHeadline)P(4,3,1:c#material3.DisplayMode)367@16887L47,368@16961L45,377@17394L30,378@17459L28,369@17015L534:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Long r2 = selectedStartDateMillis;
    L14:
        if ((r25 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Long r3 = selectedEndDateMillis;
    L25:
        if ((r25 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        int r5 = displayMode;
    L36:
        if ((r25 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L48:
        int r6 = r25 & 16;
        if (r6 == 0) goto L52;
        $dirty = $dirty | 24576;
        Modifier modifier2 = modifier;
    L60:
        if ((r25 & 32) == 0) goto L63;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        DateRangePickerDefaults r8 = this;
    L70:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898) goto L73;
    L76:
        if (r6 == 0) goto L79;
        modifier2 = Modifier.Companion;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventStart(-1611069472, $dirty2, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:366)");
    L81:
        Strings.Companion r0 = Strings.Companion;
        final String startDateText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_start_headline), $composer2, 0);
        Strings.Companion r1 = Strings.Companion;
        final String endDateText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_end_headline), $composer2, 0);
        Modifier modifier3 = modifier2;
        DateRangePickerDefaults r4 = r8;
        Long r7 = r2;
        Long r9 = r3;
        int r10 = r5;
        r4.m2166DateRangePickerHeadline0YIUgSQ(r7, r9, r10, dateFormatter, modifier3, startDateText, endDateText, ComposableLambdaKt.rememberComposableLambda(482821121, true, new DateRangePickerDefaults$DateRangePickerHeadline$1(startDateText), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1522669758, true, new DateRangePickerDefaults$DateRangePickerHeadline$2(endDateText), $composer2, 54), ComposableSingletons$DateRangePickerKt.INSTANCE.m2092getLambda1$material3_release(), $composer2, ((((($dirty2 & 14) | 918552576) | ($dirty2 & 112)) | ($dirty2 & 896)) | ($dirty2 & 7168)) | (57344 & $dirty2), ($dirty2 >> 15) & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
    L84:
        final Modifier modifier4 = modifier3;
    L85:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L89;
        r11.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$3(this, selectedStartDateMillis, selectedEndDateMillis, displayMode, dateFormatter, modifier4, $changed, r25));
        return;
    L89:
        return;
    L73:
        if ($composer2.getSkipping() == false) goto L76;
        $composer2.skipToGroupEnd();
        modifier4 = modifier2;
        goto L85
    L63:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L69;
        r8 = this;
        if ($composer2.changed(r8) == false) goto L67;
        int r12 = 131072;
    L68:
        $dirty = $dirty | r12;
        goto L70
    L67:
        r12 = 65536;
        goto L68
    L69:
        r8 = this;
        goto L70
    L52:
        if (($changed & 24576) != 0) goto L58;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L56;
        int r13 = 16384;
    L57:
        $dirty = $dirty | r13;
        goto L60
    L56:
        r13 = 8192;
        goto L57
    L58:
        modifier2 = modifier;
        goto L60
    L39:
        if (($changed & 3072) != 0) goto L48;
        if (($changed & 4096) != 0) goto L43;
        boolean r14 = $composer2.changed(dateFormatter);
    L44:
        if (r14 == false) goto L46;
        int r15 = 2048;
    L47:
        $dirty = $dirty | r15;
        goto L48
    L46:
        r15 = 1024;
        goto L47
    L43:
        r14 = $composer2.changedInstance(dateFormatter);
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r5 = displayMode;
        if ($composer2.changed(r5) == false) goto L32;
        int r16 = 256;
    L33:
        $dirty = $dirty | r16;
        goto L36
    L32:
        r16 = 128;
        goto L33
    L34:
        r5 = displayMode;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r3 = selectedEndDateMillis;
        if ($composer2.changed(r3) == false) goto L21;
        int r17 = 32;
    L22:
        $dirty = $dirty | r17;
        goto L25
    L21:
        r17 = 16;
        goto L22
    L23:
        r3 = selectedEndDateMillis;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = selectedStartDateMillis;
        if ($composer2.changed(r2) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L14
    L10:
        r18 = 2;
        goto L11
    L12:
        r2 = selectedStartDateMillis;
        goto L14
    }

    /* JADX INFO: renamed from: DateRangePickerHeadline-0YIUgSQ, reason: not valid java name */
    private final void m2166DateRangePickerHeadline0YIUgSQ(Long selectedStartDateMillis, final Long selectedEndDateMillis, final int displayMode, final DatePickerFormatter dateFormatter, final Modifier modifier, final String startDateText, final String endDateText, final Function2<? super Composer, ? super Integer, Unit> r71, final Function2<? super Composer, ? super Integer, Unit> r72, final Function2<? super Composer, ? super Integer, Unit> r73, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-820363420);
        ComposerKt.sourceInformation($composer2, "C(DateRangePickerHeadline)P(7,6,2:c#material3.DisplayMode!1,5,9,4,8,3)420@19570L15,456@21103L168,454@21029L748:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedStartDateMillis) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(selectedEndDateMillis) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(displayMode) == false) goto L21;
        int r7 = 256;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 128;
    L24:
        if (($changed & 3072) != 0) goto L34;
        if (($changed & 4096) != 0) goto L28;
        boolean r8 = $composer2.changed(dateFormatter);
    L29:
        if (r8 == false) goto L31;
        int r9 = 2048;
    L32:
        $dirty = $dirty | r9;
        goto L34
    L31:
        r9 = 1024;
        goto L32
    L28:
        r8 = $composer2.changedInstance(dateFormatter);
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changed(modifier) == false) goto L38;
        int r10 = 16384;
    L39:
        $dirty = $dirty | r10;
        goto L41
    L38:
        r10 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changed(startDateText) == false) goto L45;
        int r11 = 131072;
    L46:
        $dirty = $dirty | r11;
        goto L48
    L45:
        r11 = 65536;
    L48:
        if ((1572864 & $changed) != 0) goto L55;
        if ($composer2.changed(endDateText) == false) goto L52;
        int r12 = 1048576;
    L53:
        $dirty = $dirty | r12;
        goto L55
    L52:
        r12 = 524288;
    L55:
        if ((12582912 & $changed) != 0) goto L62;
        if ($composer2.changedInstance(r71) == false) goto L59;
        int r13 = 8388608;
    L60:
        $dirty = $dirty | r13;
        goto L62
    L59:
        r13 = 4194304;
    L62:
        if ((100663296 & $changed) != 0) goto L69;
        if ($composer2.changedInstance(r72) == false) goto L66;
        int r14 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L67:
        $dirty = $dirty | r14;
        goto L69
    L66:
        r14 = 33554432;
    L69:
        if ((805306368 & $changed) != 0) goto L76;
        if ($composer2.changedInstance(r73) == false) goto L73;
        int r15 = 536870912;
    L74:
        $dirty = $dirty | r15;
        goto L76
    L73:
        r15 = 268435456;
    L76:
        if ((306783379 & $dirty) != 306783378) goto L84;
        if (($changed1 & 1) != 0) goto L84;
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        Long r16 = selectedStartDateMillis;
    L140:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L144;
        final Long r2 = r16;
        r0.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$6(this, r2, selectedEndDateMillis, displayMode, dateFormatter, modifier, startDateText, endDateText, r71, r72, r73, $changed, $changed1));
        return;
    L144:
        return;
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(-820363420, $dirty, $changed1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:419)");
    L86:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        int $dirty2 = $dirty;
        String formatterStartDate = DatePickerFormatter.formatDate$default(dateFormatter, selectedStartDateMillis, defaultLocale, false, 4, null);
        r16 = selectedStartDateMillis;
        String formatterEndDate = DatePickerFormatter.formatDate$default(dateFormatter, selectedEndDateMillis, defaultLocale, false, 4, null);
        String verboseStartDateDescription = dateFormatter.formatDate(r16, defaultLocale, true);
        $composer2.startReplaceGroup(1063158288);
        String verboseEndDateDescription = "";
        ComposerKt.sourceInformation($composer2, "");
        if (verboseStartDateDescription == null) goto L89;
        String formatterEndDate2 = formatterEndDate;
    L96:
        $composer2.endReplaceGroup();
        String r3 = dateFormatter.formatDate(selectedEndDateMillis, defaultLocale, true);
        $composer2.startReplaceGroup(1063174382);
        ComposerKt.sourceInformation($composer2, "");
        if (r3 == null) goto L99;
        verboseEndDateDescription = r3;
    L106:
        $composer2.endReplaceGroup();
        final String startHeadlineDescription = startDateText + ": " + verboseStartDateDescription;
        final String endHeadlineDescription = endDateText + ": " + verboseEndDateDescription;
        ComposerKt.sourceInformationMarkerStart($composer2, 1063196439, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(startHeadlineDescription) | $composer2.changed(endHeadlineDescription);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L113;
        if (value$iv == Composer.Companion.getEmpty()) goto L113;
    L114:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r4 = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) value$iv);
        Alignment.Vertical r17 = Alignment.Companion.getCenterVertically();
        Arrangement.HorizontalOrVertical r1 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(r1, r17, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, r4);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L117;
        ComposablesKt.invalidApplier();
    L117:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L120;
        Function0<ComposeUiNode> r18 = r19;
        $composer2.createNode(r18);
    L121:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L128;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L128;
    L129:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r21 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r22 = RowScopeInstance.INSTANCE;
        int r23 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 303513083, "C468@21589L16:DateRangePicker.kt#uh7d8r");
        if (formatterStartDate == null) goto L132;
        $composer2.startReplaceGroup(303536053);
        ComposerKt.sourceInformation($composer2, "464@21471L31");
        TextKt.m2820Text4IGK_g(formatterStartDate, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 0, 0, 131070);
        $composer2.endReplaceGroup();
    L133:
        r73.invoke($composer2, Integer.valueOf(($dirty2 >> 27) & 14));
        if (formatterEndDate2 == null) goto L136;
        $composer2.startReplaceGroup(303729431);
        ComposerKt.sourceInformation($composer2, "470@21666L29");
        TextKt.m2820Text4IGK_g(formatterEndDate2, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 0, 0, 131070);
        $composer2.endReplaceGroup();
    L137:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
        goto L140
    L136:
        $composer2.startReplaceGroup(303795616);
        ComposerKt.sourceInformation($composer2, "472@21733L20");
        r72.invoke($composer2, Integer.valueOf(($dirty2 >> 24) & 14));
        $composer2.endReplaceGroup();
        goto L137
    L132:
        $composer2.startReplaceGroup(303604222);
        ComposerKt.sourceInformation($composer2, "466@21540L22");
        r71.invoke($composer2, Integer.valueOf(($dirty2 >> 21) & 14));
        $composer2.endReplaceGroup();
    L128:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r20);
        goto L129
    L120:
        r18 = r19;
        $composer2.useNode();
    L113:
        value$iv = (Function1) new DateRangePickerDefaults$DateRangePickerHeadline$4$1(startHeadlineDescription, endHeadlineDescription);
        $composer2.updateRememberedValue(value$iv);
        goto L114
    L99:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L102;
        $composer2.startReplaceGroup(1063182274);
        ComposerKt.sourceInformation($composer2, "446@20664L51");
        Strings.Companion r24 = Strings.Companion;
        verboseEndDateDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_no_selection_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L106
    L102:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L104;
        $composer2.startReplaceGroup(1063185245);
        ComposerKt.sourceInformation($composer2, "447@20757L46");
        Strings.Companion r25 = Strings.Companion;
        verboseEndDateDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_no_input_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L106
    L104:
        $composer2.startReplaceGroup(-1400922737);
        $composer2.endReplaceGroup();
        goto L106
    L89:
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L91;
        $composer2.startReplaceGroup(1063166242);
        ComposerKt.sourceInformation($composer2, "434@20163L51");
        Strings.Companion r26 = Strings.Companion;
        formatterEndDate2 = formatterEndDate;
        verboseStartDateDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_no_selection_description), $composer2, 0);
        $composer2.endReplaceGroup();
        goto L96
    L91:
        formatterEndDate2 = formatterEndDate;
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2195getInputjFl4v0()) == false) goto L94;
        $composer2.startReplaceGroup(1063169213);
        ComposerKt.sourceInformation($composer2, "435@20256L46");
        Strings.Companion r27 = Strings.Companion;
        String r28 = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_no_input_description), $composer2, 0);
        $composer2.endReplaceGroup();
        verboseStartDateDescription = r28;
        goto L96
    L94:
        $composer2.startReplaceGroup(-1401419729);
        $composer2.endReplaceGroup();
        verboseStartDateDescription = "";
        goto L96
    }
}
