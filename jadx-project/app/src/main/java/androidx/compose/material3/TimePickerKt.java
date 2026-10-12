package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00012\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020#0(¢\u0006\u0002\b)H\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u001d\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u00101\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u00104\u001a-\u00105\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0003¢\u0006\u0002\u00107\u001a\u0015\u00108\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u00109\u001a\u001d\u0010:\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u0010;\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u0010<\u001a1\u0010=\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u0010>\u001a=\u0010?\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0003¢\u0006\u0002\u0010E\u001a)\u0010F\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u0010G\u001a%\u0010H\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010I\u001a8\u0010J\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010K\u001a\u00020LH\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a \u0010O\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u000203H\u0007\u001ab\u0010S\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00106\u001a\u00020T2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020#0V2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020X2\b\b\u0002\u0010Y\u001a\u00020Z2\b\b\u0002\u0010[\u001a\u00020\\2\u0006\u0010.\u001a\u00020/H\u0003ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a:\u0010_\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u00106\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010W\u001a\u00020X2\u0006\u0010.\u001a\u00020/H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001aQ\u0010b\u001a\u00020#2\u0006\u0010c\u001a\u0002032\u0006\u0010d\u001a\u00020C2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020#0(2\u0006\u0010.\u001a\u00020/2\u001c\u0010'\u001a\u0018\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020#0V¢\u0006\u0002\b)¢\u0006\u0002\bgH\u0003¢\u0006\u0002\u0010h\u001a\u001d\u0010i\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a%\u0010j\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u0010<\u001a1\u0010k\u001a\u00020#2\u0006\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\u0010>\u001a\u0018\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\bH\u0002\u001a(\u0010o\u001a\u00020\b2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\u00192\u0006\u0010s\u001a\u00020\u0019H\u0002\u001a*\u0010t\u001a\u00020u2\u0006\u0010W\u001a\u00020X2\u0006\u0010R\u001a\u0002032\u0006\u0010v\u001a\u00020\u0019H\u0001ø\u0001\u0000¢\u0006\u0004\bw\u0010x\u001a+\u0010y\u001a\u00020\u001a2\b\b\u0002\u0010P\u001a\u00020\u00192\b\b\u0002\u0010Q\u001a\u00020\u00192\b\b\u0002\u0010R\u001a\u000203H\u0007¢\u0006\u0002\u0010z\u001a`\u0010{\u001a\u00020#2\u0006\u0010W\u001a\u00020X2\u0006\u0010-\u001a\u00020\u001a2\u0006\u00106\u001a\u00020T2\u0006\u0010|\u001a\u00020T2\u0006\u0010}\u001a\u00020\u00192\"\u0010~\u001a\u001e\u0012\u0014\u0012\u00120T¢\u0006\r\b\u007f\u0012\t\b\u0080\u0001\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020#0VH\u0002ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001d\u0010\u0083\u0001\u001a\u00020%*\u00020%2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0002\u001a<\u0010\u0084\u0001\u001a\u00020#*\u00020\u001a2\u0006\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\b2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001aE\u0010\u008a\u0001\u001a\u00020#*\u00020\u001f2\u0006\u0010n\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\b2\u0006\u00102\u001a\u0002032\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0082@ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0016\u0010\u008d\u0001\u001a\u00020%*\u00020%2\u0007\u0010\u008d\u0001\u001a\u000203H\u0003\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0010\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u001d\u001a\u00020\u001e*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008e\u0001²\u0006\u000b\u0010\u008f\u0001\u001a\u000203X\u008a\u0084\u0002²\u0006\u000b\u0010\u0090\u0001\u001a\u00020TX\u008a\u008e\u0002²\u0006\u000b\u0010\u0091\u0001\u001a\u00020TX\u008a\u008e\u0002²\u0006\f\u0010\u0086\u0001\u001a\u00030\u0092\u0001X\u008a\u008e\u0002²\u0006\f\u0010\u0093\u0001\u001a\u00030\u0087\u0001X\u008a\u008e\u0002"}, d2 = {"ClockDisplayBottomMargin", "Landroidx/compose/ui/unit/Dp;", "F", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "ExtraHours", "Landroidx/collection/IntList;", "FullCircle", "", "HalfCircle", "Hours", "InnerCircleRadius", "MaxDistance", "MinimumInteractiveSize", "Minutes", "OuterCircleSizeRadius", "PeriodToggleMargin", "QuarterCircle", "", "RadiansPerHour", "RadiansPerMinute", "SeparatorZIndex", "SupportLabelTop", "TimeInputBottomPadding", "hourForDisplay", "", "Landroidx/compose/material3/TimePickerState;", "getHourForDisplay", "(Landroidx/compose/material3/TimePickerState;)I", "selectorPos", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/material3/AnalogTimePickerState;", "getSelectorPos", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "CircularLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "radius", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ClockDisplayNumbers", "state", "colors", "Landroidx/compose/material3/TimePickerColors;", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "autoSwitchToMinute", "", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "ClockText", "value", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "HorizontalTimePicker", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "PeriodToggleImpl", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "startShape", "Landroidx/compose/ui/graphics/Shape;", "endShape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "TimePicker", "layoutType", "Landroidx/compose/material3/TimePickerLayoutType;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePickerState", "initialHour", "initialMinute", "is24Hour", "TimePickerTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "selection", "Landroidx/compose/material3/TimePickerSelectionMode;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "TimePickerTextField-1vLObsk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimeSelector", "TimeSelector-SAnMeKU", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ToggleItem", "checked", "shape", "onClick", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "VerticalPeriodToggle", "VerticalTimePicker", "atan", "y", "x", "dist", "x1", "y1", "x2", "y2", "numberContentDescription", "", "number", "numberContentDescription-dSwYdS4", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "timeInputOnChange", "prevValue", "max", "onNewValue", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "timeInputOnChange-z7XvuPQ", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "drawSelector", "moveSelector", "maxDist", "center", "Landroidx/compose/ui/unit/IntOffset;", "moveSelector-d3b8Pxo", "(Landroidx/compose/material3/TimePickerState;FFFJ)V", "onTap", "onTap-rOwcSBo", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "visible", "material3_release", "a11yServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "parentCenter"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimePickerKt {
    private static final float ClockDisplayBottomMargin = 0.0f;
    private static final float ClockFaceBottomMargin = 0.0f;
    private static final float DisplaySeparatorWidth = 0.0f;
    private static final IntList ExtraHours = null;
    private static final float FullCircle = 6.2831855f;
    private static final float HalfCircle = 3.1415927f;
    private static final IntList Hours = null;
    private static final float InnerCircleRadius = 0.0f;
    private static final float MaxDistance = 0.0f;
    private static final float MinimumInteractiveSize = 0.0f;
    private static final IntList Minutes = null;
    private static final float OuterCircleSizeRadius = 0.0f;
    private static final float PeriodToggleMargin = 0.0f;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float SupportLabelTop = 0.0f;
    private static final float TimeInputBottomPadding = 0.0f;

    /* JADX INFO: renamed from: access$CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final /* synthetic */ void m2850access$CircularLayoutuFdPcIQ(Modifier modifier, float radius, Function2 content, Composer $composer, int $changed, int $default) {
        m2846CircularLayoutuFdPcIQ(modifier, radius, content, $composer, $changed, $default);
    }

    public static final /* synthetic */ void access$ClockDisplayNumbers(TimePickerState state, TimePickerColors colors, Composer $composer, int $changed) {
        ClockDisplayNumbers(state, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$ClockText(Modifier modifier, AnalogTimePickerState state, int value, boolean autoSwitchToMinute, Composer $composer, int $changed) {
        ClockText(modifier, state, value, autoSwitchToMinute, $composer, $changed);
    }

    public static final /* synthetic */ long access$ClockText$lambda$29(MutableState $center$delegate) {
        return ClockText$lambda$29($center$delegate);
    }

    public static final /* synthetic */ void access$ClockText$lambda$30(MutableState $center$delegate, long value) {
        ClockText$lambda$30($center$delegate, value);
    }

    public static final /* synthetic */ long access$ClockText$lambda$32(MutableState $parentCenter$delegate) {
        return ClockText$lambda$32($parentCenter$delegate);
    }

    public static final /* synthetic */ void access$ClockText$lambda$33(MutableState $parentCenter$delegate, long value) {
        ClockText$lambda$33($parentCenter$delegate, value);
    }

    public static final /* synthetic */ void access$DisplaySeparator(Modifier modifier, Composer $composer, int $changed) {
        DisplaySeparator(modifier, $composer, $changed);
    }

    public static final /* synthetic */ void access$HorizontalClockDisplay(TimePickerState state, TimePickerColors colors, Composer $composer, int $changed) {
        HorizontalClockDisplay(state, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$HorizontalPeriodToggle(Modifier modifier, TimePickerState state, TimePickerColors colors, Composer $composer, int $changed) {
        HorizontalPeriodToggle(modifier, state, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$PeriodToggleImpl(Modifier modifier, TimePickerState state, TimePickerColors colors, MeasurePolicy measurePolicy, Shape startShape, Shape endShape, Composer $composer, int $changed) {
        PeriodToggleImpl(modifier, state, colors, measurePolicy, startShape, endShape, $composer, $changed);
    }

    public static final /* synthetic */ void access$TimeInputImpl(Modifier modifier, TimePickerColors colors, TimePickerState state, Composer $composer, int $changed) {
        TimeInputImpl(modifier, colors, state, $composer, $changed);
    }

    public static final /* synthetic */ void access$TimeInputImpl$lambda$10(MutableState $minuteValue$delegate, TextFieldValue value) {
        TimeInputImpl$lambda$10($minuteValue$delegate, value);
    }

    public static final /* synthetic */ TextFieldValue access$TimeInputImpl$lambda$6(MutableState $hourValue$delegate) {
        return TimeInputImpl$lambda$6($hourValue$delegate);
    }

    public static final /* synthetic */ void access$TimeInputImpl$lambda$7(MutableState $hourValue$delegate, TextFieldValue value) {
        TimeInputImpl$lambda$7($hourValue$delegate, value);
    }

    public static final /* synthetic */ TextFieldValue access$TimeInputImpl$lambda$9(MutableState $minuteValue$delegate) {
        return TimeInputImpl$lambda$9($minuteValue$delegate);
    }

    /* JADX INFO: renamed from: access$TimePickerTextField-1vLObsk, reason: not valid java name */
    public static final /* synthetic */ void m2851access$TimePickerTextField1vLObsk(Modifier modifier, TextFieldValue value, Function1 onValueChange, TimePickerState state, int selection, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors colors, Composer $composer, int $changed, int $default) {
        m2848TimePickerTextField1vLObsk(modifier, value, onValueChange, state, selection, keyboardOptions, keyboardActions, colors, $composer, $changed, $default);
    }

    /* JADX INFO: renamed from: access$TimeSelector-SAnMeKU, reason: not valid java name */
    public static final /* synthetic */ void m2852access$TimeSelectorSAnMeKU(Modifier modifier, int value, TimePickerState state, int selection, TimePickerColors colors, Composer $composer, int $changed) {
        m2849TimeSelectorSAnMeKU(modifier, value, state, selection, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$ToggleItem(boolean checked, Shape shape, Function0 onClick, TimePickerColors colors, Function3 content, Composer $composer, int $changed) {
        ToggleItem(checked, shape, onClick, colors, content, $composer, $changed);
    }

    public static final /* synthetic */ void access$VerticalClockDisplay(TimePickerState state, TimePickerColors colors, Composer $composer, int $changed) {
        VerticalClockDisplay(state, colors, $composer, $changed);
    }

    public static final /* synthetic */ void access$VerticalPeriodToggle(Modifier modifier, TimePickerState state, TimePickerColors colors, Composer $composer, int $changed) {
        VerticalPeriodToggle(modifier, state, colors, $composer, $changed);
    }

    public static final /* synthetic */ float access$atan(float y, float x) {
        return atan(y, x);
    }

    public static final /* synthetic */ float access$getDisplaySeparatorWidth$p() {
        return DisplaySeparatorWidth;
    }

    public static final /* synthetic */ IntList access$getExtraHours$p() {
        return ExtraHours;
    }

    public static final /* synthetic */ IntList access$getHours$p() {
        return Hours;
    }

    public static final /* synthetic */ float access$getInnerCircleRadius$p() {
        return InnerCircleRadius;
    }

    public static final /* synthetic */ float access$getMaxDistance$p() {
        return MaxDistance;
    }

    public static final /* synthetic */ IntList access$getMinutes$p() {
        return Minutes;
    }

    public static final /* synthetic */ float access$getOuterCircleSizeRadius$p() {
        return OuterCircleSizeRadius;
    }

    /* JADX INFO: renamed from: access$moveSelector-d3b8Pxo, reason: not valid java name */
    public static final /* synthetic */ void m2853access$moveSelectord3b8Pxo(TimePickerState $receiver, float x, float y, float maxDist, long center) {
        m2856moveSelectord3b8Pxo($receiver, x, y, maxDist, center);
    }

    /* JADX INFO: renamed from: access$onTap-rOwcSBo, reason: not valid java name */
    public static final /* synthetic */ Object m2854access$onTaprOwcSBo(AnalogTimePickerState $receiver, float x, float y, float maxDist, boolean autoSwitchToMinute, long center, Continuation $completion) {
        return m2858onTaprOwcSBo($receiver, x, y, maxDist, autoSwitchToMinute, center, $completion);
    }

    /* JADX INFO: renamed from: access$timeInputOnChange-z7XvuPQ, reason: not valid java name */
    public static final /* synthetic */ void m2855access$timeInputOnChangez7XvuPQ(int selection, TimePickerState state, TextFieldValue value, TextFieldValue prevValue, int max, Function1 onNewValue) {
        m2859timeInputOnChangez7XvuPQ(selection, state, value, prevValue, max, onNewValue);
    }

    /* JADX INFO: renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    public static final void m2847TimePickermT9BvqQ(final TimePickerState state, Modifier modifier, TimePickerColors colors, int layoutType, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-619286452);
        ComposerKt.sourceInformation($composer2, "C(TimePicker)P(3,2!,1:c#material3.TimePickerLayoutType)218@11441L8,219@11509L12,221@11558L35,222@11616L48:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r22 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L27:
        if (($changed & 384) == 0) goto L29;
        TimePickerColors r7 = colors;
    L38:
        if (($changed & 3072) == 0) goto L40;
        int r8 = layoutType;
    L49:
        if (($dirty & 1171) == 1170) goto L51;
    L54:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L57;
    L66:
        if (r3 == 0) goto L68;
        Modifier.Companion modifier2 = Modifier.Companion;
    L70:
        if ((r22 & 4) == 0) goto L72;
        TimePickerColors colors2 = TimePickerDefaults.INSTANCE.colors($composer2, 6);
        $dirty = $dirty & (-897);
    L74:
        if ((r22 & 8) == 0) goto L76;
        Modifier r9 = modifier2;
        int $dirty2 = $dirty & (-7169);
        int $dirty3 = TimePickerDefaults.INSTANCE.m2845layoutTypesDNSZnc($composer2, 6);
        Modifier modifier3 = r9;
        TimePickerColors colors3 = colors2;
    L77:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L80;
        ComposerKt.traceEventStart(-619286452, $dirty2, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:220)");
    L80:
        boolean invalid$iv = false;
        State<Boolean> r13 = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, $composer2, 0, 3);
        ComposerKt.sourceInformationMarkerStart($composer2, -2089091954, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L83;
    L86:
        invalid$iv = true;
    L87:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L90;
    L93:
        Object value$iv = new AnalogTimePickerState(state);
        $composer2.updateRememberedValue(value$iv);
    L94:
        AnalogTimePickerState analogState = (AnalogTimePickerState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (TimePickerLayoutType.m2865equalsimpl0($dirty3, TimePickerLayoutType.Companion.m2870getVerticalQJTpgSE()) == false) goto L97;
        $composer2.startReplaceGroup(-337235422);
        ComposerKt.sourceInformation($composer2, "224@11728L178");
        VerticalTimePicker(analogState, modifier3, colors3, true ^ TimePicker_mT9BvqQ$lambda$0(r13), $composer2, ($dirty2 & 112) | ($dirty2 & 896), 0);
        $composer2.endReplaceGroup();
    L99:
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventEnd();
    L101:
        final int layoutType2 = $dirty3;
        final Modifier modifier4 = modifier3;
        final TimePickerColors colors4 = colors3;
    L102:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L106;
        r10.updateScope(new TimePickerKt$TimePicker$1(state, modifier4, colors4, layoutType2, $changed, r22));
        return;
    L106:
        return;
    L97:
        $composer2.startReplaceGroup(-337036960);
        ComposerKt.sourceInformation($composer2, "231@11928L180");
        HorizontalTimePicker(analogState, modifier3, colors3, true ^ TimePicker_mT9BvqQ$lambda$0(r13), $composer2, ($dirty2 & 112) | ($dirty2 & 896), 0);
        $composer2.endReplaceGroup();
        goto L99
    L90:
        if (it$iv == Composer.Companion.getEmpty()) goto L93;
        value$iv = it$iv;
        goto L94
    L83:
        if (($dirty2 & 8) == 0) goto L87;
        if ($composer2.changed(state) == false) goto L87;
    L76:
        modifier3 = modifier2;
        $dirty2 = $dirty;
        $dirty3 = r8;
        colors3 = colors2;
        goto L77
    L72:
        colors2 = r7;
        goto L74
    L68:
        modifier2 = r6;
        goto L70
    L57:
        if ($composer2.getDefaultsInvalid() == true) goto L66;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
    L63:
        if ((r22 & 8) == 0) goto L65;
        $dirty = $dirty & (-7169);
    L65:
        $dirty2 = $dirty;
        $dirty3 = r8;
        colors3 = r7;
        modifier3 = r6;
        goto L77
    L51:
        if ($composer2.getSkipping() == false) goto L54;
        $composer2.skipToGroupEnd();
        colors4 = r7;
        layoutType2 = r8;
        modifier4 = r6;
        goto L102
    L40:
        if ((r22 & 8) != 0) goto L44;
        r8 = layoutType;
        if ($composer2.changed(r8) == false) goto L45;
        int r11 = 2048;
    L46:
        $dirty = $dirty | r11;
    L45:
        r11 = 1024;
        goto L46
    L44:
        r8 = layoutType;
        goto L45
    L29:
        if ((r22 & 4) != 0) goto L33;
        r7 = colors;
        if ($composer2.changed(r7) == false) goto L34;
        int r12 = 256;
    L35:
        $dirty = $dirty | r12;
    L34:
        r12 = 128;
        goto L35
    L33:
        r7 = colors;
        goto L34
    L19:
        if (($changed & 48) != 0) goto L25;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L23;
        int r14 = 32;
    L24:
        $dirty = $dirty | r14;
        goto L27
    L23:
        r14 = 16;
        goto L24
    L25:
        r6 = modifier;
        goto L27
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r4 = $composer2.changed(state);
    L11:
        if (r4 == false) goto L13;
        int r5 = 4;
    L14:
        $dirty = $dirty | r5;
        goto L15
    L13:
        r5 = 2;
        goto L14
    L10:
        r4 = $composer2.changedInstance(state);
        goto L11
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    public static final void TimeInput(final TimePickerState state, Modifier modifier, TimePickerColors colors, Composer $composer, final int $changed, final int r13) {
        Composer $composer2 = $composer.startRestartGroup(-760850373);
        ComposerKt.sourceInformation($composer2, "C(TimeInput)P(2,1)259@12999L8,261@13017L38:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r13 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r2 = r13 & 2;
        if (r2 == 0) goto L19;
        $dirty = $dirty | 48;
    L26:
        if (($changed & 384) != 0) goto L35;
        if ((r13 & 4) == 0) goto L30;
    L32:
        int r3 = 128;
    L33:
        $dirty = $dirty | r3;
        goto L35
    L30:
        if ($composer2.changed(colors) == false) goto L32;
        r3 = 256;
    L35:
        if (($dirty & 147) == 146) goto L37;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L49:
        if (r2 == 0) goto L52;
        modifier = Modifier.Companion;
    L52:
        if ((r13 & 4) == 0) goto L55;
        colors = TimePickerDefaults.INSTANCE.colors($composer2, 6);
    L54:
        $dirty = $dirty & (-897);
    L55:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(-760850373, $dirty, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:260)");
    L58:
        TimeInputImpl(modifier, colors, state, $composer2, ((($dirty >> 3) & 14) | (($dirty >> 3) & 112)) | (($dirty << 6) & 896));
        if (ComposerKt.isTraceInProgress() == true) goto L60;
    L40:
        final Modifier modifier2 = modifier;
        final TimePickerColors colors2 = colors;
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L65;
        r9.updateScope(new C05811(state, modifier2, colors2, $changed, r13));
        return;
    L65:
        return;
    L60:
        ComposerKt.traceEventEnd();
        goto L40
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L49;
        $composer2.skipToGroupEnd();
        if ((r13 & 4) == 0) goto L55;
    L37:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        goto L40
    L19:
        if (($changed & 48) != 0) goto L26;
        if ($composer2.changed(modifier) == false) goto L23;
        int r4 = 32;
    L24:
        $dirty = $dirty | r4;
        goto L26
    L23:
        r4 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r5 = $composer2.changed(state);
    L11:
        if (r5 == false) goto L13;
        int r6 = 4;
    L14:
        $dirty = $dirty | r6;
        goto L15
    L13:
        r6 = 2;
        goto L14
    L10:
        r5 = $composer2.changedInstance(state);
        goto L11
    }

    public static final TimePickerState rememberTimePickerState(final int initialHour, final int initialMinute, boolean is24Hour, Composer $composer, int $changed, int r17) {
        ComposerKt.sourceInformationMarkerStart($composer, 1237715277, "C(rememberTimePickerState)572@28878L14,575@29014L185,575@28960L239:TimePicker.kt#uh7d8r");
        if ((r17 & 1) == 0) goto L6;
        initialHour = 0;
    L6:
        if ((r17 & 2) == 0) goto L8;
        initialMinute = 0;
    L8:
        boolean r3 = false;
        if ((r17 & 4) == 0) goto L11;
        final boolean is24Hour2 = TimeFormat_androidKt.is24HourFormat($composer, 0);
    L13:
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventStart(1237715277, $changed, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)");
    L15:
        Object[] r0 = new Object[0];
        Saver<TimePickerStateImpl, ?> r2 = TimePickerStateImpl.Companion.Saver();
        ComposerKt.sourceInformationMarkerStart($composer, -1964549601, "CC(remember):TimePicker.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L20;
        if ($composer.changed(initialHour) == false) goto L20;
    L21:
        boolean r1 = true;
    L24:
        if ((($changed & 112) ^ 48) <= 32) goto L28;
        if ($composer.changed(initialMinute) == false) goto L28;
    L29:
        boolean r5 = true;
    L31:
        boolean r4 = r1 | r5;
        if ((($changed & 896) ^ 384) <= 256) goto L36;
        if ($composer.changed(is24Hour2) == false) goto L36;
    L37:
        r3 = true;
    L38:
        boolean invalid$iv = r4 | r3;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L41;
    L44:
        Object value$iv = (Function0) new TimePickerKt$rememberTimePickerState$state$1$1(initialHour, initialMinute, is24Hour2);
        $composer.updateRememberedValue(value$iv);
    L45:
        ComposerKt.sourceInformationMarkerEnd($composer);
        TimePickerStateImpl state = (TimePickerStateImpl) RememberSaveableKt.m3923rememberSaveable(r0, r2, null, (Function0) value$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L48;
        ComposerKt.traceEventEnd();
    L48:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return state;
    L41:
        if (it$iv == Composer.Companion.getEmpty()) goto L44;
        value$iv = it$iv;
    L36:
        if (($changed & 384) != 256) goto L38;
    L28:
        if (($changed & 48) == 32) goto L29;
        r5 = false;
    L20:
        if (($changed & 6) == 4) goto L21;
        r1 = false;
        goto L24
    L11:
        is24Hour2 = is24Hour;
        goto L13
    }

    public static final TimePickerState TimePickerState(int initialHour, int initialMinute, boolean is24Hour) {
        return new TimePickerStateImpl(initialHour, initialMinute, is24Hour);
    }

    public static final int getHourForDisplay(TimePickerState $this$hourForDisplay) {
        if ($this$hourForDisplay.is24hour() == false) goto L6;
        return $this$hourForDisplay.getHour() % 24;
    L6:
        if (($this$hourForDisplay.getHour() % 12) != 0) goto L9;
        return 12;
    L9:
        if ($this$hourForDisplay.isAfternoon() == false) goto L12;
        return $this$hourForDisplay.getHour() - 12;
    L12:
        return $this$hourForDisplay.getHour();
    }

    /* JADX INFO: renamed from: moveSelector-d3b8Pxo, reason: not valid java name */
    private static final void m2856moveSelectord3b8Pxo(TimePickerState $this$moveSelector_u2dd3b8Pxo, float x, float y, float maxDist, long center) {
        if (TimePickerSelectionMode.m2874equalsimpl0($this$moveSelector_u2dd3b8Pxo.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == true) goto L5;
        return;
    L5:
        if ($this$moveSelector_u2dd3b8Pxo.is24hour() == true) goto L7;
        return;
    L7:
        if (dist(x, y, IntOffset.m7101getXimpl(center), IntOffset.m7102getYimpl(center)) >= maxDist) goto L9;
        boolean r0 = true;
    L10:
        $this$moveSelector_u2dd3b8Pxo.setAfternoon(r0);
        return;
    L9:
        r0 = false;
        goto L10
    }

    /* JADX INFO: renamed from: onTap-rOwcSBo, reason: not valid java name */
    private static final Object m2858onTaprOwcSBo(AnalogTimePickerState $this$onTap_u2drOwcSBo, float x, float y, float maxDist, boolean autoSwitchToMinute, long center, Continuation<? super Unit> r15) {
        if ((r15 instanceof TimePickerKt$onTap$1) == false) goto L7;
        TimePickerKt$onTap$1 r0 = (TimePickerKt$onTap$1) r15;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        boolean autoSwitchToMinute2 = r0.Z$0;
        AnalogTimePickerState $this$onTap_u2drOwcSBo2 = (AnalogTimePickerState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L29:
        if (autoSwitchToMinute2 == false) goto L32;
        $this$onTap_u2drOwcSBo2.mo1888setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI());
    L32:
        return Unit.INSTANCE;
    L13:
        autoSwitchToMinute2 = r0.Z$0;
        $this$onTap_u2drOwcSBo2 = (AnalogTimePickerState) r0.L$0;
        ResultKt.throwOnFailure($result);
    L23:
        if (TimePickerSelectionMode.m2874equalsimpl0($this$onTap_u2drOwcSBo2.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L29;
        if (autoSwitchToMinute2 == false) goto L29;
        r0.L$0 = $this$onTap_u2drOwcSBo2;
        r0.Z$0 = autoSwitchToMinute2;
        r0.label = 2;
        if (DelayKt.delay(100, r0) != r1) goto L29;
        return r1;
    L14:
        ResultKt.throwOnFailure($result);
        float angle = atan(y - IntOffset.m7102getYimpl(center), x - IntOffset.m7101getXimpl(center));
        if (TimePickerSelectionMode.m2874equalsimpl0($this$onTap_u2drOwcSBo.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L17;
        float angle2 = (((float) Math.rint((angle / RadiansPerMinute) / 5.0f)) * 5.0f) * RadiansPerMinute;
    L18:
        m2856moveSelectord3b8Pxo($this$onTap_u2drOwcSBo, x, y, maxDist, center);
        r0.L$0 = $this$onTap_u2drOwcSBo;
        r0.Z$0 = autoSwitchToMinute;
        r0.label = 1;
        if ($this$onTap_u2drOwcSBo.rotateTo(angle2, true, r0) != r1) goto L21;
        return r1;
    L21:
        $this$onTap_u2drOwcSBo2 = $this$onTap_u2drOwcSBo;
        autoSwitchToMinute2 = autoSwitchToMinute;
        goto L23
    L17:
        angle2 = ((float) Math.rint(angle / RadiansPerHour)) * RadiansPerHour;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new TimePickerKt$onTap$1(r15);
        goto L8
    }

    public static final long getSelectorPos(AnalogTimePickerState $this$selectorPos) {
        float arg0$iv = Dp.m6973constructorimpl(TimePickerTokens.INSTANCE.m3667getClockDialSelectorHandleContainerSizeD9Ej5fM() / 2);
        if ($this$selectorPos.is24hour() == true) goto L5;
    L9:
        float arg0$iv2 = OuterCircleSizeRadius;
    L10:
        float length = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv2 - arg0$iv) + arg0$iv);
        float other$iv = (float) Math.cos($this$selectorPos.getCurrentAngle());
        float arg0$iv3 = Dp.m6973constructorimpl(Dp.m6973constructorimpl(length * other$iv) + Dp.m6973constructorimpl(TimePickerTokens.INSTANCE.m3665getClockDialContainerSizeD9Ej5fM() / 2));
        float other$iv2 = (float) Math.sin($this$selectorPos.getCurrentAngle());
        return DpKt.m6994DpOffsetYgX7TsA(arg0$iv3, Dp.m6973constructorimpl(Dp.m6973constructorimpl(length * other$iv2) + Dp.m6973constructorimpl(TimePickerTokens.INSTANCE.m3665getClockDialContainerSizeD9Ej5fM() / 2)));
    L5:
        if ($this$selectorPos.isAfternoon() == false) goto L9;
        if (TimePickerSelectionMode.m2874equalsimpl0($this$selectorPos.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L9;
        arg0$iv2 = InnerCircleRadius;
        goto L10
    }

    public static final void VerticalTimePicker(final AnalogTimePickerState state, Modifier modifier, TimePickerColors colors, final boolean autoSwitchToMinute, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1249591487);
        ComposerKt.sourceInformation($composer2, "C(VerticalTimePicker)P(3,2,1)927@40188L8,930@40238L379:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r34 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        TimePickerColors colors2 = colors;
    L35:
        if ((r34 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L45:
        if (($dirty & 1171) == 1170) goto L47;
    L50:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L53;
    L59:
        if (r3 == 0) goto L61;
        Modifier.Companion modifier2 = Modifier.Companion;
    L63:
        if ((r34 & 4) == 0) goto L65;
        $dirty = $dirty & (-897);
        colors2 = TimePickerDefaults.INSTANCE.colors($composer2, 6);
    L65:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L68;
        ComposerKt.traceEventStart(1249591487, $dirty, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:929)");
    L68:
        Modifier modifier$iv = SemanticsModifierKt.semantics$default(modifier2, false, C05861.INSTANCE, 1, null);
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        int $dirty2 = $dirty;
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L71;
        ComposablesKt.invalidApplier();
    L71:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L74;
        Function0<ComposeUiNode> r0 = r17;
        $composer2.createNode(r0);
    L75:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L82;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L82;
    L83:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r4 = ColumnScopeInstance.INSTANCE;
        int r7 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1628603633, "C934@40388L35,935@40432L60,936@40501L44,937@40554L57:TimePicker.kt#uh7d8r");
        VerticalClockDisplay(state, colors2, $composer2, ($dirty2 & 14) | (($dirty2 >> 3) & 112));
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), $composer2, 6);
        ClockFace(state, colors2, autoSwitchToMinute, $composer2, (($dirty2 & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 896));
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, ClockFaceBottomMargin), $composer2, 6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventEnd();
    L86:
        final TimePickerColors colors3 = colors2;
        final Modifier modifier4 = modifier3;
    L87:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L91;
        r9.updateScope(new C05873(state, modifier4, colors3, autoSwitchToMinute, $changed, r34));
        return;
    L91:
        return;
    L82:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
        goto L83
    L74:
        r0 = r17;
        $composer2.useNode();
        goto L75
    L61:
        modifier2 = r6;
        goto L63
    L53:
        if ($composer2.getDefaultsInvalid() == true) goto L59;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L58;
        $dirty = $dirty & (-897);
    L58:
        modifier2 = r6;
        goto L65
    L47:
        if ($composer2.getSkipping() == false) goto L50;
        $composer2.skipToGroupEnd();
        colors3 = colors2;
        modifier4 = r6;
        goto L87
    L38:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changed(autoSwitchToMinute) == false) goto L42;
        int r10 = 2048;
    L43:
        $dirty = $dirty | r10;
        goto L45
    L42:
        r10 = 1024;
        goto L43
    L26:
        if ((r34 & 4) != 0) goto L30;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L31;
        int r11 = 256;
    L32:
        $dirty = $dirty | r11;
    L31:
        r11 = 128;
        goto L32
    L30:
        colors2 = colors;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L24
    L20:
        r8 = 16;
        goto L21
    L22:
        r6 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(state) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    public static final void HorizontalTimePicker(final AnalogTimePickerState state, Modifier modifier, TimePickerColors colors, final boolean autoSwitchToMinute, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1432307537);
        ComposerKt.sourceInformation($composer2, "C(HorizontalTimePicker)P(3,2,1)945@40787L8,948@40837L309:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r34 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        TimePickerColors colors2 = colors;
    L35:
        if ((r34 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L45:
        if (($dirty & 1171) == 1170) goto L47;
    L50:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L53;
    L59:
        if (r3 == 0) goto L61;
        Modifier.Companion modifier2 = Modifier.Companion;
    L63:
        if ((r34 & 4) == 0) goto L65;
        $dirty = $dirty & (-897);
        Modifier modifier3 = modifier2;
        colors2 = TimePickerDefaults.INSTANCE.colors($composer2, 6);
    L66:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventStart(1432307537, $dirty, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:947)");
    L69:
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, ClockFaceBottomMargin, 7, null);
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L72;
        ComposablesKt.invalidApplier();
    L72:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L75;
        Function0<ComposeUiNode> r0 = r17;
        $composer2.createNode(r0);
    L76:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L82;
        int $changed$iv = 384;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L84;
    L83:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
    L84:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r4 = RowScopeInstance.INSTANCE;
        int r7 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 157723300, "C952@40982L37,953@41028L59,954@41096L44:TimePicker.kt#uh7d8r");
        HorizontalClockDisplay(state, colors2, $composer2, ($dirty2 & 14) | (($dirty2 >> 3) & 112));
        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.Companion, ClockDisplayBottomMargin), $composer2, 6);
        ClockFace(state, colors2, autoSwitchToMinute, $composer2, (($dirty2 & 14) | (($dirty2 >> 3) & 112)) | (($dirty2 >> 3) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L87;
        ComposerKt.traceEventEnd();
    L87:
        final Modifier modifier4 = modifier3;
        final TimePickerColors colors3 = colors2;
    L88:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L92;
        r8.updateScope(new C05792(state, modifier4, colors3, autoSwitchToMinute, $changed, r34));
        return;
    L92:
        return;
    L82:
        $changed$iv = 384;
        goto L83
    L75:
        r0 = r17;
        $composer2.useNode();
        goto L76
    L65:
        modifier3 = modifier2;
        goto L66
    L61:
        modifier2 = r6;
        goto L63
    L53:
        if ($composer2.getDefaultsInvalid() == true) goto L59;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L58;
        $dirty = $dirty & (-897);
    L58:
        modifier3 = r6;
        goto L66
    L47:
        if ($composer2.getSkipping() == false) goto L50;
        $composer2.skipToGroupEnd();
        modifier4 = r6;
        colors3 = colors2;
        goto L88
    L38:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changed(autoSwitchToMinute) == false) goto L42;
        int r9 = 2048;
    L43:
        $dirty = $dirty | r9;
        goto L45
    L42:
        r9 = 1024;
        goto L43
    L26:
        if ((r34 & 4) != 0) goto L30;
        colors2 = colors;
        if ($composer2.changed(colors2) == false) goto L31;
        int r10 = 256;
    L32:
        $dirty = $dirty | r10;
    L31:
        r10 = 128;
        goto L32
    L30:
        colors2 = colors;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L20;
        int r11 = 32;
    L21:
        $dirty = $dirty | r11;
        goto L24
    L20:
        r11 = 16;
        goto L21
    L22:
        r6 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(state) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    private static final void TimeInputImpl(final Modifier modifier, final TimePickerColors colors, final TimePickerState state, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-475657989);
        ComposerKt.sourceInformation($composer2, "C(TimeInputImpl)P(1)965@41356L112,965@41304L164,969@41552L104,969@41500L156,972@41661L4502:TimePicker.kt#uh7d8r");
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
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(colors) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
        goto L17
    L14:
        r4 = 16;
    L17:
        if (($changed & 384) != 0) goto L27;
        if (($changed & 512) != 0) goto L21;
        boolean r5 = $composer2.changed(state);
    L22:
        if (r5 == false) goto L24;
        int r6 = 256;
    L25:
        $dirty = $dirty | r6;
        goto L27
    L24:
        r6 = 128;
        goto L25
    L21:
        r5 = $composer2.changedInstance(state);
    L27:
        if (($dirty & 147) != 146) goto L33;
        if ($composer2.getSkipping() == false) goto L33;
        $composer2.skipToGroupEnd();
    L104:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L108;
        r1.updateScope(new C05822(modifier, colors, state, $changed));
        return;
    L108:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-475657989, $dirty, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:963)");
    L35:
        Object[] r10 = new Object[0];
        Saver<TextFieldValue, Object> r11 = TextFieldValue.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer2, 339122986, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty & 896) != 256) goto L38;
    L43:
        boolean invalid$iv = true;
    L44:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L47;
    L50:
        Object value$iv = (Function0) new TimePickerKt$TimeInputImpl$hourValue$2$1(state);
        $composer2.updateRememberedValue(value$iv);
    L51:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState hourValue$delegate = RememberSaveableKt.rememberSaveable(r10, r11, null, (Function0) value$iv, $composer2, 0, 4);
        Object[] r12 = new Object[0];
        Saver<TextFieldValue, Object> r13 = TextFieldValue.Companion.getSaver();
        ComposerKt.sourceInformationMarkerStart($composer2, 339129250, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty & 896) != 256) goto L54;
    L59:
        boolean invalid$iv2 = true;
    L60:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L63;
    L66:
        Object value$iv2 = (Function0) new TimePickerKt$TimeInputImpl$minuteValue$2$1(state);
        $composer2.updateRememberedValue(value$iv2);
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState minuteValue$delegate = RememberSaveableKt.rememberSaveable(r12, r13, null, (Function0) value$iv2, $composer2, 0, 4);
        int $dirty2 = $dirty;
        Modifier modifier$iv = PaddingKt.m729paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        int $changed$iv$iv = (384 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L70;
        ComposablesKt.invalidApplier();
    L70:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L73;
        Function0<ComposeUiNode> r2 = r23;
        $composer2.createNode(r2);
    L74:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L81;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L81;
    L82:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r8 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r9 = RowScopeInstance.INSTANCE;
        int r14 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1328966913, "C977@41861L5,986@42225L3553,982@42004L3774:TimePicker.kt#uh7d8r");
        TextStyle textStyle = TextStyle.m6430copyp1EtxEg$default(TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldLabelTextFont(), $composer2, 6), colors.m2843timeSelectorContentColorvNxB06k$material3_release(true), 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, TextAlign.Companion.m6835getCentere0LSkKk(), 0, 0, null, null, null, 0, 0, null, 16744446, null);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(textStyle), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(1306700887, true, new TimePickerKt$TimeInputImpl$1$1(hourValue$delegate, state, colors, minuteValue$delegate), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        $composer2.startReplaceGroup(511443242);
        ComposerKt.sourceInformation($composer2, "1073@45823L324");
        if (state.is24hour() == true) goto L100;
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv2);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L87;
        ComposablesKt.invalidApplier();
    L87:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L90;
        Function0<ComposeUiNode> r15 = r20;
        $composer2.createNode(r15);
    L91:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r16 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L97;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L99;
    L98:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r16);
    L99:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r17 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer3;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r18 = BoxScopeInstance.INSTANCE;
        int r19 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -415465671, "C1074@45891L242:TimePicker.kt#uh7d8r");
        VerticalPeriodToggle(SizeKt.m774sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m3660getPeriodSelectorContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3659getPeriodSelectorContainerHeightD9Ej5fM()), state, colors, $composer$iv, ((($dirty2 >> 3) & 112) | 6) | (($dirty2 << 3) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
    L101:
        $composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventEnd();
        goto L104
    L97:
        $composer3 = $composer2;
        goto L98
    L90:
        r15 = r20;
        $composer2.useNode();
        goto L91
    L100:
        $composer3 = $composer2;
    L81:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r7);
        goto L82
    L73:
        r2 = r23;
        $composer2.useNode();
        goto L74
    L63:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L66;
        value$iv2 = it$iv2;
        goto L67
    L54:
        if (($dirty & 512) != 0) goto L56;
    L58:
        invalid$iv2 = false;
        goto L60
    L56:
        if ($composer2.changedInstance(state) == false) goto L58;
    L47:
        if (it$iv == Composer.Companion.getEmpty()) goto L50;
        value$iv = it$iv;
        goto L51
    L38:
        if (($dirty & 512) != 0) goto L40;
    L42:
        invalid$iv = false;
        goto L44
    L40:
        if ($composer2.changedInstance(state) == false) goto L42;
        goto L42
    }

    private static final TextFieldValue TimeInputImpl$lambda$6(MutableState<TextFieldValue> r4) {
        MutableState<TextFieldValue> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void TimeInputImpl$lambda$7(MutableState<TextFieldValue> r4, TextFieldValue value) {
        r4.setValue(value);
    }

    private static final void TimeInputImpl$lambda$10(MutableState<TextFieldValue> r4, TextFieldValue value) {
        r4.setValue(value);
    }

    private static final TextFieldValue TimeInputImpl$lambda$9(MutableState<TextFieldValue> r4) {
        MutableState<TextFieldValue> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void HorizontalClockDisplay(final TimePickerState state, final TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(755539561);
        ComposerKt.sourceInformation($composer2, "C(HorizontalClockDisplay)P(1)1087@46270L590:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r6 = $composer2.changed(state);
    L8:
        if (r6 == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L7:
        r6 = $composer2.changedInstance(state);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changed(colors) == false) goto L17;
        int r8 = 32;
    L18:
        $dirty = $dirty | r8;
        goto L20
    L17:
        r8 = 16;
    L20:
        if (($dirty & 19) != 18) goto L26;
        if ($composer2.getSkipping() == false) goto L26;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L65:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L69;
        r3.updateScope(new C05772(state, colors, $changed));
        return;
    L69:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(755539561, $dirty, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)");
    L28:
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L31;
        ComposablesKt.invalidApplier();
    L31:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L34;
        Function0<ComposeUiNode> r4 = r18;
        $composer2.createNode(r4);
    L35:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L41;
        int $changed$iv = 48;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L43;
    L42:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r5);
    L43:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r10 = ColumnScopeInstance.INSTANCE;
        int r11 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1556019140, "C1088@46329L34:TimePicker.kt#uh7d8r");
        ClockDisplayNumbers(state, colors, $composer3, ($dirty2 & 14) | ($dirty2 & 112));
        $composer3.startReplaceGroup(919638492);
        ComposerKt.sourceInformation($composer3, "1090@46407L437");
        if (state.is24hour() == true) goto L61;
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L51;
        Function0<ComposeUiNode> r12 = r17;
        $composer3.createNode(r12);
    L52:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L58;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L60;
    L59:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r13);
    L60:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r14 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r16 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -743649264, "C1091@46484L346:TimePicker.kt#uh7d8r");
        HorizontalPeriodToggle(SizeKt.m774sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3671getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3670getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), state, colors, $composer$iv, ((($dirty2 << 3) & 112) | 6) | (($dirty2 << 3) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
    L62:
        $composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
        goto L65
    L58:
        $composer4 = $composer3;
        goto L59
    L51:
        r12 = r17;
        $composer3.useNode();
        goto L52
    L61:
        $composer4 = $composer3;
        goto L62
    L41:
        $changed$iv = 48;
        goto L42
    L34:
        r4 = r18;
        $composer2.useNode();
        goto L35
    }

    private static final void VerticalClockDisplay(final TimePickerState state, final TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2054675515);
        ComposerKt.sourceInformation($composer2, "C(VerticalClockDisplay)P(1)1107@46965L585:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r6 = $composer2.changed(state);
    L8:
        if (r6 == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L7:
        r6 = $composer2.changedInstance(state);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changed(colors) == false) goto L17;
        int r8 = 32;
    L18:
        $dirty = $dirty | r8;
        goto L20
    L17:
        r8 = 16;
    L20:
        if (($dirty & 19) != 18) goto L26;
        if ($composer2.getSkipping() == false) goto L26;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L65:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L69;
        r3.updateScope(new C05842(state, colors, $changed));
        return;
    L69:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(2054675515, $dirty, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)");
    L28:
        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L31;
        ComposablesKt.invalidApplier();
    L31:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L34;
        Function0<ComposeUiNode> r4 = r18;
        $composer2.createNode(r4);
    L35:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L41;
        int $changed$iv = 48;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L43;
    L42:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r5);
    L43:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r9 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance r10 = RowScopeInstance.INSTANCE;
        int r11 = (($changed$iv >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -519240274, "C1108@47023L34:TimePicker.kt#uh7d8r");
        ClockDisplayNumbers(state, colors, $composer3, ($dirty2 & 14) | ($dirty2 & 112));
        $composer3.startReplaceGroup(-709485014);
        ComposerKt.sourceInformation($composer3, "1110@47101L433");
        if (state.is24hour() == true) goto L61;
        Modifier modifier$iv2 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L51;
        Function0<ComposeUiNode> r12 = r17;
        $composer3.createNode(r12);
    L52:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L58;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L60;
    L59:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r13);
    L60:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r14 = ($changed$iv$iv$iv2 >> 6) & 14;
        Composer $composer$iv = $composer4;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r15 = BoxScopeInstance.INSTANCE;
        int r16 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 204292100, "C1111@47180L340:TimePicker.kt#uh7d8r");
        VerticalPeriodToggle(SizeKt.m774sizeVpY3zN4(Modifier.Companion, TimePickerTokens.INSTANCE.m3674getPeriodSelectorVerticalContainerWidthD9Ej5fM(), TimePickerTokens.INSTANCE.m3673getPeriodSelectorVerticalContainerHeightD9Ej5fM()), state, colors, $composer$iv, ((($dirty2 << 3) & 112) | 6) | (($dirty2 << 3) & 896));
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
    L62:
        $composer4.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
        goto L65
    L58:
        $composer4 = $composer3;
        goto L59
    L51:
        r12 = r17;
        $composer3.useNode();
        goto L52
    L61:
        $composer4 = $composer3;
        goto L62
    L41:
        $changed$iv = 48;
        goto L42
    L34:
        r4 = r18;
        $composer2.useNode();
        goto L35
    }

    private static final void ClockDisplayNumbers(final TimePickerState state, final TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-934561141);
        ComposerKt.sourceInformation($composer2, "C(ClockDisplayNumbers)P(1)1128@47738L5,1131@47873L775,1127@47654L994:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L13;
        if (($changed & 8) != 0) goto L7;
        boolean r2 = $composer2.changed(state);
    L8:
        if (r2 == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L13
    L10:
        r3 = 2;
        goto L11
    L7:
        r2 = $composer2.changedInstance(state);
    L13:
        if (($changed & 48) != 0) goto L20;
        if ($composer2.changed(colors) == false) goto L17;
        int r4 = 32;
    L18:
        $dirty = $dirty | r4;
        goto L20
    L17:
        r4 = 16;
    L20:
        if (($dirty & 19) != 18) goto L26;
        if ($composer2.getSkipping() == false) goto L26;
        $composer2.skipToGroupEnd();
    L31:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L35;
        r0.updateScope(new AnonymousClass2(state, colors, $changed));
        return;
    L35:
        return;
    L26:
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventStart(-934561141, $dirty, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)");
    L28:
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont(), $composer2, 6)), CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr)}, ComposableLambdaKt.rememberComposableLambda(-477913269, true, new AnonymousClass1(state, colors), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
        goto L31
    }

    private static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState state, TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1261215927);
        ComposerKt.sourceInformation($composer2, "C(HorizontalPeriodToggle)P(1,2)1160@48810L1014,1188@49871L5,1190@49902L206:TimePicker.kt#uh7d8r");
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
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r2 = $composer2.changed(state);
    L15:
        if (r2 == false) goto L17;
        int r3 = 32;
    L18:
        $dirty = $dirty | r3;
        goto L20
    L17:
        r3 = 16;
        goto L18
    L14:
        r2 = $composer2.changedInstance(state);
    L20:
        if (($changed & 384) != 0) goto L27;
        if ($composer2.changed(colors) == false) goto L24;
        int r4 = 256;
    L25:
        $dirty = $dirty | r4;
        goto L27
    L24:
        r4 = 128;
    L27:
        if (($dirty & 147) != 146) goto L33;
        if ($composer2.getSkipping() == false) goto L33;
        $composer2.skipToGroupEnd();
        final Modifier modifier2 = modifier;
        final TimePickerState state2 = state;
        final TimePickerColors colors2 = colors;
    L42:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L46;
        r9.updateScope(new C05781(modifier2, state2, colors2, $changed));
        return;
    L46:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(1261215927, $dirty, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)");
    L35:
        ComposerKt.sourceInformationMarkerStart($composer2, 2071625362, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
        TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 value$iv = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.INSTANCE;
        $composer2.updateRememberedValue(value$iv);
    L39:
        MeasurePolicy measurePolicy = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Shape r0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), $composer2, 6);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape shape = (CornerBasedShape) r0;
        CornerBasedShape r5 = ShapesKt.start(shape);
        CornerBasedShape r6 = ShapesKt.end(shape);
        int r8 = ((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896);
        modifier2 = modifier;
        state2 = state;
        colors2 = colors;
        PeriodToggleImpl(modifier2, state2, colors2, measurePolicy, r5, r6, $composer2, r8);
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
        goto L42
    L38:
        value$iv = it$iv;
        goto L39
    }

    private static final void VerticalPeriodToggle(Modifier modifier, TimePickerState state, TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1898918107);
        ComposerKt.sourceInformation($composer2, "C(VerticalPeriodToggle)P(1,2)1206@50268L1021,1234@51336L5,1236@51367L207:TimePicker.kt#uh7d8r");
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
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r2 = $composer2.changed(state);
    L15:
        if (r2 == false) goto L17;
        int r3 = 32;
    L18:
        $dirty = $dirty | r3;
        goto L20
    L17:
        r3 = 16;
        goto L18
    L14:
        r2 = $composer2.changedInstance(state);
    L20:
        if (($changed & 384) != 0) goto L27;
        if ($composer2.changed(colors) == false) goto L24;
        int r4 = 256;
    L25:
        $dirty = $dirty | r4;
        goto L27
    L24:
        r4 = 128;
    L27:
        if (($dirty & 147) != 146) goto L33;
        if ($composer2.getSkipping() == false) goto L33;
        $composer2.skipToGroupEnd();
        final Modifier modifier2 = modifier;
        final TimePickerState state2 = state;
        final TimePickerColors colors2 = colors;
    L42:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L46;
        r9.updateScope(new C05851(modifier2, state2, colors2, $changed));
        return;
    L46:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-1898918107, $dirty, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)");
    L35:
        ComposerKt.sourceInformationMarkerStart($composer2, 1491514731, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L38;
        TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1 value$iv = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.INSTANCE;
        $composer2.updateRememberedValue(value$iv);
    L39:
        MeasurePolicy measurePolicy = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Shape r0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), $composer2, 6);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape shape = (CornerBasedShape) r0;
        CornerBasedShape r5 = ShapesKt.top(shape);
        CornerBasedShape r6 = ShapesKt.bottom(shape);
        int r8 = ((($dirty & 14) | 3072) | ($dirty & 112)) | ($dirty & 896);
        modifier2 = modifier;
        state2 = state;
        colors2 = colors;
        PeriodToggleImpl(modifier2, state2, colors2, measurePolicy, r5, r6, $composer2, r8);
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
        goto L42
    L38:
        value$iv = it$iv;
        goto L39
    }

    private static final void PeriodToggleImpl(final Modifier modifier, final TimePickerState state, final TimePickerColors colors, final MeasurePolicy measurePolicy, final Shape startShape, final Shape endShape, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1374241901);
        ComposerKt.sourceInformation($composer2, "C(PeriodToggleImpl)P(3,5!1,2,4)1258@51953L5,1259@52008L41,1263@52129L128,1260@52054L1189:TimePicker.kt#uh7d8r");
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
        if (($changed & 48) != 0) goto L20;
        if (($changed & 64) != 0) goto L14;
        boolean r6 = $composer2.changed(state);
    L15:
        if (r6 == false) goto L17;
        int r7 = 32;
    L18:
        $dirty = $dirty | r7;
        goto L20
    L17:
        r7 = 16;
        goto L18
    L14:
        r6 = $composer2.changedInstance(state);
    L20:
        if (($changed & 384) != 0) goto L26;
        TimePickerColors r12 = colors;
        if ($composer2.changed(r12) == false) goto L24;
        int r8 = 256;
    L25:
        $dirty = $dirty | r8;
    L28:
        if (($changed & 3072) != 0) goto L35;
        if ($composer2.changed(measurePolicy) == false) goto L32;
        int r9 = 2048;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 1024;
    L35:
        if (($changed & 24576) != 0) goto L41;
        Shape r10 = startShape;
        if ($composer2.changed(r10) == false) goto L39;
        int r11 = 16384;
    L40:
        $dirty = $dirty | r11;
    L43:
        if ((196608 & $changed) != 0) goto L49;
        Shape r13 = endShape;
        if ($composer2.changed(r13) == false) goto L47;
        int r14 = 131072;
    L48:
        $dirty = $dirty | r14;
    L51:
        if ((74899 & $dirty) != 74898) goto L57;
        if ($composer2.getSkipping() == false) goto L57;
        $composer2.skipToGroupEnd();
    L117:
        ScopeUpdateScope r15 = $composer2.endRestartGroup();
        if (r15 == null) goto L121;
        r15.updateScope(new C05803(modifier, state, colors, measurePolicy, startShape, endShape, $changed));
        return;
    L121:
        return;
    L57:
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventStart(1374241901, $dirty, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)");
    L59:
        BorderStroke borderStroke = BorderStrokeKt.m261BorderStrokecXLIe8U(TimePickerTokens.INSTANCE.m3672getPeriodSelectorOutlineWidthD9Ej5fM(), r12.m2830getPeriodSelectorBorderColor0d7_KjU());
        Shape r16 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), $composer2, 6);
        Intrinsics.checkNotNull(r16, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape shape = (CornerBasedShape) r16;
        Strings.Companion r17 = Strings.Companion;
        final String contentDescription = Strings_androidKt.m3101getString2EP1pXo(Strings.m3031constructorimpl(R.string.m3c_time_picker_period_toggle_description), $composer2, 0);
        ComposerKt.sourceInformationMarkerStart($composer2, -2132305224, "CC(remember):TimePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(contentDescription);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L62;
    L65:
        Object value$iv = (Function1) new TimePickerKt$PeriodToggleImpl$1$1(contentDescription);
        $composer2.updateRememberedValue(value$iv);
    L66:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r18 = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) value$iv, 1, null)), borderStroke, shape);
        int $changed$iv = ($dirty >> 3) & 896;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, r18);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L69;
        ComposablesKt.invalidApplier();
    L69:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L72;
        $composer2.createNode(r21);
    L73:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L79;
        int $dirty2 = $dirty;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L81;
    L80:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r1);
    L81:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r0 = ($changed$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 822309452, "C1274@52547L29,1271@52427L283,1279@52723L219,1288@53072L28,1285@52955L272:TimePicker.kt#uh7d8r");
        boolean r4 = !state.isAfternoon();
        ComposerKt.sourceInformationMarkerStart($composer2, -250565484, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L84;
    L89:
        boolean invalid$iv2 = true;
    L90:
        boolean invalid$iv3 = invalid$iv2;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv3 == true) goto L97;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L97;
    L98:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ToggleItem(r4, r10, (Function0) value$iv2, r12, ComposableSingletons$TimePickerKt.INSTANCE.m2117getLambda1$material3_release(), $composer2, (($dirty2 << 3) & 7168) | ((($dirty2 >> 9) & 112) | 24576));
        SpacerKt.Spacer(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), SeparatorZIndex), 0.0f, 1, null), colors.m2830getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), $composer2, 0);
        boolean r19 = state.isAfternoon();
        ComposerKt.sourceInformationMarkerStart($composer2, -250548685, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L101;
    L106:
        boolean invalid$iv4 = true;
    L107:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L110;
    L113:
        Object value$iv3 = (Function0) new TimePickerKt$PeriodToggleImpl$2$2$1(state);
        $composer2.updateRememberedValue(value$iv3);
    L114:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ToggleItem(r19, r13, (Function0) value$iv3, colors, ComposableSingletons$TimePickerKt.INSTANCE.m2118getLambda2$material3_release(), $composer2, ((($dirty2 >> 12) & 112) | 24576) | (($dirty2 << 3) & 7168));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventEnd();
        goto L117
    L110:
        if (it$iv2 == Composer.Companion.getEmpty()) goto L113;
        value$iv3 = it$iv2;
        goto L114
    L101:
        if (($dirty2 & 64) != 0) goto L103;
    L105:
        invalid$iv4 = false;
        goto L107
    L103:
        if ($composer2.changedInstance(state) == false) goto L105;
    L97:
        value$iv2 = (Function0) new TimePickerKt$PeriodToggleImpl$2$1$1(state);
        $composer2.updateRememberedValue(value$iv2);
        goto L98
    L84:
        if (($dirty2 & 64) != 0) goto L86;
    L88:
        invalid$iv2 = false;
        goto L90
    L86:
        if ($composer2.changedInstance(state) == false) goto L88;
    L79:
        $dirty2 = $dirty;
        goto L80
    L72:
        $composer2.useNode();
        goto L73
    L62:
        if (it$iv == Composer.Companion.getEmpty()) goto L65;
        value$iv = it$iv;
        goto L66
    L47:
        r14 = 65536;
        goto L48
    L49:
        r13 = endShape;
        goto L51
    L39:
        r11 = 8192;
        goto L40
    L41:
        r10 = startShape;
        goto L43
    L24:
        r8 = 128;
        goto L25
    L26:
        r12 = colors;
        goto L28
    }

    private static final void ToggleItem(final boolean checked, final Shape shape, final Function0<Unit> r26, final TimePickerColors colors, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1937408098);
        ComposerKt.sourceInformation($composer2, "C(ToggleItem)P(!1,4,3)1310@53677L22,1316@53868L124,1308@53569L429:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(checked) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) != 0) goto L16;
        Shape r6 = shape;
        if ($composer2.changed(r6) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
    L18:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changedInstance(r26) == false) goto L22;
        int r9 = 256;
    L23:
        $dirty = $dirty | r9;
        goto L26
    L22:
        r9 = 128;
    L26:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changed(colors) == false) goto L30;
        int r10 = 2048;
    L31:
        $dirty = $dirty | r10;
        goto L33
    L30:
        r10 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(r28) == false) goto L37;
        int r11 = 16384;
    L38:
        $dirty = $dirty | r11;
        goto L41
    L37:
        r11 = 8192;
    L41:
        if (($dirty & 9363) != 9362) goto L47;
        if ($composer2.getSkipping() == false) goto L47;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L67:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L71;
        r7.updateScope(new C05832(checked, shape, r26, colors, r28, $changed));
        return;
    L71:
        return;
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventStart(-1937408098, $dirty, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)");
    L49:
        long contentColor = colors.m2841periodSelectorContentColorvNxB06k$material3_release(checked);
        long containerColor = colors.m2840periodSelectorContainerColorvNxB06k$material3_release(checked);
        Modifier.Companion r0 = Modifier.Companion;
        if (checked == false) goto L52;
        float r13 = 0.0f;
    L53:
        Modifier r1 = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(r0, r13), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -857429536, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty & 14) != 4) goto L56;
        boolean invalid$iv = true;
    L57:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L60;
    L63:
        Object value$iv = (Function1) new TimePickerKt$ToggleItem$1$1(checked);
        $composer2.updateRememberedValue(value$iv);
    L64:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Shape r12 = r6;
        ButtonKt.TextButton(r26, SemanticsModifierKt.semantics$default(r1, false, (Function1) value$iv, 1, null), false, r12, ButtonDefaults.INSTANCE.m1947textButtonColorsro_MJ88(containerColor, contentColor, 0, 0, $composer2, 24576, 12), null, null, PaddingKt.m718PaddingValues0680j_4(Dp.m6973constructorimpl(0)), null, r28, $composer2, (((($dirty >> 6) & 14) | 12582912) | (($dirty << 6) & 7168)) | (($dirty << 15) & 1879048192), 356);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventEnd();
        goto L67
    L60:
        if (it$iv == Composer.Companion.getEmpty()) goto L63;
        value$iv = it$iv;
        goto L64
    L56:
        invalid$iv = false;
        goto L57
    L52:
        r13 = 1.0f;
        goto L53
    L14:
        r8 = 16;
        goto L15
    L16:
        r6 = shape;
        goto L18
    }

    private static final void DisplaySeparator(final Modifier modifier, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2100674302);
        ComposerKt.sourceInformation($composer2, "C(DisplaySeparator)1326@54104L7,1335@54375L172:TimePicker.kt#uh7d8r");
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
        if (($dirty & 3) != 2) goto L16;
        if ($composer2.getSkipping() == false) goto L16;
        $composer2.skipToGroupEnd();
    L36:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L40;
        r2.updateScope(new AnonymousClass3(modifier, $changed));
        return;
    L40:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(2100674302, $dirty, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)");
    L18:
        ProvidableCompositionLocal<TextStyle> r3 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style = TextStyle.m6430copyp1EtxEg$default((TextStyle) r7, 0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, TextAlign.Companion.m6835getCentere0LSkKk(), 0, 0, null, null, new LineHeightStyle(LineHeightStyle.Alignment.Companion.m6803getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m6824getBothEVpEnUU(), null), 0, 0, null, 15695871, null);
        Modifier modifier$iv = SemanticsModifierKt.clearAndSetSemantics(modifier, C05761.INSTANCE);
        Alignment contentAlignment$iv = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r10 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        $composer2.createNode(r10);
    L25:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L31;
        int r17 = 6;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L33;
    L32:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r14);
    L33:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r12 = BoxScopeInstance.INSTANCE;
        int r39 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -789568360, "C1336@54520L5,1336@54471L70:TimePicker.kt#uh7d8r");
        TextKt.m2820Text4IGK_g(":", null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), $composer2, r17), 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, style, $composer2, 6, 0, 65530);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
        goto L36
    L31:
        r17 = 6;
        goto L32
    L24:
        $composer2.useNode();
        goto L25
    }

    /* JADX INFO: renamed from: TimeSelector-SAnMeKU, reason: not valid java name */
    private static final void m2849TimeSelectorSAnMeKU(final Modifier modifier, final int value, final TimePickerState state, final int selection, final TimePickerColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1148055889);
        ComposerKt.sourceInformation($composer2, "C(TimeSelector)P(1,4,3,2:c#material3.TimePickerSelectionMode)1351@54864L214,1363@55302L124,1373@55637L5,1367@55446L117,1375@55682L497,1361@55218L961:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(value) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L18
    L14:
        r7 = 16;
    L18:
        if (($changed & 384) != 0) goto L28;
        if (($changed & 512) != 0) goto L22;
        boolean r8 = $composer2.changed(state);
    L23:
        if (r8 == false) goto L25;
        int r9 = 256;
    L26:
        $dirty = $dirty | r9;
        goto L28
    L25:
        r9 = 128;
        goto L26
    L22:
        r8 = $composer2.changedInstance(state);
    L28:
        if (($changed & 3072) != 0) goto L35;
        if ($composer2.changed(selection) == false) goto L32;
        int r10 = 2048;
    L33:
        $dirty = $dirty | r10;
        goto L35
    L32:
        r10 = 1024;
    L35:
        if (($changed & 24576) == 0) goto L37;
    L41:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) != 9362) goto L48;
        if ($composer2.getSkipping() == false) goto L48;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L84:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L88;
        r11.updateScope(new TimePickerKt$TimeSelector$4(modifier, value, state, selection, colors, $changed));
        return;
    L88:
        return;
    L48:
        if (ComposerKt.isTraceInProgress() == false) goto L50;
        ComposerKt.traceEventStart(-1148055889, $dirty2, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)");
    L50:
        boolean selected = TimePickerSelectionMode.m2874equalsimpl0(state.mo1887getSelectionyecRtBI(), selection);
        if (TimePickerSelectionMode.m2874equalsimpl0(selection, TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L53;
        Strings.Companion r2 = Strings.Companion;
        int r3 = Strings.m3031constructorimpl(R.string.m3c_time_picker_hour_selection);
    L54:
        final String selectorContentDescription = Strings_androidKt.m3101getString2EP1pXo(r3, $composer2, 0);
        long containerColor = colors.m2842timeSelectorContainerColorvNxB06k$material3_release(selected);
        final long contentColor = colors.m2843timeSelectorContentColorvNxB06k$material3_release(selected);
        ComposerKt.sourceInformationMarkerStart($composer2, 1840519339, "CC(remember):TimePicker.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(selectorContentDescription);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L57;
    L60:
        Object value$iv = (Function1) new TimePickerKt$TimeSelector$1$1(selectorContentDescription);
        $composer2.updateRememberedValue(value$iv);
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r12 = SemanticsModifierKt.semantics(modifier, true, (Function1) value$iv);
        Shape r0 = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), $composer2, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, 1840523940, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty2 & 7168) != 2048) goto L64;
        boolean r4 = true;
    L66:
        if (($dirty2 & 896) != 256) goto L68;
    L73:
        boolean r5 = true;
    L74:
        boolean invalid$iv2 = r4 | r5;
        Object value$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L77;
    L80:
        value$iv2 = (Function0) new TimePickerKt$TimeSelector$2$1(selection, state);
        $composer2.updateRememberedValue(value$iv2);
    L81:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SurfaceKt.m2671Surfaced85dljk(selected, (Function0) value$iv2, r12, false, r0, containerColor, 0, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-1477282471, true, new TimePickerKt$TimeSelector$3(selection, state, value, contentColor), $composer2, 54), $composer2, 0, 48, 1992);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
        goto L84
    L77:
        if (value$iv2 != Composer.Companion.getEmpty()) goto L81;
    L68:
        if (($dirty2 & 512) != 0) goto L70;
    L72:
        r5 = false;
        goto L74
    L70:
        if ($composer2.changedInstance(state) == false) goto L72;
    L64:
        r4 = false;
        goto L66
    L57:
        if (it$iv == Composer.Companion.getEmpty()) goto L60;
        value$iv = it$iv;
        goto L61
    L53:
        Strings.Companion r13 = Strings.Companion;
        r3 = Strings.m3031constructorimpl(R.string.m3c_time_picker_minute_selection);
        goto L54
    L37:
        if ($composer2.changed(colors) == false) goto L39;
        int r14 = 16384;
    L40:
        $dirty = $dirty | r14;
        goto L41
    L39:
        r14 = 8192;
        goto L40
    }

    public static final void ClockFace(final AnalogTimePickerState state, final TimePickerColors colors, final boolean autoSwitchToMinute, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1170157036);
        ComposerKt.sourceInformation($composer2, "C(ClockFace)P(2,1)1521@60272L2018,1513@59878L2412:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(state) == false) goto L7;
        int r1 = 4;
    L8:
        $dirty = $dirty | r1;
        goto L10
    L7:
        r1 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(colors) == false) goto L14;
        int r2 = 32;
    L15:
        $dirty = $dirty | r2;
        goto L17
    L14:
        r2 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(autoSwitchToMinute) == false) goto L21;
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
    L35:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L39;
        r0.updateScope(new C05752(state, colors, autoSwitchToMinute, $changed));
        return;
    L39:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1170157036, $dirty, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)");
    L32:
        Modifier.Companion r4 = Modifier.Companion;
        RoundedCornerShape r5 = RoundedCornerShapeKt.getCircleShape();
        Modifier.Companion r6 = r4;
        Modifier r7 = drawSelector(SizeKt.m772size3ABfNKs(BackgroundKt.m233backgroundbw27NRU(r6, colors.m2826getClockDialColor0d7_KjU(), r5).then(new ClockDialModifier(state, autoSwitchToMinute, state.mo1887getSelectionyecRtBI(), null)), TimePickerTokens.INSTANCE.m3665getClockDialContainerSizeD9Ej5fM()), state, colors);
        CrossfadeKt.Crossfade(state.getClockFaceValues(), r7, AnimationSpecKt.tween$default(ComposerKt.invocationKey, 0, null, 6, null), null, ComposableLambdaKt.rememberComposableLambda(-1022006568, true, new C05741(colors, state, autoSwitchToMinute), $composer2, 54), $composer2, 24960, 8);
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventEnd();
        goto L35
    }

    private static final Modifier drawSelector(Modifier $this$drawSelector, final AnalogTimePickerState state, final TimePickerColors colors) {
        return DrawModifierKt.drawWithContent($this$drawSelector, new C05881(state, colors));
    }

    private static final void ClockText(Modifier modifier, final AnalogTimePickerState state, final int value, final boolean autoSwitchToMinute, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-206784607);
        ComposerKt.sourceInformation($composer2, "C(ClockText)P(1,2,3)1639@64421L5,*1640@64463L7,1641@64513L40,1642@64578L43,1643@64638L24,1645@64700L142,1665@65318L163,1670@65563L503,1659@65093L1182:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r11 = modifier;
        if ($composer2.changed(r11) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changedInstance(state) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
        goto L18
    L15:
        r5 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(value) == false) goto L22;
        int r6 = 256;
    L23:
        $dirty = $dirty | r6;
        goto L25
    L22:
        r6 = 128;
    L25:
        if (($changed & 3072) != 0) goto L31;
        boolean r13 = autoSwitchToMinute;
        if ($composer2.changed(r13) == false) goto L29;
        int r7 = 2048;
    L30:
        $dirty = $dirty | r7;
    L32:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) != 1170) goto L39;
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
    L98:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L102;
        final Modifier r1 = r11;
        r8.updateScope(new AnonymousClass4(r1, state, value, autoSwitchToMinute, $changed));
        return;
    L102:
        return;
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventStart(-206784607, $dirty2, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1638)");
    L41:
        TextStyle style = TypographyKt.getValue(TimePickerTokens.INSTANCE.getClockDialLabelTextFont(), $composer2, 6);
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$ClockText_u24lambda_u2427 = (Density) r9;
        float maxDist = $this$ClockText_u24lambda_u2427.mo376toPx0680j_4(MaxDistance);
        ComposerKt.sourceInformationMarkerStart($composer2, 297230880, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L44;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(Offset.m4114boximpl(Offset.Companion.m4141getZeroF1C5BW0()), null, 2, null);
        $composer2.updateRememberedValue(value$iv);
    L45:
        final MutableState center$delegate = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 297232963, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L48;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(IntOffset.m7092boximpl(IntOffset.Companion.m7112getZeronOccac()), null, 2, null);
        $composer2.updateRememberedValue(value$iv2);
    L49:
        final MutableState parentCenter$delegate = (MutableState) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L52;
        Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2));
        $composer2.updateRememberedValue(value$iv$iv);
    L53:
        CompositionScopedCoroutineScopeCanceller wrapper$iv = (CompositionScopedCoroutineScopeCanceller) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CoroutineScope scope = wrapper$iv.getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final String contentDescription = m2857numberContentDescriptiondSwYdS4(state.mo1887getSelectionyecRtBI(), state.is24hour(), value, $composer2, $dirty2 & 896);
        String text = CalendarLocale_jvmKt.toLocalString$default(value, 0, 0, false, 7, null);
        if (TimePickerSelectionMode.m2874equalsimpl0(state.mo1887getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L56;
        boolean selected = Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(state.getMinute(), 0, 0, false, 7, null), text);
    L57:
        Alignment r10 = Alignment.Companion.getCenter();
        Modifier r12 = SizeKt.m772size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(r11), MinimumInteractiveSize);
        ComposerKt.sourceInformationMarkerStart($composer2, 297256763, "CC(remember):TimePicker.kt#9igjgp");
        Object value$iv3 = $composer2.rememberedValue();
        if (value$iv3 != Composer.Companion.getEmpty()) goto L61;
        value$iv3 = (Function1) new TimePickerKt$ClockText$1$1(parentCenter$delegate, center$delegate);
        $composer2.updateRememberedValue(value$iv3);
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r14 = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(r12, (Function1) value$iv3), false, null, 3, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 297264943, "CC(remember):TimePicker.kt#9igjgp");
        boolean r15 = ($composer2.changedInstance(scope) | $composer2.changedInstance(state)) | $composer2.changed(maxDist);
        if (($dirty2 & 7168) != 2048) goto L64;
        boolean r16 = true;
    L65:
        boolean invalid$iv = (r15 | r16) | $composer2.changed(selected);
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L68;
    L71:
        final float maxDist2 = maxDist;
        final boolean r17 = r13;
        Modifier r18 = r14;
        final boolean selected2 = selected;
        final CoroutineScope scope2 = scope;
        boolean r19 = true;
        Object value$iv4 = (Function1) new TimePickerKt$ClockText$2$1(selected2, scope2, state, maxDist2, r17, center$delegate, parentCenter$delegate);
        $composer2.updateRememberedValue(value$iv4);
    L72:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r2 = SemanticsModifierKt.semantics(r18, r19, (Function1) value$iv4);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(r10, false);
        int $changed$iv$iv = (48 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, r2);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L75;
        ComposablesKt.invalidApplier();
    L75:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L78;
        Function0<ComposeUiNode> r3 = r110;
        $composer2.createNode(r3);
    L79:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L86;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L86;
    L87:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r21 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r22 = BoxScopeInstance.INSTANCE;
        int r23 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1481062706, "C1688@66158L48,1686@66083L186:TimePicker.kt#uh7d8r");
        Modifier.Companion r24 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 879062471, "CC(remember):TimePicker.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(contentDescription);
        Object value$iv5 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L94;
        if (value$iv5 == Composer.Companion.getEmpty()) goto L94;
    L95:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextKt.m2820Text4IGK_g(text, SemanticsModifierKt.clearAndSetSemantics(r24, (Function1) value$iv5), 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, style, $composer2, 0, 0, 65532);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L98;
        ComposerKt.traceEventEnd();
    L94:
        value$iv5 = (Function1) new TimePickerKt$ClockText$3$1$1(contentDescription);
        $composer2.updateRememberedValue(value$iv5);
    L86:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r20);
        goto L87
    L78:
        r3 = r110;
        $composer2.useNode();
        goto L79
    L68:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L71;
        r18 = r14;
        scope2 = scope;
        maxDist2 = maxDist;
        selected2 = selected;
        value$iv4 = it$iv3;
        r19 = true;
        goto L72
    L64:
        r16 = false;
        goto L65
    L56:
        selected = Intrinsics.areEqual(CalendarLocale_jvmKt.toLocalString$default(state.getHour(), 0, 0, false, 7, null), text);
        goto L57
    L52:
        value$iv$iv = it$iv$iv;
        goto L53
    L48:
        value$iv2 = it$iv2;
        goto L49
    L44:
        value$iv = it$iv;
        goto L45
    L29:
        r7 = 1024;
        goto L30
    L31:
        r13 = autoSwitchToMinute;
        goto L32
    L7:
        r4 = 2;
        goto L8
    L9:
        r11 = modifier;
        goto L11
    }

    private static final long ClockText$lambda$29(MutableState<Offset> r4) {
        MutableState<Offset> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().m4135unboximpl();
    }

    private static final void ClockText$lambda$30(MutableState<Offset> r5, long value) {
        r5.setValue(Offset.m4114boximpl(value));
    }

    private static final long ClockText$lambda$32(MutableState<IntOffset> r4) {
        MutableState<IntOffset> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue().m7110unboximpl();
    }

    private static final void ClockText$lambda$33(MutableState<IntOffset> r5, long value) {
        r5.setValue(IntOffset.m7092boximpl(value));
    }

    /* JADX INFO: renamed from: timeInputOnChange-z7XvuPQ, reason: not valid java name */
    private static final void m2859timeInputOnChangez7XvuPQ(int selection, TimePickerState state, TextFieldValue value, TextFieldValue prevValue, int max, Function1<? super TextFieldValue, Unit> r15) {
        if (Intrinsics.areEqual(value.getText(), prevValue.getText()) == false) goto L7;
        r15.invoke(value);
        return;
    L7:
        if (value.getText().length() != 0) goto L9;
        boolean r0 = true;
    L10:
        if (r0 == true) goto L12;
        TextFieldValue value2 = value;
        if (value2.getText().length() == 3) goto L61;
    L29:
        int newValue = Integer.parseInt(value2.getText());     // Catch: IllegalArgumentException -> L54 Throwable -> L56
    L31:
        if (newValue > max) goto L66;
        if (TimePickerSelectionMode.m2874equalsimpl0(selection, TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L40;
        state.setHour(newValue);     // Catch: IllegalArgumentException -> L25 Throwable -> L27
        if (newValue <= 1) goto L42;
        if (state.is24hour() == true) goto L42;
        state.mo1888setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI());     // Catch: IllegalArgumentException -> L25 Throwable -> L27
    L65:
        return;
    L42:
        if (value2.getText().length() <= 2) goto L47;
        value2 = TextFieldValue.m6661copy3r_uNRQ$default(value2, String.valueOf(value2.getText().charAt(0)), 0, null, 6, null);     // Catch: IllegalArgumentException -> L49 NumberFormatException -> L51
    L69:
        return;
    L68:
        return;
    L47:
        r15.invoke(value2);     // Catch: IllegalArgumentException -> L49 NumberFormatException -> L51
    L67:
        return;
    L40:
        state.setMinute(newValue);     // Catch: IllegalArgumentException -> L54 Throwable -> L56
        goto L42
    L66:
        return;
    L61:
        if (TextRange.m6417getStartimpl(value2.m6665getSelectiond9O1mEE()) != 1) goto L29;
        newValue = CharsKt.digitToInt(value2.getText().charAt(0));     // Catch: IllegalArgumentException -> L25 Throwable -> L27
    L58:
        return;
    L12:
        if (TimePickerSelectionMode.m2874equalsimpl0(selection, TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L14;
        state.setHour(0);
    L15:
        r15.invoke(TextFieldValue.m6661copy3r_uNRQ$default(value, "", 0, null, 6, null));
        return;
    L14:
        state.setMinute(0);
        goto L15
    L9:
        r0 = false;
        goto L10
    }

    /* JADX INFO: renamed from: TimePickerTextField-1vLObsk, reason: not valid java name */
    private static final void m2848TimePickerTextField1vLObsk(final Modifier modifier, final TextFieldValue value, final Function1<? super TextFieldValue, Unit> r114, TimePickerState state, int selection, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final TimePickerColors colors, Composer $composer, final int $changed, final int r122) {
        int r6 = selection;
        Composer $composer2 = $composer.startRestartGroup(1299172990);
        ComposerKt.sourceInformation($composer2, "C(TimePickerTextField)P(3,7,4,6,5:c#material3.TimePickerSelectionMode,2,1)1762@68219L39,1763@68284L29,1765@68374L243,1771@68670L3410,1857@72118L103,1857@72086L135:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        if ((r122 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r122 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r122 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L34:
        if ((r122 & 8) == 0) goto L37;
        $dirty = $dirty | 3072;
    L47:
        if ((r122 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
    L56:
        int r11 = r122 & 32;
        if (r11 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        KeyboardOptions r13 = keyboardOptions;
    L67:
        int r14 = r122 & 64;
        if (r14 == 0) goto L71;
        $dirty = $dirty | 1572864;
        KeyboardActions r15 = keyboardActions;
    L79:
        if ((r122 & 128) == 0) goto L83;
        int r12 = 12582912;
    L81:
        $dirty = $dirty | r12;
    L89:
        if ((4793491 & $dirty) == 4793490) goto L91;
    L94:
        if (r11 == 0) goto L96;
        KeyboardOptions keyboardOptions2 = KeyboardOptions.Companion.getDefault();
    L97:
        if (r14 == 0) goto L99;
        KeyboardActions keyboardActions2 = KeyboardActions.Companion.getDefault();
    L101:
        if (ComposerKt.isTraceInProgress() == false) goto L103;
        ComposerKt.traceEventStart(1299172990, $dirty, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1761)");
    L103:
        ComposerKt.sourceInformationMarkerStart($composer2, 882970966, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L106;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
    L107:
        final MutableInteractionSource interactionSource = (MutableInteractionSource) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 882973036, "CC(remember):TimePicker.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L110;
        Object value$iv2 = new FocusRequester();
        $composer2.updateRememberedValue(value$iv2);
    L111:
        FocusRequester focusRequester = (FocusRequester) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final TextFieldColors textFieldColors = OutlinedTextFieldDefaults.INSTANCE.m2470colors0hiis_0(colors.m2843timeSelectorContentColorvNxB06k$material3_release(true), 0, 0, 0, colors.m2842timeSelectorContainerColorvNxB06k$material3_release(true), colors.m2842timeSelectorContainerColorvNxB06k$material3_release(true), 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 0, 0, 0, 0, 3072, 2147483598, 4095);
        boolean selected = TimePickerSelectionMode.m2874equalsimpl0(r6, state.mo1887getSelectionyecRtBI());
        int $changed$iv = $dirty & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L114;
        ComposablesKt.invalidApplier();
    L114:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L117;
        Function0<ComposeUiNode> r1 = r16;
        $composer2.createNode(r1);
    L118:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L124;
        MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
        CompositionLocalMap localMap$iv$iv2 = localMap$iv$iv;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L126;
    L125:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r2);
    L126:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r3 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
        ColumnScopeInstance r4 = ColumnScopeInstance.INSTANCE;
        int r32 = (($changed$iv >> 6) & 112) | 6;
        int $dirty2 = $dirty;
        ComposerKt.sourceInformationMarkerStart($composer2, -2071429233, "C1788@69244L240,1796@69494L2047,1845@71677L244,1852@71988L5,1853@72059L5,1842@71551L523:TimePicker.kt#uh7d8r");
        $composer2.startReplaceGroup(2011386807);
        ComposerKt.sourceInformation($composer2, "1773@68737L450");
        if (selected == true) goto L133;
        Modifier r5 = SizeKt.m774sizeVpY3zN4(Modifier.Companion, TimeInputTokens.INSTANCE.m3663getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3662getTimeFieldContainerHeightD9Ej5fM());
        if (TimePickerSelectionMode.m2874equalsimpl0(r6, TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L131;
        int r7 = getHourForDisplay(state);
    L132:
        Composer $composer$iv = $composer2;
        int r17 = 0;
        m2849TimeSelectorSAnMeKU(r5, r7, state, r6, colors, $composer2, (((($dirty2 >> 3) & 896) | 6) | (($dirty2 >> 3) & 7168)) | (($dirty2 >> 9) & 57344));
    L134:
        r8.endReplaceGroup();
        if (TimePickerSelectionMode.m2874equalsimpl0(r6, TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L137;
        Strings.Companion r8 = Strings.Companion;
        int r9 = Strings.m3031constructorimpl(R.string.m3c_time_picker_minute_text_field);
    L138:
        final String contentDescription = Strings_androidKt.m3101getString2EP1pXo(r9, r8, r17);
        Modifier modifier$iv = visible(Modifier.Companion, selected);
        ComposerKt.sourceInformationMarkerStart(r8, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap localMap$iv$iv3 = r8.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier(r8, modifier$iv);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L141;
        ComposablesKt.invalidApplier();
    L141:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L144;
        $composer2.createNode(r18);
    L145:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L151;
        CompositionLocalMap localMap$iv$iv4 = localMap$iv$iv3;
        Function0<ComposeUiNode> r41 = r18;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == true) goto L153;
    L152:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r10);
    L153:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r42 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r8, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r19 = BoxScopeInstance.INSTANCE;
        int r44 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -1024044049, "C1803@69837L48,1807@70087L7,1814@70388L11,1815@70456L11,1819@70616L915,1797@69540L1991:TimePicker.kt#uh7d8r");
        Modifier r20 = SizeKt.m774sizeVpY3zN4(FocusRequesterModifierKt.focusRequester(Modifier.Companion, r117), TimeInputTokens.INSTANCE.m3663getTimeFieldContainerWidthD9Ej5fM(), TimeInputTokens.INSTANCE.m3662getTimeFieldContainerHeightD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(r8, -1002857443, "CC(remember):TimePicker.kt#9igjgp");
        boolean invalid$iv = r8.changed(contentDescription);
        Object value$iv3 = r8.rememberedValue();
        if (invalid$iv == true) goto L160;
        if (value$iv3 == Composer.Companion.getEmpty()) goto L160;
    L161:
        ComposerKt.sourceInformationMarkerEnd(r8);
        Modifier r21 = SemanticsModifierKt.semantics$default(r20, false, (Function1) value$iv3, 1, null);
        ProvidableCompositionLocal<TextStyle> r22 = TextKt.getLocalTextStyle();
        ComposerKt.sourceInformationMarkerStart(r8, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r23 = r8.consume(r22);
        ComposerKt.sourceInformationMarkerEnd(r8);
        boolean r0 = true;
        KeyboardOptions keyboardOptions3 = keyboardOptions2;
        KeyboardActions keyboardActions3 = keyboardActions2;
        BasicTextFieldKt.BasicTextField(value, r114, r21, true, false, (TextStyle) r23, keyboardOptions3, keyboardActions3, true, 0, 0, null, null, interactionSource, Brush.Companion.m4324verticalGradient8A3gB4$default(Brush.Companion, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m4356boximpl(Color.Companion.m4401getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m4356boximpl(Color.Companion.m4401getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m4356boximpl(MaterialTheme.INSTANCE.getColorScheme(r8, 6).m2038getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m4356boximpl(MaterialTheme.INSTANCE.getColorScheme(r8, 6).m2038getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m4356boximpl(Color.Companion.m4401getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m4356boximpl(Color.Companion.m4401getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, null), ComposableLambdaKt.rememberComposableLambda(825138052, true, new TimePickerKt$TimePickerTextField$1$1$2(value, interactionSource, textFieldColors), r8, 54), r8, ((((($dirty2 >> 3) & 14) | 100666368) | (($dirty2 >> 3) & 112)) | (($dirty2 << 3) & 3670016)) | (($dirty2 << 3) & 29360128), 199680, 7696);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        Modifier r34 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m685offsetVpY3zN4$default(Modifier.Companion, 0.0f, SupportLabelTop, 1, null), TimePickerKt$TimePickerTextField$1$2.INSTANCE);
        r6 = selection;
        if (TimePickerSelectionMode.m2874equalsimpl0(r6, TimePickerSelectionMode.Companion.m2878getHouryecRtBI()) == false) goto L164;
        Strings.Companion r24 = Strings.Companion;
        int r25 = Strings.m3031constructorimpl(R.string.m3c_time_picker_hour);
    L165:
        TextKt.m2820Text4IGK_g(Strings_androidKt.m3101getString2EP1pXo(r25, r8, 0), r34, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextColor(), r8, 6), 0, null, null, null, 0, null, null, 0, 0, false, 0, 0, null, TypographyKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSupportingTextFont(), r8, 6), r8, 0, 0, 65528);
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        r12.endNode();
        ComposerKt.sourceInformationMarkerEnd(r12);
        ComposerKt.sourceInformationMarkerEnd(r12);
        ComposerKt.sourceInformationMarkerEnd(r12);
        TimePickerSelectionMode r26 = TimePickerSelectionMode.m2871boximpl(state.mo1887getSelectionyecRtBI());
        Composer $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer3, 883095798, "CC(remember):TimePicker.kt#9igjgp");
        int $dirty3 = $dirty2;
        if (($dirty3 & 7168) != 2048) goto L168;
        final TimePickerState r27 = state;
    L175:
        boolean r110 = true;
    L177:
        if ((57344 & $dirty3) == 16384) goto L180;
        r0 = false;
    L180:
        boolean invalid$iv2 = r0 | r110;
        Object it$iv3 = $composer3.rememberedValue();
        if (invalid$iv2 == false) goto L183;
    L186:
        TimePickerKt$TimePickerTextField$2$1 value$iv4 = new TimePickerKt$TimePickerTextField$2$1(r27, r6, focusRequester, null);
        $composer3.updateRememberedValue(value$iv4);
    L187:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        EffectsKt.LaunchedEffect(r26, (Function2) value$iv4, $composer3, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L190;
        ComposerKt.traceEventEnd();
    L190:
        final KeyboardActions keyboardActions4 = keyboardActions3;
    L191:
        ScopeUpdateScope r111 = $composer3.endRestartGroup();
        if (r111 == null) goto L195;
        final int $dirty4 = r6;
        final KeyboardOptions keyboardOptions4 = keyboardOptions3;
        r111.updateScope(new TimePickerKt$TimePickerTextField$3(modifier, value, r114, r27, $dirty4, keyboardOptions4, keyboardActions4, colors, $changed, r122));
        return;
    L195:
        return;
    L183:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L186;
        value$iv4 = it$iv3;
        goto L187
    L168:
        if (($dirty3 & 4096) == 0) goto L172;
        r27 = state;
        if ($composer3.changedInstance(r27) == true) goto L175;
    L173:
        r110 = false;
        goto L177
    L172:
        r27 = state;
        goto L173
    L164:
        Strings.Companion r28 = Strings.Companion;
        r25 = Strings.m3031constructorimpl(R.string.m3c_time_picker_minute);
    L160:
        value$iv3 = (Function1) new TimePickerKt$TimePickerTextField$1$1$1$1(contentDescription);
        r8.updateRememberedValue(value$iv3);
        goto L161
    L151:
        localMap$iv$iv4 = localMap$iv$iv3;
        r41 = r18;
        goto L152
    L144:
        r8.useNode();
        goto L145
    L137:
        Strings.Companion r29 = Strings.Companion;
        r9 = Strings.m3031constructorimpl(R.string.m3c_time_picker_hour_text_field);
        goto L138
    L131:
        r7 = state.getMinute();
        goto L132
    L133:
        $composer$iv = $composer2;
        r17 = 0;
        goto L134
    L124:
        measurePolicy$iv2 = measurePolicy$iv;
        localMap$iv$iv2 = localMap$iv$iv;
        goto L125
    L117:
        r1 = r16;
        $composer2.useNode();
        goto L118
    L110:
        value$iv2 = it$iv2;
        goto L111
    L106:
        value$iv = it$iv;
        goto L107
    L99:
        keyboardActions2 = r15;
        goto L101
    L96:
        keyboardOptions2 = r13;
        goto L97
    L91:
        if ($composer2.getSkipping() == false) goto L94;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        r27 = state;
        $dirty3 = $dirty;
        keyboardOptions3 = r13;
        keyboardActions4 = r15;
        goto L191
    L83:
        if ((12582912 & $changed) != 0) goto L89;
        if ($composer2.changed(colors) == false) goto L87;
        r12 = 8388608;
        goto L81
    L87:
        r12 = 4194304;
        goto L81
    L71:
        if ((1572864 & $changed) != 0) goto L77;
        r15 = keyboardActions;
        if ($composer2.changed(r15) == false) goto L75;
        int r112 = 1048576;
    L76:
        $dirty = $dirty | r112;
        goto L79
    L75:
        r112 = 524288;
        goto L76
    L77:
        r15 = keyboardActions;
        goto L79
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r13 = keyboardOptions;
        if ($composer2.changed(r13) == false) goto L64;
        int r113 = 131072;
    L65:
        $dirty = $dirty | r113;
        goto L67
    L64:
        r113 = 65536;
        goto L65
    L66:
        r13 = keyboardOptions;
        goto L67
    L50:
        if (($changed & 24576) != 0) goto L56;
        if ($composer2.changed(r6) == false) goto L54;
        int r115 = 16384;
    L55:
        $dirty = $dirty | r115;
        goto L56
    L54:
        r115 = 8192;
        goto L55
    L37:
        if (($changed & 3072) != 0) goto L47;
        if (($changed & 4096) != 0) goto L41;
        boolean r116 = $composer2.changed(state);
    L42:
        if (r116 == false) goto L44;
        int r117 = 2048;
    L45:
        $dirty = $dirty | r117;
        goto L47
    L44:
        r117 = 1024;
        goto L45
    L41:
        r116 = $composer2.changedInstance(state);
        goto L42
    L26:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r114) == false) goto L30;
        int r118 = 256;
    L31:
        $dirty = $dirty | r118;
        goto L34
    L30:
        r118 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changed(value) == false) goto L20;
        int r30 = 32;
    L21:
        $dirty = $dirty | r30;
        goto L23
    L20:
        r30 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(modifier) == false) goto L10;
        int r31 = 4;
    L11:
        $dirty = $dirty | r31;
        goto L13
    L10:
        r31 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: CircularLayout-uFdPcIQ, reason: not valid java name */
    private static final void m2846CircularLayoutuFdPcIQ(Modifier modifier, final float radius, final Function2<? super Composer, ? super Integer, Unit> r21, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(1548175696);
        ComposerKt.sourceInformation($composer2, "C(CircularLayout)P(1,2:c#ui.unit.Dp)1871@72466L1666,1871@72419L1713:TimePicker.kt#uh7d8r");
        int $dirty = $changed;
        int r5 = r24 & 1;
        if (r5 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r7 = modifier;
    L14:
        if ((r24 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r24 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
    L39:
        if (r5 == 0) goto L41;
        Modifier.Companion modifier2 = Modifier.Companion;
    L43:
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventStart(1548175696, $dirty2, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)");
    L45:
        ComposerKt.sourceInformationMarkerStart($composer2, -328610546, "CC(remember):TimePicker.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L48;
        boolean invalid$iv = true;
    L49:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L52;
    L55:
        MeasurePolicy value$iv = new TimePickerKt$CircularLayout$1$1(radius);
        $composer2.updateRememberedValue(value$iv);
    L56:
        MeasurePolicy r13 = (MeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv = (($dirty2 >> 6) & 14) | (($dirty2 << 3) & 112);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, modifier2);
        Function0<ComposeUiNode> r11 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L59;
        ComposablesKt.invalidApplier();
    L59:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L62;
        $composer2.createNode(r11);
    L63:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Modifier modifier3 = modifier2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, r13, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == false) goto L66;
    L69:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r1);
    L70:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r21.invoke($composer2, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
    L73:
        final Modifier modifier4 = modifier3;
    L74:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L78;
        r8.updateScope(new TimePickerKt$CircularLayout$2(modifier4, radius, r21, $changed, r24));
        return;
    L78:
        return;
    L66:
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L70;
    L62:
        $composer2.useNode();
        goto L63
    L52:
        if (it$iv == Composer.Companion.getEmpty()) goto L55;
        value$iv = it$iv;
        goto L56
    L48:
        invalid$iv = false;
        goto L49
    L41:
        modifier2 = r7;
        goto L43
    L36:
        if ($composer2.getSkipping() == false) goto L39;
        $composer2.skipToGroupEnd();
        modifier4 = r7;
        goto L74
    L27:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r21) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
        goto L33
    L31:
        r9 = 128;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(radius) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L24
    L21:
        r10 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L14
    L10:
        r12 = 2;
        goto L11
    L12:
        r7 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: numberContentDescription-dSwYdS4, reason: not valid java name */
    public static final String m2857numberContentDescriptiondSwYdS4(int selection, boolean is24Hour, int number, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 194237364, "C(numberContentDescription)P(2:c#material3.TimePickerSelectionMode)1924@74567L21:TimePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(194237364, $changed, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)");
    L6:
        if (TimePickerSelectionMode.m2874equalsimpl0(selection, TimePickerSelectionMode.Companion.m2879getMinuteyecRtBI()) == false) goto L8;
        Strings.Companion r0 = Strings.Companion;
        int id = Strings.m3031constructorimpl(R.string.m3c_time_picker_minute_suffix);
    L11:
        String r1 = Strings_androidKt.m3102getStringqBjtwXw(id, new Object[]{Integer.valueOf(number)}, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
    L14:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    L8:
        if (is24Hour == false) goto L10;
        Strings.Companion r2 = Strings.Companion;
        id = Strings.m3031constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        goto L11
    L10:
        Strings.Companion r3 = Strings.Companion;
        id = Strings.m3031constructorimpl(R.string.m3c_time_picker_hour_suffix);
        goto L11
    }

    private static final float dist(float x1, float y1, int x2, int y2) {
        float x = x2 - x1;
        float y = y2 - y1;
        return (float) Math.hypot(x, y);
    }

    private static final float atan(float y, float x) {
        float ret = ((float) Math.atan2(y, x)) - 1.5707964f;
        if (ret >= 0.0f) goto L6;
        return FullCircle + ret;
    L6:
        return ret;
    }

    static {
        OuterCircleSizeRadius = Dp.m6973constructorimpl(101);
        InnerCircleRadius = Dp.m6973constructorimpl(69);
        ClockDisplayBottomMargin = Dp.m6973constructorimpl(36);
        ClockFaceBottomMargin = Dp.m6973constructorimpl(24);
        DisplaySeparatorWidth = Dp.m6973constructorimpl(24);
        SupportLabelTop = Dp.m6973constructorimpl(7);
        TimeInputBottomPadding = Dp.m6973constructorimpl(24);
        MaxDistance = Dp.m6973constructorimpl(74);
        MinimumInteractiveSize = Dp.m6973constructorimpl(48);
        Minutes = IntListKt.intListOf(new int[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});
        Hours = IntListKt.intListOf(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        MutableIntList $this$ExtraHours_u24lambda_u2446 = new MutableIntList(Hours.getSize());
        IntList this_$iv = Hours;
        int[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r8 = this_$iv._size;
    L3:
        if (i$iv >= r8) goto L5;
        int it = content$iv[i$iv];
        $this$ExtraHours_u24lambda_u2446.add((it % 12) + 12);
        i$iv = i$iv + 1;
        goto L3
    L5:
        ExtraHours = $this$ExtraHours_u24lambda_u2446;
        PeriodToggleMargin = Dp.m6973constructorimpl(12);
    }

    private static final Modifier visible(Modifier $this$visible, final boolean visible) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new TimePickerKt$visible$$inlined$debugInspectorInfo$1(visible);
    L7:
        return $this$visible.then(new VisibleModifier(visible, r2));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
