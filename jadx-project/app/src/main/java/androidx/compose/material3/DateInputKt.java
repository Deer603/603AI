package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
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
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001ad\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\u0098\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010 ¢\u0006\u0002\b!2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010 ¢\u0006\u0002\b!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\n\u0010)\u001a\u00060*j\u0002`+2\u0006\u0010\u0018\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006.²\u0006\n\u0010/\u001a\u000200X\u008a\u008e\u0002"}, d2 = {"InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "DateInputContent", "", "selectedDateMillis", "", "onDateSelectionChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "modifier", "Landroidx/compose/ui/Modifier;", "initialDateMillis", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "dateInputValidator", "Landroidx/compose/material3/DateInputValidator;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "DateInputTextField-tQNruF0", "(Landroidx/compose/ui/Modifier;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/internal/DateInputFormat;Ljava/util/Locale;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "material3_release", "text", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding = null;
    private static final float InputTextNonErroneousBottomPadding = 0.0f;

    public static final /* synthetic */ void access$DateInputTextField_tQNruF0$lambda$5(MutableState $text$delegate, TextFieldValue value) {
        DateInputTextField_tQNruF0$lambda$5($text$delegate, value);
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final void DateInputContent(final Long selectedDateMillis, final Function1<? super Long, Unit> r26, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(643325609);
        ComposerKt.sourceInformation($composer2, "C(DateInputContent)P(5,3!1,6,2,4)62@2605L15,64@2655L75,65@2758L45,66@2838L44,67@2916L45,69@2999L551,82@3639L42,86@3836L164,92@4024L62,83@3686L901:DateInput.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedDateMillis) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(r26) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L18
    L14:
        r7 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(calendarModel) == false) goto L22;
        int r8 = 256;
    L23:
        $dirty = $dirty | r8;
        goto L25
    L22:
        r8 = 128;
    L25:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changedInstance(yearRange) == false) goto L29;
        int r9 = 2048;
    L30:
        $dirty = $dirty | r9;
        goto L33
    L29:
        r9 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L43;
        if (($changed & 32768) != 0) goto L37;
        boolean r10 = $composer2.changed(dateFormatter);
    L38:
        if (r10 == false) goto L40;
        int r11 = 16384;
    L41:
        $dirty = $dirty | r11;
        goto L43
    L40:
        r11 = 8192;
        goto L41
    L37:
        r10 = $composer2.changedInstance(dateFormatter);
    L43:
        if ((196608 & $changed) != 0) goto L49;
        SelectableDates r12 = selectableDates;
        if ($composer2.changed(r12) == false) goto L47;
        int r13 = 131072;
    L48:
        $dirty = $dirty | r13;
    L51:
        if ((1572864 & $changed) != 0) goto L59;
        if ($composer2.changed(colors) == false) goto L55;
        int r14 = 1048576;
    L56:
        $dirty = $dirty | r14;
        goto L59
    L55:
        r14 = 524288;
    L59:
        if ((599187 & $dirty) != 599186) goto L65;
        if ($composer2.getSkipping() == false) goto L65;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L93:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L97;
        r15.updateScope(new AnonymousClass4(selectedDateMillis, r26, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L97:
        return;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(643325609, $dirty, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
    L67:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1825155115, "CC(remember):DateInput.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(defaultLocale);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L70;
    L73:
        Object value$iv = calendarModel.getDateInputFormat(defaultLocale);
        $composer2.updateRememberedValue(value$iv);
    L74:
        DateInputFormat dateInputFormat = (DateInputFormat) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Strings.Companion r2 = Strings.Companion;
        String errorDatePattern = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_for_pattern), $composer2, 0);
        Strings.Companion r16 = Strings.Companion;
        String errorDateOutOfYearRange = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_year_range), $composer2, 0);
        Strings.Companion r17 = Strings.Companion;
        String errorInvalidNotAllowed = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_not_allowed), $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 1825166599, "CC(remember):DateInput.kt#9igjgp");
        boolean r18 = $composer2.changed(dateInputFormat);
        if ((57344 & $dirty) != 16384) goto L77;
    L82:
        boolean r19 = true;
    L83:
        boolean invalid$iv2 = r18 | r19;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L86;
    L89:
        DateInputFormat dateInputFormat2 = dateInputFormat;
        ?? r3 = 1;
        Composer $composer4 = $composer2;
        value$iv2 = new DateInputValidator(yearRange, r12, dateInputFormat2, dateFormatter, errorDatePattern, errorDateOutOfYearRange, errorInvalidNotAllowed, "", null, null, 768, null);
        $composer2.updateRememberedValue(value$iv2);
    L90:
        DateInputValidator dateInputValidator = (DateInputValidator) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer4);
        final String pattern = dateInputFormat2.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(pattern, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        Strings.Companion r4 = Strings.Companion;
        final String labelText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_label), $composer4, 0);
        Modifier r5 = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, r3, null), InputTextFieldPadding);
        int r20 = InputIdentifier.Companion.m2302getSingleDateInputJ2x2o4M();
        dateInputValidator.setCurrentStartDateMillis$material3_release(selectedDateMillis);
        Composer $composer5 = $composer4;
        m2120DateInputTextFieldtQNruF0(r5, selectedDateMillis, r26, calendarModel, ComposableLambdaKt.rememberComposableLambda(-1819015125, r3, new AnonymousClass2(labelText, pattern), $composer4, 54), ComposableLambdaKt.rememberComposableLambda(-564233108, r3, new AnonymousClass3(pattern), $composer4, 54), r20, dateInputValidator, dateInputFormat2, defaultLocale, colors, $composer5, (((($dirty << 3) & 112) | 1794054) | (($dirty << 3) & 896)) | (($dirty << 3) & 7168), ($dirty >> 18) & 14);
        $composer3 = $composer5;
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventEnd();
        goto L93
    L86:
        if (value$iv2 == Composer.Companion.getEmpty()) goto L89;
        dateInputFormat2 = dateInputFormat;
        r3 = 1;
        $composer4 = $composer2;
        goto L90
    L77:
        if (($dirty & 32768) != 0) goto L79;
    L81:
        r19 = false;
        goto L83
    L79:
        if ($composer2.changed(dateFormatter) == false) goto L81;
    L70:
        if (it$iv == Composer.Companion.getEmpty()) goto L73;
        value$iv = it$iv;
        goto L74
    L47:
        r13 = 65536;
        goto L48
    L49:
        r12 = selectableDates;
        goto L51
    }

    /* JADX INFO: renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m2120DateInputTextFieldtQNruF0(final Modifier modifier, final Long initialDateMillis, final Function1<? super Long, Unit> r45, final CalendarModel calendarModel, final Function2<? super Composer, ? super Integer, Unit> r47, final Function2<? super Composer, ? super Integer, Unit> r48, final int inputIdentifier, final DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors colors, Composer $composer, final int $changed, final int $changed1) {
        final DateInputFormat r9 = dateInputFormat;
        Composer $composer2 = $composer.startRestartGroup(-857008589);
        ComposerKt.sourceInformation($composer2, "C(DateInputTextField)P(8,4,9!1,6,10,5:c#material3.InputIdentifier,3,2,7)122@5091L39,124@5207L488,124@5155L540,142@5766L1458,188@7730L60,191@7875L59,140@5701L2642:DateInput.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(modifier) == false) goto L7;
        int r11 = 4;
    L8:
        $dirty = $dirty | r11;
        goto L11
    L7:
        r11 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(initialDateMillis) == false) goto L15;
        int r12 = 32;
    L16:
        $dirty = $dirty | r12;
        goto L18
    L15:
        r12 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        Function1<? super Long, Unit> r13 = r45;
        if ($composer2.changedInstance(r13) == false) goto L22;
        int r15 = 256;
    L23:
        $dirty = $dirty | r15;
    L26:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changedInstance(calendarModel) == false) goto L30;
        int r16 = 2048;
    L31:
        $dirty = $dirty | r16;
        goto L33
    L30:
        r16 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(r47) == false) goto L37;
        int r17 = 16384;
    L38:
        $dirty = $dirty | r17;
        goto L41
    L37:
        r17 = 8192;
    L41:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L49;
        if ($composer2.changedInstance(r48) == false) goto L45;
        int r18 = 131072;
    L46:
        $dirty = $dirty | r18;
        goto L49
    L45:
        r18 = 65536;
    L49:
        if (($changed & 1572864) != 0) goto L55;
        int r7 = inputIdentifier;
        if ($composer2.changed(r7) == false) goto L53;
        int r19 = 1048576;
    L54:
        $dirty = $dirty | r19;
    L57:
        if (($changed & 12582912) != 0) goto L65;
        if ($composer2.changed(dateInputValidator) == false) goto L61;
        int r110 = 8388608;
    L62:
        $dirty = $dirty | r110;
        goto L65
    L61:
        r110 = 4194304;
    L65:
        if (($changed & 100663296) != 0) goto L72;
        if ($composer2.changed(r9) == false) goto L69;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r111;
        goto L72
    L69:
        r111 = 33554432;
    L72:
        if (($changed & 805306368) != 0) goto L79;
        if ($composer2.changedInstance(locale) == false) goto L76;
        int r112 = 536870912;
    L77:
        $dirty = $dirty | r112;
        goto L79
    L76:
        r112 = 268435456;
    L79:
        if (($changed1 & 6) != 0) goto L87;
        if ($composer2.changed(colors) == false) goto L83;
        int r113 = 4;
    L84:
        $dirty1 = $dirty1 | r113;
        goto L87
    L83:
        r113 = 2;
    L87:
        if (($dirty & 306783379) != 306783378) goto L95;
        if (($dirty1 & 3) != 2) goto L95;
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L149:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L153;
        r14.updateScope(new DateInputKt$DateInputTextField$4(modifier, initialDateMillis, r45, calendarModel, r47, r48, inputIdentifier, dateInputValidator, r9, locale, colors, $changed, $changed1));
        return;
    L153:
        return;
    L95:
        if (ComposerKt.isTraceInProgress() == false) goto L97;
        ComposerKt.traceEventStart(-857008589, $dirty, $dirty1, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
    L97:
        MutableState errorText = (MutableState) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, DateInputKt$DateInputTextField$errorText$1.INSTANCE, $composer2, 3072, 6);
        Object[] r114 = new Object[0];
        Saver<TextFieldValue, Object> r115 = TextFieldValue.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer2, 236419420, "CC(remember):DateInput.kt#9igjgp");
        if (($dirty & 112) != 32) goto L100;
        boolean r0 = true;
    L101:
        boolean r1 = r0 | $composer2.changedInstance(calendarModel);
        if (($dirty & 234881024) != 67108864) goto L104;
        boolean r2 = true;
    L105:
        boolean invalid$iv = (r1 | r2) | $composer2.changedInstance(locale);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L108;
    L111:
        Object value$iv = (Function0) new DateInputKt$DateInputTextField$text$2$1(initialDateMillis, calendarModel, r9, locale);
        $composer2.updateRememberedValue(value$iv);
    L112:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState text$delegate = RememberSaveableKt.rememberSaveable(r114, r115, null, (Function0) value$iv, $composer2, 0, 4);
        TextFieldValue r25 = DateInputTextField_tQNruF0$lambda$4(text$delegate);
        ComposerKt.sourceInformationMarkerStart($composer2, 236438278, "CC(remember):DateInput.kt#9igjgp");
        if (($dirty & 234881024) != 67108864) goto L115;
        boolean r116 = true;
    L116:
        boolean r117 = (r116 | $composer2.changed(text$delegate)) | $composer2.changed(errorText);
        if (($dirty & 896) != 256) goto L119;
        boolean r3 = true;
    L120:
        boolean r4 = (r3 | r117) | $composer2.changedInstance(calendarModel);
        if (($dirty & 29360128) != 8388608) goto L123;
        boolean r118 = true;
    L124:
        boolean r5 = r4 | r118;
        if (($dirty & 3670016) != 1048576) goto L127;
        boolean r119 = true;
    L128:
        boolean invalid$iv2 = (r5 | r119) | $composer2.changedInstance(locale);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L131;
    L134:
        final int r6 = r7;
        final Function1<? super Long, Unit> r8 = r13;
        final MutableState errorText2 = errorText;
        int $dirty2 = $dirty;
        Object r10 = new DateInputKt$DateInputTextField$1$1(r9, errorText2, r8, calendarModel, dateInputValidator, r6, locale, text$delegate);
        r9 = r9;
        Object value$iv2 = (Function1) r10;
        $composer2.updateRememberedValue(value$iv2);
    L135:
        Function1 r20 = (Function1) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (StringsKt.isBlank((CharSequence) errorText2.getValue()) == true) goto L138;
        float r120 = Dp.m6973constructorimpl(0);
    L139:
        Modifier r21 = PaddingKt.m729paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, r120, 7, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 236499728, "CC(remember):DateInput.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changed(errorText2);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L142;
    L145:
        Object value$iv3 = (Function1) new DateInputKt$DateInputTextField$2$1(errorText2);
        $composer2.updateRememberedValue(value$iv3);
    L146:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        OutlinedTextFieldKt.OutlinedTextField(r25, r20, SemanticsModifierKt.semantics$default(r21, false, (Function1) value$iv3, 1, null), false, false, null, r47, r48, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-591991974, true, new DateInputKt$DateInputTextField$3(errorText2), $composer2, 54), !StringsKt.isBlank((CharSequence) errorText2.getValue()), new DateVisualTransformation(r9), new KeyboardOptions(0, false, KeyboardType.Companion.m6653getNumberPjHm6EE(), ImeAction.Companion.m6597getDoneeUduSuo(), null, null, null, 113, null), null, true, 0, 0, null, null, colors.getDateTextFieldColors(), $composer2, (($dirty2 << 6) & 3670016) | (($dirty2 << 6) & 29360128), 12779904, 0, 4001592);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L149;
        ComposerKt.traceEventEnd();
        goto L149
    L142:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L145;
        value$iv3 = it$iv3;
        goto L146
    L138:
        r120 = InputTextNonErroneousBottomPadding;
        goto L139
    L131:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L134;
        $dirty2 = $dirty;
        errorText2 = errorText;
        value$iv2 = it$iv2;
        goto L135
    L127:
        r119 = false;
        goto L128
    L123:
        r118 = false;
        goto L124
    L119:
        r3 = false;
        goto L120
    L115:
        r116 = false;
        goto L116
    L108:
        if (it$iv == Composer.Companion.getEmpty()) goto L111;
        value$iv = it$iv;
        goto L112
    L104:
        r2 = false;
        goto L105
    L100:
        r0 = false;
        goto L101
    L53:
        r19 = 524288;
        goto L54
    L55:
        r7 = inputIdentifier;
        goto L57
    L22:
        r15 = 128;
        goto L23
    L24:
        r13 = r45;
        goto L26
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> r4) {
        MutableState<TextFieldValue> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void DateInputTextField_tQNruF0$lambda$5(MutableState<TextFieldValue> r4, TextFieldValue value) {
        r4.setValue(value);
    }

    static {
        InputTextFieldPadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(24), Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(24), 0.0f, 8, null);
        InputTextNonErroneousBottomPadding = Dp.m6973constructorimpl(16);
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }
}
