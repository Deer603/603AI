package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0084\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001ak\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020(2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010+\u001a\u008d\u0001\u0010,\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020.2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u0014012!\u00105\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u0014012\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010'\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010=\u001aZ\u0010>\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aT\u0010E\u001a\u00020&2\n\u0010F\u001a\u00060Gj\u0002`H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010.2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010;\u001a\u00020<H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001an\u0010O\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010P\u001a\u00020*2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010R\u001a\u00020*2\u0006\u0010S\u001a\u00020*2\u0006\u0010T\u001a\u00020*2\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010X\u001a6\u0010Y\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Z\u001a\u00020L2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u001401H\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a\u008d\u0001\u0010^\u001a\u00020\u00142\u0006\u0010_\u001a\u00020`2\b\u0010-\u001a\u0004\u0018\u00010.2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u0014012!\u00105\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u0014012\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010'\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010a\u001av\u0010b\u001a\u00020\u00142\u0006\u0010c\u001a\u00020d2!\u00100\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u0014012\u0006\u0010e\u001a\u00020.2\b\u0010f\u001a\u0004\u0018\u00010.2\b\u0010g\u001a\u0004\u0018\u00010.2\b\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010'\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010j\u001ag\u0010k\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010l\u001a\u00020*2\u0006\u0010m\u001a\u00020*2\u0006\u0010n\u001a\u00020*2\u0006\u0010o\u001a\u00020W2\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010s\u001a\u009c\u0001\u0010t\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020.2\u0006\u0010Z\u001a\u00020L2#\u00100\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0004\u0012\u00020\u0014012!\u00105\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u0014012\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010'\u001a\u00020(2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003ø\u0001\u0000¢\u0006\u0004\bu\u0010v\u001a\u001d\u0010w\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\u0010x\u001a^\u0010y\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010P\u001a\u00020*2\u0006\u0010z\u001a\u00020*2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010S\u001a\u00020*2\u0006\u0010V\u001a\u00020W2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010{\u001a`\u0010|\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.2!\u0010}\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u0014012\u0006\u0010;\u001a\u00020<2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010\u007f\u001aC\u0010\u0080\u0001\u001a\u00020\u00142\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0007\u0010\u0081\u0001\u001a\u00020*2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0003\u0010\u0082\u0001\u001a6\u0010\u0083\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0084\u00012\u0007\u0010%\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020W2\u0007\u0010\u008a\u0001\u001a\u00020WH\u0002\u001a>\u0010\u008b\u0001\u001a\u0004\u0018\u00010W2\u0007\u0010\u008c\u0001\u001a\u00020*2\u0007\u0010\u008d\u0001\u001a\u00020*2\u0007\u0010\u008e\u0001\u001a\u00020*2\u0007\u0010\u008f\u0001\u001a\u00020*2\u0007\u0010\u0090\u0001\u001a\u00020*H\u0003¢\u0006\u0003\u0010\u0091\u0001\u001a\u0011\u0010\u0092\u0001\u001a\u00020\f2\u0006\u00109\u001a\u00020:H\u0000\u001aK\u0010\u0093\u0001\u001a\u00020&2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010.2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020L2\b\b\u0002\u0010;\u001a\u00020<H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001aK\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010_\u001a\u00020`2!\u00105\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u0014012\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0080@¢\u0006\u0003\u0010\u0097\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u000e\u0010\u0011\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0012\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0098\u0001²\u0006\n\u0010n\u001a\u00020*X\u008a\u008e\u0002"}, d2 = {"DatePickerHeadlinePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "getDatePickerHorizontalPadding", "()F", "F", "DatePickerModeTogglePadding", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "MaxCalendarRows", "", "MonthYearHeight", "getMonthYearHeight", "RecommendedSizeForAccessibility", "getRecommendedSizeForAccessibility", "YearsInRow", "YearsVerticalPadding", "DateEntryContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "modeToggleButton", "colors", "Landroidx/compose/material3/DatePickerColors;", "headlineTextStyle", "Landroidx/compose/ui/text/TextStyle;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePicker", "state", "Landroidx/compose/material3/DatePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "showModeToggle", "", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DatePickerContent", "selectedDateMillis", "", "displayedMonthMillis", "onDateSelectionChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "dateInMillis", "onDisplayedMonthChange", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "titleContentColor", "Landroidx/compose/ui/graphics/Color;", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "DatePickerState-sHin3Bw", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DatePickerState;", "Day", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "displayMode", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HorizontalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Month", "month", "Landroidx/compose/material3/internal/CalendarMonth;", "todayMillis", "startDateMillis", "endDateMillis", "rangeSelectionInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "(Landroidx/compose/material3/internal/CalendarMonth;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ljava/lang/Long;Landroidx/compose/material3/SelectedRangeInfo;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "MonthsNavigation", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "SwitchableDateEntryContent-d7iavvg", "(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/internal/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Year", "currentYear", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;ZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "YearPicker", "onYearSelected", "year", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "YearPickerMenuButton", "expanded", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "scrollDownLabel", "dayContentDescription", "rangeSelectionEnabled", "isToday", "isStartDate", "isEndDate", "isInRange", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberOfMonthsInRange", "rememberDatePickerState", "rememberDatePickerState-EU0dCGE", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding = null;
    private static final float DatePickerHorizontalPadding = 0.0f;
    private static final PaddingValues DatePickerModeTogglePadding = null;
    private static final PaddingValues DatePickerTitlePadding = null;
    private static final int MaxCalendarRows = 6;
    private static final float MonthYearHeight = 0.0f;
    private static final float RecommendedSizeForAccessibility = 0.0f;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding = 0.0f;

    public static final /* synthetic */ void access$DatePickerContent(Long selectedDateMillis, long displayedMonthMillis, Function1 onDateSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed) {
        DatePickerContent(selectedDateMillis, displayedMonthMillis, onDateSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed);
    }

    public static final /* synthetic */ boolean access$DatePickerContent$lambda$10(MutableState $yearPickerVisible$delegate) {
        return DatePickerContent$lambda$10($yearPickerVisible$delegate);
    }

    public static final /* synthetic */ void access$DatePickerContent$lambda$11(MutableState $yearPickerVisible$delegate, boolean value) {
        DatePickerContent$lambda$11($yearPickerVisible$delegate, value);
    }

    public static final /* synthetic */ void access$Day(Modifier modifier, boolean selected, Function0 onClick, boolean animateChecked, boolean enabled, boolean today, boolean inRange, String description, DatePickerColors colors, Function2 content, Composer $composer, int $changed) {
        Day(modifier, selected, onClick, animateChecked, enabled, today, inRange, description, colors, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$HorizontalMonthsList(LazyListState lazyListState, Long selectedDateMillis, Function1 onDateSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed) {
        HorizontalMonthsList(lazyListState, selectedDateMillis, onDateSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$MonthsNavigation(Modifier modifier, boolean nextAvailable, boolean previousAvailable, boolean yearPickerVisible, String yearPickerText, Function0 onNextClicked, Function0 onPreviousClicked, Function0 onYearPickerButtonClicked, DatePickerColors colors, Composer $composer, int $changed) {
        MonthsNavigation(modifier, nextAvailable, previousAvailable, yearPickerVisible, yearPickerText, onNextClicked, onPreviousClicked, onYearPickerButtonClicked, colors, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    public static final /* synthetic */ void m2159access$SwitchableDateEntryContentd7iavvg(Long selectedDateMillis, long displayedMonthMillis, int displayMode, Function1 onDateSelectionChange, Function1 onDisplayedMonthChange, CalendarModel calendarModel, IntRange yearRange, DatePickerFormatter dateFormatter, SelectableDates selectableDates, DatePickerColors colors, Composer $composer, int $changed) {
        m2158SwitchableDateEntryContentd7iavvg(selectedDateMillis, displayedMonthMillis, displayMode, onDateSelectionChange, onDisplayedMonthChange, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$Year(Modifier modifier, boolean selected, boolean currentYear, Function0 onClick, boolean enabled, String description, DatePickerColors colors, Function2 content, Composer $composer, int $changed) {
        Year(modifier, selected, currentYear, onClick, enabled, description, colors, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$YearPicker(Modifier modifier, long displayedMonthMillis, Function1 onYearSelected, SelectableDates selectableDates, CalendarModel calendarModel, IntRange yearRange, DatePickerColors colors, Composer $composer, int $changed) {
        YearPicker(modifier, displayedMonthMillis, onYearSelected, selectableDates, calendarModel, yearRange, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$YearPickerMenuButton(Function0 onClick, boolean expanded, Modifier modifier, Function2 content, Composer $composer, int $changed, int $default) {
        YearPickerMenuButton(onClick, expanded, modifier, content, $composer, $changed, $default);
    }

    public static final /* synthetic */ List access$customScrollActions(LazyGridState state, CoroutineScope coroutineScope, String scrollUpLabel, String scrollDownLabel) {
        return customScrollActions(state, coroutineScope, scrollUpLabel, scrollDownLabel);
    }

    public static final /* synthetic */ PaddingValues access$getDatePickerHeadlinePadding$p() {
        return DatePickerHeadlinePadding;
    }

    public static final /* synthetic */ PaddingValues access$getDatePickerTitlePadding$p() {
        return DatePickerTitlePadding;
    }

    public static final /* synthetic */ float access$getYearsVerticalPadding$p() {
        return YearsVerticalPadding;
    }

    public static final void DatePicker(final DatePickerState state, Modifier modifier, DatePickerFormatter dateFormatter, Function2<? super Composer, ? super Integer, Unit> r30, Function2<? super Composer, ? super Integer, Unit> r31, boolean showModeToggle, DatePickerColors colors, Composer $composer, final int $changed, final int r36) {
        Composer $composer2 = $composer.startRestartGroup(809701813);
        ComposerKt.sourceInformation($composer2, "C(DatePicker)P(5,3,1,6,2,4)171@8197L47,172@8285L170,178@8499L278,187@8865L8,189@8902L15,190@8942L62,207@9637L5,210@9746L655,191@9009L1392:DatePicker.kt#uh7d8r");
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
        ComposerKt.sourceInformationMarkerStart($composer2, 255556878, "CC(remember):DatePicker.kt#9igjgp");
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
        r9 = ComposableLambdaKt.rememberComposableLambda(-1504998463, true, new AnonymousClass2(state), $composer2, 54);
    L110:
        if (r10 == 0) goto L112;
        r11 = ComposableLambdaKt.rememberComposableLambda(-1780043561, r4, new AnonymousClass3(state, dateFormatter2), $composer2, r8);
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
        ComposerKt.traceEventStart(809701813, $dirty, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:188)");
    L121:
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 255580733, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(defaultLocale);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L127;
        boolean showModeToggle4 = showModeToggle3;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L128;
        Object value$iv2 = it$iv2;
    L129:
        final CalendarModel calendarModel = (CalendarModel) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.startReplaceGroup(255587712);
        ComposerKt.sourceInformation($composer2, "197@9187L323");
        if (showModeToggle4 == false) goto L132;
        ComposableLambda r16 = ComposableLambdaKt.rememberComposableLambda(1982226759, true, new AnonymousClass4(state), $composer2, 54);
    L133:
        $composer2.endReplaceGroup();
        DatePickerFormatter dateFormatter3 = dateFormatter2;
        Composer $composer3 = $composer2;
        m2153DateEntryContainerau3_HiA(modifier3, r15, r11, r16, colors2, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderHeadlineFont(), $composer2, 6), DatePickerModalTokens.INSTANCE.m3273getHeaderContainerHeightD9Ej5fM(), ComposableLambdaKt.rememberComposableLambda(-1840727866, true, new AnonymousClass5(state, calendarModel, dateFormatter2, colors2), $composer2, 54), $composer3, ((((($dirty >> 3) & 14) | 14155776) | (($dirty >> 6) & 112)) | (($dirty >> 6) & 896)) | (($dirty >> 6) & 57344));
        if (ComposerKt.isTraceInProgress() == false) goto L136;
        ComposerKt.traceEventEnd();
    L136:
        final Function2<? super Composer, ? super Integer, Unit> r6 = r15;
        final boolean showModeToggle5 = showModeToggle4;
        final Modifier modifier4 = modifier3;
        final DatePickerColors colors3 = colors2;
        final DatePickerFormatter dateFormatter4 = dateFormatter3;
        final Function2<? super Composer, ? super Integer, Unit> r17 = r11;
    L137:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L141;
        r18.updateScope(new AnonymousClass6(state, modifier4, dateFormatter4, r6, r17, showModeToggle5, colors3, $changed, r36));
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
        r17 = r11;
        goto L137
    L71:
        if ((r36 & 64) != 0) goto L75;
        r14 = colors;
        if ($composer2.changed(r14) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
    L76:
        r19 = 524288;
        goto L77
    L75:
        r14 = colors;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        showModeToggle2 = showModeToggle;
        if ($composer2.changed(showModeToggle2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L69
    L65:
        r110 = 65536;
        goto L66
    L67:
        showModeToggle2 = showModeToggle;
        goto L69
    L50:
        if (($changed & 24576) != 0) goto L56;
        r11 = r31;
        if ($composer2.changedInstance(r11) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        r11 = r31;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = r30;
        if ($composer2.changedInstance(r9) == false) goto L43;
        int r112 = 2048;
    L44:
        $dirty = $dirty | r112;
        goto L46
    L43:
        r112 = 1024;
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

    /* JADX INFO: renamed from: rememberDatePickerState-EU0dCGE, reason: not valid java name */
    public static final DatePickerState m2160rememberDatePickerStateEU0dCGE(Long initialSelectedDateMillis, Long initialDisplayedMonthMillis, IntRange yearRange, int initialDisplayMode, SelectableDates selectableDates, Composer $composer, int $changed, int r24) {
        ComposerKt.sourceInformationMarkerStart($composer, 2065763010, "C(rememberDatePickerState)P(2,1,4,0:c#material3.DisplayMode)365@15667L15,*366@15771L383,366@15694L460:DatePicker.kt#uh7d8r");
        if ((r24 & 1) == 0) goto L5;
        final Long initialSelectedDateMillis2 = null;
    L7:
        if ((r24 & 2) == 0) goto L9;
        final Long initialDisplayedMonthMillis2 = initialSelectedDateMillis2;
    L11:
        if ((r24 & 4) == 0) goto L13;
        final IntRange yearRange2 = DatePickerDefaults.INSTANCE.getYearRange();
    L15:
        if ((r24 & 8) == 0) goto L17;
        final int initialDisplayMode2 = DisplayMode.Companion.m2196getPickerjFl4v0();
    L19:
        if ((r24 & 16) == 0) goto L21;
        final SelectableDates selectableDates2 = DatePickerDefaults.INSTANCE.getAllDates();
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(2065763010, $changed, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:364)");
    L25:
        final Locale locale = CalendarLocale_androidKt.defaultLocale($composer, 0);
        boolean r1 = false;
        Object[] r0 = new Object[0];
        Saver<DatePickerStateImpl, Object> r2 = DatePickerStateImpl.Companion.Saver(selectableDates2, locale);
        ComposerKt.sourceInformationMarkerStart($composer, -390857660, "CC(remember):DatePicker.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L30;
        if ($composer.changed(initialSelectedDateMillis2) == false) goto L30;
    L31:
        boolean r3 = true;
    L34:
        if ((($changed & 112) ^ 48) <= 32) goto L38;
        if ($composer.changed(initialDisplayedMonthMillis2) == false) goto L38;
    L39:
        boolean r5 = true;
    L41:
        boolean r4 = (r3 | r5) | $composer.changedInstance(yearRange2);
        if ((($changed & 7168) ^ 3072) <= 2048) goto L46;
        if ($composer.changed(initialDisplayMode2) == false) goto L46;
    L47:
        boolean r6 = true;
    L49:
        boolean r7 = r4 | r6;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L54;
        if ($composer.changed(selectableDates2) == false) goto L54;
    L55:
        r1 = true;
    L56:
        boolean invalid$iv = (r1 | r7) | $composer.changedInstance(locale);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L59;
    L62:
        Object value$iv = (Function0) new DatePickerKt$rememberDatePickerState$1$1(initialSelectedDateMillis2, initialDisplayedMonthMillis2, yearRange2, initialDisplayMode2, selectableDates2, locale);
        $composer.updateRememberedValue(value$iv);
    L63:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object r8 = RememberSaveableKt.m3923rememberSaveable(r0, r2, null, (Function0) value$iv, $composer, 0, 4);
        DatePickerStateImpl $this$rememberDatePickerState_EU0dCGE_u24lambda_u243 = (DatePickerStateImpl) r8;
        $this$rememberDatePickerState_EU0dCGE_u24lambda_u243.setSelectableDates(selectableDates2);
        DatePickerStateImpl r9 = (DatePickerStateImpl) r8;
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L66:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r9;
    L59:
        if (it$iv == Composer.Companion.getEmpty()) goto L62;
        value$iv = it$iv;
    L54:
        if (($changed & 24576) != 16384) goto L56;
    L46:
        if (($changed & 3072) == 2048) goto L47;
        r6 = false;
    L38:
        if (($changed & 48) == 32) goto L39;
        r5 = false;
    L30:
        if (($changed & 6) == 4) goto L31;
        r3 = false;
        goto L34
    L21:
        selectableDates2 = selectableDates;
        goto L23
    L17:
        initialDisplayMode2 = initialDisplayMode;
        goto L19
    L13:
        yearRange2 = yearRange;
        goto L15
    L9:
        initialDisplayedMonthMillis2 = initialDisplayedMonthMillis;
        goto L11
    L5:
        initialSelectedDateMillis2 = initialSelectedDateMillis;
        goto L7
    }

    /* JADX INFO: renamed from: DatePickerState-sHin3Bw$default, reason: not valid java name */
    public static /* synthetic */ DatePickerState m2156DatePickerStatesHin3Bw$default(Locale r0, Long r1, Long r2, IntRange r3, int r4, SelectableDates r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r1 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r2 = r1;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r3 = DatePickerDefaults.INSTANCE.getYearRange();
    L12:
        if ((r6 & 16) == 0) goto L15;
        r4 = DisplayMode.Companion.m2196getPickerjFl4v0();
    L15:
        if ((r6 & 32) == 0) goto L17;
        SelectableDates r8 = DatePickerDefaults.INSTANCE.getAllDates();
    L18:
        IntRange r9 = r3;
        int r10 = r4;
        return m2155DatePickerStatesHin3Bw(r0, r1, r2, r9, r10, r8);
    L17:
        r8 = r5;
        goto L18
    }

    /* JADX INFO: renamed from: DatePickerState-sHin3Bw, reason: not valid java name */
    public static final DatePickerState m2155DatePickerStatesHin3Bw(Locale locale, Long initialSelectedDateMillis, Long initialDisplayedMonthMillis, IntRange yearRange, int initialDisplayMode, SelectableDates selectableDates) {
        return new DatePickerStateImpl(initialSelectedDateMillis, initialDisplayedMonthMillis, yearRange, initialDisplayMode, selectableDates, locale, null);
    }

    /* JADX INFO: renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m2153DateEntryContainerau3_HiA(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r38, final Function2<? super Composer, ? super Integer, Unit> r39, final Function2<? super Composer, ? super Integer, Unit> r40, final DatePickerColors colors, final TextStyle headlineTextStyle, final float headerMinHeight, final Function2<? super Composer, ? super Integer, Unit> r44, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1507356255);
        ComposerKt.sourceInformation($composer2, "C(DateEntryContainer)P(6,7,3,5!1,4,2:c#ui.unit.Dp)1309@61230L1775:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r11 = modifier;
        if ($composer2.changed(r11) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L19;
        if ($composer2.changedInstance(r38) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
        goto L19
    L15:
        r3 = 16;
    L19:
        if (($changed & 384) != 0) goto L27;
        if ($composer2.changedInstance(r39) == false) goto L23;
        int r4 = 256;
    L24:
        $dirty = $dirty | r4;
        goto L27
    L23:
        r4 = 128;
    L27:
        if (($changed & 3072) != 0) goto L33;
        Function2<? super Composer, ? super Integer, Unit> r5 = r40;
        if ($composer2.changedInstance(r5) == false) goto L31;
        int r6 = 2048;
    L32:
        $dirty = $dirty | r6;
    L35:
        if (($changed & 24576) != 0) goto L41;
        DatePickerColors r7 = colors;
        if ($composer2.changed(r7) == false) goto L39;
        int r8 = 16384;
    L40:
        $dirty = $dirty | r8;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        TextStyle r9 = headlineTextStyle;
        if ($composer2.changed(r9) == false) goto L47;
        int r10 = 131072;
    L48:
        $dirty = $dirty | r10;
    L51:
        if ((1572864 & $changed) != 0) goto L57;
        float r12 = headerMinHeight;
        if ($composer2.changed(r12) == false) goto L55;
        int r13 = 1048576;
    L56:
        $dirty = $dirty | r13;
    L59:
        if ((12582912 & $changed) != 0) goto L66;
        if ($composer2.changedInstance(r44) == false) goto L63;
        int r14 = 8388608;
    L64:
        $dirty = $dirty | r14;
        goto L66
    L63:
        r14 = 4194304;
    L66:
        if ((4793491 & $dirty) != 4793490) goto L72;
        if ($composer2.getSkipping() == false) goto L72;
        $composer2.skipToGroupEnd();
    L91:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L95;
        r15.updateScope(new DatePickerKt$DateEntryContainer$3(modifier, r38, r39, r40, colors, headlineTextStyle, headerMinHeight, r44, $changed));
        return;
    L95:
        return;
    L72:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(1507356255, $dirty, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1308)");
    L74:
        Modifier modifier$iv = BackgroundKt.m234backgroundbw27NRU$default(SemanticsModifierKt.semantics$default(SizeKt.m776sizeInqDBjuR0$default(r11, DatePickerModalTokens.INSTANCE.m3267getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, DatePickerKt$DateEntryContainer$1.INSTANCE, 1, null), r7.m2124getContainerColor0d7_KjU(), null, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L77;
        ComposablesKt.invalidApplier();
    L77:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L80;
        Function0<ComposeUiNode> r0 = r16;
        $composer2.createNode(r0);
    L81:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == false) goto L84;
    L87:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
    L88:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r17 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r18 = ColumnScopeInstance.INSTANCE;
        int r19 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 133465402, "C1325@61799L1182,1319@61549L1432,1351@62990L9:DatePicker.kt#uh7d8r");
        final DatePickerColors r110 = r7;
        final TextStyle r111 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r112 = r5;
        float r113 = r12;
        m2154DatePickerHeaderpc5RIQQ(Modifier.Companion, r38, r7.m2143getTitleContentColor0d7_KjU(), r7.m2136getHeadlineContentColor0d7_KjU(), r113, ComposableLambdaKt.rememberComposableLambda(-229007058, true, new DatePickerKt$DateEntryContainer$2$1(r39, r112, r38, r110, r111), $composer2, 54), $composer2, (($dirty2 & 112) | 196614) | (($dirty2 >> 6) & 57344));
        r44.invoke($composer2, Integer.valueOf(($dirty2 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventEnd();
        goto L91
    L84:
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L88;
    L80:
        r0 = r16;
        $composer2.useNode();
        goto L81
    L55:
        r13 = 524288;
        goto L56
    L57:
        r12 = headerMinHeight;
        goto L59
    L47:
        r10 = 65536;
        goto L48
    L49:
        r9 = headlineTextStyle;
        goto L51
    L39:
        r8 = 8192;
        goto L40
    L41:
        r7 = colors;
        goto L43
    L31:
        r6 = 1024;
        goto L32
    L33:
        r5 = r40;
        goto L35
    L7:
        r2 = 2;
        goto L8
    L9:
        r11 = modifier;
        goto L11
    }

    /* JADX INFO: renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m2157DisplayModeToggleButtontER2X8s(Modifier modifier, final int displayMode, final Function1<? super DisplayMode, Unit> r12, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1393846115);
        ComposerKt.sourceInformation($composer2, "C(DisplayModeToggleButton)P(1,0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(displayMode) == false) goto L14;
        int r2 = 32;
    L15:
        $dirty = $dirty | r2;
        goto L17
    L14:
        r2 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r12) == false) goto L21;
        int r3 = 256;
    L22:
        $dirty = $dirty | r3;
        goto L24
    L21:
        r3 = 128;
    L24:
        if (($dirty & 147) != 146) goto L30;
        if ($composer2.getSkipping() == false) goto L30;
        $composer2.skipToGroupEnd();
        final Modifier modifier2 = modifier;
    L61:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L65;
        r10.updateScope(new DatePickerKt$DisplayModeToggleButton$3(modifier2, displayMode, r12, $changed));
        return;
    L65:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(1393846115, $dirty, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1361)");
    L32:
        boolean invalid$iv = true;
        if (DisplayMode.m2191equalsimpl0(displayMode, DisplayMode.Companion.m2196getPickerjFl4v0()) == false) goto L46;
        $composer2.startReplaceGroup(-411219388);
        ComposerKt.sourceInformation($composer2, "1363@63278L42,1363@63257L262");
        ComposerKt.sourceInformationMarkerStart($composer2, -428906382, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty & 896) == 256) goto L38;
        invalid$iv = false;
    L38:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L41;
    L44:
        Object value$iv = (Function0) new DatePickerKt$DisplayModeToggleButton$1$1(r12);
        $composer2.updateRememberedValue(value$iv);
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        modifier2 = modifier;
        IconButtonKt.IconButton((Function0) value$iv, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m2088getLambda1$material3_release(), $composer2, (($dirty << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
        $composer2.endReplaceGroup();
    L59:
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventEnd();
        goto L61
    L41:
        if (it$iv == Composer.Companion.getEmpty()) goto L44;
        value$iv = it$iv;
        goto L45
    L46:
        $composer2.startReplaceGroup(-410937381);
        ComposerKt.sourceInformation($composer2, "1370@63562L43,1370@63541L271");
        ComposerKt.sourceInformationMarkerStart($composer2, -428897293, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty & 896) == 256) goto L50;
        invalid$iv = false;
    L50:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L53;
    L56:
        Object value$iv2 = (Function0) new DatePickerKt$DisplayModeToggleButton$2$1(r12);
        $composer2.updateRememberedValue(value$iv2);
    L57:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        modifier2 = modifier;
        IconButtonKt.IconButton((Function0) value$iv2, modifier2, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m2089getLambda2$material3_release(), $composer2, (($dirty << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
        $composer2.endReplaceGroup();
        goto L59
    L53:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L56;
        value$iv2 = it$iv2;
        goto L57
    }

    /* JADX INFO: renamed from: SwitchableDateEntryContent-d7iavvg, reason: not valid java name */
    private static final void m2158SwitchableDateEntryContentd7iavvg(final Long selectedDateMillis, final long displayedMonthMillis, int displayMode, final Function1<? super Long, Unit> r24, final Function1<? super Long, Unit> r25, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-895379221);
        ComposerKt.sourceInformation($composer2, "C(SwitchableDateEntryContent)P(8,4,3:c#material3.DisplayMode,5,6!1,9,2,7)*1399@64608L7,1407@64864L2301,1451@67222L1081,1400@64644L3659:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(selectedDateMillis) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L11
    L7:
        r3 = 2;
    L11:
        if (($changed & 48) != 0) goto L19;
        if ($composer2.changed(displayedMonthMillis) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
        goto L19
    L15:
        r5 = 16;
    L19:
        if (($changed & 384) != 0) goto L25;
        int r13 = displayMode;
        if ($composer2.changed(r13) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L33;
        Function1<? super Long, Unit> r7 = r24;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r8 = 2048;
    L32:
        $dirty = $dirty | r8;
    L35:
        if (($changed & 24576) != 0) goto L41;
        Function1<? super Long, Unit> r9 = r25;
        if ($composer2.changedInstance(r9) == false) goto L39;
        int r10 = 16384;
    L40:
        $dirty = $dirty | r10;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        CalendarModel r11 = calendarModel;
        if ($composer2.changedInstance(r11) == false) goto L47;
        int r12 = 131072;
    L48:
        $dirty = $dirty | r12;
    L51:
        if ((1572864 & $changed) != 0) goto L57;
        IntRange r14 = yearRange;
        if ($composer2.changedInstance(r14) == false) goto L55;
        int r15 = 1048576;
    L56:
        $dirty = $dirty | r15;
    L59:
        if ((12582912 & $changed) != 0) goto L69;
        if ((16777216 & $changed) != 0) goto L63;
        boolean r16 = $composer2.changed(dateFormatter);
    L64:
        if (r16 == false) goto L66;
        int r17 = 8388608;
    L67:
        $dirty = $dirty | r17;
        goto L69
    L66:
        r17 = 4194304;
        goto L67
    L63:
        r16 = $composer2.changedInstance(dateFormatter);
    L69:
        if ((100663296 & $changed) != 0) goto L75;
        SelectableDates r18 = selectableDates;
        if ($composer2.changed(r18) == false) goto L73;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L74:
        $dirty = $dirty | r19;
    L77:
        if ((805306368 & $changed) != 0) goto L83;
        DatePickerColors r110 = colors;
        if ($composer2.changed(r110) == false) goto L81;
        int r111 = 536870912;
    L82:
        $dirty = $dirty | r111;
    L84:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty2) != 306783378) goto L91;
        if ($composer2.getSkipping() == false) goto L91;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L103:
        ScopeUpdateScope r112 = $composer3.endRestartGroup();
        if (r112 == null) goto L107;
        final int r4 = r13;
        r112.updateScope(new DatePickerKt$SwitchableDateEntryContent$4(selectedDateMillis, displayedMonthMillis, r4, r24, r25, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L107:
        return;
    L91:
        if (ComposerKt.isTraceInProgress() == false) goto L93;
        ComposerKt.traceEventStart(-895379221, $dirty2, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1396)");
    L93:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$SwitchableDateEntryContent_d7iavvg_u24lambda_u247 = (Density) r1;
        final int parallaxTarget = -$this$SwitchableDateEntryContent_d7iavvg_u24lambda_u247.mo370roundToPx0680j_4(Dp.m6973constructorimpl(48));
        DisplayMode r113 = DisplayMode.m2188boximpl(r13);
        Modifier r114 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -742566717, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(parallaxTarget);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L96;
    L99:
        Object value$iv = (Function1) new DatePickerKt$SwitchableDateEntryContent$2$1(parallaxTarget);
        $composer2.updateRememberedValue(value$iv);
    L100:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Function1<? super Long, Unit> r20 = r7;
        final Function1<? super Long, Unit> r21 = r9;
        final CalendarModel r22 = r11;
        final IntRange r23 = r14;
        final SelectableDates r26 = r18;
        final DatePickerColors r115 = r110;
        AnimatedContentKt.AnimatedContent(r113, r114, (Function1) value$iv, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.rememberComposableLambda(-459778869, true, new DatePickerKt$SwitchableDateEntryContent$3(selectedDateMillis, displayedMonthMillis, r20, r21, r22, r23, dateFormatter, r26, r115), $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 1597440, 40);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventEnd();
        goto L103
    L96:
        if (it$iv == Composer.Companion.getEmpty()) goto L99;
        value$iv = it$iv;
        goto L100
    L81:
        r111 = 268435456;
        goto L82
    L83:
        r110 = colors;
        goto L84
    L73:
        r19 = 33554432;
        goto L74
    L75:
        r18 = selectableDates;
        goto L77
    L55:
        r15 = 524288;
        goto L56
    L57:
        r14 = yearRange;
        goto L59
    L47:
        r12 = 65536;
        goto L48
    L49:
        r11 = calendarModel;
        goto L51
    L39:
        r10 = 8192;
        goto L40
    L41:
        r9 = r25;
        goto L43
    L31:
        r8 = 1024;
        goto L32
    L33:
        r7 = r24;
        goto L35
    L23:
        r6 = 128;
        goto L24
    L25:
        r13 = displayMode;
        goto L27
    }

    private static final void DatePickerContent(final Long selectedDateMillis, final long displayedMonthMillis, final Function1<? super Long, Unit> r85, final Function1<? super Long, Unit> r86, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-434467002);
        ComposerKt.sourceInformation($composer2, "C(DatePickerContent)P(7,3,4,5!1,8,2,6)1494@68907L64,1497@69061L466,1497@69034L493,1509@69554L24,1510@69608L42,1511@69675L15,1512@69695L5031:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(selectedDateMillis) == false) goto L7;
        int r11 = 4;
    L8:
        $dirty = $dirty | r11;
        goto L11
    L7:
        r11 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(displayedMonthMillis) == false) goto L15;
        int r12 = 32;
    L16:
        $dirty = $dirty | r12;
        goto L18
    L15:
        r12 = 16;
    L18:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changedInstance(r85) == false) goto L22;
        int r13 = 256;
    L23:
        $dirty = $dirty | r13;
        goto L26
    L22:
        r13 = 128;
    L26:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r86) == false) goto L30;
        int r14 = 2048;
    L31:
        $dirty = $dirty | r14;
        goto L34
    L30:
        r14 = 1024;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(calendarModel) == false) goto L38;
        int r15 = 16384;
    L39:
        $dirty = $dirty | r15;
        goto L41
    L38:
        r15 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changedInstance(yearRange) == false) goto L45;
        int r16 = 131072;
    L46:
        $dirty = $dirty | r16;
        goto L48
    L45:
        r16 = 65536;
    L48:
        if ((1572864 & $changed) != 0) goto L58;
        if ((2097152 & $changed) != 0) goto L52;
        boolean r17 = $composer2.changed(dateFormatter);
    L53:
        if (r17 == false) goto L55;
        int r18 = 1048576;
    L56:
        $dirty = $dirty | r18;
        goto L58
    L55:
        r18 = 524288;
        goto L56
    L52:
        r17 = $composer2.changedInstance(dateFormatter);
    L58:
        if ((12582912 & $changed) != 0) goto L66;
        if ($composer2.changed(selectableDates) == false) goto L62;
        int r19 = 8388608;
    L63:
        $dirty = $dirty | r19;
        goto L66
    L62:
        r19 = 4194304;
    L66:
        if ((100663296 & $changed) != 0) goto L73;
        if ($composer2.changed(colors) == false) goto L70;
        int r110 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r110;
        goto L73
    L70:
        r110 = 33554432;
    L73:
        if ((38347923 & $dirty) != 38347922) goto L79;
        if ($composer2.getSkipping() == false) goto L79;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L167:
        ScopeUpdateScope r111 = $composer3.endRestartGroup();
        if (r111 == null) goto L171;
        r111.updateScope(new C04973(selectedDateMillis, displayedMonthMillis, r85, r86, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L171:
        return;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventStart(-434467002, $dirty, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1491)");
    L81:
        final CalendarMonth displayedMonth = calendarModel.getMonth(displayedMonthMillis);
        int monthIndex = RangesKt.coerceAtLeast(displayedMonth.indexIn(yearRange), 0);
        final LazyListState monthsListState = LazyListStateKt.rememberLazyListState(monthIndex, 0, $composer2, 0, 2);
        Integer r0 = Integer.valueOf(monthIndex);
        ComposerKt.sourceInformationMarkerStart($composer2, -1235295380, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(monthsListState) | $composer2.changed(monthIndex);
        DatePickerKt$DatePickerContent$1$1 value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L84;
    L87:
        value$iv = new DatePickerKt$DatePickerContent$1$1(monthsListState, monthIndex, null);
        $composer2.updateRememberedValue(value$iv);
    L88:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r0, (Function2) value$iv, $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L91;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L92:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final CoroutineScope coroutineScope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState yearPickerVisible$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, DatePickerKt$DatePickerContent$yearPickerVisible$2.INSTANCE, $composer2, 3072, 6);
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        int $dirty2 = $dirty;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r112 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L95;
        ComposablesKt.invalidApplier();
    L95:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L98;
        Function0<ComposeUiNode> r2 = r112;
        $composer2.createNode(r2);
    L99:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L106;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L106;
    L107:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r36 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r10 = ColumnScopeInstance.INSTANCE;
        int r39 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1436856422, "C1523@70222L511,1535@70767L520,1547@71329L42,1513@69712L1698,1551@71420L3300:DatePicker.kt#uh7d8r");
        Modifier r3 = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, DatePickerHorizontalPadding, 0.0f, 2, null);
        boolean r5 = monthsListState.getCanScrollForward();
        boolean r113 = monthsListState.getCanScrollBackward();
        boolean r114 = DatePickerContent$lambda$10(yearPickerVisible$delegate);
        String r20 = dateFormatter.formatMonthYear(Long.valueOf(displayedMonthMillis), defaultLocale);
        if (r20 != null) goto L110;
        r20 = "-";
    L110:
        ComposerKt.sourceInformationMarkerStart($composer2, 230756280, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(coroutineScope) | $composer2.changed(monthsListState);
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L117;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L117;
    L118:
        Function0 r4 = (Function0) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 230773729, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(coroutineScope) | $composer2.changed(monthsListState);
        Object value$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L125;
        if (value$iv3 == Composer.Companion.getEmpty()) goto L125;
    L126:
        Function0 r6 = (Function0) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 230791235, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv4 = $composer2.changed(yearPickerVisible$delegate);
        Object value$iv4 = $composer2.rememberedValue();
        if (invalid$iv4 == true) goto L132;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (value$iv4 != Composer.Companion.getEmpty()) goto L134;
    L133:
        value$iv4 = (Function0) new DatePickerKt$DatePickerContent$2$3$1(yearPickerVisible$delegate);
        $composer2.updateRememberedValue(value$iv4);
    L134:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String r115 = r20;
        $composer3 = $composer2;
        MonthsNavigation(r3, r5, r113, r114, r115, r4, r6, (Function0) value$iv4, colors, $composer2, ($dirty2 & 234881024) | 6);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier modifier$iv2 = Modifier.Companion;
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r52 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L137;
        ComposablesKt.invalidApplier();
    L137:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L140;
        $composer2.createNode(r52);
    L141:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L147;
        CompositionLocalMap localMap$iv$iv3 = localMap$iv$iv2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L149;
    L148:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r1);
    L149:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r57 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r7 = BoxScopeInstance.INSTANCE;
        int r60 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 2145982723, "C1552@71438L683,1571@72420L2290,1566@72161L2549:DatePicker.kt#uh7d8r");
        Modifier modifier$iv3 = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, DatePickerHorizontalPadding, 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv2 = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        int $changed$iv$iv3 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv4 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer2, modifier$iv3);
        Function0<ComposeUiNode> r28 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L152;
        ComposablesKt.invalidApplier();
    L152:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L155;
        Function0<ComposeUiNode> r8 = r28;
        $composer2.createNode(r8);
    L156:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L162;
        Arrangement.Vertical verticalArrangement$iv3 = verticalArrangement$iv2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == true) goto L164;
    L163:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r21);
    L164:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r23 = ColumnScopeInstance.INSTANCE;
        int r42 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 455260175, "C1553@71534L31,1554@71582L525:DatePicker.kt#uh7d8r");
        WeekDays(colors, calendarModel, $composer2, (($dirty2 >> 24) & 14) | (($dirty2 >> 9) & 112));
        HorizontalMonthsList(monthsListState, selectedDateMillis, r85, r86, calendarModel, yearRange, dateFormatter, selectableDates, colors, $composer2, (((((((($dirty2 << 3) & 112) | ($dirty2 & 896)) | ($dirty2 & 7168)) | ($dirty2 & 57344)) | ($dirty2 & 458752)) | ($dirty2 & 3670016)) | ($dirty2 & 29360128)) | ($dirty2 & 234881024));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final CoroutineScope coroutineScope3 = coroutineScope2;
        AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$10(yearPickerVisible$delegate), ClipKt.clipToBounds(Modifier.Companion), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), null, ComposableLambdaKt.rememberComposableLambda(1193716082, true, new DatePickerKt$DatePickerContent$2$4$2(displayedMonthMillis, yearPickerVisible$delegate, coroutineScope3, monthsListState, yearRange, displayedMonth, selectableDates, calendarModel, colors), $composer2, 54), $composer2, 200112, 16);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L167;
        ComposerKt.traceEventEnd();
        goto L167
    L162:
        verticalArrangement$iv3 = verticalArrangement$iv2;
        goto L163
    L155:
        r8 = r28;
        $composer2.useNode();
        goto L156
    L147:
        localMap$iv$iv3 = localMap$iv$iv2;
        goto L148
    L140:
        $composer2.useNode();
        goto L141
    L132:
        coroutineScope2 = coroutineScope;
    L125:
        value$iv3 = (Function0) new DatePickerKt$DatePickerContent$2$2$1(coroutineScope, monthsListState);
        $composer2.updateRememberedValue(value$iv3);
    L117:
        value$iv2 = (Function0) new DatePickerKt$DatePickerContent$2$1$1(coroutineScope, monthsListState);
        $composer2.updateRememberedValue(value$iv2);
    L106:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L107
    L98:
        r2 = r112;
        $composer2.useNode();
        goto L99
    L91:
        value$iv$iv = it$iv$iv;
        goto L92
    L84:
        if (value$iv != Composer.Companion.getEmpty()) goto L88;
        goto L87
    }

    private static final boolean DatePickerContent$lambda$10(MutableState<Boolean> r4) {
        MutableState<Boolean> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void DatePickerContent$lambda$11(MutableState<Boolean> r5, boolean value) {
        r5.setValue(Boolean.valueOf(value));
    }

    /* JADX INFO: renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m2154DatePickerHeaderpc5RIQQ(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r36, final long titleContentColor, final long headlineContentColor, final float minHeight, final Function2<? super Composer, ? super Integer, Unit> r42, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-996037719);
        ComposerKt.sourceInformation($composer2, "C(DatePickerHeader)P(3,4,5:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.unit.Dp)1629@75185L539:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r36) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
        goto L17
    L14:
        r5 = 16;
    L17:
        if (($changed & 384) != 0) goto L23;
        long r11 = titleContentColor;
        if ($composer2.changed(r11) == false) goto L21;
        int r6 = 256;
    L22:
        $dirty = $dirty | r6;
    L25:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changed(headlineContentColor) == false) goto L29;
        int r7 = 2048;
    L30:
        $dirty = $dirty | r7;
        goto L33
    L29:
        r7 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L40;
        if ($composer2.changed(minHeight) == false) goto L37;
        int r8 = 16384;
    L38:
        $dirty = $dirty | r8;
        goto L40
    L37:
        r8 = 8192;
    L40:
        if ((196608 & $changed) != 0) goto L47;
        if ($composer2.changedInstance(r42) == false) goto L44;
        int r9 = 131072;
    L45:
        $dirty = $dirty | r9;
        goto L47
    L44:
        r9 = 65536;
    L47:
        if ((74899 & $dirty) != 74898) goto L53;
        if ($composer2.getSkipping() == false) goto L53;
        $composer2.skipToGroupEnd();
    L81:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L85;
        r12.updateScope(new DatePickerKt$DatePickerHeader$2(modifier, r36, titleContentColor, headlineContentColor, minHeight, r42, $changed));
        return;
    L85:
        return;
    L53:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(-996037719, $dirty, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1621)");
    L56:
        if (r36 == null) goto L58;
        Modifier.Companion heightModifier = SizeKt.m757defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, minHeight, 1, null);
    L59:
        Modifier modifier$iv = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(heightModifier);
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        int $changed$iv$iv = (48 << 3) & 112;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L62;
        ComposablesKt.invalidApplier();
    L62:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L65;
        Function0<ComposeUiNode> r0 = r16;
        $composer2.createNode(r0);
    L66:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L73;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L73;
    L74:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r10 = ColumnScopeInstance.INSTANCE;
        int r13 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1244227240, "C1639@75626L92:DatePicker.kt#uh7d8r");
        $composer2.startReplaceGroup(594325590);
        ComposerKt.sourceInformation($composer2, "1634@75414L5,1635@75518L89,1635@75432L175");
        if (r36 == null) goto L78;
        TextStyle textStyle = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont(), $composer2, 6);
        ProvideContentColorTextStyleKt.m3029ProvideContentColorTextStyle3JVO9M(r11, textStyle, ComposableLambdaKt.rememberComposableLambda(1936268514, true, new DatePickerKt$DatePickerHeader$1$1(r36), $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 384);
    L78:
        $composer2.endReplaceGroup();
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(headlineContentColor)), r42, $composer2, ProvidedValue.$stable | (($dirty2 >> 12) & 112));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L73:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L74
    L65:
        r0 = r16;
        $composer2.useNode();
        goto L66
    L58:
        heightModifier = Modifier.Companion;
        goto L59
    L21:
        r6 = 128;
        goto L22
    L23:
        r11 = titleContentColor;
        goto L25
    }

    private static final void HorizontalMonthsList(final LazyListState lazyListState, final Long selectedDateMillis, final Function1<? super Long, Unit> r22, final Function1<? super Long, Unit> r23, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        final LazyListState r1 = lazyListState;
        Composer $composer2 = $composer.startRestartGroup(-1994757941);
        ComposerKt.sourceInformation($composer2, "C(HorizontalMonthsList)P(3,7,4,5!1,8,2,6)1659@76284L158,1665@76504L5,1665@76511L1365,1665@76447L1429,1696@77912L228,1696@77882L258:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(r1) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(selectedDateMillis) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
        goto L18
    L14:
        r5 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        final Function1<? super Long, Unit> r6 = r22;
        if ($composer2.changedInstance(r6) == false) goto L22;
        int r8 = 256;
    L23:
        $dirty = $dirty | r8;
    L26:
        if (($changed & 3072) != 0) goto L32;
        Function1<? super Long, Unit> r15 = r23;
        if ($composer2.changedInstance(r15) == false) goto L30;
        int r9 = 2048;
    L31:
        $dirty = $dirty | r9;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(calendarModel) == false) goto L38;
        int r10 = 16384;
    L39:
        $dirty = $dirty | r10;
        goto L41
    L38:
        r10 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changedInstance(yearRange) == false) goto L45;
        int r11 = 131072;
    L46:
        $dirty = $dirty | r11;
        goto L48
    L45:
        r11 = 65536;
    L48:
        if ((1572864 & $changed) != 0) goto L58;
        if ((2097152 & $changed) != 0) goto L52;
        boolean r12 = $composer2.changed(dateFormatter);
    L53:
        if (r12 == false) goto L55;
        int r13 = 1048576;
    L56:
        $dirty = $dirty | r13;
        goto L58
    L55:
        r13 = 524288;
        goto L56
    L52:
        r12 = $composer2.changedInstance(dateFormatter);
    L58:
        if ((12582912 & $changed) != 0) goto L64;
        SelectableDates r14 = selectableDates;
        if ($composer2.changed(r14) == false) goto L62;
        int r16 = 8388608;
    L63:
        $dirty = $dirty | r16;
    L66:
        if ((100663296 & $changed) != 0) goto L72;
        DatePickerColors r17 = colors;
        if ($composer2.changed(r17) == false) goto L70;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r18;
    L74:
        if ((38347923 & $dirty) != 38347922) goto L80;
        if ($composer2.getSkipping() == false) goto L80;
        $composer2.skipToGroupEnd();
    L107:
        ScopeUpdateScope r19 = $composer2.endRestartGroup();
        if (r19 == null) goto L111;
        r19.updateScope(new C05003(r1, selectedDateMillis, r22, r23, calendarModel, yearRange, dateFormatter, selectableDates, colors, $changed));
        return;
    L111:
        return;
    L80:
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventStart(-1994757941, $dirty, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1656)");
    L82:
        final CalendarDate today = calendarModel.getToday();
        ComposerKt.sourceInformationMarkerStart($composer2, -1217520394, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(yearRange);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L85;
    L88:
        Object value$iv = calendarModel.getMonth(yearRange.getFirst(), 1);
        $composer2.updateRememberedValue(value$iv);
    L89:
        final CalendarMonth firstMonth = (CalendarMonth) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty2 = $dirty;
        final DatePickerColors r110 = r17;
        final SelectableDates r20 = r14;
        TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), $composer2, 6), ComposableLambdaKt.rememberComposableLambda(1504086906, true, new AnonymousClass1(lazyListState, yearRange, calendarModel, firstMonth, r6, today, selectedDateMillis, dateFormatter, r20, r110), $composer2, 54), $composer2, 48);
        ComposerKt.sourceInformationMarkerStart($composer2, -1217468228, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L92;
        boolean r0 = true;
    L94:
        if (($dirty2 & 7168) != 2048) goto L96;
        boolean r111 = true;
    L97:
        boolean invalid$iv2 = ((r0 | r111) | $composer2.changedInstance(calendarModel)) | $composer2.changedInstance(yearRange);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L100;
    L103:
        r1 = lazyListState;
        DatePickerKt$HorizontalMonthsList$2$1 value$iv2 = new DatePickerKt$HorizontalMonthsList$2$1(r1, r15, calendarModel, yearRange, null);
        $composer2.updateRememberedValue(value$iv2);
    L104:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r1, (Function2) value$iv2, $composer2, $dirty2 & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
        goto L107
    L100:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L103;
        r1 = lazyListState;
        value$iv2 = it$iv2;
        goto L104
    L96:
        r111 = false;
        goto L97
    L92:
        r0 = false;
        goto L94
    L85:
        if (it$iv == Composer.Companion.getEmpty()) goto L88;
        value$iv = it$iv;
        goto L89
    L70:
        r18 = 33554432;
        goto L71
    L72:
        r17 = colors;
        goto L74
    L62:
        r16 = 4194304;
        goto L63
    L64:
        r14 = selectableDates;
        goto L66
    L30:
        r9 = 1024;
        goto L31
    L32:
        r15 = r23;
        goto L34
    L22:
        r8 = 128;
        goto L23
    L24:
        r6 = r22;
        goto L26
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final Function1<? super Long, Unit> r3, final CalendarModel calendarModel, final IntRange yearRange, Continuation<? super Unit> r6) {
        Object r0 = SnapshotStateKt.snapshotFlow(new C05102(lazyListState)).collect(new C05113(lazyListState, r3, calendarModel, yearRange), r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public static final void WeekDays(final DatePickerColors colors, final CalendarModel calendarModel, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1849465391);
        ComposerKt.sourceInformation($composer2, "C(WeekDays)P(1)1739@79443L5,1741@79454L974:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(colors) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(calendarModel) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L75:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L84;
        r3.updateScope(new C05032(colors, calendarModel, $changed));
        return;
    L84:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-1849465391, $dirty, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1728)");
    L25:
        int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
        List<Pair<String, String>> r8 = calendarModel.getWeekdayNames();
        ArrayList dayNames = new ArrayList();
        int i = firstDayOfWeek - 1;
        int r9 = r8.size();
    L26:
        if (i >= r9) goto L28;
        dayNames.add(r8.get(i));
        i = i + 1;
        goto L26
    L28:
        int i2 = 0;
        int r10 = firstDayOfWeek - 1;
    L29:
        if (i2 >= r10) goto L31;
        dayNames.add(r8.get(i2));
        i2 = i2 + 1;
        goto L29
    L31:
        TextStyle textStyle = TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont(), $composer2, 6);
        Modifier modifier$iv = SizeKt.fillMaxWidth$default(SizeKt.m757defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, RecommendedSizeForAccessibility, 1, null), 0.0f, 1, null);
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceEvenly();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        int $changed$iv$iv = (438 << 3) & 112;
        String r15 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        String r5 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L34;
        ComposablesKt.invalidApplier();
    L34:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L37;
        $composer2.createNode(r17);
    L38:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L44;
        ArrayList dayNames2 = dayNames;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L46;
    L45:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r4);
    L46:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r11 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r12 = RowScopeInstance.INSTANCE;
        int $changed2 = ((438 >> 6) & 112) | 6;
        Function0<ComposeUiNode> r18 = r17;
        Composer $composer4 = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer4, -602795257, "C:DatePicker.kt#uh7d8r");
        $composer4.startReplaceGroup(396197267);
        ComposerKt.sourceInformation($composer4, "*1750@79820L33,1748@79738L674");
        ArrayList $this$fastForEach$iv = dayNames2;
        int $i$f$fastForEach = $this$fastForEach$iv.size();
        int index$iv = 0;
    L47:
        if (index$iv >= $i$f$fastForEach) goto L72;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        List $this$fastForEach$iv2 = $this$fastForEach$iv;
        final Pair it = (Pair) item$iv;
        int r57 = $i$f$fastForEach;
        Modifier.Companion r13 = Modifier.Companion;
        int index$iv2 = index$iv;
        int $changed3 = $changed2;
        ComposerKt.sourceInformationMarkerStart($composer4, -1458700563, "CC(remember):DatePicker.kt#9igjgp");
        boolean invalid$iv = $composer4.changed(it);
        Composer $this$cache$iv = $composer4;
        Object value$iv = $this$cache$iv.rememberedValue();
        if (invalid$iv == true) goto L54;
        Modifier modifier$iv2 = modifier$iv;
        if (value$iv != Composer.Companion.getEmpty()) goto L56;
    L55:
        value$iv = (Function1) new DatePickerKt$WeekDays$1$1$1$1(it);
        $this$cache$iv.updateRememberedValue(value$iv);
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer4);
        Modifier modifier$iv3 = SizeKt.m774sizeVpY3zN4(SemanticsModifierKt.clearAndSetSemantics(r13, (Function1) value$iv), RecommendedSizeForAccessibility, RecommendedSizeForAccessibility);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, r15);
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer4.getCurrentCompositionLocalMap();
        String r19 = r15;
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer4, modifier$iv3);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, r5);
        if (($composer4.getApplier() instanceof Applier) == true) goto L59;
        ComposablesKt.invalidApplier();
    L59:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L62;
        Function0<ComposeUiNode> r14 = r20;
        $composer4.createNode(r14);
    L63:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer4);
        String r71 = r5;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r16 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L70;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L70;
    L71:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r21 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r22 = BoxScopeInstance.INSTANCE;
        int r23 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 87886672, "C1757@80134L264:DatePicker.kt#uh7d8r");
        Composer $composer5 = $composer4;
        TextKt.m2820Text4IGK_g((String) it.getSecond(), SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), colors.m2146getWeekdayContentColor0d7_KjU(), 0, null, null, null, 0, null, TextAlign.m6828boximpl(TextAlign.Companion.m6835getCentere0LSkKk()), 0, 0, false, 0, 0, null, textStyle, $composer$iv, 48, 0, 65016);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        index$iv = index$iv2 + 1;
        verticalAlignment$iv = verticalAlignment$iv;
        measurePolicy$iv = measurePolicy$iv;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        $i$f$fastForEach = r57;
        $changed2 = $changed3;
        modifier$iv = modifier$iv2;
        r5 = r71;
        horizontalArrangement$iv = horizontalArrangement$iv;
        r15 = r19;
        $composer4 = $composer5;
        localMap$iv$iv = localMap$iv$iv;
        r18 = r18;
    L70:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r16);
        goto L71
    L62:
        r14 = r20;
        $composer4.useNode();
        goto L63
    L54:
        modifier$iv2 = modifier$iv;
        goto L55
    L72:
        Composer $composer6 = $composer4;
        $composer6.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer6);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventEnd();
        goto L75
    L44:
        dayNames2 = dayNames;
        goto L45
    L37:
        $composer2.useNode();
        goto L38
    }

    public static final void Month(final CalendarMonth month, final Function1<? super Long, Unit> r87, final long todayMillis, final Long startDateMillis, final Long endDateMillis, final SelectedRangeInfo rangeSelectionInfo, final DatePickerFormatter dateFormatter, final SelectableDates selectableDates, final DatePickerColors colors, Composer $composer, final int $changed) {
        final Function1<? super Long, Unit> r2 = r87;
        DatePickerFormatter r8 = dateFormatter;
        Composer $composer2 = $composer.startRestartGroup(-1912870997);
        ComposerKt.sourceInformation($composer2, "C(Month)P(3,4,8,7,2,5,1,6)1793@81233L15,1795@81275L5273:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        CalendarMonth r12 = month;
        if ($composer2.changed(r12) == false) goto L7;
        int r14 = 4;
    L8:
        $dirty = $dirty | r14;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(r2) == false) goto L15;
        int r15 = 32;
    L16:
        $dirty = $dirty | r15;
        goto L18
    L15:
        r15 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(todayMillis) == false) goto L22;
        int r16 = 256;
    L23:
        $dirty = $dirty | r16;
        goto L25
    L22:
        r16 = 128;
    L25:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changed(startDateMillis) == false) goto L29;
        int r17 = 2048;
    L30:
        $dirty = $dirty | r17;
        goto L32
    L29:
        r17 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(endDateMillis) == false) goto L36;
        int r18 = 16384;
    L37:
        $dirty = $dirty | r18;
        goto L39
    L36:
        r18 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changed(rangeSelectionInfo) == false) goto L43;
        int r19 = 131072;
    L44:
        $dirty = $dirty | r19;
        goto L46
    L43:
        r19 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L56;
        if ((2097152 & $changed) != 0) goto L50;
        boolean r110 = $composer2.changed(r8);
    L51:
        if (r110 == false) goto L53;
        int r111 = 1048576;
    L54:
        $dirty = $dirty | r111;
        goto L56
    L53:
        r111 = 524288;
        goto L54
    L50:
        r110 = $composer2.changedInstance(r8);
    L56:
        if ((12582912 & $changed) != 0) goto L64;
        if ($composer2.changed(selectableDates) == false) goto L60;
        int r112 = 8388608;
    L61:
        $dirty = $dirty | r112;
        goto L64
    L60:
        r112 = 4194304;
    L64:
        if (($changed & 100663296) != 0) goto L71;
        if ($composer2.changed(colors) == false) goto L68;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L69:
        $dirty = $dirty | r113;
        goto L71
    L68:
        r113 = 33554432;
    L71:
        if (($dirty & 38347923) != 38347922) goto L77;
        if ($composer2.getSkipping() == false) goto L77;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L239:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L247;
        r13.updateScope(new C05012(month, r87, todayMillis, startDateMillis, endDateMillis, rangeSelectionInfo, dateFormatter, selectableDates, colors, $changed));
        return;
    L247:
        return;
    L77:
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventStart(-1912870997, $dirty, -1, "androidx.compose.material3.Month (DatePicker.kt:1782)");
    L79:
        $composer2.startReplaceGroup(1821433443);
        ComposerKt.sourceInformation($composer2, "1785@81016L143");
        String r114 = "CC(remember):DatePicker.kt#9igjgp";
        if (rangeSelectionInfo == null) goto L97;
        Modifier.Companion r1 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1821435596, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty & 458752) != 131072) goto L84;
        boolean r0 = true;
    L85:
        boolean r24 = r0;
        if (($dirty & 234881024) != 67108864) goto L88;
        boolean r3 = true;
    L89:
        boolean invalid$iv = r24 | r3;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L92;
    L95:
        Object value$iv = (Function1) new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(rangeSelectionInfo, colors);
        $composer2.updateRememberedValue(value$iv);
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion rangeSelectionDrawModifier = DrawModifierKt.drawWithContent(r1, (Function1) value$iv);
    L98:
        $composer2.endReplaceGroup();
        Locale defaultLocale = CalendarLocale_androidKt.defaultLocale($composer2, 0);
        Modifier.Companion r4 = Modifier.Companion;
        float arg0$iv = RecommendedSizeForAccessibility;
        Modifier modifier$iv = SizeKt.m761requiredHeight3ABfNKs(r4, Dp.m6973constructorimpl(6 * arg0$iv)).then(rangeSelectionDrawModifier);
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getSpaceEvenly();
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        int $changed$iv$iv = (48 << 3) & 112;
        String r5 = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r115 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        int r38 = 6;
        String r6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L101;
        ComposablesKt.invalidApplier();
    L101:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L104;
        Function0<ComposeUiNode> r7 = r115;
        $composer2.createNode(r7);
    L105:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r9 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L112;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L112;
    L113:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r10 = ($changed$iv$iv$iv >> 6) & 14;
        int r11 = 0;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r20 = ColumnScopeInstance.INSTANCE;
        int r40 = ((48 >> 6) & 112) | 6;
        Composer $composer4 = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer4, 1403534943, "C:DatePicker.kt#uh7d8r");
        $composer4.startReplaceGroup(-647461340);
        ComposerKt.sourceInformation($composer4, "*1802@81567L4965");
        int weekIndex = 0;
        int cellIndex = 0;
    L114:
        int cellIndex2 = cellIndex;
        int cellIndex3 = r38;
        if (weekIndex >= cellIndex3) goto L236;
        int weekIndex2 = weekIndex;
        Modifier materialized$iv$iv2 = materialized$iv$iv;
        int r46 = r11;
        Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceEvenly();
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer4, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer4, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        int $changed$iv$iv2 = (438 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, r5);
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer4.getCurrentCompositionLocalMap();
        String r55 = r5;
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer4, modifier$iv2);
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        Function0<ComposeUiNode> r116 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, r6);
        if (($composer4.getApplier() instanceof Applier) == true) goto L119;
        ComposablesKt.invalidApplier();
    L119:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L122;
        $composer4.createNode(r116);
    L123:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer4);
        String r61 = r6;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L130;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L130;
    L131:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer4;
        int cellIndex4 = 0;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r23 = RowScopeInstance.INSTANCE;
        int $changed2 = ((438 >> 6) & 112) | 6;
        Composer $composer5 = $composer$iv;
        ComposerKt.sourceInformationMarkerStart($composer5, 1554692074, "C:DatePicker.kt#uh7d8r");
        $composer5.startReplaceGroup(-88395975);
        ComposerKt.sourceInformation($composer5, "");
        int dayIndex = 0;
        int cellIndex5 = cellIndex2;
    L132:
        int r75 = cellIndex4;
        if (dayIndex >= 7) goto L235;
        if (cellIndex5 < r12.getDaysFromStartOfWeekToFirstOfMonth()) goto L233;
        if (cellIndex5 >= (r12.getDaysFromStartOfWeekToFirstOfMonth() + r12.getNumberOfDays())) goto L233;
        $composer5.startReplaceGroup(1555370911);
        ComposerKt.sourceInformation($composer5, "1842@83738L365,1858@84596L39,1864@85003L567,1882@86070L376,1855@84427L2019");
        final int dayNumber = cellIndex5 - r12.getDaysFromStartOfWeekToFirstOfMonth();
        dayIndex = dayIndex;
        cellIndex5 = cellIndex5;
        final long dateInMillis = r12.getStartUtcTimeMillis() + (((long) dayNumber) * CalendarModelKt.MillisecondsIn24Hours);
        if (dateInMillis != todayMillis) goto L142;
        boolean isToday = true;
    L143:
        if (startDateMillis != null) goto L146;
    L148:
        boolean startDateSelected = false;
    L149:
        if (endDateMillis != null) goto L152;
    L154:
        boolean endDateSelected = false;
    L155:
        $changed2 = $changed2;
        $composer5.startReplaceGroup(-88360892);
        ComposerKt.sourceInformation($composer5, "1830@83074L435");
        if (rangeSelectionInfo == null) goto L183;
        ComposerKt.sourceInformationMarkerStart($composer5, -88358994, r114);
        Composer $composer6 = $composer5;
        if (($dirty2 & 458752) != 131072) goto L160;
        boolean r25 = true;
    L161:
        boolean invalid$iv2 = r25 | $composer2.changed(dateInMillis);
        Object value$iv2 = $composer6.rememberedValue();
        if (invalid$iv2 == true) goto L169;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L169;
    L182:
        ComposerKt.sourceInformationMarkerEnd($composer6);
        boolean inRange = ((Boolean) ((MutableState) value$iv2).getValue()).booleanValue();
    L184:
        $composer6.endReplaceGroup();
        if (rangeSelectionInfo == null) goto L187;
        boolean r66 = true;
    L188:
        String dayContentDescription = dayContentDescription(r66, isToday, startDateSelected, endDateSelected, inRange, $composer6, 0);
        Composer $composer7 = $composer6;
        Composer $composer8 = $composer4;
        String formattedDateDescription = r8.formatDate(Long.valueOf(dateInMillis), defaultLocale, true);
        if (formattedDateDescription != null) goto L191;
        formattedDateDescription = "";
    L191:
        Modifier.Companion r117 = Modifier.Companion;
        if (startDateSelected == true) goto L196;
        if (endDateSelected == true) goto L196;
        boolean r118 = false;
    L197:
        defaultLocale = defaultLocale;
        ComposerKt.sourceInformationMarkerStart($composer7, -88310686, r114);
        if (($dirty2 & 112) != 32) goto L200;
        boolean r26 = true;
    L201:
        boolean invalid$iv3 = r26 | $composer2.changed(dateInMillis);
        Object it$iv2 = $composer7.rememberedValue();
        if (invalid$iv3 == true) goto L208;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L208;
        Object value$iv3 = it$iv2;
    L209:
        Function0 r27 = (Function0) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer7);
        ComposerKt.sourceInformationMarkerStart($composer7, -88297134, r114);
        boolean r28 = $composer2.changed(dateInMillis);
        if (($dirty2 & 29360128) != 8388608) goto L212;
        boolean r29 = true;
    L213:
        boolean invalid$iv4 = r28 | r29;
        Object value$iv4 = $composer7.rememberedValue();
        if (invalid$iv4 == true) goto L219;
        Function0 r82 = r27;
        if (value$iv4 == Composer.Companion.getEmpty()) goto L221;
    L227:
        boolean r30 = ((Boolean) value$iv4).booleanValue();
        ComposerKt.sourceInformationMarkerEnd($composer7);
        if (dayContentDescription == null) goto L230;
        String r31 = dayContentDescription + ", " + formattedDateDescription;
    L231:
        String r119 = r31;
        $composer2 = $composer2;
        r116 = r116;
        measurePolicy$iv = measurePolicy$iv;
        $composer4 = $composer8;
        boolean startDateSelected2 = startDateSelected;
        Function0 factory$iv$iv$iv = r82;
        r114 = r114;
        Day(r117, r118, factory$iv$iv$iv, startDateSelected2, r30, isToday, inRange, r119, colors, ComposableLambdaKt.rememberComposableLambda(-2095706591, true, new DatePickerKt$Month$1$1$3(dayNumber), $composer7, 54), $composer7, 805306374 | ($dirty2 & 234881024));
        $composer5 = $composer7;
        $composer5.endReplaceGroup();
    L234:
        r12 = month;
        r2 = r87;
        r8 = dateFormatter;
        measurePolicy$iv = measurePolicy$iv;
        $composer4 = $composer4;
        r116 = r116;
        cellIndex5 = cellIndex5 + 1;
        dayIndex = dayIndex + 1;
        $composer2 = $composer2;
        verticalAlignment$iv = verticalAlignment$iv;
        r114 = r114;
        defaultLocale = defaultLocale;
        cellIndex4 = r75;
        $changed2 = $changed2;
        goto L132
    L230:
        r31 = formattedDateDescription;
    L221:
        if (selectableDates.isSelectableYear(r12.getYear()) == true) goto L223;
    L225:
        boolean r32 = false;
    L226:
        value$iv4 = Boolean.valueOf(r32);
        $composer7.updateRememberedValue(value$iv4);
        goto L227
    L223:
        if (selectableDates.isSelectableDate(dateInMillis) == false) goto L225;
        r32 = true;
        goto L226
    L219:
        r82 = r27;
        goto L221
    L212:
        r29 = false;
    L208:
        value$iv3 = (Function0) new DatePickerKt$Month$1$1$1$1(r2, dateInMillis);
        $composer7.updateRememberedValue(value$iv3);
        goto L209
    L200:
        r26 = false;
    L196:
        r118 = true;
        goto L197
    L187:
        r66 = false;
    L169:
        if (startDateMillis == null) goto L171;
        long r79 = startDateMillis.longValue();
    L173:
        if (dateInMillis < r79) goto L180;
        if (endDateMillis == null) goto L176;
        long r710 = endDateMillis.longValue();
    L178:
        if (dateInMillis > r710) goto L180;
        boolean r70 = true;
    L181:
        value$iv2 = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(r70), null, 2, null);
        $composer6.updateRememberedValue(value$iv2);
        goto L182
    L176:
        r710 = Long.MIN_VALUE;
    L180:
        r70 = false;
        goto L181
    L171:
        r79 = Long.MAX_VALUE;
        goto L173
    L160:
        r25 = false;
        goto L161
    L183:
        $composer6 = $composer5;
        verticalAlignment$iv = verticalAlignment$iv;
        inRange = false;
        goto L184
    L152:
        if (dateInMillis != endDateMillis.longValue()) goto L154;
        endDateSelected = true;
        goto L155
    L146:
        if (dateInMillis != startDateMillis.longValue()) goto L148;
        startDateSelected = true;
        goto L149
    L142:
        isToday = false;
    L233:
        $composer5.startReplaceGroup(1554856342);
        ComposerKt.sourceInformation($composer5, "1814@82149L315");
        SpacerKt.Spacer(SizeKt.m766requiredSizeVpY3zN4(Modifier.Companion, RecommendedSizeForAccessibility, RecommendedSizeForAccessibility), $composer5, 6);
        $composer5.endReplaceGroup();
        goto L234
    L235:
        int cellIndex6 = cellIndex5;
        Composer $composer9 = $composer4;
        $composer5.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer9.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer9);
        ComposerKt.sourceInformationMarkerEnd($composer9);
        ComposerKt.sourceInformationMarkerEnd($composer9);
        r12 = month;
        r2 = r87;
        r8 = dateFormatter;
        weekIndex = weekIndex2 + 1;
        r38 = 6;
        materialized$iv$iv = materialized$iv$iv2;
        r11 = r46;
        $dirty = $dirty2;
        r5 = r55;
        r6 = r61;
        defaultLocale = defaultLocale;
        cellIndex = cellIndex6;
    L130:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r21);
        goto L131
    L122:
        $composer4.useNode();
        goto L123
    L236:
        $composer3 = $composer2;
        Composer $composer10 = $composer4;
        $composer10.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L239;
        ComposerKt.traceEventEnd();
    L112:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r9);
        goto L113
    L104:
        r7 = r115;
        $composer2.useNode();
        goto L105
    L92:
        if (it$iv == Composer.Companion.getEmpty()) goto L95;
        value$iv = it$iv;
        goto L96
    L88:
        r3 = false;
        goto L89
    L84:
        r0 = false;
        goto L85
    L97:
        rangeSelectionDrawModifier = Modifier.Companion;
        goto L98
    L7:
        r14 = 2;
        goto L8
    L9:
        r12 = month;
        goto L11
    }

    public static final int numberOfMonthsInRange(IntRange yearRange) {
        return ((yearRange.getLast() - yearRange.getFirst()) + 1) * 12;
    }

    private static final String dayContentDescription(boolean rangeSelectionEnabled, boolean isToday, boolean isStartDate, boolean isEndDate, boolean isInRange, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 502032503, "C(dayContentDescription)P(4,3,2):DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(502032503, $changed, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1909)");
    L5:
        StringBuilder descriptionBuilder = new StringBuilder();
        $composer.startReplaceGroup(-647730741);
        ComposerKt.sourceInformation($composer, "");
        boolean r1 = false;
        if (rangeSelectionEnabled == false) goto L14;
        if (isStartDate == false) goto L9;
        $composer.startReplaceGroup(-647727716);
        ComposerKt.sourceInformation($composer, "1914@87077L56");
        Strings.Companion r2 = Strings.Companion;
        descriptionBuilder.append(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_start_headline), $composer, 0));
        $composer.endReplaceGroup();
        goto L14
    L9:
        if (isEndDate == false) goto L11;
        $composer.startReplaceGroup(-647723718);
        ComposerKt.sourceInformation($composer, "1916@87202L54");
        Strings.Companion r3 = Strings.Companion;
        descriptionBuilder.append(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_end_headline), $composer, 0));
        $composer.endReplaceGroup();
        goto L14
    L11:
        if (isInRange == false) goto L13;
        $composer.startReplaceGroup(-647719783);
        ComposerKt.sourceInformation($composer, "1918@87325L53");
        Strings.Companion r4 = Strings.Companion;
        descriptionBuilder.append(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_range_picker_day_in_range), $composer, 0));
        $composer.endReplaceGroup();
        goto L14
    L13:
        $composer.startReplaceGroup(1395591750);
        $composer.endReplaceGroup();
    L14:
        $composer.endReplaceGroup();
        $composer.startReplaceGroup(-647717033);
        ComposerKt.sourceInformation($composer, "1923@87526L54");
        if (isToday == true) goto L17;
    L23:
        $composer.endReplaceGroup();
        if (descriptionBuilder.length() != 0) goto L26;
        r1 = true;
    L26:
        if (r1 == false) goto L28;
        String r5 = null;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r5;
    L28:
        r5 = descriptionBuilder.toString();
        goto L30
    L17:
        if (descriptionBuilder.length() <= 0) goto L19;
        boolean r6 = true;
    L20:
        if (r6 == false) goto L22;
        descriptionBuilder.append(", ");
    L22:
        Strings.Companion r7 = Strings.Companion;
        descriptionBuilder.append(Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_date_picker_today_description), $composer, 0));
        goto L23
    L19:
        r6 = false;
        goto L20
    }

    private static final void Day(final Modifier modifier, final boolean selected, final Function0<Unit> r23, final boolean animateChecked, final boolean enabled, final boolean today, final boolean inRange, final String description, final DatePickerColors colors, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1434777861);
        ComposerKt.sourceInformation($composer2, "C(Day)P(6,8,7!1,4,9,5,3)1951@88438L114,1956@88638L5,1959@88697L83,1963@88864L190,1979@89366L319,1942@88009L1676:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(selected) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(r23) == false) goto L21;
        int r7 = 256;
    L22:
        $dirty = $dirty | r7;
        goto L25
    L21:
        r7 = 128;
    L25:
        if (($changed & 3072) != 0) goto L31;
        boolean r8 = animateChecked;
        if ($composer2.changed(r8) == false) goto L29;
        int r9 = 2048;
    L30:
        $dirty = $dirty | r9;
    L33:
        if (($changed & 24576) != 0) goto L39;
        boolean r10 = enabled;
        if ($composer2.changed(r10) == false) goto L37;
        int r11 = 16384;
    L38:
        $dirty = $dirty | r11;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changed(today) == false) goto L45;
        int r12 = 131072;
    L46:
        $dirty = $dirty | r12;
        goto L48
    L45:
        r12 = 65536;
    L48:
        if ((1572864 & $changed) != 0) goto L54;
        boolean r13 = inRange;
        if ($composer2.changed(r13) == false) goto L52;
        int r14 = 1048576;
    L53:
        $dirty = $dirty | r14;
    L56:
        if ((12582912 & $changed) != 0) goto L63;
        if ($composer2.changed(description) == false) goto L60;
        int r15 = 8388608;
    L61:
        $dirty = $dirty | r15;
        goto L63
    L60:
        r15 = 4194304;
    L63:
        if ((100663296 & $changed) != 0) goto L69;
        DatePickerColors r16 = colors;
        if ($composer2.changed(r16) == false) goto L67;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L68:
        $dirty = $dirty | r17;
    L71:
        if ((805306368 & $changed) == 0) goto L73;
    L77:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty2) != 306783378) goto L84;
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L105:
        ScopeUpdateScope r18 = $composer3.endRestartGroup();
        if (r18 == null) goto L109;
        r18.updateScope(new C04993(modifier, selected, r23, animateChecked, enabled, today, inRange, description, colors, r30, $changed));
        return;
    L109:
        return;
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(-1434777861, $dirty2, -1, "androidx.compose.material3.Day (DatePicker.kt:1941)");
    L86:
        ComposerKt.sourceInformationMarkerStart($composer2, 67509195, "CC(remember):DatePicker.kt#9igjgp");
        if ((29360128 & $dirty2) != 8388608) goto L89;
        boolean invalid$iv = true;
    L90:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L93;
    L96:
        Object value$iv = (Function1) new DatePickerKt$Day$1$1(description);
        $composer2.updateRememberedValue(value$iv);
    L97:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r0 = SemanticsModifierKt.semantics(modifier, true, (Function1) value$iv);
        Shape r19 = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getDateContainerShape(), $composer2, 6);
        DatePickerColors r2 = r16;
        long r110 = r2.dayContainerColor$material3_release(selected, r10, r8, $composer2, (((($dirty2 >> 3) & 14) | (($dirty2 >> 9) & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 15) & 7168)).getValue().m4376unboximpl();
        long r3 = colors.dayContentColor$material3_release(today, selected, r13, enabled, $composer2, ((((($dirty2 >> 15) & 14) | ($dirty2 & 112)) | (($dirty2 >> 12) & 896)) | (($dirty2 >> 3) & 7168)) | (57344 & ($dirty2 >> 12))).getValue().m4376unboximpl();
        if (today == false) goto L101;
        if (selected == true) goto L101;
        BorderStroke r111 = BorderStrokeKt.m261BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m3272getDateTodayContainerOutlineWidthD9Ej5fM(), colors.m2145getTodayDateBorderColor0d7_KjU());
    L102:
        $composer3 = $composer2;
        SurfaceKt.m2671Surfaced85dljk(selected, r23, r0, enabled, r19, r110, r3, 0.0f, 0.0f, r111, null, ComposableLambdaKt.rememberComposableLambda(-2031780827, true, new C04982(r30), $composer2, 54), $composer3, ((($dirty2 >> 3) & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 7168), 48, 1408);
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventEnd();
    L101:
        r111 = null;
        goto L102
    L93:
        if (it$iv == Composer.Companion.getEmpty()) goto L96;
        value$iv = it$iv;
        goto L97
    L89:
        invalid$iv = false;
        goto L90
    L73:
        if ($composer2.changedInstance(r30) == false) goto L75;
        int r112 = 536870912;
    L76:
        $dirty = $dirty | r112;
        goto L77
    L75:
        r112 = 268435456;
        goto L76
    L67:
        r17 = 33554432;
        goto L68
    L69:
        r16 = colors;
        goto L71
    L52:
        r14 = 524288;
        goto L53
    L54:
        r13 = inRange;
        goto L56
    L37:
        r11 = 8192;
        goto L38
    L39:
        r10 = enabled;
        goto L41
    L29:
        r9 = 1024;
        goto L30
    L31:
        r8 = animateChecked;
        goto L33
    }

    private static final void YearPicker(final Modifier modifier, final long displayedMonthMillis, final Function1<? super Integer, Unit> r23, final SelectableDates selectableDates, final CalendarModel calendarModel, final IntRange yearRange, final DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1286899812);
        ComposerKt.sourceInformation($composer2, "C(YearPicker)P(3,2,4,5!1,6)2004@90070L5,2004@90077L4227,2004@89996L4308:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r2 = modifier;
        if ($composer2.changed(r2) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
    L11:
        if (($changed & 48) != 0) goto L17;
        final long r13 = displayedMonthMillis;
        if ($composer2.changed(r13) == false) goto L15;
        int r4 = 32;
    L16:
        $dirty = $dirty | r4;
    L19:
        if (($changed & 384) != 0) goto L25;
        Function1<? super Integer, Unit> r5 = r23;
        if ($composer2.changedInstance(r5) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L33;
        SelectableDates r7 = selectableDates;
        if ($composer2.changed(r7) == false) goto L31;
        int r8 = 2048;
    L32:
        $dirty = $dirty | r8;
    L35:
        if (($changed & 24576) != 0) goto L41;
        CalendarModel r9 = calendarModel;
        if ($composer2.changedInstance(r9) == false) goto L39;
        int r10 = 16384;
    L40:
        $dirty = $dirty | r10;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        IntRange r11 = yearRange;
        if ($composer2.changedInstance(r11) == false) goto L47;
        int r12 = 131072;
    L48:
        $dirty = $dirty | r12;
    L51:
        if ((1572864 & $changed) != 0) goto L57;
        DatePickerColors r14 = colors;
        if ($composer2.changed(r14) == false) goto L55;
        int r15 = 1048576;
    L56:
        $dirty = $dirty | r15;
    L59:
        if ((599187 & $dirty) != 599186) goto L65;
        if ($composer2.getSkipping() == false) goto L65;
        $composer2.skipToGroupEnd();
    L70:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L74;
        r16.updateScope(new C05072(modifier, displayedMonthMillis, r23, selectableDates, calendarModel, yearRange, colors, $changed));
        return;
    L74:
        return;
    L65:
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(-1286899812, $dirty, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:2003)");
    L67:
        final Modifier r17 = r2;
        final Function1<? super Integer, Unit> r18 = r5;
        final SelectableDates r19 = r7;
        final CalendarModel r110 = r9;
        final IntRange r111 = r11;
        final DatePickerColors r112 = r14;
        TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont(), $composer2, 6), ComposableLambdaKt.rememberComposableLambda(1301915789, true, new C05061(r110, r13, r111, r112, r17, r18, r19), $composer2, 54), $composer2, 48);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
        goto L70
    L55:
        r15 = 524288;
        goto L56
    L57:
        r14 = colors;
        goto L59
    L47:
        r12 = 65536;
        goto L48
    L49:
        r11 = yearRange;
        goto L51
    L39:
        r10 = 8192;
        goto L40
    L41:
        r9 = calendarModel;
        goto L43
    L31:
        r8 = 1024;
        goto L32
    L33:
        r7 = selectableDates;
        goto L35
    L23:
        r6 = 128;
        goto L24
    L25:
        r5 = r23;
        goto L27
    L15:
        r4 = 16;
        goto L16
    L17:
        r13 = displayedMonthMillis;
        goto L19
    L7:
        r3 = 2;
        goto L8
    L9:
        r2 = modifier;
        goto L11
    }

    private static final void Year(final Modifier modifier, final boolean selected, final boolean currentYear, final Function0<Unit> r24, final boolean enabled, final String description, final DatePickerColors colors, final Function2<? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(238547184);
        ComposerKt.sourceInformation($composer2, "C(Year)P(5,7,2,6,4,3)2099@94618L393,2117@95386L102,2122@95584L5,2123@95614L58,2126@95739L83,2129@95878L106,2110@95016L968:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r11 = 4;
    L8:
        $dirty = $dirty | r11;
        goto L10
    L7:
        r11 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(selected) == false) goto L14;
        int r12 = 32;
    L15:
        $dirty = $dirty | r12;
        goto L17
    L14:
        r12 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(currentYear) == false) goto L21;
        int r13 = 256;
    L22:
        $dirty = $dirty | r13;
        goto L24
    L21:
        r13 = 128;
    L24:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changedInstance(r24) == false) goto L28;
        int r14 = 2048;
    L29:
        $dirty = $dirty | r14;
        goto L32
    L28:
        r14 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changed(enabled) == false) goto L36;
        int r15 = 16384;
    L37:
        $dirty = $dirty | r15;
        goto L39
    L36:
        r15 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changed(description) == false) goto L43;
        int r16 = 131072;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L53;
        if ($composer2.changed(colors) == false) goto L50;
        int r17 = 1048576;
    L51:
        $dirty = $dirty | r17;
        goto L53
    L50:
        r17 = 524288;
    L53:
        if ((12582912 & $changed) != 0) goto L60;
        if ($composer2.changedInstance(r28) == false) goto L57;
        int r18 = 8388608;
    L58:
        $dirty = $dirty | r18;
        goto L60
    L57:
        r18 = 4194304;
    L60:
        if ((4793491 & $dirty) != 4793490) goto L66;
        if ($composer2.getSkipping() == false) goto L66;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L102:
        ScopeUpdateScope r10 = $composer3.endRestartGroup();
        if (r10 == null) goto L106;
        r10.updateScope(new C05053(modifier, selected, currentYear, r24, enabled, description, colors, r28, $changed));
        return;
    L106:
        return;
    L66:
        if (ComposerKt.isTraceInProgress() == false) goto L68;
        ComposerKt.traceEventStart(238547184, $dirty, -1, "androidx.compose.material3.Year (DatePicker.kt:2097)");
    L68:
        ComposerKt.sourceInformationMarkerStart($composer2, -1682587287, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty & 896) != 256) goto L71;
        boolean r4 = true;
    L73:
        if (($dirty & 112) != 32) goto L75;
        boolean r19 = true;
    L76:
        boolean invalid$iv = r4 | r19;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L83;
        if (it$iv == Composer.Companion.getEmpty()) goto L83;
        $dirty = $dirty;
        Object value$iv = it$iv;
    L88:
        BorderStroke border = (BorderStroke) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1682563002, "CC(remember):DatePicker.kt#9igjgp");
        if (($dirty & 458752) != 131072) goto L91;
        boolean invalid$iv2 = true;
    L92:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L95;
    L98:
        Object value$iv2 = (Function1) new DatePickerKt$Year$1$1(description);
        $composer2.updateRememberedValue(value$iv2);
    L99:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3 = $composer2;
        SurfaceKt.m2671Surfaced85dljk(selected, r24, SemanticsModifierKt.semantics(modifier, true, (Function1) value$iv2), enabled, ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), $composer2, 6), colors.yearContainerColor$material3_release(selected, enabled, $composer2, ((($dirty >> 3) & 14) | (($dirty >> 9) & 112)) | (($dirty >> 12) & 896)).getValue().m4376unboximpl(), colors.yearContentColor$material3_release(currentYear, selected, enabled, $composer2, (((($dirty >> 6) & 14) | ($dirty & 112)) | (($dirty >> 6) & 896)) | (($dirty >> 9) & 7168)).getValue().m4376unboximpl(), 0.0f, 0.0f, border, null, ComposableLambdaKt.rememberComposableLambda(-1573188346, true, new C05042(r28), $composer2, 54), $composer3, ((($dirty >> 3) & 14) | (($dirty >> 6) & 112)) | (($dirty >> 3) & 7168), 48, 1408);
        if (ComposerKt.isTraceInProgress() == false) goto L102;
        ComposerKt.traceEventEnd();
        goto L102
    L95:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L98;
        value$iv2 = it$iv2;
        goto L99
    L91:
        invalid$iv2 = false;
    L83:
        if (currentYear == false) goto L86;
        if (selected == true) goto L86;
        value$iv = BorderStrokeKt.m261BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m3272getDateTodayContainerOutlineWidthD9Ej5fM(), colors.m2145getTodayDateBorderColor0d7_KjU());
    L87:
        $composer2.updateRememberedValue(value$iv);
    L86:
        value$iv = null;
        goto L87
    L75:
        r19 = false;
        goto L76
    L71:
        r4 = false;
        goto L73
    }

    private static final void MonthsNavigation(final Modifier modifier, final boolean nextAvailable, final boolean previousAvailable, final boolean yearPickerVisible, final String yearPickerText, final Function0<Unit> r39, final Function0<Unit> r40, final Function0<Unit> r41, DatePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-773929258);
        ComposerKt.sourceInformation($composer2, "C(MonthsNavigation)P(1,2,6,8,7,3,4,5)2151@96490L2049:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) != 0) goto L16;
        final boolean r9 = nextAvailable;
        if ($composer2.changed(r9) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
    L18:
        if (($changed & 384) != 0) goto L24;
        final boolean r7 = previousAvailable;
        if ($composer2.changed(r7) == false) goto L22;
        int r5 = 256;
    L23:
        $dirty = $dirty | r5;
    L26:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changed(yearPickerVisible) == false) goto L30;
        int r6 = 2048;
    L31:
        $dirty = $dirty | r6;
        goto L33
    L30:
        r6 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L39;
        final String r8 = yearPickerText;
        if ($composer2.changed(r8) == false) goto L37;
        int r10 = 16384;
    L38:
        $dirty = $dirty | r10;
    L41:
        if ((196608 & $changed) != 0) goto L47;
        Function0<Unit> r11 = r39;
        if ($composer2.changedInstance(r11) == false) goto L45;
        int r12 = 131072;
    L46:
        $dirty = $dirty | r12;
    L49:
        if ((1572864 & $changed) != 0) goto L57;
        if ($composer2.changedInstance(r40) == false) goto L53;
        int r13 = 1048576;
    L54:
        $dirty = $dirty | r13;
        goto L57
    L53:
        r13 = 524288;
    L57:
        if ((12582912 & $changed) != 0) goto L63;
        Function0<Unit> r14 = r41;
        if ($composer2.changedInstance(r14) == false) goto L61;
        int r15 = 8388608;
    L62:
        $dirty = $dirty | r15;
    L65:
        if ((100663296 & $changed) != 0) goto L71;
        DatePickerColors r16 = colors;
        if ($composer2.changed(r16) == false) goto L69;
        int r17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r17;
    L72:
        int $dirty2 = $dirty;
        if ((38347923 & $dirty2) != 38347922) goto L79;
        if ($composer2.getSkipping() == false) goto L79;
        $composer2.skipToGroupEnd();
    L103:
        ScopeUpdateScope r18 = $composer2.endRestartGroup();
        if (r18 == null) goto L107;
        final DatePickerColors r19 = r16;
        r18.updateScope(new C05022(modifier, nextAvailable, previousAvailable, yearPickerVisible, yearPickerText, r39, r40, r41, r19, $changed));
        return;
    L107:
        return;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventStart(-773929258, $dirty2, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:2150)");
    L81:
        Modifier modifier$iv = SizeKt.m761requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
        if (yearPickerVisible == false) goto L84;
        Arrangement.HorizontalOrVertical horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
    L85:
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L88;
        ComposablesKt.invalidApplier();
    L88:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L91;
        Function0<ComposeUiNode> r0 = r21;
        $composer2.createNode(r0);
    L92:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L99;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L99;
    L100:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r20 = RowScopeInstance.INSTANCE;
        int r25 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -856633141, "C2161@96905L1628,2161@96822L1711:DatePicker.kt#uh7d8r");
        final Function0<Unit> r22 = r14;
        final Function0<Unit> r23 = r11;
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(r16.m2137getNavigationContentColor0d7_KjU())), ComposableLambdaKt.rememberComposableLambda(-962805198, true, new DatePickerKt$MonthsNavigation$1$1(r22, yearPickerVisible, r8, r40, r7, r23, r9), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventEnd();
    L99:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L100
    L91:
        r0 = r21;
        $composer2.useNode();
        goto L92
    L84:
        horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
        goto L85
    L69:
        r17 = 33554432;
        goto L70
    L71:
        r16 = colors;
        goto L72
    L61:
        r15 = 4194304;
        goto L62
    L63:
        r14 = r41;
        goto L65
    L45:
        r12 = 65536;
        goto L46
    L47:
        r11 = r39;
        goto L49
    L37:
        r10 = 8192;
        goto L38
    L39:
        r8 = yearPickerText;
        goto L41
    L22:
        r5 = 128;
        goto L23
    L24:
        r7 = previousAvailable;
        goto L26
    L14:
        r4 = 16;
        goto L15
    L16:
        r9 = nextAvailable;
        goto L18
    }

    private static final void YearPickerMenuButton(final Function0<Unit> r19, final boolean expanded, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r22, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(409654418);
        ComposerKt.sourceInformation($composer2, "C(YearPickerMenuButton)P(3,1,2)2212@98959L7,2212@98909L58,2215@99024L453,2208@98780L697:DatePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r25 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        Function0<Unit> r3 = r19;
    L14:
        if ((r25 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L23:
        int r6 = r25 & 4;
        if (r6 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r7 = modifier;
    L35:
        if ((r25 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L45:
        if (($dirty & 1171) == 1170) goto L47;
    L50:
        if (r6 == 0) goto L52;
        Modifier modifier2 = Modifier.Companion;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(409654418, $dirty, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:2207)");
    L56:
        RoundedCornerShape r0 = RoundedCornerShapeKt.getCircleShape();
        ButtonDefaults r8 = ButtonDefaults.INSTANCE;
        ProvidableCompositionLocal<Color> r9 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ButtonColors r11 = r8.m1947textButtonColorsro_MJ88(0, ((Color) r10).m4376unboximpl(), 0, 0, $composer2, 24576, 13);
        ComposableLambda r12 = ComposableLambdaKt.rememberComposableLambda(1899012021, true, new C05081(r22, expanded), $composer2, 54);
        int r17 = (($dirty & 14) | 807075840) | (($dirty >> 3) & 112);
        Modifier modifier3 = modifier2;
        ButtonKt.TextButton(r3, modifier3, false, r0, r11, null, null, null, null, r12, $composer2, r17, 388);
        $composer2 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
    L59:
        final Modifier modifier4 = modifier3;
    L60:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L64;
        r13.updateScope(new C05092(r19, expanded, modifier4, r22, $changed, r25));
        return;
    L64:
        return;
    L52:
        modifier2 = r7;
        goto L54
    L47:
        if ($composer2.getSkipping() == false) goto L50;
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L60
    L38:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changedInstance(r22) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
        goto L45
    L42:
        r14 = 1024;
        goto L43
    L27:
        if (($changed & 384) != 0) goto L33;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L31;
        int r15 = 256;
    L32:
        $dirty = $dirty | r15;
        goto L35
    L31:
        r15 = 128;
        goto L32
    L33:
        r7 = modifier;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(expanded) == false) goto L21;
        int r16 = 32;
    L22:
        $dirty = $dirty | r16;
        goto L23
    L21:
        r16 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = r19;
        if ($composer2.changedInstance(r3) == false) goto L10;
        int r18 = 4;
    L11:
        $dirty = $dirty | r18;
        goto L14
    L10:
        r18 = 2;
        goto L11
    L12:
        r3 = r19;
        goto L14
    }

    private static final List<CustomAccessibilityAction> customScrollActions(final LazyGridState state, final CoroutineScope coroutineScope, String scrollUpLabel, String scrollDownLabel) {
        return CollectionsKt.listOf(new CustomAccessibilityAction[]{new CustomAccessibilityAction(scrollUpLabel, new DatePickerKt$customScrollActions$scrollUpAction$1(state, coroutineScope)), new CustomAccessibilityAction(scrollDownLabel, new DatePickerKt$customScrollActions$scrollDownAction$1(state, coroutineScope))});
    }

    static {
        RecommendedSizeForAccessibility = Dp.m6973constructorimpl(48);
        MonthYearHeight = Dp.m6973constructorimpl(56);
        DatePickerHorizontalPadding = Dp.m6973constructorimpl(12);
        DatePickerModeTogglePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(12), 3, null);
        DatePickerTitlePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(24), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(12), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m722PaddingValuesa9UjIt4$default(Dp.m6973constructorimpl(24), 0.0f, Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(12), 2, null);
        YearsVerticalPadding = Dp.m6973constructorimpl(16);
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }
}
