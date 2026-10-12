package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
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
import androidx.compose.ui.unit.Dp;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: DateRangeInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0019"}, d2 = {"TextFieldSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangeInputContent", "", "selectedStartDateMillis", "", "selectedEndDateMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startDateMillis", "endDateMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = 0.0f;

    public static final void DateRangeInputContent(final Long selectedStartDateMillis, final Long selectedEndDateMillis, final Function2<? super Long, ? super Long, Unit> r54, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-607499086);
        ComposerKt.sourceInformation($composer2, "C(DateRangeInputContent)P(6,5,3!1,7,2,4)45@1775L15,47@1825L75,48@1928L45,49@2008L44,50@2086L45,51@2160L50,53@2248L530,70@2991L2331:DateRangeInput.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedStartDateMillis) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(selectedEndDateMillis) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r54) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(calendarModel) == false) goto L28;
        int r10 = 2048;
    L29:
        $dirty = $dirty | r10;
        goto L31
    L28:
        r10 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L37;
        IntRange r11 = yearRange;
        if ($composer2.changedInstance(r11) == false) goto L35;
        int r12 = 16384;
    L36:
        $dirty = $dirty | r12;
    L39:
        if ((196608 & $changed) != 0) goto L49;
        if (($changed & 262144) != 0) goto L43;
        boolean r13 = $composer2.changed(dateFormatter);
    L44:
        if (r13 == false) goto L46;
        int r14 = 131072;
    L47:
        $dirty = $dirty | r14;
        goto L49
    L46:
        r14 = 65536;
        goto L47
    L43:
        r13 = $composer2.changedInstance(dateFormatter);
    L49:
        if ((1572864 & $changed) != 0) goto L55;
        SelectableDates r15 = selectableDates;
        if ($composer2.changed(r15) == false) goto L53;
        int r16 = 1048576;
    L54:
        $dirty = $dirty | r16;
    L57:
        if (($changed & 12582912) != 0) goto L63;
        DatePickerColors r17 = colors;
        if ($composer2.changed(r17) == false) goto L61;
        int r18 = 8388608;
    L62:
        $dirty = $dirty | r18;
    L65:
        if (($dirty & 4793491) != 4793490) goto L71;
        if ($composer2.getSkipping() == false) goto L71;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L145:
        ScopeUpdateScope r19 = $composer3.endRestartGroup();
        if (r19 == null) goto L149;
        r19.updateScope(new AnonymousClass3(selectedStartDateMillis, selectedEndDateMillis, r54, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L149:
        return;
    L71:
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventStart(-607499086, $dirty, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:43)");
    L73:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 998328518, "CC(remember):DateRangeInput.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(defaultLocale);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L76;
    L79:
        Object value$iv = calendarModel.getDateInputFormat(defaultLocale);
        $composer2.updateRememberedValue(value$iv);
    L80:
        DateInputFormat dateInputFormat = (DateInputFormat) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Strings.Companion r0 = Strings.Companion;
        String errorDatePattern = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_for_pattern), $composer2, 0);
        Strings.Companion r1 = Strings.Companion;
        String errorDateOutOfYearRange = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_year_range), $composer2, 0);
        Strings.Companion r2 = Strings.Companion;
        String errorInvalidNotAllowed = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_input_invalid_not_allowed), $composer2, 0);
        Strings.Companion r3 = Strings.Companion;
        String errorInvalidRange = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_input_invalid_range_input), $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 998342509, "CC(remember):DateRangeInput.kt#9igjgp");
        boolean r4 = $composer2.changed(dateInputFormat);
        if ((458752 & $dirty) != 131072) goto L83;
    L88:
        boolean r110 = true;
    L89:
        boolean invalid$iv2 = r4 | r110;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L95;
        DateInputFormat dateInputFormat2 = dateInputFormat;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L96;
        Object value$iv2 = it$iv2;
    L97:
        DateInputValidator dateInputValidator = (DateInputValidator) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        dateInputValidator.setCurrentStartDateMillis$material3_release(selectedStartDateMillis);
        dateInputValidator.setCurrentEndDateMillis$material3_release(selectedEndDateMillis);
        Modifier modifier$iv = PaddingKt.padding(Modifier.Companion, DateInputKt.getInputTextFieldPadding());
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m606spacedBy0680j_4(TextFieldSpacing);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((54 >> 3) & 14) | ((54 >> 3) & 112));
        int $changed$iv$iv = (54 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L100;
        ComposablesKt.invalidApplier();
    L100:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L103;
        Function0<ComposeUiNode> r5 = r27;
        $composer2.createNode(r5);
    L104:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L111;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L111;
    L112:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r33 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        int r37 = ((54 >> 6) & 112) | 6;
        RowScope $this$DateRangeInputContent_u24lambda_u245 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1199006788, "C75@3252L56,88@3849L203,79@3446L218,86@3692L62,76@3317L972,98@4317L54,110@4882L199,102@4509L190,108@4727L62,99@4380L936:DateRangeInput.kt#uh7d8r");
        final String pattern = dateInputFormat2.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(pattern, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        Strings.Companion r20 = Strings.Companion;
        final String startRangeText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_start_headline), $composer2, 0);
        Modifier r31 = RowScope.weight$default($this$DateRangeInputContent_u24lambda_u245, Modifier.Companion, 0.5f, false, 2, null);
        int r41 = InputIdentifier.Companion.m2303getStartDateInputJ2x2o4M();
        ComposerKt.sourceInformationMarkerStart($composer2, 1485363141, "CC(remember):DateRangeInput.kt#9igjgp");
        if (($dirty & 896) != 256) goto L115;
        boolean r21 = true;
    L116:
        boolean r44 = r21;
        if (($dirty & 112) != 32) goto L119;
        boolean r22 = true;
    L120:
        boolean invalid$iv3 = r44 | r22;
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L126;
        Composer $composer4 = $composer2;
        if (value$iv3 != Composer.Companion.getEmpty()) goto L128;
    L127:
        value$iv3 = (Function1) new DateRangeInputKt$DateRangeInputContent$2$1$1(r54, selectedEndDateMillis);
        $composer2.updateRememberedValue(value$iv3);
    L128:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty2 = $dirty;
        boolean r111 = false;
        DatePickerColors r112 = r17;
        DateInputFormat dateInputFormat3 = dateInputFormat2;
        $composer3 = $composer4;
        DateInputKt.m2120DateInputTextFieldtQNruF0(r31, selectedStartDateMillis, (Function1) value$iv3, calendarModel, ComposableLambdaKt.rememberComposableLambda(801434508, true, new DateRangeInputKt$DateRangeInputContent$2$2(startRangeText, pattern), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(665407211, true, new DateRangeInputKt$DateRangeInputContent$2$3(pattern), $composer2, 54), r41, dateInputValidator, dateInputFormat3, defaultLocale, r112, $composer2, ((($dirty << 3) & 112) | 1794048) | ($dirty & 7168), ($dirty >> 21) & 14);
        Strings.Companion r23 = Strings.Companion;
        final String endRangeText = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_end_headline), $composer2, 0);
        Modifier r24 = RowScope.weight$default($this$DateRangeInputContent_u24lambda_u245, Modifier.Companion, 0.5f, false, 2, null);
        int r25 = InputIdentifier.Companion.m2301getEndDateInputJ2x2o4M();
        ComposerKt.sourceInformationMarkerStart($composer2, 1485396193, "CC(remember):DateRangeInput.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L131;
        boolean r26 = true;
    L133:
        if (($dirty2 & 14) != 4) goto L135;
        r111 = true;
    L135:
        boolean invalid$iv4 = r26 | r111;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L138;
    L141:
        Object value$iv4 = (Function1) new DateRangeInputKt$DateRangeInputContent$2$4$1(r54, selectedStartDateMillis);
        $composer2.updateRememberedValue(value$iv4);
    L142:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        DateInputKt.m2120DateInputTextFieldtQNruF0(r24, selectedEndDateMillis, (Function1) value$iv4, calendarModel, ComposableLambdaKt.rememberComposableLambda(911487285, true, new DateRangeInputKt$DateRangeInputContent$2$5(endRangeText, pattern), $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-961726252, true, new DateRangeInputKt$DateRangeInputContent$2$6(pattern), $composer2, 54), r25, dateInputValidator, dateInputFormat3, defaultLocale, colors, $composer2, ($dirty2 & 7168) | (($dirty2 & 112) | 1794048), ($dirty2 >> 21) & 14);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L145;
        ComposerKt.traceEventEnd();
        goto L145
    L138:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L141;
        value$iv4 = it$iv3;
        goto L142
    L131:
        r26 = false;
        goto L133
    L126:
        $composer4 = $composer2;
        goto L127
    L119:
        r22 = false;
        goto L120
    L115:
        r21 = false;
    L111:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r6);
        goto L112
    L103:
        r5 = r27;
        $composer2.useNode();
    L96:
        value$iv2 = new DateInputValidator(r11, r15, dateInputFormat2, dateFormatter, errorDatePattern, errorDateOutOfYearRange, errorInvalidNotAllowed, errorInvalidRange, null, null, 768, null);
        $composer2.updateRememberedValue(value$iv2);
        goto L97
    L95:
        dateInputFormat2 = dateInputFormat;
        goto L96
    L83:
        if (($dirty & 262144) != 0) goto L85;
    L87:
        r110 = false;
        goto L89
    L85:
        if ($composer2.changed(dateFormatter) == false) goto L87;
    L76:
        if (it$iv == Composer.Companion.getEmpty()) goto L79;
        value$iv = it$iv;
        goto L80
    L61:
        r18 = 4194304;
        goto L62
    L63:
        r17 = colors;
        goto L65
    L53:
        r16 = 524288;
        goto L54
    L55:
        r15 = selectableDates;
        goto L57
    L35:
        r12 = 8192;
        goto L36
    L37:
        r11 = yearRange;
        goto L39
    }

    static {
        TextFieldSpacing = Dp.m6973constructorimpl(8);
    }
}
