package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a°\u0001\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001a`\u0010/\u001a\u00020\f2\n\u00100\u001a\u000601j\u0002`22\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a½\u0001\u0010:\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002072:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a°\u0001\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010A\u001a.\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010\u000b\u001a\u00020@2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0002\u001aT\u0010J\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001ae\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010P\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 H\u0002¢\u0006\u0002\u0010Q\u001a&\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "selectedStartDateMillis", "", "selectedEndDateMillis", "displayedMonthMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "displayMode", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DateRangePickerKt {
    private static final PaddingValues CalendarMonthSubheadPadding = null;
    private static final PaddingValues DateRangePickerHeadlinePadding = null;
    private static final PaddingValues DateRangePickerTitlePadding = null;
    private static final float HeaderHeightOffset = 0.0f;

    public static final /* synthetic */ void access$DateRangePickerContent(Long selectedStartDateMillis, Long selectedEndDateMillis, long displayedMonthMillis, Function2 onDatesSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed) {
        DateRangePickerContent(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, onDatesSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final /* synthetic */ void m2173access$SwitchableDateEntryContentRN2D1Q(Long selectedStartDateMillis, Long selectedEndDateMillis, long displayedMonthMillis, int displayMode, Function2 onDatesSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed, int $changed1) {
        m2172SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, displayMode, onDatesSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed, $changed1);
    }

    public static final /* synthetic */ void access$VerticalMonthsList(LazyListState lazyListState, Long selectedStartDateMillis, Long selectedEndDateMillis, Function2 onDatesSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed) {
        VerticalMonthsList(lazyListState, selectedStartDateMillis, selectedEndDateMillis, onDatesSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed);
    }

    public static final /* synthetic */ List access$customScrollActions(LazyListState state, CoroutineScope coroutineScope, String scrollUpLabel, String scrollDownLabel) {
        return customScrollActions(state, coroutineScope, scrollUpLabel, scrollDownLabel);
    }

    public static final /* synthetic */ PaddingValues access$getDateRangePickerHeadlinePadding$p() {
        return DateRangePickerHeadlinePadding;
    }

    public static final /* synthetic */ PaddingValues access$getDateRangePickerTitlePadding$p() {
        return DateRangePickerTitlePadding;
    }

    public static final /* synthetic */ void access$updateDateSelection(long dateInMillis, Long currentStartDateMillis, Long currentEndDateMillis, Function2 onDatesSelectionChange) {
        updateDateSelection(dateInMillis, currentStartDateMillis, currentEndDateMillis, onDatesSelectionChange);
    }

    public static final void DateRangePicker(final DateRangePickerState state, Modifier modifier, DatePickerFormatter dateFormatter, Function2<? super Composer, ? super Integer, Unit> r30, Function2<? super Composer, ? super Integer, Unit> r31, boolean showModeToggle, DatePickerColors colors, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(650830774);
        ComposerKt.sourceInformation($composer2, "C(DateRangePicker)P(5,3,1,6,2,4)95@4412L47,96@4500L185,102@4729L352,112@5169L8,114@5206L15,115@5246L62,132@5955L5,136@6111L1139,116@5313L1937:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r36 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r36 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
    L35:
        int r7 = r36 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r9 = r30;
    L46:
        int r10 = r36 & 16;
        if (r10 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r11 = r31;
    L57:
        int r12 = r36 & 32;
        if (r12 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean showModeToggle2 = showModeToggle;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        DatePickerColors r14 = colors;
    L80:
        if ((599187 & $dirty) == 599186) goto L82;
    L85:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L88;
    L97:
        if (r5 == 0) goto L100;
        modifier2 = Modifier.Companion;
    L100:
        if ((r36 & 4) == 0) goto L106;
        ComposerKt.sourceInformationMarkerStart($composer2, -1454781303, "CC(remember):DateRangePicker.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L104;
        Object value$iv = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
        $composer2.updateRememberedValue(value$iv);
    L105:
        final DatePickerFormatter dateFormatter2 = (DatePickerFormatter) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-897);
    L107:
        if (r7 == 0) goto L109;
        boolean r4 = true;
        int r8 = 54;
        r9 = ComposableLambdaKt.rememberComposableLambda(-162164694, true, new AnonymousClass2(state), $composer2, 54);
    L110:
        if (r10 == 0) goto L112;
        r11 = ComposableLambdaKt.rememberComposableLambda(-185279404, r4, new AnonymousClass3(state, dateFormatter2), $composer2, r8);
    L112:
        if (r12 == 0) goto L115;
        showModeToggle2 = true;
    L115:
        if ((r36 & 64) == 0) goto L117;
        $dirty = $dirty & (-3670017);
        boolean r13 = showModeToggle2;
        final DatePickerColors colors2 = DatePickerDefaults.INSTANCE.colors($composer2, 6);
        boolean showModeToggle3 = r13;
        Function2<? super Composer, ? super Integer, Unit> r15 = r9;
        Modifier modifier3 = modifier2;
    L118:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L121;
        ComposerKt.traceEventStart(650830774, $dirty, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:113)");
    L121:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -1454754600, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(defaultLocale);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L127;
        boolean showModeToggle4 = showModeToggle3;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L128;
        Object value$iv2 = it$iv2;
    L129:
        final CalendarModel calendarModel = (CalendarModel) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(-1454747621);
        ComposerKt.sourceInformation($composer2, "122@5491L323");
        if (showModeToggle4 == false) goto L132;
        ComposableLambda r16 = ComposableLambdaKt.rememberComposableLambda(-1490010652, true, new AnonymousClass4(state), $composer2, 54);
    L133:
        $composer2.endReplaceGroup();
        TextStyle r17 = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), $composer2, 6);
        float arg0$iv = DatePickerModalTokens.INSTANCE.m3277getRangeSelectionHeaderContainerHeightD9Ej5fM();
        float other$iv = HeaderHeightOffset;
        DatePickerFormatter dateFormatter3 = dateFormatter2;
        Composer $composer3 = $composer2;
        DatePickerKt.m2153DateEntryContainerau3_HiA(modifier3, r15, r11, r16, colors2, r17, Dp.m6973constructorimpl(arg0$iv - other$iv), ComposableLambdaKt.rememberComposableLambda(-57534331, true, new AnonymousClass5(state, calendarModel, dateFormatter2, colors2), $composer2, 54), $composer3, ((((($dirty >> 3) & 14) | 14155776) | (($dirty >> 6) & 112)) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventEnd();
    L136:
        final Function2<? super Composer, ? super Integer, Unit> r6 = r15;
        final boolean showModeToggle5 = showModeToggle4;
        final Modifier modifier4 = modifier3;
        final DatePickerColors colors3 = colors2;
        final DatePickerFormatter dateFormatter4 = dateFormatter3;
        final Function2<? super Composer, ? super Integer, Unit> r18 = r11;
    L137:
        ScopeUpdateScope r19 = $composer3.endRestartGroup();
        if (r19 == null) goto L141;
        r19.updateScope(new AnonymousClass6(state, modifier4, dateFormatter4, r6, r18, showModeToggle5, colors3, $changed, r36));
        return;
    L141:
        return;
    L132:
        r16 = null;
    L128:
        value$iv2 = CalendarModel_androidKt.createCalendarModel(defaultLocale);
        $composer2.updateRememberedValue(value$iv2);
        goto L129
    L127:
        showModeToggle4 = showModeToggle3;
        goto L128
    L117:
        $dirty = $dirty;
        r15 = r9;
        showModeToggle3 = showModeToggle2;
        colors2 = r14;
        modifier3 = modifier2;
        goto L118
    L109:
        r4 = true;
        r8 = 54;
        goto L110
    L104:
        value$iv = it$iv;
        goto L105
    L106:
        dateFormatter2 = dateFormatter;
        goto L107
    L88:
        if ($composer2.getDefaultsInvalid() == true) goto L97;
        $composer2.skipToGroupEnd();
        if ((r36 & 4) == 0) goto L94;
        $dirty = $dirty & (-897);
    L94:
        if ((r36 & 64) == 0) goto L96;
        dateFormatter2 = dateFormatter;
        $dirty = $dirty & (-3670017);
        r15 = r9;
        showModeToggle3 = showModeToggle2;
        colors2 = r14;
        modifier3 = modifier2;
        goto L118
    L96:
        dateFormatter2 = dateFormatter;
        r15 = r9;
        showModeToggle3 = showModeToggle2;
        colors2 = r14;
        modifier3 = modifier2;
        goto L118
    L82:
        if ($composer2.getSkipping() == false) goto L85;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        r6 = r9;
        showModeToggle5 = showModeToggle2;
        colors3 = r14;
        dateFormatter4 = dateFormatter;
        r18 = r11;
        goto L137
    L71:
        if ((r36 & 64) != 0) goto L75;
        r14 = colors;
        if ($composer2.changed(r14) == false) goto L76;
        int r110 = 1048576;
    L77:
        $dirty = $dirty | r110;
    L76:
        r110 = 524288;
        goto L77
    L75:
        r14 = colors;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        showModeToggle2 = showModeToggle;
        if ($composer2.changed(showModeToggle2) == false) goto L65;
        int r111 = 131072;
    L66:
        $dirty = $dirty | r111;
        goto L69
    L65:
        r111 = 65536;
        goto L66
    L67:
        showModeToggle2 = showModeToggle;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = r31;
        if ($composer2.changedInstance(r11) == false) goto L54;
        int r112 = 16384;
    L55:
        $dirty = $dirty | r112;
        goto L57
    L54:
        r112 = 8192;
        goto L55
    L56:
        r11 = r31;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = r30;
        if ($composer2.changedInstance(r9) == false) goto L43;
        int r113 = 2048;
    L44:
        $dirty = $dirty | r113;
        goto L46
    L43:
        r113 = 1024;
        goto L44
    L45:
        r9 = r30;
        goto L46
    L26:
        if ((r36 & 4) == 0) goto L28;
    L33:
        int r20 = 128;
    L34:
        $dirty = $dirty | r20;
        goto L35
    L28:
        if (($changed & 512) != 0) goto L30;
        boolean r21 = $composer2.changed(dateFormatter);
    L31:
        if (r21 == false) goto L33;
        r20 = 256;
        goto L34
    L30:
        r21 = $composer2.changedInstance(dateFormatter);
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r22 = 32;
    L21:
        $dirty = $dirty | r22;
        goto L24
    L20:
        r22 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(state) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L12
    L10:
        r23 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m2175rememberDateRangePickerStateIlFM19s(Long initialSelectedStartDateMillis, Long initialSelectedEndDateMillis, Long initialDisplayedMonthMillis, IntRange yearRange, int initialDisplayMode, SelectableDates selectableDates, Composer $composer, int $changed, int r26) {
        ComposerKt.sourceInformationMarkerStart($composer, -2012087461, "C(rememberDateRangePickerState)P(3,2,1,5,0:c#material3.DisplayMode)262@11757L15,*263@11866L475,263@11784L557:DateRangePicker.kt#uh7d8r");
        if ((r26 & 1) == 0) goto L5;
        final Long initialSelectedStartDateMillis2 = null;
    L7:
        if ((r26 & 2) == 0) goto L9;
        final Long initialSelectedEndDateMillis2 = null;
    L11:
        if ((r26 & 4) == 0) goto L13;
        final Long initialDisplayedMonthMillis2 = initialSelectedStartDateMillis2;
    L15:
        if ((r26 & 8) == 0) goto L17;
        final IntRange yearRange2 = DatePickerDefaults.INSTANCE.getYearRange();
    L19:
        if ((r26 & 16) == 0) goto L21;
        final int initialDisplayMode2 = DisplayMode.Companion.m2196getPickerjFl4v0();
    L23:
        if ((r26 & 32) == 0) goto L25;
        final SelectableDates selectableDates2 = DatePickerDefaults.INSTANCE.getAllDates();
    L27:
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventStart(-2012087461, $changed, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
    L29:
        final Locale locale = CalendarLocale_androidKt.defaultLocale($composer, 0);
        Object[] r0 = new Object[0];
        Saver<DateRangePickerStateImpl, Object> r3 = DateRangePickerStateImpl.Companion.Saver(selectableDates2, locale);
        ComposerKt.sourceInformationMarkerStart($composer, -250595201, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean r8 = true;
        if ((($changed & 14) ^ 6) <= 4) goto L34;
        if ($composer.changed(initialSelectedStartDateMillis2) == false) goto L34;
    L35:
        boolean r5 = true;
    L38:
        if ((($changed & 112) ^ 48) <= 32) goto L42;
        if ($composer.changed(initialSelectedEndDateMillis2) == false) goto L42;
    L43:
        boolean r1 = true;
    L45:
        boolean r2 = r1 | r5;
        if ((($changed & 896) ^ 384) <= 256) goto L50;
        if ($composer.changed(initialDisplayedMonthMillis2) == false) goto L50;
    L51:
        boolean r6 = true;
    L53:
        boolean r4 = (r2 | r6) | $composer.changedInstance(yearRange2);
        if (((57344 & $changed) ^ 24576) <= 16384) goto L58;
        if ($composer.changed(initialDisplayMode2) == false) goto L58;
    L59:
        boolean r7 = true;
    L61:
        boolean r9 = r4 | r7;
        if (((458752 & $changed) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) goto L66;
        if ($composer.changed(selectableDates2) == false) goto L66;
    L69:
        boolean invalid$iv = (r9 | r8) | $composer.changedInstance(locale);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L72;
    L75:
        Object value$iv = (Function0) new DateRangePickerKt$rememberDateRangePickerState$1$1(initialSelectedStartDateMillis2, initialSelectedEndDateMillis2, initialDisplayedMonthMillis2, yearRange2, initialDisplayMode2, selectableDates2, locale);
        $composer.updateRememberedValue(value$iv);
    L76:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object r10 = RememberSaveableKt.m3923rememberSaveable(r0, r3, null, (Function0) value$iv, $composer, 0, 4);
        DateRangePickerStateImpl $this$rememberDateRangePickerState_IlFM19s_u24lambda_u243 = (DateRangePickerStateImpl) r10;
        $this$rememberDateRangePickerState_IlFM19s_u24lambda_u243.setSelectableDates(selectableDates2);
        DateRangePickerStateImpl r11 = (DateRangePickerStateImpl) r10;
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r11;
    L72:
        if (it$iv == Composer.Companion.getEmpty()) goto L75;
        value$iv = it$iv;
    L66:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) goto L69;
        r8 = false;
    L58:
        if (($changed & 24576) == 16384) goto L59;
        r7 = false;
    L50:
        if (($changed & 384) == 256) goto L51;
        r6 = false;
    L42:
        if (($changed & 48) == 32) goto L43;
        r1 = false;
    L34:
        if (($changed & 6) == 4) goto L35;
        r5 = false;
        goto L38
    L25:
        selectableDates2 = selectableDates;
        goto L27
    L21:
        initialDisplayMode2 = initialDisplayMode;
        goto L23
    L17:
        yearRange2 = yearRange;
        goto L19
    L13:
        initialDisplayedMonthMillis2 = initialDisplayedMonthMillis;
        goto L15
    L9:
        initialSelectedEndDateMillis2 = initialSelectedEndDateMillis;
        goto L11
    L5:
        initialSelectedStartDateMillis2 = initialSelectedStartDateMillis;
        goto L7
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m2171DateRangePickerStateHVP43zI$default(Locale r1, Long r2, Long r3, Long r4, IntRange r5, int r6, SelectableDates r7, int r8, Object r9) {
        if ((r8 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r4 = r2;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r5 = DatePickerDefaults.INSTANCE.getYearRange();
    L15:
        if ((r8 & 32) == 0) goto L18;
        r6 = DisplayMode.Companion.m2196getPickerjFl4v0();
    L18:
        if ((r8 & 64) == 0) goto L21;
        r7 = DatePickerDefaults.INSTANCE.getAllDates();
    L21:
        return m2170DateRangePickerStateHVP43zI(r1, r2, r3, r4, r5, r6, r7);
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m2170DateRangePickerStateHVP43zI(Locale locale, Long initialSelectedStartDateMillis, Long initialSelectedEndDateMillis, Long initialDisplayedMonthMillis, IntRange yearRange, int initialDisplayMode, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(initialSelectedStartDateMillis, initialSelectedEndDateMillis, initialDisplayedMonthMillis, yearRange, initialDisplayMode, selectableDates, locale, null);
    }

    /* JADX INFO: renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    private static final void m2172SwitchableDateEntryContentRN2D1Q(final Long selectedStartDateMillis, final Long selectedEndDateMillis, final long displayedMonthMillis, int displayMode, final Function2<? super Long, ? super Long, Unit> r25, final Function1<? super Long, Unit> r26, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(-532789335);
        ComposerKt.sourceInformation($composer2, "C(SwitchableDateEntryContent)P(9,8,4,3:c#material3.DisplayMode,5,6!1,10,2,7)676@30273L1249,668@30045L1477:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(selectedStartDateMillis) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L11
    L7:
        r6 = 2;
    L11:
        if (($changed & 48) != 0) goto L17;
        Long r7 = selectedEndDateMillis;
        if ($composer2.changed(r7) == false) goto L15;
        int r8 = 32;
    L16:
        $dirty = $dirty | r8;
    L19:
        if (($changed & 384) != 0) goto L25;
        long r9 = displayedMonthMillis;
        if ($composer2.changed(r9) == false) goto L23;
        int r10 = 256;
    L24:
        $dirty = $dirty | r10;
    L27:
        if (($changed & 3072) != 0) goto L33;
        int r14 = displayMode;
        if ($composer2.changed(r14) == false) goto L31;
        int r11 = 2048;
    L32:
        $dirty = $dirty | r11;
    L35:
        if (($changed & 24576) != 0) goto L41;
        Function2<? super Long, ? super Long, Unit> r12 = r25;
        if ($composer2.changedInstance(r12) == false) goto L39;
        int r13 = 16384;
    L40:
        $dirty = $dirty | r13;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        Function1<? super Long, Unit> r15 = r26;
        if ($composer2.changedInstance(r15) == false) goto L47;
        int r16 = 131072;
    L48:
        $dirty = $dirty | r16;
    L51:
        if ((1572864 & $changed) != 0) goto L57;
        CalendarModel r17 = calendarModel;
        if ($composer2.changedInstance(r17) == false) goto L55;
        int r18 = 1048576;
    L56:
        $dirty = $dirty | r18;
    L59:
        if (($changed & 12582912) != 0) goto L65;
        IntRange r4 = yearRange;
        if ($composer2.changedInstance(r4) == false) goto L63;
        int r19 = 8388608;
    L64:
        $dirty = $dirty | r19;
    L67:
        if (($changed & 100663296) != 0) goto L77;
        if (($changed & 134217728) != 0) goto L71;
        boolean r110 = $composer2.changed(dateFormatter);
    L72:
        if (r110 == false) goto L74;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L75:
        $dirty = $dirty | r111;
        goto L77
    L74:
        r111 = 33554432;
        goto L75
    L71:
        r110 = $composer2.changedInstance(dateFormatter);
    L77:
        if (($changed & 805306368) != 0) goto L85;
        if ($composer2.changed(selectableDates) == false) goto L81;
        int r112 = 536870912;
    L82:
        $dirty = $dirty | r112;
        goto L85
    L81:
        r112 = 268435456;
    L85:
        if (($changed1 & 6) != 0) goto L91;
        DatePickerColors r5 = colors;
        if ($composer2.changed(r5) == false) goto L89;
        int r113 = 4;
    L90:
        $dirty1 = $dirty1 | r113;
    L93:
        if (($dirty & 306783379) != 306783378) goto L101;
        if (($dirty1 & 3) != 2) goto L101;
        if ($composer2.getSkipping() == false) goto L101;
        $composer2.skipToGroupEnd();
        int $dirty2 = $dirty;
        Composer $composer3 = $composer2;
    L106:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L110;
        final int r20 = r14;
        r0.updateScope(new DateRangePickerKt$SwitchableDateEntryContent$3(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, r20, r25, r26, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed, $changed1));
        return;
    L110:
        return;
    L101:
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(-532789335, $dirty, $dirty1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:665)");
    L103:
        int $dirty3 = $dirty;
        SpringSpec r1 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        Modifier r114 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DateRangePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null);
        final long r2 = r9;
        final IntRange r21 = r4;
        final Long r3 = r7;
        final Function1<? super Long, Unit> r22 = r15;
        final CalendarModel r23 = r17;
        $dirty2 = $dirty3;
        final DatePickerColors r115 = r5;
        final Function2<? super Long, ? super Long, Unit> r24 = r12;
        CrossfadeKt.Crossfade(DisplayMode.m2188boximpl(r14), r114, r1, null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new DateRangePickerKt$SwitchableDateEntryContent$2(selectedStartDateMillis, r3, r2, r24, r22, r23, r21, dateFormatter, selectableDates, r115), $composer2, 54), $composer2, (($dirty2 >> 9) & 14) | 24960, 8);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
        goto L106
    L89:
        r113 = 2;
        goto L90
    L91:
        r5 = colors;
        goto L93
    L63:
        r19 = 4194304;
        goto L64
    L65:
        r4 = yearRange;
        goto L67
    L55:
        r18 = 524288;
        goto L56
    L57:
        r17 = calendarModel;
        goto L59
    L47:
        r16 = 65536;
        goto L48
    L49:
        r15 = r26;
        goto L51
    L39:
        r13 = 8192;
        goto L40
    L41:
        r12 = r25;
        goto L43
    L31:
        r11 = 1024;
        goto L32
    L33:
        r14 = displayMode;
        goto L35
    L23:
        r10 = 128;
        goto L24
    L25:
        r9 = displayedMonthMillis;
        goto L27
    L15:
        r8 = 16;
        goto L16
    L17:
        r7 = selectedEndDateMillis;
        goto L19
    }

    private static final void DateRangePickerContent(final Long selectedStartDateMillis, final Long selectedEndDateMillis, final long displayedMonthMillis, final Function2<? super Long, ? super Long, Unit> r39, final Function1<? super Long, Unit> r40, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-787063721);
        ComposerKt.sourceInformation($composer2, "C(DateRangePickerContent)P(8,7,3,4,5!1,9,2,6)722@32197L64,725@32351L309,725@32324L336,733@32666L648:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(selectedStartDateMillis) == false) goto L7;
        int r12 = 4;
    L8:
        $dirty = $dirty | r12;
        goto L11
    L7:
        r12 = 2;
    L11:
        if (($changed & 48) != 0) goto L17;
        Long r13 = selectedEndDateMillis;
        if ($composer2.changed(r13) == false) goto L15;
        int r14 = 32;
    L16:
        $dirty = $dirty | r14;
    L19:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changed(displayedMonthMillis) == false) goto L23;
        int r15 = 256;
    L24:
        $dirty = $dirty | r15;
        goto L26
    L23:
        r15 = 128;
    L26:
        if (($changed & 3072) != 0) goto L32;
        Function2<? super Long, ? super Long, Unit> r16 = r39;
        if ($composer2.changedInstance(r16) == false) goto L30;
        int r17 = 2048;
    L31:
        $dirty = $dirty | r17;
    L34:
        if (($changed & 24576) != 0) goto L40;
        Function1<? super Long, Unit> r18 = r40;
        if ($composer2.changedInstance(r18) == false) goto L38;
        int r19 = 16384;
    L39:
        $dirty = $dirty | r19;
    L42:
        if ((196608 & $changed) != 0) goto L49;
        if ($composer2.changedInstance(calendarModel) == false) goto L46;
        int r110 = 131072;
    L47:
        $dirty = $dirty | r110;
        goto L49
    L46:
        r110 = 65536;
    L49:
        if ((1572864 & $changed) != 0) goto L56;
        if ($composer2.changedInstance(yearRange) == false) goto L53;
        int r111 = 1048576;
    L54:
        $dirty = $dirty | r111;
        goto L56
    L53:
        r111 = 524288;
    L56:
        if ((12582912 & $changed) != 0) goto L66;
        if ((16777216 & $changed) != 0) goto L60;
        boolean r112 = $composer2.changed(dateFormatter);
    L61:
        if (r112 == false) goto L63;
        int r113 = 8388608;
    L64:
        $dirty = $dirty | r113;
        goto L66
    L63:
        r113 = 4194304;
        goto L64
    L60:
        r112 = $composer2.changedInstance(dateFormatter);
    L66:
        if ((100663296 & $changed) != 0) goto L74;
        if ($composer2.changed(selectableDates) == false) goto L70;
        int r114 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r114;
        goto L74
    L70:
        r114 = 33554432;
    L74:
        if (($changed & 805306368) != 0) goto L81;
        if ($composer2.changed(colors) == false) goto L78;
        int r115 = 536870912;
    L79:
        $dirty = $dirty | r115;
        goto L81
    L78:
        r115 = 268435456;
    L81:
        if (($dirty & 306783379) != 306783378) goto L87;
        if ($composer2.getSkipping() == false) goto L87;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L114:
        ScopeUpdateScope r116 = $composer3.endRestartGroup();
        if (r116 == null) goto L118;
        r116.updateScope(new C05123(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, r39, r40, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L118:
        return;
    L87:
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventStart(-787063721, $dirty, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:719)");
    L89:
        CalendarMonth displayedMonth = calendarModel.getMonth(displayedMonthMillis);
        int monthIndex = RangesKt.coerceAtLeast(displayedMonth.indexIn(yearRange), 0);
        LazyListState monthsListState = LazyListStateKt.rememberLazyListState(monthIndex, 0, $composer2, 0, 2);
        Integer r0 = Integer.valueOf(monthIndex);
        ComposerKt.sourceInformationMarkerStart($composer2, -1097467628, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(monthsListState) | $composer2.changed(monthIndex);
        DateRangePickerKt$DateRangePickerContent$1$1 value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L92;
    L95:
        value$iv = new DateRangePickerKt$DateRangePickerContent$1$1(monthsListState, monthIndex, null);
        $composer2.updateRememberedValue(value$iv);
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r0, (Function2) value$iv, $composer2, 0);
        Modifier modifier$iv = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        int $changed$iv = ((6 >> 3) & 14) | ((6 >> 3) & 112);
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, $changed$iv);
        int $changed$iv$iv = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r117 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L99;
        ComposablesKt.invalidApplier();
    L99:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L102;
        Function0<ComposeUiNode> r1 = r117;
        $composer2.createNode(r1);
    L103:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L109;
        $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L111;
    L110:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
    L111:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r3 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r4 = ColumnScopeInstance.INSTANCE;
        int r28 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 556963099, "C734@32754L31,735@32794L514:DateRangePicker.kt#uh7d8r");
        DatePickerKt.WeekDays(colors, calendarModel, $composer$iv, (($dirty >> 27) & 14) | (($dirty >> 12) & 112));
        Long r7 = r13;
        Function1<? super Long, Unit> r9 = r18;
        Function2<? super Long, ? super Long, Unit> r8 = r16;
        VerticalMonthsList(monthsListState, selectedStartDateMillis, r7, r8, r9, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer$iv, ((((((((($dirty << 3) & 112) | (($dirty << 3) & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventEnd();
        goto L114
    L109:
        $composer3 = $composer2;
        goto L110
    L102:
        r1 = r117;
        $composer2.useNode();
        goto L103
    L92:
        if (value$iv != Composer.Companion.getEmpty()) goto L96;
    L38:
        r19 = 8192;
        goto L39
    L40:
        r18 = r40;
        goto L42
    L30:
        r17 = 1024;
        goto L31
    L32:
        r16 = r39;
        goto L34
    L15:
        r14 = 16;
        goto L16
    L17:
        r13 = selectedEndDateMillis;
        goto L19
    }

    private static final void VerticalMonthsList(final LazyListState lazyListState, final Long selectedStartDateMillis, final Long selectedEndDateMillis, final Function2<? super Long, ? super Long, Unit> r24, final Function1<? super Long, Unit> r25, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        final LazyListState r1 = lazyListState;
        Composer $composer2 = $composer.startRestartGroup(1257365001);
        ComposerKt.sourceInformation($composer2, "C(VerticalMonthsList)P(3,8,7,4,5!1,9,2,6)770@34042L158,776@34262L5,776@34269L3748,776@34205L3812,853@38052L228,853@38022L258:DateRangePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(r1) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) != 0) goto L16;
        Long r4 = selectedStartDateMillis;
        if ($composer2.changed(r4) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
    L18:
        if (($changed & 384) != 0) goto L24;
        Long r6 = selectedEndDateMillis;
        if ($composer2.changed(r6) == false) goto L22;
        int r7 = 256;
    L23:
        $dirty = $dirty | r7;
    L26:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r24) == false) goto L30;
        int r9 = 2048;
    L31:
        $dirty = $dirty | r9;
        goto L34
    L30:
        r9 = 1024;
    L34:
        if (($changed & 24576) != 0) goto L42;
        if ($composer2.changedInstance(r25) == false) goto L38;
        int r10 = 16384;
    L39:
        $dirty = $dirty | r10;
        goto L42
    L38:
        r10 = 8192;
    L42:
        if ((196608 & $changed) != 0) goto L49;
        if ($composer2.changedInstance(calendarModel) == false) goto L46;
        int r11 = 131072;
    L47:
        $dirty = $dirty | r11;
        goto L49
    L46:
        r11 = 65536;
    L49:
        if ((1572864 & $changed) != 0) goto L56;
        if ($composer2.changedInstance(yearRange) == false) goto L53;
        int r12 = 1048576;
    L54:
        $dirty = $dirty | r12;
        goto L56
    L53:
        r12 = 524288;
    L56:
        if ((12582912 & $changed) != 0) goto L66;
        if ((16777216 & $changed) != 0) goto L60;
        boolean r13 = $composer2.changed(dateFormatter);
    L61:
        if (r13 == false) goto L63;
        int r14 = 8388608;
    L64:
        $dirty = $dirty | r14;
        goto L66
    L63:
        r14 = 4194304;
        goto L64
    L60:
        r13 = $composer2.changedInstance(dateFormatter);
    L66:
        if ((100663296 & $changed) != 0) goto L72;
        final SelectableDates r15 = selectableDates;
        if ($composer2.changed(r15) == false) goto L70;
        int r16 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r16;
    L74:
        if ((805306368 & $changed) != 0) goto L82;
        if ($composer2.changed(colors) == false) goto L78;
        int r17 = 536870912;
    L79:
        $dirty = $dirty | r17;
        goto L82
    L78:
        r17 = 268435456;
    L82:
        if (($dirty & 306783379) != 306783378) goto L88;
        if ($composer2.getSkipping() == false) goto L88;
        $composer2.skipToGroupEnd();
    L115:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L119;
        r18.updateScope(new C05133(r1, selectedStartDateMillis, selectedEndDateMillis, r24, r25, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L119:
        return;
    L88:
        if (ComposerKt.isTraceInProgress() == false) goto L90;
        ComposerKt.traceEventStart(1257365001, $dirty, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:767)");
    L90:
        final CalendarDate today = calendarModel.getToday();
        ComposerKt.sourceInformationMarkerStart($composer2, -2140145208, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(yearRange);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L93;
    L96:
        value$iv = calendarModel.getMonth(yearRange.getFirst(), 1);
        $composer2.updateRememberedValue(value$iv);
    L97:
        final CalendarMonth firstMonth = (CalendarMonth) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty2 = $dirty;
        final Long r2 = r4;
        final Long r8 = r6;
        TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), $composer2, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new AnonymousClass1(r2, r8, r24, lazyListState, yearRange, calendarModel, firstMonth, dateFormatter, colors, today, r15), $composer2, 54), $composer2, 48);
        ComposerKt.sourceInformationMarkerStart($composer2, -2140016818, "CC(remember):DateRangePicker.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L100;
        boolean r0 = true;
    L102:
        if ((57344 & $dirty2) != 16384) goto L104;
        boolean r19 = true;
    L105:
        boolean invalid$iv2 = ((r0 | r19) | $composer2.changedInstance(calendarModel)) | $composer2.changedInstance(yearRange);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L108;
    L111:
        r1 = lazyListState;
        DateRangePickerKt$VerticalMonthsList$2$1 value$iv2 = new DateRangePickerKt$VerticalMonthsList$2$1(r1, r25, calendarModel, yearRange, null);
        $composer2.updateRememberedValue(value$iv2);
    L112:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r1, (Function2) value$iv2, $composer2, $dirty2 & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
        goto L115
    L108:
        if (it$iv == Composer.Companion.getEmpty()) goto L111;
        r1 = lazyListState;
        value$iv2 = it$iv;
        goto L112
    L104:
        r19 = false;
        goto L105
    L100:
        r0 = false;
        goto L102
    L93:
        if (value$iv != Composer.Companion.getEmpty()) goto L97;
    L70:
        r16 = 33554432;
        goto L71
    L72:
        r15 = selectableDates;
        goto L74
    L22:
        r7 = 128;
        goto L23
    L24:
        r6 = selectedEndDateMillis;
        goto L26
    L14:
        r5 = 16;
        goto L15
    L16:
        r4 = selectedStartDateMillis;
        goto L18
    }

    private static final void updateDateSelection(long dateInMillis, Long currentStartDateMillis, Long currentEndDateMillis, Function2<? super Long, ? super Long, Unit> r7) {
        if (currentStartDateMillis != null) goto L5;
        if (currentEndDateMillis != null) goto L5;
    L7:
        r7.invoke(Long.valueOf(dateInMillis), null);
        return;
    L5:
        if (currentStartDateMillis == null) goto L8;
        if (currentEndDateMillis != null) goto L7;
    L8:
        if (currentStartDateMillis != null) goto L10;
    L12:
        r7.invoke(Long.valueOf(dateInMillis), null);
        return;
    L10:
        if (dateInMillis < currentStartDateMillis.longValue()) goto L12;
        r7.invoke(currentStartDateMillis, Long.valueOf(dateInMillis));
    }

    static {
        CalendarMonthSubheadPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(24), Dp.m6973constructorimpl(20), 0.0f, Dp.m6973constructorimpl(8), 4, null);
        DateRangePickerTitlePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(64), 0.0f, Dp.m6973constructorimpl(12), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(64), 0.0f, Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(12), 2, null);
        HeaderHeightOffset = Dp.m6973constructorimpl(60);
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* JADX INFO: renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m2174drawRangeBackgroundmxwnekA(ContentDrawScope $this$drawRangeBackground_u2dmxwnekA, SelectedRangeInfo selectedRangeInfo, long color) {
        ContentDrawScope r0 = $this$drawRangeBackground_u2dmxwnekA;
        float itemContainerWidth = r0.mo376toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float itemContainerHeight = r0.mo376toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float itemStateLayerHeight = r0.mo376toPx0680j_4(DatePickerModalTokens.INSTANCE.m3270getDateStateLayerHeightD9Ej5fM());
        float stateLayerVerticalPadding = (itemContainerHeight - itemStateLayerHeight) / 2.0f;
        float horizontalSpaceBetweenItems = (Size.m4194getWidthimpl(r0.mo4917getSizeNHjbRc()) - (7.0f * itemContainerWidth)) / 7.0f;
        long r7 = selectedRangeInfo.m2598getGridStartCoordinatesnOccac();
        int r9 = IntOffset.m7101getXimpl(r7);
        int y1 = IntOffset.m7102getYimpl(r7);
        long r10 = selectedRangeInfo.m2597getGridEndCoordinatesnOccac();
        int r8 = IntOffset.m7101getXimpl(r10);
        int y2 = IntOffset.m7102getYimpl(r10);
        float r11 = r9 * (itemContainerWidth + horizontalSpaceBetweenItems);
        if (selectedRangeInfo.getFirstIsSelectionStart() == false) goto L5;
        float r12 = itemContainerWidth / 2.0f;
    L6:
        float startX = (r11 + r12) + (horizontalSpaceBetweenItems / 2.0f);
        float startY = (y1 * itemContainerHeight) + stateLayerVerticalPadding;
        float r14 = r8 * (itemContainerWidth + horizontalSpaceBetweenItems);
        if (selectedRangeInfo.getLastIsSelectionEnd() == false) goto L9;
        float r15 = itemContainerWidth / 2.0f;
    L10:
        float endX = (r14 + r15) + (horizontalSpaceBetweenItems / 2.0f);
        float endY = (y2 * itemContainerHeight) + stateLayerVerticalPadding;
        if (r0.getLayoutDirection() != LayoutDirection.Rtl) goto L13;
        boolean isRtl = true;
    L14:
        if (isRtl == false) goto L16;
        startX = Size.m4194getWidthimpl(r0.mo4917getSizeNHjbRc()) - startX;
        endX = Size.m4194getWidthimpl(r0.mo4917getSizeNHjbRc()) - endX;
    L16:
        ContentDrawScope r18 = r0;
        long r21 = OffsetKt.Offset(startX, startY);
        if (y1 != y2) goto L19;
        float r16 = endX - startX;
    L22:
        DrawScope.m4911drawRectnJ9OG0$default(r18, color, r21, SizeKt.Size(r16, itemStateLayerHeight), 0.0f, null, null, 0, 120, null);
        if (y1 == y2) goto L37;
        int y = (y2 - y1) - 1;
    L25:
        if (y <= 0) goto L28;
        DrawScope.m4911drawRectnJ9OG0$default(r0, color, OffsetKt.Offset(0.0f, (y * itemContainerHeight) + startY), SizeKt.Size(Size.m4194getWidthimpl($this$drawRangeBackground_u2dmxwnekA.mo4917getSizeNHjbRc()), itemStateLayerHeight), 0.0f, null, null, 0, 120, null);
        y = y - 1;
        r0 = $this$drawRangeBackground_u2dmxwnekA;
        itemContainerWidth = itemContainerWidth;
        goto L25
    L28:
        if ($this$drawRangeBackground_u2dmxwnekA.getLayoutDirection() != LayoutDirection.Ltr) goto L30;
        float topLeftX = 0.0f;
    L31:
        ContentDrawScope r31 = $this$drawRangeBackground_u2dmxwnekA;
        long r34 = OffsetKt.Offset(topLeftX, endY);
        if (isRtl == false) goto L34;
        float r1 = endX - Size.m4194getWidthimpl($this$drawRangeBackground_u2dmxwnekA.mo4917getSizeNHjbRc());
    L35:
        DrawScope.m4911drawRectnJ9OG0$default(r31, color, r34, SizeKt.Size(r1, itemStateLayerHeight), 0.0f, null, null, 0, 120, null);
        return;
    L34:
        r1 = endX;
        goto L35
    L30:
        topLeftX = Size.m4194getWidthimpl($this$drawRangeBackground_u2dmxwnekA.mo4917getSizeNHjbRc());
        goto L31
    L37:
        return;
    L19:
        if (isRtl == false) goto L21;
        r16 = -startX;
        goto L22
    L21:
        r16 = Size.m4194getWidthimpl(r0.mo4917getSizeNHjbRc()) - startX;
        goto L22
    L13:
        isRtl = false;
        goto L14
    L9:
        r15 = itemContainerWidth;
        goto L10
    L5:
        r12 = 0.0f;
        goto L6
    }

    private static final List<CustomAccessibilityAction> customScrollActions(final LazyListState state, final CoroutineScope coroutineScope, String scrollUpLabel, String scrollDownLabel) {
        return CollectionsKt.listOf(new CustomAccessibilityAction[]{new CustomAccessibilityAction(scrollUpLabel, new DateRangePickerKt$customScrollActions$scrollUpAction$1(state, coroutineScope)), new CustomAccessibilityAction(scrollDownLabel, new DateRangePickerKt$customScrollActions$scrollDownAction$1(state, coroutineScope))});
    }
}
